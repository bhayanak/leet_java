package org.leetcode.hard;


/**
 * <b>#3225 - Maximum Score From Grid Operations</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D matrix grid of size n x n. Initially, all cells of the grid are colored white. In one operation, you can select any cell of indices (i, j), and color black all the cells of the jth column starting from the top row down to the ith row.
 *
 *
 * The grid score is the sum of all grid[i][j] such that cell (i, j) is white and it has a horizontally adjacent black cell.
 *
 *
 * Return the maximum score that can be achieved after some number of operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,0,0,0,0],[0,0,3,0,0],[0,1,0,0,0],[5,0,0,3,0],[0,0,0,0,2]]
 *
 *
 * Output: 11
 *
 *
 * Explanation:
 *
 *
 * In the first operation, we color all cells in column 1 down to row 3, and in the second operation, we color all cells in column 4 down to the last row. The score of the resulting grid is grid[3][0] + grid[1][2] + grid[3][3] which is equal to 11.
 *
 * Example 2:
 *
 * Input: grid = [[10,9,0,0,15],[7,1,0,8,0],[5,20,0,11,0],[0,0,0,1,2],[8,12,1,10,3]]
 *
 *
 * Output: 94
 *
 *
 * Explanation:
 *
 *
 * We perform operations on 1, 2, and 3 down to rows 1, 4, and 0, respectively. The score of the resulting grid is grid[0][0] + grid[1][0] + grid[2][1] + grid[4][1] + grid[1][3] + grid[2][3] + grid[3][3] + grid[4][3] + grid[0][4] which is equal to 94.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == grid.length &lt;= 100
 *
 * n == grid[i].length
 *
 * 0 &lt;= grid[i][j] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Solve the problem in O(N^4) using a 3-states dp.
 * Hint 3: Let <code>dp[i][lastHeight][beforeLastHeight]</code> denote the maximum score if the grid was limited to column <code>i</code>, and the height of column <code>i - 1</code> is <code>lastHeight</code> and the height of column <code>i - 2</code> is <code>beforeLastHeight</code>.
 * Hint 4: The third state, <code>beforeLastHeight</code>, is used to determine which values of column <code>i - 1</code> will be added to the score.  We can replace this state with another state that only takes two values 0 or 1.
 * Hint 5: Let <code>dp[i][lastHeight][isBigger]</code> denote the maximum score if the grid was limited to column <code>i</code>, and where the height of column <code>i - 1</code> is <code>lastHeight</code>. Additionally, if <code>isBigger == 1</code>, the number of black cells in column <code>i</code> is assumed to be larger than the number of black cells in column <code>i - 2</code>, and vice versa. Note that if our assumption is wrong, it would lead to a suboptimal score and, therefore, it would not be considered as the final answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-from-grid-operations/">LeetCode #3225</a>
 */
public class MaximumScoreFromGridOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score From Grid Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumScoreFromGridOperations ===");
        MaximumScoreFromGridOperations sol = new MaximumScoreFromGridOperations();
        System.out.println(sol.solve(null));
    }
}
