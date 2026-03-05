package org.leetcode.medium;


/**
 * <b>#3180 - Maximum Total Reward Using Operations I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array rewardValues of length n, representing the values of rewards.
 *
 *
 * Initially, your total reward x is 0, and all indices are unmarked. You are allowed to perform the following operation any number of times:
 *
 *
 * Choose an unmarked index i from the range [0, n - 1].
 *
 * If rewardValues[i] is greater than your current total reward x, then add rewardValues[i] to x (i.e., x = x + rewardValues[i]), and mark the index i.
 *
 * Return an integer denoting the maximum total reward you can collect by performing the operations optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rewardValues = [1,1,3,3]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * During the operations, we can choose to mark the indices 0 and 2 in order, and the total reward will be 4, which is the maximum.
 *
 * Example 2:
 *
 * Input: rewardValues = [1,6,4,3,2]
 *
 *
 * Output: 11
 *
 *
 * Explanation:
 *
 *
 * Mark the indices 0, 2, and 1 in order. The total reward will then be 11, which is the maximum.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= rewardValues.length &lt;= 2000
 *
 * 1 &lt;= rewardValues[i] &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the rewards array first.
 * Hint 2: If we decide to apply some rewards, it's always optimal to apply them in order.
 * Hint 3: Let <code>dp[i][j]</code> (true/false) be the state after the first <code>i</code> rewards, indicating whether we can get exactly <code>j</code> points.
 * Hint 4: The transition is given by: <code>dp[i][j] = dp[i - 1][j − rewardValues[i]]</code> if <code>j − rewardValues[i] &lt; rewardValues[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/maximum-total-reward-using-operations-i/">LeetCode #3180</a>
 */
public class MaximumTotalRewardUsingOperationsI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Total Reward Using Operations I");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumTotalRewardUsingOperationsI ===");
        MaximumTotalRewardUsingOperationsI sol = new MaximumTotalRewardUsingOperationsI();
        System.out.println(sol.solve(null));
    }
}
