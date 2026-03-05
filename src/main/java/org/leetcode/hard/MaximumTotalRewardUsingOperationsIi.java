package org.leetcode.hard;


/**
 * <b>#3181 - Maximum Total Reward Using Operations II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation</p>
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
 * 1 &lt;= rewardValues.length &lt;= 5 * 104
 *
 * 1 &lt;= rewardValues[i] &lt;= 5 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the rewards array first.
 * Hint 2: If we decide to apply some rewards, it's always optimal to apply them in order.
 * Hint 3: The transition is given by: <code>dp[i][j] = dp[i - 1][j − rewardValues[i]]</code> if <code>j − rewardValues[i] &lt; rewardValues[i]</code>.
 * Hint 4: Note that the dp array is a boolean array. We just need 1 bit per element, so we can use a bitset or something similar. We just need a "stream" of bits and apply bitwise operations to optimize the computations by a constant factor.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/maximum-total-reward-using-operations-ii/">LeetCode #3181</a>
 */
public class MaximumTotalRewardUsingOperationsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Total Reward Using Operations II");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumTotalRewardUsingOperationsIi ===");
        MaximumTotalRewardUsingOperationsIi sol = new MaximumTotalRewardUsingOperationsIi();
        System.out.println(sol.solve(null));
    }
}
