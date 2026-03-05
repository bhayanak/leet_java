package org.leetcode.easy;


/**
 * <b>#3210 - Find the Encrypted String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer k. Encrypt the string using the following algorithm:
 *
 *
 * For each character c in s, replace c with the kth character after c in the string (in a cyclic manner).
 *
 * Return the encrypted string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "dart", k = 3
 *
 *
 * Output: "tdar"
 *
 *
 * Explanation:
 *
 *
 * For i = 0, the 3rd character after 'd' is 't'.
 *
 * For i = 1, the 3rd character after 'a' is 'd'.
 *
 * For i = 2, the 3rd character after 'r' is 'a'.
 *
 * For i = 3, the 3rd character after 't' is 'r'.
 *
 * Example 2:
 *
 * Input: s = "aaa", k = 1
 *
 *
 * Output: "aaa"
 *
 *
 * Explanation:
 *
 *
 * As all the characters are the same, the encrypted string will also be the same.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * 1 &lt;= k &lt;= 104
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Make a new string such that for each character in <code>s</code>, character <code>i</code> will correspond to <code>(i + k) % s.length</code> character in the original string.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/find-the-encrypted-string/">LeetCode #3210</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class FindTheEncryptedString {

    /**
     * Checks Check string.
     *
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkString(String s) {
        boolean sawB=false;
        for (char c:s.toCharArray()) {
            if (c=='b') sawB=true;
            else if (sawB) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FindTheEncryptedString sol = new FindTheEncryptedString();
        System.out.println(sol.checkString("hello"));
    }
}
