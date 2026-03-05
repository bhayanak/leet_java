package org.leetcode.medium;


/**
 * <b>#2596 - Check Knight Tour Configuration</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a knight on an n x n chessboard. In a valid configuration, the knight starts at the top-left cell of the board and visits every cell on the board exactly once.
 *
 *
 * You are given an n x n integer matrix grid consisting of distinct integers from the range [0, n * n - 1] where grid[row][col] indicates that the cell (row, col) is the grid[row][col]th cell that the knight visited. The moves are 0-indexed.
 *
 *
 * Return true if grid represents a valid configuration of the knight's movements or false otherwise.
 *
 *
 * Note that a valid knight move consists of moving two squares vertically and one square horizontally, or two squares horizontally and one square vertically. The figure below illustrates all the possible eight moves of a knight from some cell.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]]
 * Output: true
 * Explanation: The above diagram represents the grid. It can be shown that it is a valid configuration.
 *
 * Example 2:
 *
 * Input: grid = [[0,3,6],[5,8,1],[2,7,4]]
 * Output: false
 * Explanation: The above diagram represents the grid. The 8th move of the knight is not valid considering its position after the 7th move.
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == grid[i].length
 *
 * 3 &lt;= n &lt;= 7
 *
 * 0 &lt;= grid[row][col] &lt; n * n
 *
 * All integers in grid are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It is enough to check if each move of the knight is valid.
 * Hint 2: Try all cases of the knight's movements to check if a move is valid.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Matrix, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/check-knight-tour-configuration/">LeetCode #2596</a>
 */
public class CheckKnightTourConfiguration {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check Knight Tour Configuration");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckKnightTourConfiguration ===");
        CheckKnightTourConfiguration sol = new CheckKnightTourConfiguration();
        System.out.println(sol.solve(null));
    }
}
