package org.leetcode.medium;


/**
 * <b>#2033 - Minimum Operations to Make a Uni-Value Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Sorting, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.
 *
 *
 * A uni-value grid is a grid where all the elements of it are equal.
 *
 *
 * Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[2,4],[6,8]], x = 2
 * Output: 4
 * Explanation: We can make every element equal to 4 by doing the following: 
 * - Add x to 2 once.
 * - Subtract x from 6 once.
 * - Subtract x from 8 twice.
 * A total of 4 operations were used.
 *
 * Example 2:
 *
 * Input: grid = [[1,5],[2,3]], x = 1
 * Output: 5
 * Explanation: We can make every element equal to 3.
 *
 * Example 3:
 *
 * Input: grid = [[1,2],[3,4]], x = 2
 * Output: -1
 * Explanation: It is impossible to make every element equal.
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= m, n &lt;= 105
 *
 * 1 &lt;= m * n &lt;= 105
 *
 * 1 &lt;= x, grid[i][j] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is it possible to make two integers a and b equal if they have different remainders dividing by x?
 * Hint 2: If it is possible, which number should you select to minimize the number of operations?
 * Hint 3: What if the elements are sorted?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Sorting, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/">LeetCode #2033</a>
 */
public class MinimumOperationsToMakeAUniValueGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make a Uni-Value Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeAUniValueGrid ===");
        MinimumOperationsToMakeAUniValueGrid sol = new MinimumOperationsToMakeAUniValueGrid();
        System.out.println(sol.solve(null));
    }
}
