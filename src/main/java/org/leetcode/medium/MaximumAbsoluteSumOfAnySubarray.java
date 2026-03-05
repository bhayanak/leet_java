package org.leetcode.medium;


/**
 * <b>#1749 - Maximum Absolute Sum of Any Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. The absolute sum of a subarray [numsl, numsl+1, ..., numsr-1, numsr] is abs(numsl + numsl+1 + ... + numsr-1 + numsr).
 *
 *
 * Return the maximum absolute sum of any (possibly empty) subarray of nums.
 *
 *
 * Note that abs(x) is defined as follows:
 *
 *
 * If x is a negative integer, then abs(x) = -x.
 *
 * If x is a non-negative integer, then abs(x) = x.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-3,2,3,-4]
 * Output: 5
 * Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.
 *
 * Example 2:
 *
 * Input: nums = [2,-5,1,-4,3,-2]
 * Output: 8
 * Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -104 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What if we asked for maximum sum, not absolute sum?
 * Hint 2: It's a standard problem that can be solved by Kadane's algorithm.
 * Hint 3: The key idea is the max absolute sum will be either the max sum or the min sum.
 * Hint 4: So just run kadane twice, once calculating the max sum and once calculating the min sum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/">LeetCode #1749</a>
 */
public class MaximumAbsoluteSumOfAnySubarray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Absolute Sum of Any Subarray");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumAbsoluteSumOfAnySubarray ===");
        MaximumAbsoluteSumOfAnySubarray sol = new MaximumAbsoluteSumOfAnySubarray();
        System.out.println(sol.solve(null));
    }
}
