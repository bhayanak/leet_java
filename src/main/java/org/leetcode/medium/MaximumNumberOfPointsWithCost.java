package org.leetcode.medium;


/**
 * <b>#1937 - Maximum Number of Points with Cost</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix points (0-indexed). Starting with 0 points, you want to maximize the number of points you can get from the matrix.
 *
 *
 * To gain points, you must pick one cell in each row. Picking the cell at coordinates (r, c) will add points[r][c] to your score.
 *
 *
 * However, you will lose points if you pick a cell too far from the cell that you picked in the previous row. For every two adjacent rows r and r + 1 (where 0 &lt;= r &lt; m - 1), picking cells at coordinates (r, c1) and (r + 1, c2) will subtract abs(c1 - c2) from your score.
 *
 *
 * Return the maximum number of points you can achieve.
 *
 *
 * abs(x) is defined as:
 *
 *
 * x for x &gt;= 0.
 *
 * -x for x &lt; 0.
 *
 *
 *
 * Example 1: 
 *
 * Input: points = [[1,2,3],[1,5,1],[3,1,1]]
 * Output: 9
 * Explanation:
 * The blue cells denote the optimal cells to pick, which have coordinates (0, 2), (1, 1), and (2, 0).
 * You add 3 + 5 + 3 = 11 to your score.
 * However, you must subtract abs(2 - 1) + abs(1 - 0) = 2 from your score.
 * Your final score is 11 - 2 = 9.
 *
 * Example 2:
 *
 * Input: points = [[1,5],[2,3],[4,2]]
 * Output: 11
 * Explanation:
 * The blue cells denote the optimal cells to pick, which have coordinates (0, 1), (1, 1), and (2, 0).
 * You add 5 + 3 + 4 = 12 to your score.
 * However, you must subtract abs(1 - 1) + abs(1 - 0) = 1 from your score.
 * Your final score is 12 - 1 = 11.
 *
 *
 *
 * Constraints:
 *
 *
 * m == points.length
 *
 * n == points[r].length
 *
 * 1 &lt;= m, n &lt;= 105
 *
 * 1 &lt;= m * n &lt;= 105
 *
 * 0 &lt;= points[r][c] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try using dynamic programming.
 * Hint 2: dp[i][j] is the maximum number of points you can have if points[i][j] is the most recent cell you picked.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-points-with-cost/">LeetCode #1937</a>
 */
public class MaximumNumberOfPointsWithCost {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Points with Cost");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfPointsWithCost ===");
        MaximumNumberOfPointsWithCost sol = new MaximumNumberOfPointsWithCost();
        System.out.println(sol.solve(null));
    }
}
