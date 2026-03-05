package org.leetcode.medium;


/**
 * <b>#934 - Shortest Bridge</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an n x n binary matrix grid where 1 represents land and 0 represents water.
 *
 *
 * An island is a 4-directionally connected group of 1's not connected to any other 1's. There are exactly two islands in grid.
 *
 *
 * You may change 0's to 1's to connect the two islands to form one island.
 *
 *
 * Return the smallest number of 0's you must flip to connect the two islands.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,1],[1,0]]
 * Output: 1
 *
 * Example 2:
 *
 * Input: grid = [[0,1,0],[0,0,0],[0,0,1]]
 * Output: 2
 *
 * Example 3:
 *
 * Input: grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == grid[i].length
 *
 * 2 &lt;= n &lt;= 100
 *
 * grid[i][j] is either 0 or 1.
 *
 * There are exactly two islands in grid.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-bridge/">LeetCode #934</a>
 */
public class ShortestBridge {

    /**
     * TODO: Implement "Shortest Bridge".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Bridge");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestBridge.java &amp;&amp; java org.leetcode.medium.ShortestBridge</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestBridge ===");
        ShortestBridge sol = new ShortestBridge();
        System.out.println(sol.solve(null));
    }
}
