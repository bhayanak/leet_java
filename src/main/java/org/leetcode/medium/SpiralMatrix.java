package org.leetcode.medium;

/**
 * <b>#54 - Spiral Matrix</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * Example 2:
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
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
 * 1 &lt;= m, n &lt;= 10
 * 	
 * -100 &lt;= matrix[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Well for some problems, the best way really is to come up with some algorithms for simulation. Basically, you need to simulate what the problem asks us to do.
 * - We go boundary by boundary and move inwards. That is the essential operation. First row, last column, last row, first column, and then we move inwards by 1 and repeat. That's all. That is all the simulation that we need.
 * - Think about when you want to switch the progress on one of the indexes. If you progress on i out of [i, j], you'll shift in the same column. Similarly, by changing values for j, you'd be shifting in the same row.
Also, keep track of the end of a boundary so that you can move inwards and then keep repeating. It's always best to simulate edge cases like a single column or a single row to see if anything breaks or not.
 *
 * <h2>Approach</h2>
 * Maintain four boundaries (top, bottom, left, right). Traverse in spiral order:
 * right along top, down along right, left along bottom, up along left.
 * Shrink each boundary after traversal.
 *
 * <h2>Complexity</h2>
* Time: O(m·n)  |  Space: O(1) excluding output
 *
 * @see <a href="https://leetcode.com/problems/spiral-matrix/">LeetCode #54</a>
 */
public class SpiralMatrix {

    /**
     * Returns all elements of an m×n matrix in spiral order.
     *
     * @param matrix input 2-D grid
     * @return       elements in clockwise spiral order
     */
    public java.util.List<Integer> spiralOrder(int[][] matrix) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        if (matrix.length == 0) return result;
        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        while (top <= bottom && left <= right) {
            for (int c = left;  c <= right;  c++) result.add(matrix[top][c]);   top++;
            for (int r = top;   r <= bottom; r++) result.add(matrix[r][right]); right--;
            if (top <= bottom)
                for (int c = right; c >= left;  c--) result.add(matrix[bottom][c]); bottom--;
            if (left <= right)
                for (int r = bottom; r >= top; r--) result.add(matrix[r][left]);  left++;
        }
        return result;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        SpiralMatrix sol = new SpiralMatrix();
        System.out.println("No method available");
    }
}
