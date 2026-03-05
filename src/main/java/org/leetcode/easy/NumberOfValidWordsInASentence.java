package org.leetcode.easy;


/**
 * <b>#2047 - Number of Valid Words in a Sentence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sentence consists of lowercase letters ('a' to 'z'), digits ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.', and ','), and spaces (' ') only. Each sentence can be broken down into one or more tokens separated by one or more spaces ' '.
 *
 *
 * A token is a valid word if all three of the following are true:
 *
 *
 * It only contains lowercase letters, hyphens, and/or punctuation (no digits).
 *
 * There is at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
 *
 * There is at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and "." are valid, but "a!b" and "c.," are not valid).
 *
 * Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".
 *
 *
 * Given a string sentence, return the number of valid words in sentence.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "cat and  dog"
 * Output: 3
 * Explanation: The valid words in the sentence are "cat", "and", and "dog".
 *
 * Example 2:
 *
 * Input: sentence = "!this  1-s b8d!"
 * Output: 0
 * Explanation: There are no valid words in the sentence.
 * "!this" is invalid because it starts with a punctuation mark.
 * "1-s" and "b8d" are invalid because they contain digits.
 *
 * Example 3:
 *
 * Input: sentence = "alice and  bob are playing stone-game10"
 * Output: 5
 * Explanation: The valid words in the sentence are "alice", "and", "bob", "are", and "playing".
 * "stone-game10" is invalid because it contains digits.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sentence.length &lt;= 1000
 *
 * sentence only contains lowercase English letters, digits, ' ', '-', '!', '.', and ','.
 *
 * There will be at least 1 token.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through the string to split it by spaces.
 * Hint 2: Count the number of characters of each type (letters, numbers, hyphens, and punctuations).
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/number-of-valid-words-in-a-sentence/">LeetCode #2047</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class NumberOfValidWordsInASentence {

    /**
     * Counts Count valid words.
     *
     * @param sentence the sentence (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countValidWords(String sentence) {
        int count=0;
        for (String tok:sentence.split(" ")) {
            if (tok.isEmpty()) continue;
            if (isValid(tok)) count++;
        }
        return count;
    }
    private boolean isValid(String t) {
        int hyphens=0;
        for (int i=0;i<t.length();i++) {
            char c=t.charAt(i);
            if (Character.isDigit(c)) return false;
            if (c=='-') {
                hyphens++;
                if (hyphens>1 || i==0 || i==t.length()-1) return false;
                if (!Character.isLetter(t.charAt(i-1)) || !Character.isLetter(t.charAt(i+1))) return false;
            } else if (!Character.isLetter(c) && c!='!' && c!='.' && c!=',') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        NumberOfValidWordsInASentence sol = new NumberOfValidWordsInASentence();
                System.out.println(sol.countValidWords("cat and  dog")); // 3
                System.out.println(sol.countValidWords("!this  1-s b8d!")); // 0
                System.out.println(sol.countValidWords("alice and  bob are playing stone-game10")); // 5
    }
}
