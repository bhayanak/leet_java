package org.leetcode.medium;


/**
 * <b>#3434 - Maximum Frequency After Subarray Operation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming, Greedy, Enumeration, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of length n. You are also given an integer k.
 *
 *
 * You perform the following operation on nums once:
 *
 *
 * Select a subarray nums[i..j] where 0 &lt;= i &lt;= j &lt;= n - 1.
 *
 * Select an integer x and add x to all the elements in nums[i..j].
 *
 * Find the maximum frequency of the value k after the operation.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6], k = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * After adding -5 to nums[2..5], 1 has a frequency of 2 in [1, 2, -2, -1, 0, 1].
 *
 * Example 2:
 *
 * Input: nums = [10,2,3,4,5,5,4,3,2,2], k = 10
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * After adding 8 to nums[1..9], 10 has a frequency of 4 in [10, 10, 11, 12, 13, 13, 12, 11, 10, 10].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 50
 *
 * 1 &lt;= k &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix the element you want to convert to <code>k</code>.
 * Hint 2: Use prefix sums to optimize counting occurrences of an element.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming, Greedy, Enumeration, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-frequency-after-subarray-operation/">LeetCode #3434</a>
 */
public class MaximumFrequencyAfterSubarrayOperation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Frequency After Subarray Operation");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumFrequencyAfterSubarrayOperation ===");
        MaximumFrequencyAfterSubarrayOperation sol = new MaximumFrequencyAfterSubarrayOperation();
        System.out.println(sol.solve(null));
    }
}
