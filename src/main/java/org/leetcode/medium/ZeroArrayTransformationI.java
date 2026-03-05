package org.leetcode.medium;


/**
 * <b>#3355 - Zero Array Transformation I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and a 2D array queries, where queries[i] = [li, ri].
 *
 *
 * For each queries[i]:
 *
 *
 * Select a subset of indices within the range [li, ri] in nums.
 *
 * Decrement the values at the selected indices by 1.
 *
 * A Zero Array is an array where all elements are equal to 0.
 *
 *
 * Return true if it is possible to transform nums into a Zero Array after processing all the queries sequentially, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,1], queries = [[0,2]]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * For i = 0:
 *
 *
 *
 *
 * Select the subset of indices as [0, 2] and decrement the values at these indices by 1.
 *
 * The array will become [0, 0, 0], which is a Zero Array.
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [4,3,2,1], queries = [[1,3],[0,2]]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * For i = 0:
 *
 *
 *
 *
 * Select the subset of indices as [1, 2, 3] and decrement the values at these indices by 1.
 *
 * The array will become [4, 2, 1, 0].
 *
 *
 *
 * For i = 1:
 *
 *
 *
 * Select the subset of indices as [0, 1, 2] and decrement the values at these indices by 1.
 *
 * The array will become [3, 1, 0, 0], which is not a Zero Array.
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i].length == 2
 *
 * 0 &lt;= li &lt;= ri &lt; nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use difference array and prefix sum to check if an index can be made zero?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/zero-array-transformation-i/">LeetCode #3355</a>
 */
public class ZeroArrayTransformationI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Zero Array Transformation I");
    }

    public static void main(String[] args) {
        System.out.println("=== ZeroArrayTransformationI ===");
        ZeroArrayTransformationI sol = new ZeroArrayTransformationI();
        System.out.println(sol.solve(null));
    }
}
