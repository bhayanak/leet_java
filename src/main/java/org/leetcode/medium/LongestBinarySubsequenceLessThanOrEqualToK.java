package org.leetcode.medium;


/**
 * <b>#2311 - Longest Binary Subsequence Less Than or Equal to K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Greedy, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s and a positive integer k.
 *
 *
 * Return the length of the longest subsequence of s that makes up a binary number less than or equal to k.
 *
 *
 * Note:
 *
 *
 * The subsequence can contain leading zeroes.
 *
 * The empty string is considered to be equal to 0.
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1001010", k = 5
 * Output: 5
 * Explanation: The longest subsequence of s that makes up a binary number less than or equal to 5 is "00010", as this number is equal to 2 in decimal.
 * Note that "00100" and "00101" are also possible, which are equal to 4 and 5 in decimal, respectively.
 * The length of this subsequence is 5, so 5 is returned.
 *
 * Example 2:
 *
 * Input: s = "00101001", k = 1
 * Output: 6
 * Explanation: "000001" is the longest subsequence of s that makes up a binary number less than or equal to 1, as this number is equal to 1 in decimal.
 * The length of this subsequence is 6, so 6 is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s[i] is either '0' or '1'.
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Choosing a subsequence from the string is equivalent to deleting all the other digits.
 * Hint 2: If you were to remove a digit, which one should you remove to reduce the value of the string?
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Greedy, Memoization).
 *
 * @see <a href="https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/">LeetCode #2311</a>
 */
public class LongestBinarySubsequenceLessThanOrEqualToK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Binary Subsequence Less Than or Equal to K");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestBinarySubsequenceLessThanOrEqualToK ===");
        LongestBinarySubsequenceLessThanOrEqualToK sol = new LongestBinarySubsequenceLessThanOrEqualToK();
        System.out.println(sol.solve(null));
    }
}
