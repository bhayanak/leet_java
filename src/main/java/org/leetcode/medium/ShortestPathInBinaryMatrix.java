package org.leetcode.medium;


/**
 * <b>#1091 - Shortest Path in Binary Matrix</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an n x n binary matrix grid, return the length of the shortest clear path in the matrix. If there is no clear path, return -1.
 *
 *
 * A clear path in a binary matrix is a path from the top-left cell (i.e., (0, 0)) to the bottom-right cell (i.e., (n - 1, n - 1)) such that:
 *
 *
 * All the visited cells of the path are 0.
 *
 * All the adjacent cells of the path are 8-directionally connected (i.e., they are different and they share an edge or a corner).
 *
 * The length of a clear path is the number of visited cells of this path.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,1],[1,0]]
 * Output: 2
 *
 * Example 2:
 *
 * Input: grid = [[0,0,0],[1,1,0],[1,1,0]]
 * Output: 4
 *
 * Example 3:
 *
 * Input: grid = [[1,0,0],[1,1,0],[1,1,0]]
 * Output: -1
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= n &lt;= 100
 *
 * grid[i][j] is 0 or 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do a breadth first search to find the shortest path.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-path-in-binary-matrix/">LeetCode #1091</a>
 */
public class ShortestPathInBinaryMatrix {

    /**
     * TODO: Implement "Shortest Path in Binary Matrix".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Path in Binary Matrix");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestPathInBinaryMatrix.java &amp;&amp; java org.leetcode.medium.ShortestPathInBinaryMatrix</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestPathInBinaryMatrix ===");
        ShortestPathInBinaryMatrix sol = new ShortestPathInBinaryMatrix();
        System.out.println(sol.solve(null));
    }
}
