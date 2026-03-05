package org.leetcode.medium;


/**
 * <b>#959 - Regions Cut By Slashes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An n x n grid is composed of 1 x 1 squares where each 1 x 1 square consists of a '/', '\', or blank space ' '. These characters divide the square into contiguous regions.
 *
 *
 * Given the grid grid represented as a string array, return the number of regions.
 *
 *
 * Note that backslash characters are escaped, so a '\' is represented as '\\'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [" /","/ "]
 * Output: 2
 *
 * Example 2:
 *
 * Input: grid = [" /","  "]
 * Output: 1
 *
 * Example 3:
 *
 * Input: grid = ["/\\","\\/"]
 * Output: 5
 * Explanation: Recall that because \ characters are escaped, "\\/" refers to \/, and "/\\" refers to /\.
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == grid[i].length
 *
 * 1 &lt;= n &lt;= 30
 *
 * grid[i][j] is either '/', '\', or ' '.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/regions-cut-by-slashes/">LeetCode #959</a>
 */
public class RegionsCutBySlashes {

    /**
     * TODO: Implement "Regions Cut By Slashes".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Regions Cut By Slashes");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RegionsCutBySlashes.java &amp;&amp; java org.leetcode.medium.RegionsCutBySlashes</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== RegionsCutBySlashes ===");
        RegionsCutBySlashes sol = new RegionsCutBySlashes();
        System.out.println(sol.solve(null));
    }
}
