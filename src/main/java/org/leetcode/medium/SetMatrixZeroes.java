package org.leetcode.medium;

/**
 * <b>#73 - Set Matrix Zeroes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * 
 * 
 * You must do it in place.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * Example 2:
 * 
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * m == matrix.length
 * 	
 * n == matrix[0].length
 * 	
 * 1 &lt;= m, n &lt;= 200
 * 	
 * -231 &lt;= matrix[i][j] &lt;= 231 - 1
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * A straightforward solution using O(mn) space is probably a bad idea.
 * 	
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * 	
 * Could you devise a constant space solution?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - If any cell of the matrix has a zero we can record its row and column number using additional memory.
But if you don't want to use extra memory then you can manipulate the array instead. i.e. simulating exactly what the question says.
 * - Setting cell values to zero on the fly while iterating might lead to discrepancies. What if you use some other integer value as your marker?
There is still a better approach for this problem with O(1) space.
 * - We could have used 2 sets to keep a record of rows/columns which need to be set to zero. But for an O(1) space solution, you can use one of the rows and and one of the columns to keep track of this information.
 * - We can use the first cell of every row and column as a flag. This flag would determine whether a row or column has been set to zero.
 *
 * <h2>Approach</h2>
 * Use the first row and first column as in-place markers for which rows/cols to zero.
 * Track separately whether row0 and col0 themselves should be zeroed.
 *
 * <h2>Complexity</h2>
* Time: O(m·n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/set-matrix-zeroes/">LeetCode #73</a>
 */
public class SetMatrixZeroes {

    /**
     * Sets entire row and column to zero for every cell that is zero (in-place, O(1) space).
     *
     * @param matrix m×n integer matrix (modified in-place)
     */
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean row0 = false, col0 = false;
        // Check if first row/col need zeroing
        for (int j = 0; j < n; j++) if (matrix[0][j] == 0) row0 = true;
        for (int i = 0; i < m; i++) if (matrix[i][0] == 0) col0 = true;
        // Use first row/col as markers
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0) { matrix[i][0] = 0; matrix[0][j] = 0; }
        // Zero out marked cells
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
        if (row0) for (int j = 0; j < n; j++) matrix[0][j] = 0;
        if (col0) for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                SetMatrixZeroes sol = new SetMatrixZeroes();
                int[][] m = {{1,1,1},{1,0,1},{1,1,1}};
                sol.setZeroes(m);
                for (int[] r : m) System.out.println(java.util.Arrays.toString(r));
                // [1,0,1][0,0,0][1,0,1]
    }
}
