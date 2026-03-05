package org.leetcode.hard;


/**
 * <b>#2851 - String Transformation</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and t of equal length n. You can perform the following operation on the string s:
 *
 *
 * Remove a suffix of s of length l where 0 &lt; l &lt; n and append it at the start of s.
 *
 * 	For example, let s = 'abcd' then in one operation you can remove the suffix 'cd' and append it in front of s making s = 'cdab'.
 *
 * You are also given an integer k. Return the number of ways in which s can be transformed into t in exactly k operations.
 *
 *
 * Since the answer can be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcd", t = "cdab", k = 2
 * Output: 2
 * Explanation: 
 * First way:
 * In first operation, choose suffix from index = 3, so resulting s = "dabc".
 * In second operation, choose suffix from index = 3, so resulting s = "cdab".
 *
 * Second way:
 * In first operation, choose suffix from index = 1, so resulting s = "bcda".
 * In second operation, choose suffix from index = 1, so resulting s = "cdab".
 *
 * Example 2:
 *
 * Input: s = "ababab", t = "ababab", k = 1
 * Output: 2
 * Explanation: 
 * First way:
 * Choose suffix from index = 2, so resulting s = "ababab".
 *
 * Second way:
 * Choose suffix from index = 4, so resulting s = "ababab".
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 5 * 105
 *
 * 1 &lt;= k &lt;= 1015
 *
 * s.length == t.length
 *
 * s and t consist of only lowercase English alphabets.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: String <code>t</code> can be only constructed if it is a rotated version of string <code>s</code>.
 * Hint 2: Use KMP algorithm or Z algorithm to find the number of indices from where <code>s</code> is equal to <code>t</code>.
 * Hint 3: Use Dynamic Programming to count the number of ways.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming, String Matching).
 *
 * @see <a href="https://leetcode.com/problems/string-transformation/">LeetCode #2851</a>
 */
public class StringTransformation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: String Transformation");
    }

    public static void main(String[] args) {
        System.out.println("=== StringTransformation ===");
        StringTransformation sol = new StringTransformation();
        System.out.println(sol.solve(null));
    }
}
