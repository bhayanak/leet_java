package org.leetcode.easy;

/**
 * <b>#58 - Length of Last Word</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * 
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * 
 * Example 2:
 * 
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * 
 * Example 3:
 * 
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 104
 * 	
 * s consists of only English letters and spaces ' '.
 * 	
 * There will be at least one word in s.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Scan from the end: skip trailing spaces, then count characters until a space.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">LeetCode #58</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class LengthOfLastWord {

    /**
     * Returns the length of the last word in a string (words separated by spaces).
     *
     * @param s string of words and spaces
     * @return  length of the last word
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--; // skip trailing spaces
        int len = 0;
        while (i >= 0 && s.charAt(i) != ' ') { len++; i--; }
        return len;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
                LengthOfLastWord sol = new LengthOfLastWord();
                System.out.println(sol.lengthOfLastWord("Hello World"));           // 5
                System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // 4
    }
}
