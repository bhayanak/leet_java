package org.leetcode.hard;


/**
 * <b>#1284 - Minimum Number of Flips to Convert Binary Matrix to Zero Matrix</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a m x n binary matrix mat. In one step, you can choose one cell and flip it and all the four neighbors of it if they exist (Flip is changing 1 to 0 and 0 to 1). A pair of cells are called neighbors if they share one edge.
 *
 *
 * Return the minimum number of steps required to convert mat to a zero matrix or -1 if you cannot.
 *
 *
 * A binary matrix is a matrix with all cells equal to 0 or 1 only.
 *
 *
 * A zero matrix is a matrix with all cells equal to 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[0,0],[0,1]]
 * Output: 3
 * Explanation: One possible solution is to flip (1, 0) then (0, 1) and finally (1, 1) as shown.
 *
 * Example 2:
 *
 * Input: mat = [[0]]
 * Output: 0
 * Explanation: Given matrix is a zero matrix. We do not need to change it.
 *
 * Example 3:
 *
 * Input: mat = [[1,0,0],[1,0,0]]
 * Output: -1
 * Explanation: Given matrix cannot be a zero matrix.
 *
 *
 *
 * Constraints:
 *
 *
 * m == mat.length
 *
 * n == mat[i].length
 *
 * 1 &lt;= m, n &lt;= 3
 *
 * mat[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Flipping same index two times is like not flipping it at all. Each index can be flipped one time. Try all possible combinations. O(2^(n*m)).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-flips-to-convert-binary-matrix-to-zero-matrix/">LeetCode #1284</a>
 */
public class MinimumNumberOfFlipsToConvertBinaryMatrixToZeroMatrix {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Flips to Convert Binary Matrix to Zero Matrix");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfFlipsToConvertBinaryMatrixToZeroMatrix ===");
        MinimumNumberOfFlipsToConvertBinaryMatrixToZeroMatrix sol = new MinimumNumberOfFlipsToConvertBinaryMatrixToZeroMatrix();
        System.out.println(sol.solve(null));
    }
}
