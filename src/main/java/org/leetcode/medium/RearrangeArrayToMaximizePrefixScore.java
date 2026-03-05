package org.leetcode.medium;


/**
 * <b>#2587 - Rearrange Array to Maximize Prefix Score</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. You can rearrange the elements of nums to any order (including the given order).
 *
 *
 * Let prefix be the array containing the prefix sums of nums after rearranging it. In other words, prefix[i] is the sum of the elements from 0 to i in nums after rearranging it. The score of nums is the number of positive integers in the array prefix.
 *
 *
 * Return the maximum score you can achieve.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,-1,0,1,-3,3,-3]
 * Output: 6
 * Explanation: We can rearrange the array into nums = [2,3,1,-1,-3,0,-3].
 * prefix = [2,5,6,5,2,2,-1], so the score is 6.
 * It can be shown that 6 is the maximum score we can obtain.
 *
 * Example 2:
 *
 * Input: nums = [-2,-3,0]
 * Output: 0
 * Explanation: Any rearrangement of the array will result in a score of 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -106 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The best order of the array is in decreasing order.
 * Hint 2: Sort the array in decreasing order and count the number of positive values in the prefix sum array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/rearrange-array-to-maximize-prefix-score/">LeetCode #2587</a>
 */
public class RearrangeArrayToMaximizePrefixScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rearrange Array to Maximize Prefix Score");
    }

    public static void main(String[] args) {
        System.out.println("=== RearrangeArrayToMaximizePrefixScore ===");
        RearrangeArrayToMaximizePrefixScore sol = new RearrangeArrayToMaximizePrefixScore();
        System.out.println(sol.solve(null));
    }
}
