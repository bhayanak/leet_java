package org.leetcode.medium;


/**
 * <b>#2428 - Maximum Sum of an Hourglass</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix grid.
 *
 *
 * We define an hourglass as a part of the matrix with the following form:
 *
 *
 * Return the maximum sum of the elements of an hourglass.
 *
 *
 * Note that an hourglass cannot be rotated and must be entirely contained within the matrix.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[6,2,1,3],[4,2,1,5],[9,2,8,7],[4,1,2,9]]
 * Output: 30
 * Explanation: The cells shown above represent the hourglass with the maximum sum: 6 + 2 + 1 + 2 + 9 + 2 + 8 = 30.
 *
 * Example 2:
 *
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: 35
 * Explanation: There is only one hourglass in the matrix, with the sum: 1 + 2 + 3 + 5 + 7 + 8 + 9 = 35.
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
 * 3 &lt;= m, n &lt;= 150
 *
 * 0 &lt;= grid[i][j] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Each 3x3 submatrix has exactly one hourglass.
 * Hint 2: Find the sum of each hourglass in the matrix and return the largest of these values.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-of-an-hourglass/">LeetCode #2428</a>
 */
public class MaximumSumOfAnHourglass {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum of an Hourglass");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSumOfAnHourglass ===");
        MaximumSumOfAnHourglass sol = new MaximumSumOfAnHourglass();
        System.out.println(sol.solve(null));
    }
}
