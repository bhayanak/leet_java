package org.leetcode.medium;


/**
 * <b>#1975 - Maximum Matrix Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an n x n integer matrix. You can do the following operation any number of times:
 *
 *
 * Choose any two adjacent elements of matrix and multiply each of them by -1.
 *
 * Two elements are considered adjacent if and only if they share a border.
 *
 *
 * Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's elements using the operation mentioned above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[1,-1],[-1,1]]
 * Output: 4
 * Explanation: We can follow the following steps to reach sum equals 4:
 * - Multiply the 2 elements in the first row by -1.
 * - Multiply the 2 elements in the first column by -1.
 *
 * Example 2:
 *
 * Input: matrix = [[1,2,3],[-1,-2,-3],[1,2,3]]
 * Output: 16
 * Explanation: We can follow the following step to reach sum equals 16:
 * - Multiply the 2 last elements in the second row by -1.
 *
 *
 *
 * Constraints:
 *
 *
 * n == matrix.length == matrix[i].length
 *
 * 2 &lt;= n &lt;= 250
 *
 * -105 &lt;= matrix[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to use the operation so that each row has only one negative number.
 * Hint 2: If you have only one negative element you cannot convert it to positive.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-matrix-sum/">LeetCode #1975</a>
 */
public class MaximumMatrixSum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Matrix Sum");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumMatrixSum ===");
        MaximumMatrixSum sol = new MaximumMatrixSum();
        System.out.println(sol.solve(null));
    }
}
