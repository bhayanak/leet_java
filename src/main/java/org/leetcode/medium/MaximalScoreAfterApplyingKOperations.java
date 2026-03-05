package org.leetcode.medium;


/**
 * <b>#2530 - Maximal Score After Applying K Operations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer k. You have a starting score of 0.
 *
 *
 * In one operation:
 *
 *
 * choose an index i such that 0 &lt;= i &lt; nums.length,
 *
 * increase your score by nums[i], and
 *
 * replace nums[i] with ceil(nums[i] / 3).
 *
 * Return the maximum possible score you can attain after applying exactly k operations.
 *
 *
 * The ceiling function ceil(val) is the least integer greater than or equal to val.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,10,10,10,10], k = 5
 * Output: 50
 * Explanation: Apply the operation to each array element exactly once. The final score is 10 + 10 + 10 + 10 + 10 = 50.
 *
 * Example 2:
 *
 * Input: nums = [1,10,3,3,3], k = 3
 * Output: 17
 * Explanation: You can do the following operations:
 * Operation 1: Select i = 1, so nums becomes [1,4,3,3,3]. Your score increases by 10.
 * Operation 2: Select i = 1, so nums becomes [1,2,3,3,3]. Your score increases by 4.
 * Operation 3: Select i = 2, so nums becomes [1,2,1,3,3]. Your score increases by 3.
 * The final score is 10 + 4 + 3 = 17.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length, k &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It is always optimal to select the greatest element in the array.
 * Hint 2: Use a heap to query for the maximum in O(log n) time.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximal-score-after-applying-k-operations/">LeetCode #2530</a>
 */
public class MaximalScoreAfterApplyingKOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximal Score After Applying K Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximalScoreAfterApplyingKOperations ===");
        MaximalScoreAfterApplyingKOperations sol = new MaximalScoreAfterApplyingKOperations();
        System.out.println(sol.solve(null));
    }
}
