package org.leetcode.medium;


/**
 * <b>#1218 - Longest Arithmetic Subsequence of Given Difference</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr and an integer difference, return the length of the longest subsequence in arr which is an arithmetic sequence such that the difference between adjacent elements in the subsequence equals difference.
 *
 *
 * A subsequence is a sequence that can be derived from arr by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,4], difference = 1
 * Output: 4
 * Explanation: The longest arithmetic subsequence is [1,2,3,4].
 *
 * Example 2:
 *
 * Input: arr = [1,3,5,7], difference = 1
 * Output: 1
 * Explanation: The longest arithmetic subsequence is any single element.
 *
 * Example 3:
 *
 * Input: arr = [1,5,7,8,5,3,4,2,1], difference = -2
 * Output: 4
 * Explanation: The longest arithmetic subsequence is [7,5,3,1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * -104 &lt;= arr[i], difference &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Let dp[i] be the maximum length of a subsequence of the given difference whose last element is i.
 * Hint 3: dp[i] = 1 + dp[i-k]
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/">LeetCode #1218</a>
 */
public class LongestArithmeticSubsequenceOfGivenDifference {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Arithmetic Subsequence of Given Difference");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LongestArithmeticSubsequenceOfGivenDifference ===");
        LongestArithmeticSubsequenceOfGivenDifference sol = new LongestArithmeticSubsequenceOfGivenDifference();
        System.out.println(sol.solve(null));
    }
}
