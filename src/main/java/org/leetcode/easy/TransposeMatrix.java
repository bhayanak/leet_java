package org.leetcode.easy;


/**
 * <b>#867 - Transpose Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D integer array matrix, return the transpose of matrix.
 *
 *
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 *
 * Example 2:
 *
 * Input: matrix = [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 *
 *
 *
 * Constraints:
 *
 *
 * m == matrix.length
 *
 * n == matrix[i].length
 *
 * 1 &lt;= m, n &lt;= 1000
 *
 * 1 &lt;= m * n &lt;= 105
 *
 * -109 &lt;= matrix[i][j] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We don't need any special algorithms to do this. You just need to know what the transpose of a matrix looks like. Rows become columns and vice versa!
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/transpose-matrix/">LeetCode #867</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class TransposeMatrix {

    /**
     * Solves the problem: Transpose.
     *
     * @param matrix the matrix (int[][])
     * @return the computed int[][] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                res[j][i] = matrix[i][j];
        return res;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac TransposeMatrix.java &amp;&amp; java org.leetcode.easy.TransposeMatrix</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        TransposeMatrix sol = new TransposeMatrix();
                int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
                for (int[] r : sol.transpose(m)) System.out.println(java.util.Arrays.toString(r));
                // [1,4,7][2,5,8][3,6,9]
    }
}
