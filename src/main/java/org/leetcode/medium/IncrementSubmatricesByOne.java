package org.leetcode.medium;


/**
 * <b>#2536 - Increment Submatrices by One</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n, indicating that we initially have an n x n 0-indexed integer matrix mat filled with zeroes.
 *
 *
 * You are also given a 2D integer array query. For each query[i] = [row1i, col1i, row2i, col2i], you should do the following operation:
 *
 *
 * Add 1 to every element in the submatrix with the top left corner (row1i, col1i) and the bottom right corner (row2i, col2i). That is, add 1 to mat[x][y] for all row1i &lt;= x &lt;= row2i and col1i &lt;= y &lt;= col2i.
 *
 * Return the matrix mat after performing every query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, queries = [[1,1,2,2],[0,0,1,1]]
 * Output: [[1,1,0],[1,2,1],[0,1,1]]
 * Explanation: The diagram above shows the initial matrix, the matrix after the first query, and the matrix after the second query.
 * - In the first query, we add 1 to every element in the submatrix with the top left corner (1, 1) and bottom right corner (2, 2).
 * - In the second query, we add 1 to every element in the submatrix with the top left corner (0, 0) and bottom right corner (1, 1).
 *
 * Example 2:
 *
 * Input: n = 2, queries = [[0,0,1,1]]
 * Output: [[1,1],[1,1]]
 * Explanation: The diagram above shows the initial matrix and the matrix after the first query.
 * - In the first query we add 1 to every element in the matrix.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 500
 *
 * 1 &lt;= queries.length &lt;= 104
 *
 * 0 &lt;= row1i &lt;= row2i &lt; n
 *
 * 0 &lt;= col1i &lt;= col2i &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Imagine each row as a separate array. Instead of updating the whole submatrix together, we can use prefix sum to update each row separately.
 * Hint 2: For each query, iterate over the rows i in the range [row1, row2] and add 1 to prefix sum S[i][col1], and subtract 1 from S[i][col2 + 1].
 * Hint 3: After doing this operation for all the queries, update each row separately with S[i][j] = S[i][j] + S[i][j - 1].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/increment-submatrices-by-one/">LeetCode #2536</a>
 */
public class IncrementSubmatricesByOne {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Increment Submatrices by One");
    }

    public static void main(String[] args) {
        System.out.println("=== IncrementSubmatricesByOne ===");
        IncrementSubmatricesByOne sol = new IncrementSubmatricesByOne();
        System.out.println(sol.solve(null));
    }
}
