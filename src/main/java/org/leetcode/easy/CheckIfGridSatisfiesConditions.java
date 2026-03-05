package org.leetcode.easy;


/**
 * <b>#3142 - Check if Grid Satisfies Conditions</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D matrix grid of size m x n. You need to check if each cell grid[i][j] is:
 *
 *
 * Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists).
 *
 * Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).
 *
 * Return true if all the cells satisfy these conditions, otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0,2],[1,0,2]]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 * All the cells in the grid satisfy the conditions.
 *
 * Example 2:
 *
 * Input: grid = [[1,1,1],[0,0,0]]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 * All cells in the first row are equal.
 *
 * Example 3:
 *
 * Input: grid = [[1],[2],[3]]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 * Cells in the first column have different values.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, m &lt;= 10
 *
 * 0 &lt;= grid[i][j] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check if each column has same value in each cell.
 * Hint 2: If the previous condition is satisfied, we can simply check the first cells in adjacent columns.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/check-if-grid-satisfies-conditions/">LeetCode #3142</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfGridSatisfiesConditions {

    /**
     * Solves the problem: Satisfies conditions.
     *
     * @param grid the grid (int[][])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean satisfiesConditions(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        for (int i=0;i<m;i++) for (int j=0;j<n;j++) {
            if (i+1<m && grid[i][j]!=grid[i+1][j]) return false;
            if (j+1<n && grid[i][j]==grid[i][j+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfGridSatisfiesConditions sol = new CheckIfGridSatisfiesConditions();
                System.out.println(sol.satisfiesConditions(new int[][]{{1,0,2},{1,0,2}})); // true
                System.out.println(sol.satisfiesConditions(new int[][]{{1,1,1},{0,0,0}})); // false
    }
}
