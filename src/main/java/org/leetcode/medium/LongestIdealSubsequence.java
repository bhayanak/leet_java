package org.leetcode.medium;


/**
 * <b>#2370 - Longest Ideal Subsequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase letters and an integer k. We call a string t ideal if the following conditions are satisfied:
 *
 *
 * t is a subsequence of the string s.
 *
 * The absolute difference in the alphabet order of every two adjacent letters in t is less than or equal to k.
 *
 * Return the length of the longest ideal string.
 *
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
 *
 *
 * Note that the alphabet order is not cyclic. For example, the absolute difference in the alphabet order of 'a' and 'z' is 25, not 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "acfgbd", k = 2
 * Output: 4
 * Explanation: The longest ideal string is "acbd". The length of this string is 4, so 4 is returned.
 * Note that "acfgbd" is not ideal because 'c' and 'f' have a difference of 3 in alphabet order.
 *
 * Example 2:
 *
 * Input: s = "abcd", k = 3
 * Output: 4
 * Explanation: The longest ideal string is "abcd". The length of this string is 4, so 4 is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * 0 &lt;= k &lt;= 25
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can you calculate the longest ideal subsequence that ends at a specific index i?
 * Hint 2: Can you calculate it for all positions i? How can you use previously calculated answers to calculate the answer for the next position?
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/longest-ideal-subsequence/">LeetCode #2370</a>
 */
public class LongestIdealSubsequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Ideal Subsequence");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestIdealSubsequence ===");
        LongestIdealSubsequence sol = new LongestIdealSubsequence();
        System.out.println(sol.solve(null));
    }
}
