package org.leetcode.medium;


/**
 * <b>#2567 - Minimum Score by Changing Two Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * The low score of nums is the minimum absolute difference between any two integers.
 *
 * The high score of nums is the maximum absolute difference between any two integers.
 *
 * The score of nums is the sum of the high and low scores.
 *
 * Return the minimum score after changing two elements of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,7,8,5]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Change nums[0] and nums[1] to be 6 so that nums becomes [6,6,7,8,5].
 *
 * The low score is the minimum absolute difference: |6 - 6| = 0.
 *
 * The high score is the maximum absolute difference: |8 - 5| = 3.
 *
 * The sum of high and low score is 3.
 *
 * Example 2:
 *
 * Input: nums = [1,4,3]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Change nums[1] and nums[2] to 1 so that nums becomes [1,1,1].
 *
 * The sum of maximum absolute difference and minimum absolute difference is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Changing the minimum or maximum values will only minimize the score.
 * Hint 2: Think about what all possible pairs of minimum and maximum values can be changed to form the minimum score.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-score-by-changing-two-elements/">LeetCode #2567</a>
 */
public class MinimumScoreByChangingTwoElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Score by Changing Two Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumScoreByChangingTwoElements ===");
        MinimumScoreByChangingTwoElements sol = new MinimumScoreByChangingTwoElements();
        System.out.println(sol.solve(null));
    }
}
