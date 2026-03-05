package org.leetcode.easy;


/**
 * <b>#2319 - Check if Matrix Is X-Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A square matrix is said to be an X-Matrix if both of the following conditions hold:
 *
 *
 * All the elements in the diagonals of the matrix are non-zero.
 *
 * All other elements are 0.
 *
 * Given a 2D integer array grid of size n x n representing a square matrix, return true if grid is an X-Matrix. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
 * Output: true
 * Explanation: Refer to the diagram above. 
 * An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
 * Thus, grid is an X-Matrix.
 *
 * Example 2:
 *
 * Input: grid = [[5,7,0],[0,3,1],[0,5,0]]
 * Output: false
 * Explanation: Refer to the diagram above.
 * An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
 * Thus, grid is not an X-Matrix.
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == grid[i].length
 *
 * 3 &lt;= n &lt;= 100
 *
 * 0 &lt;= grid[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Assuming a 0-indexed matrix, for a given cell on row i and column j, it is in a diagonal if and only if i == j or i == n - 1 - j.
 * Hint 2: We can then iterate through the elements in the matrix to check if all the elements in the diagonals are non-zero and all other elements are zero.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/check-if-matrix-is-x-matrix/">LeetCode #2319</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfMatrixIsXMatrix {

    /**
     * Checks Check x matrix.
     *
     * @param grid the grid (int[][])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        for (int i=0;i<n;i++) for (int j=0;j<n;j++) {
            boolean onDiag=(i==j||i+j==n-1);
            if (onDiag&&grid[i][j]==0) return false;
            if (!onDiag&&grid[i][j]!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfMatrixIsXMatrix sol = new CheckIfMatrixIsXMatrix();
                System.out.println(sol.checkXMatrix(new int[][]{{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}})); // true
                System.out.println(sol.checkXMatrix(new int[][]{{5,7,0},{0,3,1},{0,5,0}})); // false
    }
}
