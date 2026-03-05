package org.leetcode.hard;


/**
 * <b>#1289 - Minimum Falling Path Sum II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an n x n integer matrix grid, return the minimum sum of a falling path with non-zero shifts.
 *
 *
 * A falling path with non-zero shifts is a choice of exactly one element from each row of grid such that no two elements chosen in adjacent rows are in the same column.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: 13
 * Explanation: 
 * The possible falling paths are:
 * [1,5,9], [1,5,7], [1,6,7], [1,6,8],
 * [2,4,8], [2,4,9], [2,6,7], [2,6,8],
 * [3,4,8], [3,4,9], [3,5,7], [3,5,9]
 * The falling path with the smallest sum is [1,5,7], so the answer is 13.
 *
 * Example 2:
 *
 * Input: grid = [[7]]
 * Output: 7
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == grid[i].length
 *
 * 1 &lt;= n &lt;= 200
 *
 * -99 &lt;= grid[i][j] &lt;= 99
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Let dp[i][j] be the answer for the first i rows such that column j is chosen from row i.
 * Hint 3: Use the concept of cumulative array to optimize the complexity of the solution.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-falling-path-sum-ii/">LeetCode #1289</a>
 */
public class MinimumFallingPathSumIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Falling Path Sum II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumFallingPathSumIi ===");
        MinimumFallingPathSumIi sol = new MinimumFallingPathSumIi();
        System.out.println(sol.solve(null));
    }
}
