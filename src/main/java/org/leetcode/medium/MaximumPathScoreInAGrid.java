package org.leetcode.medium;


/**
 * <b>#3742 - Maximum Path Score in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n grid where each cell contains one of the values 0, 1, or 2. You are also given an integer k.
 *
 *
 * You start from the top-left corner (0, 0) and want to reach the bottom-right corner (m - 1, n - 1) by moving only right or down.
 *
 *
 * Each cell contributes a specific score and incurs an associated cost, according to their cell values:
 *
 *
 * 0: adds 0 to your score and costs 0.
 *
 * 1: adds 1 to your score and costs 1.
 *
 * 2: adds 2 to your score and costs 1. ​​​​​​​
 *
 * Return the maximum score achievable without exceeding a total cost of k, or -1 if no valid path exists.
 *
 *
 * Note: If you reach the last cell but the total cost exceeds k, the path is invalid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0, 1],[2, 0]], k = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * The optimal path is:
 *
 *
 *
 *
 *
 * 			Cell
 * 			grid[i][j]
 * 			Score
 * 			Total
 *
 * 			Score
 * 			Cost
 * 			Total
 *
 * 			Cost
 *
 *
 *
 *
 *
 *
 * 			(0, 0)
 * 			0
 * 			0
 * 			0
 * 			0
 * 			0
 *
 *
 *
 *
 * 			(1, 0)
 * 			2
 * 			2
 * 			2
 * 			1
 * 			1
 *
 *
 *
 *
 * 			(1, 1)
 * 			0
 * 			0
 * 			2
 * 			0
 * 			1
 *
 *
 *
 *
 * Thus, the maximum possible score is 2.
 *
 * Example 2:
 *
 * Input: grid = [[0, 1],[1, 2]], k = 1
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * There is no path that reaches cell (1, 1)​​​​​​​ without exceeding cost k. Thus, the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m, n &lt;= 200
 *
 * 0 &lt;= k &lt;= 103​​​​​​​
 *
 * ​​​​​​​grid[0][0] == 0
 *
 * 0 &lt;= grid[i][j] &lt;= 2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Let <code>dp[i][j][c]</code> = max score at cell <code>(i,j)</code> with total cost exactly <code>c</code> (0 &lt;= <code>c</code> &lt;= <code>k</code>).
 * Hint 3: Update <code>dp[i][j][c]</code> from <code>(i-1,j)</code> and <code>(i,j-1)</code> using <code>cost = (grid[i][j] == 0 ? 0 : 1)</code> and <code>score = grid[i][j]</code>.
 * Hint 4: Answer = <code>max(dp[m-1][n-1][c])</code> for <code>c=0..k</code>, or <code>-1</code> if none.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/maximum-path-score-in-a-grid/">LeetCode #3742</a>
 */
public class MaximumPathScoreInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Path Score in a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumPathScoreInAGrid ===");
        MaximumPathScoreInAGrid sol = new MaximumPathScoreInAGrid();
        System.out.println(sol.solve(null));
    }
}
