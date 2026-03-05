package org.leetcode.hard;


/**
 * <b>#3256 - Maximum Value Sum by Placing Three Rooks I</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a m x n 2D array board representing a chessboard, where board[i][j] represents the value of the cell (i, j).
 *
 *
 * Rooks in the same row or column attack each other. You need to place three rooks on the chessboard such that the rooks do not attack each other.
 *
 *
 * Return the maximum sum of the cell values on which the rooks are placed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: board = [[-3,1,1,1],[-3,1,-3,1],[-3,2,1,1]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 * We can place the rooks in the cells (0, 2), (1, 3), and (2, 1) for a sum of 1 + 1 + 2 = 4.
 *
 * Example 2:
 *
 * Input: board = [[1,2,3],[4,5,6],[7,8,9]]
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * We can place the rooks in the cells (0, 0), (1, 1), and (2, 2) for a sum of 1 + 5 + 9 = 15.
 *
 * Example 3:
 *
 * Input: board = [[1,1,1],[1,1,1],[1,1,1]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * We can place the rooks in the cells (0, 2), (1, 1), and (2, 0) for a sum of 1 + 1 + 1 = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= m == board.length &lt;= 100
 *
 * 3 &lt;= n == board[i].length &lt;= 100
 *
 * -109 &lt;= board[i][j] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Store the largest 3 values for each row.
 * Hint 2: Select any 3 rows and brute force all combinations.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/maximum-value-sum-by-placing-three-rooks-i/">LeetCode #3256</a>
 */
public class MaximumValueSumByPlacingThreeRooksI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Value Sum by Placing Three Rooks I");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumValueSumByPlacingThreeRooksI ===");
        MaximumValueSumByPlacingThreeRooksI sol = new MaximumValueSumByPlacingThreeRooksI();
        System.out.println(sol.solve(null));
    }
}
