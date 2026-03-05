package org.leetcode.hard;


/**
 * <b>#1568 - Minimum Number of Days to Disconnect Island</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Matrix, Strongly Connected Component</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n binary grid grid where 1 represents land and 0 represents water. An island is a maximal 4-directionally (horizontal or vertical) connected group of 1's.
 *
 *
 * The grid is said to be connected if we have exactly one island, otherwise is said disconnected.
 *
 *
 * In one day, we are allowed to change any single land cell (1) into a water cell (0).
 *
 *
 * Return the minimum number of days to disconnect the grid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,1,1,0],[0,1,1,0],[0,0,0,0]]
 *
 * Output: 2
 * Explanation: We need at least 2 days to get a disconnected grid.
 * Change land grid[1][1] and grid[0][2] to water and get 2 disconnected island.
 *
 * Example 2:
 *
 * Input: grid = [[1,1]]
 * Output: 2
 * Explanation: Grid of full water is also disconnected ([[1,1]] -&gt; [[0,0]]), 0 islands.
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
 * 1 &lt;= m, n &lt;= 30
 *
 * grid[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Return 0 if the grid is already disconnected.
 * Hint 2: Return 1 if changing a single land to water disconnect the island.
 * Hint 3: Otherwise return 2.
 * Hint 4: We can disconnect the grid within at most 2 days.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Matrix, Strongly Connected Component).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-days-to-disconnect-island/">LeetCode #1568</a>
 */
public class MinimumNumberOfDaysToDisconnectIsland {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Days to Disconnect Island");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfDaysToDisconnectIsland ===");
        MinimumNumberOfDaysToDisconnectIsland sol = new MinimumNumberOfDaysToDisconnectIsland();
        System.out.println(sol.solve(null));
    }
}
