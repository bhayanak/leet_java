package org.leetcode.medium;


/**
 * <b>#1856 - Maximum Subarray Min-Product</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Monotonic Stack, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The min-product of an array is equal to the minimum value in the array multiplied by the array's sum.
 *
 *
 * For example, the array [3,2,5] (minimum value is 2) has a min-product of 2 * (3+2+5) = 2 * 10 = 20.
 *
 * Given an array of integers nums, return the maximum min-product of any non-empty subarray of nums. Since the answer may be large, return it modulo 109 + 7.
 *
 *
 * Note that the min-product should be maximized before performing the modulo operation. Testcases are generated such that the maximum min-product without modulo will fit in a 64-bit signed integer.
 *
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,2]
 * Output: 14
 * Explanation: The maximum min-product is achieved with the subarray [2,3,2] (minimum value is 2).
 * 2 * (2+3+2) = 2 * 7 = 14.
 *
 * Example 2:
 *
 * Input: nums = [2,3,3,1,2]
 * Output: 18
 * Explanation: The maximum min-product is achieved with the subarray [3,3] (minimum value is 3).
 * 3 * (3+3) = 3 * 6 = 18.
 *
 * Example 3:
 *
 * Input: nums = [3,1,5,6,4,2]
 * Output: 60
 * Explanation: The maximum min-product is achieved with the subarray [5,6,4] (minimum value is 4).
 * 4 * (5+6+4) = 4 * 15 = 60.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is there a way we can sort the elements to simplify the problem?
 * Hint 2: Can we find the maximum min-product for every value in the array?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Monotonic Stack, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-subarray-min-product/">LeetCode #1856</a>
 */
public class MaximumSubarrayMinProduct {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Subarray Min-Product");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumSubarrayMinProduct ===");
        MaximumSubarrayMinProduct sol = new MaximumSubarrayMinProduct();
        System.out.println(sol.solve(null));
    }
}
