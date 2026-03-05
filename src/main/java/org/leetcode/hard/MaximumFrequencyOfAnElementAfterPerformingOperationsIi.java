package org.leetcode.hard;


/**
 * <b>#3347 - Maximum Frequency of an Element After Performing Operations II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Sliding Window, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and two integers k and numOperations.
 *
 *
 * You must perform an operation numOperations times on nums, where in each operation you:
 *
 *
 * Select an index i that was not selected in any previous operations.
 *
 * Add an integer in the range [-k, k] to nums[i].
 *
 * Return the maximum possible frequency of any element in nums after performing the operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,5], k = 1, numOperations = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can achieve a maximum frequency of two by:
 *
 *
 * Adding 0 to nums[1], after which nums becomes [1, 4, 5].
 *
 * Adding -1 to nums[2], after which nums becomes [1, 4, 4].
 *
 * Example 2:
 *
 * Input: nums = [5,11,20,20], k = 5, numOperations = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can achieve a maximum frequency of two by:
 *
 *
 * Adding 0 to nums[1].
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
 *
 * 0 &lt;= numOperations &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The optimal values to check are <code>nums[i] - k</code>, <code>nums[i]</code>, and <code>nums[i] + k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sliding Window, Sorting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-ii/">LeetCode #3347</a>
 */
public class MaximumFrequencyOfAnElementAfterPerformingOperationsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Frequency of an Element After Performing Operations II");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumFrequencyOfAnElementAfterPerformingOperationsIi ===");
        MaximumFrequencyOfAnElementAfterPerformingOperationsIi sol = new MaximumFrequencyOfAnElementAfterPerformingOperationsIi();
        System.out.println(sol.solve(null));
    }
}
