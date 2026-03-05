package org.leetcode.medium;


/**
 * <b>#2556 - Disconnect Path in a Binary Matrix by at Most One Flip</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Depth-First Search, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed m x n binary matrix grid. You can move from a cell (row, col) to any of the cells (row + 1, col) or (row, col + 1) that has the value 1. The matrix is disconnected if there is no path from (0, 0) to (m - 1, n - 1).
 *
 *
 * You can flip the value of at most one (possibly none) cell. You cannot flip the cells (0, 0) and (m - 1, n - 1).
 *
 *
 * Return true if it is possible to make the matrix disconnect or false otherwise.
 *
 *
 * Note that flipping a cell changes its value from 0 to 1 or from 1 to 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,1,1],[1,0,0],[1,1,1]]
 * Output: true
 * Explanation: We can change the cell shown in the diagram above. There is no path from (0, 0) to (2, 2) in the resulting grid.
 *
 * Example 2:
 *
 * Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: false
 * Explanation: It is not possible to change at most one cell such that there is not path from (0, 0) to (2, 2).
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
 * 1 &lt;= m, n &lt;= 1000
 *
 * 1 &lt;= m * n &lt;= 105
 *
 * grid[i][j] is either 0 or 1.
 *
 * grid[0][0] == grid[m - 1][n - 1] == 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can consider the grid a graph with edges between adjacent cells.
 * Hint 2: If you can find two non-intersecting paths from (0, 0) to (m - 1, n - 1) then the answer is false. Otherwise, it is always true.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Depth-First Search, Breadth-First Search, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/disconnect-path-in-a-binary-matrix-by-at-most-one-flip/">LeetCode #2556</a>
 */
public class DisconnectPathInABinaryMatrixByAtMostOneFlip {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Disconnect Path in a Binary Matrix by at Most One Flip");
    }

    public static void main(String[] args) {
        System.out.println("=== DisconnectPathInABinaryMatrixByAtMostOneFlip ===");
        DisconnectPathInABinaryMatrixByAtMostOneFlip sol = new DisconnectPathInABinaryMatrixByAtMostOneFlip();
        System.out.println(sol.solve(null));
    }
}
