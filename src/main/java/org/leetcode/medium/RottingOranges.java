package org.leetcode.medium;


/**
 * <b>#994 - Rotting Oranges</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n grid where each cell can have one of three values:
 *
 *
 * 0 representing an empty cell,
 *
 * 1 representing a fresh orange, or
 *
 * 2 representing a rotten orange.
 *
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
 *
 *
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 *
 * Example 2:
 *
 * Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 *
 * Example 3:
 *
 * Input: grid = [[0,2]]
 * Output: 0
 * Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
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
 * 1 &lt;= m, n &lt;= 10
 *
 * grid[i][j] is 0, 1, or 2.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/rotting-oranges/">LeetCode #994</a>
 */
public class RottingOranges {

    /**
     * TODO: Implement "Rotting Oranges".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rotting Oranges");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RottingOranges.java &amp;&amp; java org.leetcode.medium.RottingOranges</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== RottingOranges ===");
        RottingOranges sol = new RottingOranges();
        System.out.println(sol.solve(null));
    }
}
