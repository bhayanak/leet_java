package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #766: Toeplitz Matrix
 * @see <a href="https://leetcode.com/problems/toeplitz-matrix/">Problem</a>
 */
public class ToeplitzMatrix {

    /**
     * Returns true if the matrix is Toeplitz: every diagonal from top-left to bottom-right
     * has the same value.
     * @param matrix the 2D matrix
     * @return true if Toeplitz
     * <p><b>Explanation:</b> Every cell (r,c) must equal (r-1,c-1); check all cells except first row/col.</p>
     */
    public boolean solve(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for (int r = 1; r < rows; r++)
            for (int c = 1; c < cols; c++)
                if (matrix[r][c] != matrix[r-1][c-1]) return false;
        return true;
    }

    public static void main(String[] args) {
        ToeplitzMatrix sol = new ToeplitzMatrix();
        System.out.println(sol.solve(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}})); // true
        System.out.println(sol.solve(new int[][]{{1,2},{2,2}}));                     // false
    }

}
