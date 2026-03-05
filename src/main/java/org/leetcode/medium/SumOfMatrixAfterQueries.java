package org.leetcode.medium;


/**
 * <b>#2718 - Sum of Matrix After Queries</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and a 0-indexed 2D array queries where queries[i] = [typei, indexi, vali].
 *
 *
 * Initially, there is a 0-indexed n x n matrix filled with 0's. For each query, you must apply one of the following changes:
 *
 *
 * if typei == 0, set the values in the row with indexi to vali, overwriting any previous values.
 *
 * if typei == 1, set the values in the column with indexi to vali, overwriting any previous values.
 *
 * Return the sum of integers in the matrix after all queries are applied.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, queries = [[0,0,1],[1,2,2],[0,2,3],[1,0,4]]
 * Output: 23
 * Explanation: The image above describes the matrix after each query. The sum of the matrix after all queries are applied is 23. 
 *
 * Example 2:
 *
 * Input: n = 3, queries = [[0,0,4],[0,1,2],[1,0,1],[0,2,3],[1,2,1]]
 * Output: 17
 * Explanation: The image above describes the matrix after each query. The sum of the matrix after all queries are applied is 17.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 104
 *
 * 1 &lt;= queries.length &lt;= 5 * 104
 *
 * queries[i].length == 3
 *
 * 0 &lt;= typei &lt;= 1
 *
 * 0 &lt;= indexi &lt; n
 *
 * 0 &lt;= vali &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Process queries in reversed order, as the latest queries represent the most recent changes in the matrix.
 * Hint 2: Once you encounter an operation on some row/column, no further operations will affect the values in this row/column. Keep track of seen rows and columns with a set.
 * Hint 3: When operating on an unseen row/column, the number of affected cells is the number of columns/rows you haven’t previously seen.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-matrix-after-queries/">LeetCode #2718</a>
 */
public class SumOfMatrixAfterQueries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Matrix After Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfMatrixAfterQueries ===");
        SumOfMatrixAfterQueries sol = new SumOfMatrixAfterQueries();
        System.out.println(sol.solve(null));
    }
}
