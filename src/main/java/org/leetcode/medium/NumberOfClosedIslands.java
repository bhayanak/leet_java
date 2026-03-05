package org.leetcode.medium;


/**
 * <b>#1254 - Number of Closed Islands</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.
 *
 *
 * Return the number of closed islands.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
 * Output: 2
 * Explanation: 
 * Islands in gray are closed because they are completely surrounded by water (group of 1s).
 *
 * Example 2:
 *
 * Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
 * Output: 1
 *
 * Example 3:
 *
 * Input: grid = [[1,1,1,1,1,1,1],
 *                [1,0,0,0,0,0,1],
 *                [1,0,1,1,1,0,1],
 *                [1,0,1,0,1,0,1],
 *                [1,0,1,1,1,0,1],
 *                [1,0,0,0,0,0,1],
 *                [1,1,1,1,1,1,1]]
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= grid.length, grid[0].length &lt;= 100
 *
 * 0 &lt;= grid[i][j] &lt;=1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Exclude connected group of 0s on the corners because they are not closed island.
 * Hint 2: Return number of connected component of 0s on the grid.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-closed-islands/">LeetCode #1254</a>
 */
public class NumberOfClosedIslands {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Closed Islands");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfClosedIslands ===");
        NumberOfClosedIslands sol = new NumberOfClosedIslands();
        System.out.println(sol.solve(null));
    }
}
