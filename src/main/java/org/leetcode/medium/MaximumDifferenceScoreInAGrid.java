package org.leetcode.medium;


/**
 * <b>#3148 - Maximum Difference Score in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n matrix grid consisting of positive integers. You can move from a cell in the matrix to any other cell that is either to the bottom or to the right (not necessarily adjacent). The score of a move from a cell with the value c1 to a cell with the value c2 is c2 - c1.
 *
 *
 * You can start at any cell, and you have to make at least one move.
 *
 *
 * Return the maximum total score you can achieve.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[9,5,7,3],[8,9,6,1],[6,7,14,3],[2,5,3,1]]
 *
 *
 * Output: 9
 *
 *
 * Explanation: We start at the cell (0, 1), and we perform the following moves:
 *
 * - Move from the cell (0, 1) to (2, 1) with a score of 7 - 5 = 2.
 *
 * - Move from the cell (2, 1) to (2, 2) with a score of 14 - 7 = 7.
 *
 * The total score is 2 + 7 = 9.
 *
 * Example 2:
 *
 * Input: grid = [[4,3,2],[3,2,1]]
 *
 *
 * Output: -1
 *
 *
 * Explanation: We start at the cell (0, 0), and we perform one move: (0, 0) to (0, 1). The score is 3 - 4 = -1.
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
 * 1 &lt;= grid[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Any path from a cell <code>(x1, y1)</code> to another cell <code>(x2, y2)</code> will always have a score of <code>grid[x2][y2] - grid[x1][y1]</code>.
 * Hint 2: Let’s say we fix the starting cell <code>(x1, y1)</code>, how to the find a cell <code>(x2, y2)</code> such that the value <code>grid[x2][y2] - grid[x1][y1]</code> is the maximum possible?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/maximum-difference-score-in-a-grid/">LeetCode #3148</a>
 */
public class MaximumDifferenceScoreInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Difference Score in a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumDifferenceScoreInAGrid ===");
        MaximumDifferenceScoreInAGrid sol = new MaximumDifferenceScoreInAGrid();
        System.out.println(sol.solve(null));
    }
}
