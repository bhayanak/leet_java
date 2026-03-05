package org.leetcode.hard;


/**
 * <b>#1001 - Grid Illumination</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a 2D grid of size n x n where each cell of this grid has a lamp that is initially turned off.
 *
 *
 * You are given a 2D array of lamp positions lamps, where lamps[i] = [rowi, coli] indicates that the lamp at grid[rowi][coli] is turned on. Even if the same lamp is listed more than once, it is turned on.
 *
 *
 * When a lamp is turned on, it illuminates its cell and all other cells in the same row, column, or diagonal.
 *
 *
 * You are also given another 2D array queries, where queries[j] = [rowj, colj]. For the jth query, determine whether grid[rowj][colj] is illuminated or not. After answering the jth query, turn off the lamp at grid[rowj][colj] and its 8 adjacent lamps if they exist. A lamp is adjacent if its cell shares either a side or corner with grid[rowj][colj].
 *
 *
 * Return an array of integers ans, where ans[j] should be 1 if the cell in the jth query was illuminated, or 0 if the lamp was not.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]
 * Output: [1,0]
 * Explanation: We have the initial grid with all lamps turned off. In the above picture we see the grid after turning on the lamp at grid[0][0] then turning on the lamp at grid[4][4].
 * The 0th query asks if the lamp at grid[1][1] is illuminated or not (the blue square). It is illuminated, so set ans[0] = 1. Then, we turn off all lamps in the red square.
 *
 * The 1st query asks if the lamp at grid[1][0] is illuminated or not (the blue square). It is not illuminated, so set ans[1] = 0. Then, we turn off all lamps in the red rectangle.
 *
 * Example 2:
 *
 * Input: n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,1]]
 * Output: [1,1]
 *
 * Example 3:
 *
 * Input: n = 5, lamps = [[0,0],[0,4]], queries = [[0,4],[0,1],[1,4]]
 * Output: [1,1,0]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 *
 * 0 &lt;= lamps.length &lt;= 20000
 *
 * 0 &lt;= queries.length &lt;= 20000
 *
 * lamps[i].length == 2
 *
 * 0 &lt;= rowi, coli &lt; n
 *
 * queries[j].length == 2
 *
 * 0 &lt;= rowj, colj &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/grid-illumination/">LeetCode #1001</a>
 */
public class GridIllumination {

    /**
     * TODO: Implement "Grid Illumination".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Grid Illumination");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac GridIllumination.java &amp;&amp; java org.leetcode.hard.GridIllumination</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== GridIllumination ===");
        GridIllumination sol = new GridIllumination();
        System.out.println(sol.solve(null));
    }
}
