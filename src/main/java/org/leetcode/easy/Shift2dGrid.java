package org.leetcode.easy;


/**
 * <b>#1260 - Shift 2D Grid</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
 *
 *
 * In one shift operation:
 *
 *
 * Element at grid[i][j] moves to grid[i][j + 1].
 *
 * Element at grid[i][n - 1] moves to grid[i + 1][0].
 *
 * Element at grid[m - 1][n - 1] moves to grid[0][0].
 *
 * Return the 2D grid after applying shift operation k times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * Output: [[9,1,2],[3,4,5],[6,7,8]]
 *
 * Example 2:
 *
 * Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
 * Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
 *
 * Example 3:
 *
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
 * Output: [[1,2,3],[4,5,6],[7,8,9]]
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= m &lt;= 50
 *
 * 1 &lt;= n &lt;= 50
 *
 * -1000 &lt;= grid[i][j] &lt;= 1000
 *
 * 0 &lt;= k &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate step by step. move grid[i][j] to grid[i][j+1]. handle last column of the grid.
 * Hint 2: Put the matrix row by row to a vector. take k % vector.length and move last k of the vector to the beginning. put the vector to the matrix back the same way.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shift-2d-grid/">LeetCode #1260</a>
 */
public class Shift2dGrid {

    public java.util.List<java.util.List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length, n=grid[0].length, total=m*n;
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        for (int i=0;i<m;i++) {
            java.util.List<Integer> row = new java.util.ArrayList<>();
            for (int j=0;j<n;j++) row.add(0);
            res.add(row);
        }
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++) {
                int pos = (i*n+j+k) % total;
                res.get(pos/n).set(pos%n, grid[i][j]);
            }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        Shift2dGrid sol = new Shift2dGrid();
        System.out.println("No method available");
    }
}
