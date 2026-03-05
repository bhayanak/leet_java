package org.leetcode.medium;


/**
 * <b>#3397 - Maximum Number of Distinct Elements After Operations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * You are allowed to perform the following operation on each element of the array at most once:
 *
 *
 * Add an integer in the range [-k, k] to the element.
 *
 * Return the maximum possible number of distinct elements in nums after performing the operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3,3,4], k = 2
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * nums changes to [-1, 0, 1, 2, 3, 4] after performing operations on the first four elements.
 *
 * Example 2:
 *
 * Input: nums = [4,4,4,4], k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * By adding -1 to nums[0] and 1 to nums[1], nums changes to [3, 5, 4, 4].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use sorting here?
 * Hint 2: Find the minimum element which is not used for each element.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-distinct-elements-after-operations/">LeetCode #3397</a>
 */
public class MaximumNumberOfDistinctElementsAfterOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Distinct Elements After Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfDistinctElementsAfterOperations ===");
        MaximumNumberOfDistinctElementsAfterOperations sol = new MaximumNumberOfDistinctElementsAfterOperations();
        System.out.println(sol.solve(null));
    }
}
