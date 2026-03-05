package org.leetcode.medium;


/**
 * <b>#1914 - Cyclically Rotating a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix grid​​​, where m and n are both even integers, and an integer k.
 *
 *
 * The matrix is composed of several layers, which is shown in the below image, where each color is its own layer:
 *
 *
 *
 *
 *
 * A cyclic rotation of the matrix is done by cyclically rotating each layer in the matrix. To cyclically rotate a layer once, each element in the layer will take the place of the adjacent element in the counter-clockwise direction. An example rotation is shown below:
 *
 *
 * Return the matrix after applying k cyclic rotations to it.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: grid = [[40,10],[30,20]], k = 1
 * Output: [[10,20],[40,30]]
 * Explanation: The figures above represent the grid at every state.
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 *
 * Input: grid = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], k = 2
 * Output: [[3,4,8,12],[2,11,10,16],[1,7,6,15],[5,9,13,14]]
 * Explanation: The figures above represent the grid at every state.
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 2 &lt;= m, n &lt;= 50
 *
 * Both m and n are even integers.
 *
 * 1 &lt;= grid[i][j] &lt;= 5000
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First, you need to consider each layer separately as an array.
 * Hint 2: Just cycle this array and then re-assign it.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/cyclically-rotating-a-grid/">LeetCode #1914</a>
 */
public class CyclicallyRotatingAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Cyclically Rotating a Grid");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CyclicallyRotatingAGrid ===");
        CyclicallyRotatingAGrid sol = new CyclicallyRotatingAGrid();
        System.out.println(sol.solve(null));
    }
}
