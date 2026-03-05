package org.leetcode.medium;


/**
 * <b>#3689 - Maximum Total Subarray Value I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and an integer k.
 *
 *
 * You need to choose exactly k non-empty subarrays nums[l..r] of nums. Subarrays may overlap, and the exact same subarray (same l and r) can be chosen more than once.
 *
 *
 * The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).
 *
 *
 * The total value is the sum of the values of all chosen subarrays.
 *
 *
 * Return the maximum possible total value you can achieve.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2], k = 2
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * One optimal approach is:
 *
 *
 * Choose nums[0..1] = [1, 3]. The maximum is 3 and the minimum is 1, giving a value of 3 - 1 = 2.
 *
 * Choose nums[0..2] = [1, 3, 2]. The maximum is still 3 and the minimum is still 1, so the value is also 3 - 1 = 2.
 *
 * Adding these gives 2 + 2 = 4.
 *
 * Example 2:
 *
 * Input: nums = [4,2,5,1], k = 3
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * One optimal approach is:
 *
 *
 * Choose nums[0..3] = [4, 2, 5, 1]. The maximum is 5 and the minimum is 1, giving a value of 5 - 1 = 4.
 *
 * Choose nums[0..3] = [4, 2, 5, 1]. The maximum is 5 and the minimum is 1, so the value is also 4.
 *
 * Choose nums[2..3] = [5, 1]. The maximum is 5 and the minimum is 1, so the value is again 4.
 *
 * Adding these gives 4 + 4 + 4 = 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 5 * 10​​​​​​​4
 *
 * 0 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Choose the whole subarray <code>k</code> times.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-total-subarray-value-i/">LeetCode #3689</a>
 */
public class MaximumTotalSubarrayValueI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Total Subarray Value I");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumTotalSubarrayValueI ===");
        MaximumTotalSubarrayValueI sol = new MaximumTotalSubarrayValueI();
        System.out.println(sol.solve(null));
    }
}
