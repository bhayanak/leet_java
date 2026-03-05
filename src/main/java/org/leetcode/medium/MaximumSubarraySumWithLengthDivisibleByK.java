package org.leetcode.medium;


/**
 * <b>#3381 - Maximum Subarray Sum With Length Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums and an integer k.
 *
 *
 * Return the maximum sum of a subarray of nums, such that the size of the subarray is divisible by k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2], k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The subarray [1, 2] with sum 3 has length equal to 2 which is divisible by 1.
 *
 * Example 2:
 *
 * Input: nums = [-1,-2,-3,-4,-5], k = 4
 *
 *
 * Output: -10
 *
 *
 * Explanation:
 *
 *
 * The maximum sum subarray is [-1, -2, -3, -4] which has length equal to 4 which is divisible by 4.
 *
 * Example 3:
 *
 * Input: nums = [-5,1,2,-3,4], k = 2
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The maximum sum subarray is [1, 2, -3, 4] which has length equal to 4 which is divisible by 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= nums.length &lt;= 2 * 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain minimum prefix sum ending at every possible <code>index%k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-subarray-sum-with-length-divisible-by-k/">LeetCode #3381</a>
 */
public class MaximumSubarraySumWithLengthDivisibleByK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Subarray Sum With Length Divisible by K");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSubarraySumWithLengthDivisibleByK ===");
        MaximumSubarraySumWithLengthDivisibleByK sol = new MaximumSubarraySumWithLengthDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
