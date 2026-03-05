package org.leetcode.medium;


/**
 * <b>#3819 - Rotate Non Negative Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * Rotate only the non-negative elements of the array to the left by k positions, in a cyclic manner.
 *
 *
 * All negative elements must stay in their original positions and must not move.
 *
 *
 * After rotation, place the non-negative elements back into the array in the new order, filling only the positions that originally contained non-negative values and skipping all negative positions.
 *
 *
 * Return the resulting array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-2,3,-4], k = 3
 *
 *
 * Output: [3,-2,1,-4]
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * The non-negative elements, in order, are [1, 3].
 *
 * Left rotation with k = 3 results in:
 *
 *
 *
 * [1, 3] -&gt; [3, 1] -&gt; [1, 3] -&gt; [3, 1]
 *
 *
 *
 * Placing them back into the non-negative indices results in [3, -2, 1, -4].
 *
 * Example 2:
 *
 * Input: nums = [-3,-2,7], k = 1
 *
 *
 * Output: [-3,-2,7]
 *
 *
 * Explanation:
 *
 *
 * The non-negative elements, in order, are [7].
 *
 * Left rotation with k = 1 results in [7].
 *
 * Placing them back into the non-negative indices results in [-3, -2, 7].
 *
 * Example 3:
 *
 * Input: nums = [5,4,-9,6], k = 2
 *
 *
 * Output: [6,5,-9,4]
 *
 *
 * Explanation:
 *
 *
 * The non-negative elements, in order, are [5, 4, 6].
 *
 * Left rotation with k = 2 results in [6, 5, 4].
 *
 * Placing them back into the non-negative indices results in [6, 5, -9, 4].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -105 &lt;= nums[i] &lt;= 105
 *
 * 0 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Pull out non-negative values and their indices.
 * Hint 2: Left-rotate the values by <code>k</code> (use <code>k %= m</code> where <code>m</code> is their count).
 * Hint 3: Put the rotated values back into the stored indices; leave negatives as-is and return the array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/rotate-non-negative-elements/">LeetCode #3819</a>
 */
public class RotateNonNegativeElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rotate Non Negative Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== RotateNonNegativeElements ===");
        RotateNonNegativeElements sol = new RotateNonNegativeElements();
        System.out.println(sol.solve(null));
    }
}
