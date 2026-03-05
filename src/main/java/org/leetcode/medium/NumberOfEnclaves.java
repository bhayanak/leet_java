package org.leetcode.medium;


/**
 * <b>#1020 - Number of Enclaves</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.
 *
 *
 * A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.
 *
 *
 * Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
 * Output: 3
 * Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.
 *
 * Example 2:
 *
 * Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
 * Output: 0
 * Explanation: All 1s are either on the boundary or can reach the boundary.
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
 * 1 &lt;= m, n &lt;= 500
 *
 * grid[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you model this problem as a graph problem?  Create n * m + 1 nodes where n * m nodes represents each cell of the map and one extra node to represent the exterior of the map.
 * Hint 2: In the map add edges between neighbors on land cells. And add edges between the exterior and land nodes which are in the boundary.
Return as answer the number of nodes that are not reachable from the exterior node.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-enclaves/">LeetCode #1020</a>
 */
public class NumberOfEnclaves {

    /**
     * TODO: Implement "Number of Enclaves".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Enclaves");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfEnclaves.java &amp;&amp; java org.leetcode.medium.NumberOfEnclaves</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfEnclaves ===");
        NumberOfEnclaves sol = new NumberOfEnclaves();
        System.out.println(sol.solve(null));
    }
}
