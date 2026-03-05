package org.leetcode.medium;


/**
 * <b>#3393 - Count Paths With the Given XOR Value</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array grid with size m x n. You are also given an integer k.
 *
 *
 * Your task is to calculate the number of paths you can take from the top-left cell (0, 0) to the bottom-right cell (m - 1, n - 1) satisfying the following constraints:
 *
 *
 * You can either move to the right or down. Formally, from the cell (i, j) you may move to the cell (i, j + 1) or to the cell (i + 1, j) if the target cell exists.
 *
 * The XOR of all the numbers on the path must be equal to k.
 *
 * Return the total number of such paths.
 *
 *
 * Since the answer can be very large, return the result modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[2, 1, 5], [7, 10, 0], [12, 6, 4]], k = 11
 *
 *
 * Output: 3
 *
 *
 * Explanation: 
 *
 *
 * The 3 paths are:
 *
 *
 * (0, 0) → (1, 0) → (2, 0) → (2, 1) → (2, 2)
 *
 * (0, 0) → (1, 0) → (1, 1) → (1, 2) → (2, 2)
 *
 * (0, 0) → (0, 1) → (1, 1) → (2, 1) → (2, 2)
 *
 * Example 2:
 *
 * Input: grid = [[1, 3, 3, 3], [0, 3, 3, 2], [3, 0, 1, 1]], k = 2
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The 5 paths are:
 *
 *
 * (0, 0) → (1, 0) → (2, 0) → (2, 1) → (2, 2) → (2, 3)
 *
 * (0, 0) → (1, 0) → (1, 1) → (2, 1) → (2, 2) → (2, 3)
 *
 * (0, 0) → (1, 0) → (1, 1) → (1, 2) → (1, 3) → (2, 3)
 *
 * (0, 0) → (0, 1) → (1, 1) → (1, 2) → (2, 2) → (2, 3)
 *
 * (0, 0) → (0, 1) → (0, 2) → (1, 2) → (2, 2) → (2, 3)
 *
 * Example 3:
 *
 * Input: grid = [[1, 1, 1, 2], [3, 0, 3, 2], [3, 0, 2, 2]], k = 10
 *
 *
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m == grid.length &lt;= 300
 *
 * 1 &lt;= n == grid[r].length &lt;= 300
 *
 * 0 &lt;= grid[r][c] &lt; 16
 *
 * 0 &lt;= k &lt; 16
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DP.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/count-paths-with-the-given-xor-value/">LeetCode #3393</a>
 */
public class CountPathsWithTheGivenXorValue {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Paths With the Given XOR Value");
    }

    public static void main(String[] args) {
        System.out.println("=== CountPathsWithTheGivenXorValue ===");
        CountPathsWithTheGivenXorValue sol = new CountPathsWithTheGivenXorValue();
        System.out.println(sol.solve(null));
    }
}
