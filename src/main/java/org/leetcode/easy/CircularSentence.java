package org.leetcode.easy;


/**
 * <b>#2490 - Circular Sentence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 *
 *
 * For example, "Hello World", "HELLO", "hello world hello world" are all sentences.
 *
 * Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.
 *
 *
 * A sentence is circular if:
 *
 *
 * The last character of each word in the sentence is equal to the first character of its next word.
 *
 * The last character of the last word is equal to the first character of the first word.
 *
 * For example, "leetcode exercises sound delightful", "eetcode", "leetcode eats soul" are all circular sentences. However, "Leetcode is cool", "happy Leetcode", "Leetcode" and "I like Leetcode" are not circular sentences.
 *
 *
 * Given a string sentence, return true if it is circular. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "leetcode exercises sound delightful"
 * Output: true
 * Explanation: The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
 * - leetcode's last character is equal to exercises's first character.
 * - exercises's last character is equal to sound's first character.
 * - sound's last character is equal to delightful's first character.
 * - delightful's last character is equal to leetcode's first character.
 * The sentence is circular.
 *
 * Example 2:
 *
 * Input: sentence = "eetcode"
 * Output: true
 * Explanation: The words in sentence are ["eetcode"].
 * - eetcode's last character is equal to eetcode's first character.
 * The sentence is circular.
 *
 * Example 3:
 *
 * Input: sentence = "Leetcode is cool"
 * Output: false
 * Explanation: The words in sentence are ["Leetcode", "is", "cool"].
 * - Leetcode's last character is not equal to is's first character.
 * The sentence is not circular.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sentence.length &lt;= 500
 *
 * sentence consist of only lowercase and uppercase English letters and spaces.
 *
 * The words in sentence are separated by a single space.
 *
 * There are no leading or trailing spaces.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check the character before the empty space and the character after the empty space.
 * Hint 2: Check the first character and the last character of the sentence.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/circular-sentence/">LeetCode #2490</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CircularSentence {

    /**
     * Returns true if Is circular sentence.
     *
     * @param sentence the sentence (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isCircularSentence(String sentence) {
        String[] words=sentence.split(" ");
        int n=words.length;
        for (int i=0;i<n;i++) {
            String cur=words[i], next=words[(i+1)%n];
            if (cur.charAt(cur.length()-1)!=next.charAt(0)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CircularSentence sol = new CircularSentence();
                System.out.println(sol.isCircularSentence("leetcode exercises sound delightful")); // true
                System.out.println(sol.isCircularSentence("eetcode"));     // true
                System.out.println(sol.isCircularSentence("Leetcode is cool")); // false
    }
}
