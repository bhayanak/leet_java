package org.leetcode.easy;


/**
 * <b>#2133 - Check if Every Row and Column Contains All Numbers</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
 *
 *
 * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
 * Output: true
 * Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
 * Hence, we return true.
 *
 * Example 2:
 *
 * Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
 * Output: false
 * Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
 * Hence, we return false.
 *
 *
 *
 * Constraints:
 *
 *
 * n == matrix.length == matrix[i].length
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= matrix[i][j] &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use for loops to check each row for every number from 1 to n. Similarly, do the same for each column.
 * Hint 2: For each check, you can keep a set of the unique elements in the checked row/col. By the end of the check, the size of the set should be n.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/">LeetCode #2133</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfEveryRowAndColumnContainsAllNumbers {

    /**
     * Checks Check valid.
     *
     * @param matrix the matrix (int[][])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for (int i=0;i<n;i++) {
            boolean[] rowSeen=new boolean[n+1], colSeen=new boolean[n+1];
            for (int j=0;j<n;j++) {
                if (rowSeen[matrix[i][j]]||colSeen[matrix[j][i]]) return false;
                rowSeen[matrix[i][j]]=true; colSeen[matrix[j][i]]=true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfEveryRowAndColumnContainsAllNumbers sol = new CheckIfEveryRowAndColumnContainsAllNumbers();
                System.out.println(sol.checkValid(new int[][]{{1,2,3},{3,1,2},{2,3,1}})); // true
                System.out.println(sol.checkValid(new int[][]{{1,1,1},{1,2,3},{1,2,3}})); // false
    }
}
