package org.leetcode.hard;


/**
 * <b>#827 - Making A Large Island</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1.
 *
 *
 * Return the size of the largest island in grid after applying this operation.
 *
 *
 * An island is a 4-directionally connected group of 1s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0],[0,1]]
 * Output: 3
 * Explanation: Change one 0 to 1 and connect two 1s, then we get an island with area = 3.
 *
 * Example 2:
 *
 * Input: grid = [[1,1],[1,0]]
 * Output: 4
 * Explanation: Change the 0 to 1 and make the island bigger, only one island with area = 4.
 *
 * Example 3:
 *
 * Input: grid = [[1,1],[1,1]]
 * Output: 4
 * Explanation: Can't change any 0 to 1, only one island with area = 4.
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
 * 1 &lt;= n &lt;= 500
 *
 * grid[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/making-a-large-island/">LeetCode #827</a>
 */
public class MakingALargeIsland {

    /**
     * TODO: Implement "Making A Large Island".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Making A Large Island");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MakingALargeIsland.java &amp;&amp; java org.leetcode.hard.MakingALargeIsland</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MakingALargeIsland ===");
        MakingALargeIsland sol = new MakingALargeIsland();
        System.out.println(sol.solve(null));
    }
}
