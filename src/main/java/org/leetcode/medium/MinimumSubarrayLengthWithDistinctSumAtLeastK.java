package org.leetcode.medium;


/**
 * <b>#3795 - Minimum Subarray Length With Distinct Sum At Least K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * Return the minimum length of a subarray whose sum of the distinct values present in that subarray (each value counted once) is at least k. If no such subarray exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,3,1], k = 4
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The subarray [2, 3] has distinct elements {2, 3} whose sum is 2 + 3 = 5, which is ​​​​​​​at least k = 4. Thus, the answer is 2.
 *
 * Example 2:
 *
 * Input: nums = [3,2,3,4], k = 5
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The subarray [3, 2] has distinct elements {3, 2} whose sum is 3 + 2 = 5, which is ​​​​​​​at least k = 5. Thus, the answer is 2.
 *
 * Example 3:
 *
 * Input: nums = [5,5,4], k = 5
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The subarray [5] has distinct elements {5} whose sum is 5, which is at least k = 5. Thus, the answer is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a two-pointer sliding window that expands the right end until the window's sum of values that occur exactly once reaches at least <code>k</code>.
 * Hint 2: When that happens, greedily advance the left pointer to shrink the window as much as possible while keeping the unique-sum <code>&gt;= k</code>, updating the minimum length.
 * Hint 3: Maintain a frequency counter to update the unique-sum when an element's count flips between unique and non-unique
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/minimum-subarray-length-with-distinct-sum-at-least-k/">LeetCode #3795</a>
 */
public class MinimumSubarrayLengthWithDistinctSumAtLeastK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Subarray Length With Distinct Sum At Least K");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumSubarrayLengthWithDistinctSumAtLeastK ===");
        MinimumSubarrayLengthWithDistinctSumAtLeastK sol = new MinimumSubarrayLengthWithDistinctSumAtLeastK();
        System.out.println(sol.solve(null));
    }
}
