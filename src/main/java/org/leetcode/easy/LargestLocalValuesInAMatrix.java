package org.leetcode.easy;


/**
 * <b>#2373 - Largest Local Values in a Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an n x n integer matrix grid.
 *
 *
 * Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
 *
 *
 * maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
 *
 * In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
 *
 *
 * Return the generated matrix.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
 * Output: [[9,9],[8,6]]
 * Explanation: The diagram above shows the original matrix and the generated matrix.
 * Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
 *
 * Example 2:
 *
 * Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
 * Output: [[2,2,2],[2,2,2],[2,2,2]]
 * Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
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
 * 1 &lt;= grid[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use nested loops to run through all possible 3 x 3 windows in the matrix.
 * Hint 2: For each 3 x 3 window, iterate through the values to get the maximum value within the window.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/largest-local-values-in-a-matrix/">LeetCode #2373</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class LargestLocalValuesInAMatrix {

    /**
     * Solves the problem: Largest local.
     *
     * @param grid the grid (int[][])
     * @return the computed int[][] result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] res=new int[n-2][n-2];
        for (int i=0;i<n-2;i++) for (int j=0;j<n-2;j++) {
            int max=0;
            for (int r=i;r<=i+2;r++) for (int c=j;c<=j+2;c++) max=Math.max(max,grid[r][c]);
            res[i][j]=max;
        }
        return res;
    }

    public static void main(String[] args) {
        LargestLocalValuesInAMatrix sol = new LargestLocalValuesInAMatrix();
                System.out.println(java.util.Arrays.deepToString(sol.largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}}))); // [[9,9],[8,6]]
                System.out.println(java.util.Arrays.deepToString(sol.largestLocal(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}}))); // [[2,2,2],[2,2,2],[2,2,2]]
    }
}
