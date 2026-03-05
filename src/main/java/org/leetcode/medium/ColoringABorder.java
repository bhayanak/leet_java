package org.leetcode.medium;


/**
 * <b>#1034 - Coloring A Border</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix grid, and three integers row, col, and color. Each value in the grid represents the color of the grid square at that location.
 *
 *
 * Two squares are called adjacent if they are next to each other in any of the 4 directions.
 *
 *
 * Two squares belong to the same connected component if they have the same color and they are adjacent.
 *
 *
 * The border of a connected component is all the squares in the connected component that are either adjacent to (at least) a square not in the component, or on the boundary of the grid (the first or last row or column).
 *
 *
 * You should color the border of the connected component that contains the square grid[row][col] with color.
 *
 *
 * Return the final grid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
 * Output: [[3,3],[3,2]]
 *
 *
 * Example 2:
 *
 * Input: grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
 * Output: [[1,3,3],[2,3,3]]
 *
 *
 * Example 3:
 *
 * Input: grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
 * Output: [[2,2,2],[2,1,2],[2,2,2]]
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
 * 1 &lt;= m, n &lt;= 50
 *
 * 1 &lt;= grid[i][j], color &lt;= 1000
 *
 * 0 &lt;= row &lt; m
 *
 * 0 &lt;= col &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a DFS to find every square in the component.  Then for each square, color it if it has a neighbor that is outside the grid or a different color.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/coloring-a-border/">LeetCode #1034</a>
 */
public class ColoringABorder {

    /**
     * TODO: Implement "Coloring A Border".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Coloring A Border");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ColoringABorder.java &amp;&amp; java org.leetcode.medium.ColoringABorder</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ColoringABorder ===");
        ColoringABorder sol = new ColoringABorder();
        System.out.println(sol.solve(null));
    }
}
