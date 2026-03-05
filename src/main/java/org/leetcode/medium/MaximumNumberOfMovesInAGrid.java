package org.leetcode.medium;


/**
 * <b>#2684 - Maximum Number of Moves in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed m x n matrix grid consisting of positive integers.
 *
 *
 * You can start at any cell in the first column of the matrix, and traverse the grid in the following way:
 *
 *
 * From a cell (row, col), you can move to any of the cells: (row - 1, col + 1), (row, col + 1) and (row + 1, col + 1) such that the value of the cell you move to, should be strictly bigger than the value of the current cell.
 *
 * Return the maximum number of moves that you can perform.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[2,4,3,5],[5,4,9,3],[3,4,2,11],[10,9,13,15]]
 * Output: 3
 * Explanation: We can start at the cell (0, 0) and make the following moves:
 * - (0, 0) -&gt; (0, 1).
 * - (0, 1) -&gt; (1, 2).
 * - (1, 2) -&gt; (2, 3).
 * It can be shown that it is the maximum number of moves that can be made.
 *
 * Example 2:
 *
 * Input: grid = [[3,2,4],[2,1,9],[1,1,7]]
 * Output: 0
 * Explanation: Starting from any cell in the first column we cannot perform any moves.
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
 * 2 &lt;= m, n &lt;= 1000
 *
 * 4 &lt;= m * n &lt;= 105
 *
 * 1 &lt;= grid[i][j] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider using dynamic programming to find the maximum number of moves that can be made from each cell.
 * Hint 2: The final answer will be the maximum value in cells of the first column.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/">LeetCode #2684</a>
 */
public class MaximumNumberOfMovesInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Moves in a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfMovesInAGrid ===");
        MaximumNumberOfMovesInAGrid sol = new MaximumNumberOfMovesInAGrid();
        System.out.println(sol.solve(null));
    }
}
