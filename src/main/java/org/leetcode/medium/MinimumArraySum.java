package org.leetcode.medium;


/**
 * <b>#3366 - Minimum Array Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and three integers k, op1, and op2.
 *
 *
 * You can perform the following operations on nums:
 *
 *
 * Operation 1: Choose an index i and divide nums[i] by 2, rounding up to the nearest whole number. You can perform this operation at most op1 times, and not more than once per index.
 *
 * Operation 2: Choose an index i and subtract k from nums[i], but only if nums[i] is greater than or equal to k. You can perform this operation at most op2 times, and not more than once per index.
 *
 * Note: Both operations can be applied to the same index, but at most once each.
 *
 *
 * Return the minimum possible sum of all elements in nums after performing any number of operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,8,3,19,3], k = 3, op1 = 1, op2 = 1
 *
 *
 * Output: 23
 *
 *
 * Explanation:
 *
 *
 * Apply Operation 2 to nums[1] = 8, making nums[1] = 5.
 *
 * Apply Operation 1 to nums[3] = 19, making nums[3] = 10.
 *
 * The resulting array becomes [2, 5, 3, 10, 3], which has the minimum possible sum of 23 after applying the operations.
 *
 * Example 2:
 *
 * Input: nums = [2,4,3], k = 3, op1 = 2, op2 = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Apply Operation 1 to nums[0] = 2, making nums[0] = 1.
 *
 * Apply Operation 1 to nums[1] = 4, making nums[1] = 2.
 *
 * Apply Operation 2 to nums[2] = 3, making nums[2] = 0.
 *
 * The resulting array becomes [1, 2, 0], which has the minimum possible sum of 3 after applying the operations.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 0 &lt;= nums[i] &lt;= 105
 *
 * 0 &lt;= k &lt;= 105
 *
 * 0 &lt;= op1, op2 &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of dynamic programming with states to track progress and remaining operations.
 * Hint 2: Use <code>dp[index][op1][op2]</code> where each state tracks progress at <code>index</code> with <code>op1</code> and <code>op2</code> operations left.
 * Hint 3: At each state, try applying only operation 1, only operation 2, both in sequence, or skip both to find optimal results.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/minimum-array-sum/">LeetCode #3366</a>
 */
public class MinimumArraySum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Array Sum");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumArraySum ===");
        MinimumArraySum sol = new MinimumArraySum();
        System.out.println(sol.solve(null));
    }
}
