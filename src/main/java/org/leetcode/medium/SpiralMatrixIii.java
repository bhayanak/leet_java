package org.leetcode.medium;


/**
 * <b>#885 - Spiral Matrix III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid, and the southeast corner is at the last row and column.
 *
 *
 * You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary, we continue our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.
 *
 *
 * Return an array of coordinates representing the positions of the grid in the order you visited them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rows = 1, cols = 4, rStart = 0, cStart = 0
 * Output: [[0,0],[0,1],[0,2],[0,3]]
 *
 * Example 2:
 *
 * Input: rows = 5, cols = 6, rStart = 1, cStart = 4
 * Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= rows, cols &lt;= 100
 *
 * 0 &lt;= rStart &lt; rows
 *
 * 0 &lt;= cStart &lt; cols
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/spiral-matrix-iii/">LeetCode #885</a>
 */
public class SpiralMatrixIii {

    /**
     * TODO: Implement "Spiral Matrix III".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Spiral Matrix III");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SpiralMatrixIii.java &amp;&amp; java org.leetcode.medium.SpiralMatrixIii</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SpiralMatrixIii ===");
        SpiralMatrixIii sol = new SpiralMatrixIii();
        System.out.println(sol.solve(null));
    }
}
