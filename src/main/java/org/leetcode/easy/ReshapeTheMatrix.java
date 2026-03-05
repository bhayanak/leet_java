package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #566: Reshape the Matrix
 * @see <a href="https://leetcode.com/problems/reshape-the-matrix/">Problem</a>
 */
public class ReshapeTheMatrix {

    /**
     * LeetCode #566 – Reshape the Matrix
     * Difficulty: EASY
     * Topics: Array, Matrix, Simulation
     *
     * In MATLAB, there is a handy function called reshape which can reshape an m
     * x n matrix into a new one with a different size r x c keeping its original
     * data.
     * 
     * 
     * You are given an m x n matrix mat and two integers r and c representing the
     * number of rows and the number of columns of the wanted reshaped matrix.
     * 
     * 
     * The reshaped matrix should be filled with all the elements of the original
     * matrix in the same row-traversing order as they were.
     * 
     * 
     * If the reshape operation with given parameters is possible and legal,
     * output the new reshaped matrix; Otherwise, output the original matrix.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: mat = [[1,2],[3,4]], r = 1, c = 4
     * Output: [[1,2,3,4]]
     * 
     * Example 2:
     * 
     * Input: mat = [[1,2],[3,4]], r = 2, c = 4
     * Output: [[1,2],[3,4]]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * m == mat.length
     * 
     * n == mat[i].length
     * 
     * 1 &lt;= m, n &lt;= 100
     * 
     * -1000 &lt;= mat[i][j] &lt;= 1000
     * 
     * 1 &lt;= r, c &lt;= 300

     *
     * Hints:
     *   1. Do you know how 2d matrix is stored in 1d memory? Try to map 2-dimensions into one.
     *   2. M[i][j]=M[n*i+j] , where n is the number of cols. 
This is the one way of converting 2-d indices into one 1-d index.  
Now, how will you convert 1-d index into 2-d indices?
     *   3. Try to use division and modulus to convert 1-d index into 2-d indices.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        int[][] result = new int[r][c];
        for (int i = 0; i < m * n; i++)
            result[i/c][i%c] = mat[i/n][i%n];
        return result;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix sol = new ReshapeTheMatrix();
        System.out.println(sol.matrixReshape(new int[][]{{1,2},{3,4}}, 0, 0));
    }
}
