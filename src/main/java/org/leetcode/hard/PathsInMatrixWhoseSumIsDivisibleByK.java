package org.leetcode.hard;


/**
 * <b>#2435 - Paths in Matrix Whose Sum Is Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed m x n integer matrix grid and an integer k. You are currently at position (0, 0) and you want to reach position (m - 1, n - 1) moving only down or right.
 *
 *
 * Return the number of paths where the sum of the elements on the path is divisible by k. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[5,2,4],[3,0,5],[0,7,2]], k = 3
 * Output: 2
 * Explanation: There are two paths where the sum of the elements on the path is divisible by k.
 * The first path highlighted in red has a sum of 5 + 2 + 4 + 5 + 2 = 18 which is divisible by 3.
 * The second path highlighted in blue has a sum of 5 + 3 + 0 + 5 + 2 = 15 which is divisible by 3.
 *
 * Example 2:
 *
 * Input: grid = [[0,0]], k = 5
 * Output: 1
 * Explanation: The path highlighted in red has a sum of 0 + 0 = 0 which is divisible by 5.
 *
 * Example 3:
 *
 * Input: grid = [[7,3,4,9],[2,3,6,2],[2,3,7,0]], k = 1
 * Output: 10
 * Explanation: Every integer is divisible by 1 so the sum of the elements on every possible path is divisible by k.
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
 * 1 &lt;= m, n &lt;= 5 * 104
 *
 * 1 &lt;= m * n &lt;= 5 * 104
 *
 * 0 &lt;= grid[i][j] &lt;= 100
 *
 * 1 &lt;= k &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The actual numbers in grid do not matter. What matters are the remainders you get when you divide the numbers by k.
 * Hint 2: We can use dynamic programming to solve this problem. What can we use as states?
 * Hint 3: Let dp[i][j][value] represent the number of paths where the sum of the elements on the path has a remainder of value when divided by k.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/paths-in-matrix-whose-sum-is-divisible-by-k/">LeetCode #2435</a>
 */
public class PathsInMatrixWhoseSumIsDivisibleByK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Paths in Matrix Whose Sum Is Divisible by K");
    }

    public static void main(String[] args) {
        System.out.println("=== PathsInMatrixWhoseSumIsDivisibleByK ===");
        PathsInMatrixWhoseSumIsDivisibleByK sol = new PathsInMatrixWhoseSumIsDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
