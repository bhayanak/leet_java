package org.leetcode.medium;


/**
 * <b>#3040 - Maximum Number of Operations With the Same Score II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers called nums, you can perform any of the following operation while nums contains at least 2 elements:
 *
 *
 * Choose the first two elements of nums and delete them.
 *
 * Choose the last two elements of nums and delete them.
 *
 * Choose the first and the last elements of nums and delete them.
 *
 * The score of the operation is the sum of the deleted elements.
 *
 *
 * Your task is to find the maximum number of operations that can be performed, such that all operations have the same score.
 *
 *
 * Return the maximum number of operations possible that satisfy the condition mentioned above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,1,2,3,4]
 * Output: 3
 * Explanation: We perform the following operations:
 * - Delete the first two elements, with score 3 + 2 = 5, nums = [1,2,3,4].
 * - Delete the first and the last elements, with score 1 + 4 = 5, nums = [2,3].
 * - Delete the first and the last elements, with score 2 + 3 = 5, nums = [].
 * We are unable to perform any more operations as nums is empty.
 *
 * Example 2:
 *
 * Input: nums = [3,2,6,1,4]
 * Output: 2
 * Explanation: We perform the following operations:
 * - Delete the first two elements, with score 3 + 2 = 5, nums = [6,1,4].
 * - Delete the last two elements, with score 1 + 4 = 5, nums = [6].
 * It can be proven that we can perform at most 2 operations.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 2000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: After the first operation, the score of other operations is fixed.
 * Hint 2: For the fixed score use dynamic programming <code>dp[l][r]</code> to find a maximum number of operations on the subarray <code>nums[l..r]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Memoization).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-ii/">LeetCode #3040</a>
 */
public class MaximumNumberOfOperationsWithTheSameScoreIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Operations With the Same Score II");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfOperationsWithTheSameScoreIi ===");
        MaximumNumberOfOperationsWithTheSameScoreIi sol = new MaximumNumberOfOperationsWithTheSameScoreIi();
        System.out.println(sol.solve(null));
    }
}
