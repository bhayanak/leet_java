package org.leetcode.medium;

/**
 * <b>#48 - Rotate Image</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * 
 * 
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * 
 * Example 2:
 * 
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == matrix.length == matrix[i].length
 * 	
 * 1 &lt;= n &lt;= 20
 * 	
 * -1000 &lt;= matrix[i][j] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Two-step in-place: 1) Transpose (swap matrix[i][j] with matrix[j][i]).
 *                   2) Reverse each row.
 * This achieves the clockwise 90° rotation without extra space.
 *
 * <h2>Complexity</h2>
* Time: O(n²)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/rotate-image/">LeetCode #48</a>
 */
public class RotateImage {

    /**
     * Rotates an n×n matrix 90 degrees clockwise in-place.
     *
     * @param matrix n×n integer matrix (modified in-place)
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++) {
                int tmp = matrix[i][j]; matrix[i][j] = matrix[j][i]; matrix[j][i] = tmp;
            }
        // Reverse each row
        for (int[] row : matrix) {
            int l = 0, r = n - 1;
            while (l < r) { int tmp = row[l]; row[l++] = row[r]; row[r--] = tmp; }
        }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                RotateImage sol = new RotateImage();
                int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
                sol.rotate(m);
                for (int[] r : m) System.out.println(java.util.Arrays.toString(r));
                // [7,4,1][8,5,2][9,6,3]
    }
}
