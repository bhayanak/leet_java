package org.leetcode.medium;


/**
 * <b>#807 - Max Increase to Keep City Skyline</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a city composed of n x n blocks, where each block contains a single building shaped like a vertical square prism. You are given a 0-indexed n x n integer matrix grid where grid[r][c] represents the height of the building located in the block at row r and column c.
 *
 *
 * A city's skyline is the outer contour formed by all the building when viewing the side of the city from a distance. The skyline from each cardinal direction north, east, south, and west may be different.
 *
 *
 * We are allowed to increase the height of any number of buildings by any amount (the amount can be different per building). The height of a 0-height building can also be increased. However, increasing the height of a building should not affect the city's skyline from any cardinal direction.
 *
 *
 * Return the maximum total sum that the height of the buildings can be increased by without changing the city's skyline from any cardinal direction.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
 * Output: 35
 * Explanation: The building heights are shown in the center of the above image.
 * The skylines when viewed from each cardinal direction are drawn in red.
 * The grid after increasing the height of buildings without affecting skylines is:
 * gridNew = [ [8, 4, 8, 7],
 *             [7, 4, 7, 7],
 *             [9, 4, 8, 7],
 *             [3, 3, 3, 3] ]
 *
 * Example 2:
 *
 * Input: grid = [[0,0,0],[0,0,0],[0,0,0]]
 * Output: 0
 * Explanation: Increasing the height of any building will result in the skyline changing.
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length
 *
 * n == grid[r].length
 *
 * 2 &lt;= n &lt;= 50
 *
 * 0 &lt;= grid[r][c] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/max-increase-to-keep-city-skyline/">LeetCode #807</a>
 */
public class MaxIncreaseToKeepCitySkyline {

    /**
     * TODO: Implement "Max Increase to Keep City Skyline".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Max Increase to Keep City Skyline");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaxIncreaseToKeepCitySkyline.java &amp;&amp; java org.leetcode.medium.MaxIncreaseToKeepCitySkyline</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaxIncreaseToKeepCitySkyline ===");
        MaxIncreaseToKeepCitySkyline sol = new MaxIncreaseToKeepCitySkyline();
        System.out.println(sol.solve(null));
    }
}
