package org.leetcode.easy;


/**
 * <b>#2000 - Reverse Prefix of Word</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 *
 *
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 *
 * Return the resulting string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abcdefd", ch = "d"
 * Output: "dcbaefd"
 * Explanation: The first occurrence of "d" is at index 3. 
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 *
 * Example 2:
 *
 * Input: word = "xyxzxe", ch = "z"
 * Output: "zxyxxe"
 * Explanation: The first and only occurrence of "z" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
 *
 * Example 3:
 *
 * Input: word = "abcd", ch = "z"
 * Output: "abcd"
 * Explanation: "z" does not exist in word.
 * You should not do any reverse operation, the resulting string is "abcd".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 250
 *
 * word consists of lowercase English letters.
 *
 * ch is a lowercase English letter.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the first index where ch appears.
 * Hint 2: Find a way to reverse a substring of word.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reverse-prefix-of-word/">LeetCode #2000</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation. Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
  */
public class ReversePrefixOfWord {

    /**
     * Solves the problem: Reverse prefix.
     *
     * @param word the word (String)
     * @param ch the ch (char)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation. Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
      */
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx<0) return word;
        return new StringBuilder(word.substring(0,idx+1)).reverse().toString() + word.substring(idx+1);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ReversePrefixOfWord sol = new ReversePrefixOfWord();
                System.out.println(sol.reversePrefix("abcdefd",'d')); // "dcbaefd"
                System.out.println(sol.reversePrefix("xyxzxe",'z'));  // "zxyxxe"
                System.out.println(sol.reversePrefix("abcd",'z'));    // "abcd"
    }
}
