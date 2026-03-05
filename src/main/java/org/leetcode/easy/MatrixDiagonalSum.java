package org.leetcode.easy;


/**
 * <b>#1572 - Matrix Diagonal Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[1,2,3],
 *               [4,5,6],
 *               [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 *
 * Example 2:
 *
 * Input: mat = [[1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1]]
 * Output: 8
 *
 * Example 3:
 *
 * Input: mat = [[5]]
 * Output: 5
 *
 *
 *
 * Constraints:
 *
 *
 * n == mat.length == mat[i].length
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= mat[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There will be overlap of elements in the primary and secondary diagonals if and only if the length of the matrix is odd, which is at the center.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/matrix-diagonal-sum/">LeetCode #1572</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class MatrixDiagonalSum {

    /**
     * Solves the problem: Diagonal sum.
     *
     * @param mat the mat (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int diagonalSum(int[][] mat) {
        int n=mat.length, sum=0;
        for (int i=0;i<n;i++) {
            sum+=mat[i][i]+mat[i][n-1-i];
        }
        if (n%2==1) sum-=mat[n/2][n/2]; // middle counted twice
        return sum;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MatrixDiagonalSum sol = new MatrixDiagonalSum();
                System.out.println(sol.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));    // 25
                System.out.println(sol.diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}})); // 8
                System.out.println(sol.diagonalSum(new int[][]{{5}})); // 5
    }
}
