package org.leetcode.medium;


/**
 * <b>#3840 - House Robber V</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed and is protected by a security system with a color code.
 *
 *
 * You are given two integer arrays nums and colors, both of length n, where nums[i] is the amount of money in the ith house and colors[i] is the color code of that house.
 *
 *
 * You cannot rob two adjacent houses if they share the same color code.
 *
 *
 * Return the maximum amount of money you can rob.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,3,5], colors = [1,1,2,2]
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * Choose houses i = 1 with nums[1] = 4 and i = 3 with nums[3] = 5 because they are non-adjacent.
 *
 * Thus, the total amount robbed is 4 + 5 = 9.
 *
 * Example 2:
 *
 * Input: nums = [3,1,2,4], colors = [2,3,2,2]
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * Choose houses i = 0 with nums[0] = 3, i = 1 with nums[1] = 1, and i = 3 with nums[3] = 4.
 *
 * This selection is valid because houses i = 0 and i = 1 have different colors, and house i = 3 is non-adjacent to i = 1.
 *
 * Thus, the total amount robbed is 3 + 1 + 4 = 8.
 *
 * Example 3:
 *
 * Input: nums = [10,1,3,9], colors = [1,1,1,2]
 *
 *
 * Output: 22
 *
 *
 * Explanation:
 *
 *
 * Choose houses i = 0 with nums[0] = 10, i = 2 with nums[2] = 3, and i = 3 with nums[3] = 9.
 *
 * This selection is valid because houses i = 0 and i = 2 are non-adjacent, and houses i = 2 and i = 3 have different colors.
 *
 * Thus, the total amount robbed is 10 + 3 + 9 = 22.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length == colors.length &lt;= 105
 *
 * 1 &lt;= nums[i], colors[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming
 * Hint 2: Let <code>dp[i]</code> be the maximum money robbable considering houses up to index <code>i</code>
 * Hint 3: Initialize <code>dp[i]</code> with <code>nums[i]</code>, then compare with skipping the house: <code>dp[i - 1]</code>
 * Hint 4: If <code>colors[i] != colors[i - 1]</code>, allow taking adjacent house: <code>nums[i] + dp[i - 1]</code>
 * Hint 5: Always allow non-adjacent take: <code>nums[i] + dp[i - 2]</code>
 * Hint 6: Answer is <code>dp[n - 1]</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/house-robber-v/">LeetCode #3840</a>
 */
public class HouseRobberV {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: House Robber V");
    }

    public static void main(String[] args) {
        System.out.println("=== HouseRobberV ===");
        HouseRobberV sol = new HouseRobberV();
        System.out.println(sol.solve(null));
    }
}
