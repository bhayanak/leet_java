package org.leetcode.easy;


/**
 * <b>#2639 - Find the Width of Columns of a Grid</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed m x n integer matrix grid. The width of a column is the maximum length of its integers.
 *
 *
 * For example, if grid = [[-10], [3], [12]], the width of the only column is 3 since -10 is of length 3.
 *
 * Return an integer array ans of size n where ans[i] is the width of the ith column.
 *
 *
 * The length of an integer x with len digits is equal to len if x is non-negative, and len + 1 otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1],[22],[333]]
 * Output: [3]
 * Explanation: In the 0th column, 333 is of length 3.
 *
 * Example 2:
 *
 * Input: grid = [[-15,1,3],[15,7,12],[5,6,-2]]
 * Output: [3,1,2]
 * Explanation: 
 * In the 0th column, only -15 is of length 3.
 * In the 1st column, all integers are of length 1. 
 * In the 2nd column, both 12 and -2 are of length 2.
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
 * 1 &lt;= m, n &lt;= 100 
 *
 * -109 &lt;= grid[r][c] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can find the length of a number by dividing it by 10 and then rounding it down again and again until this number becomes equal to 0. Add 1 if this number is negative.
 * Hint 2: Traverse the matrix column-wise to find the maximum length in each column.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/">LeetCode #2639</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindTheWidthOfColumnsOfAGrid {

    /**
     * Finds Find column width.
     *
     * @param grid the grid (int[][])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int[] findColumnWidth(int[][] grid) {
        int n=grid[0].length;
        int[] res=new int[n];
        for (int j=0;j<n;j++) for (int[] row:grid) res[j]=Math.max(res[j],String.valueOf(row[j]).length());
        return res;
    }

    public static void main(String[] args) {
        FindTheWidthOfColumnsOfAGrid sol = new FindTheWidthOfColumnsOfAGrid();
                System.out.println(java.util.Arrays.toString(sol.findColumnWidth(new int[][]{{1},{22},{333}}))); // [3]
                System.out.println(java.util.Arrays.toString(sol.findColumnWidth(new int[][]{{0,-1},{1,0},{1,-2}}))); // [1,2]
    }
}
