package org.leetcode.easy;


/**
 * <b>#2022 - Convert 1D Array Into 2D Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.
 *
 *
 * The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
 *
 *
 * Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: original = [1,2,3,4], m = 2, n = 2
 * Output: [[1,2],[3,4]]
 * Explanation: The constructed 2D array should contain 2 rows and 2 columns.
 * The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
 * The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.
 *
 * Example 2:
 *
 * Input: original = [1,2,3], m = 1, n = 3
 * Output: [[1,2,3]]
 * Explanation: The constructed 2D array should contain 1 row and 3 columns.
 * Put all three elements in original into the first row of the constructed 2D array.
 *
 * Example 3:
 *
 * Input: original = [1,2], m = 1, n = 1
 * Output: []
 * Explanation: There are 2 elements in original.
 * It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= original.length &lt;= 5 * 104
 *
 * 1 &lt;= original[i] &lt;= 105
 *
 * 1 &lt;= m, n &lt;= 4 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: When is it possible to convert original into a 2D array and when is it impossible?
 * Hint 2: It is possible if and only if m * n == original.length
 * Hint 3: If it is possible to convert original to a 2D array, keep an index i such that original[i] is the next element to add to the 2D array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/convert-1d-array-into-2d-array/">LeetCode #2022</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class Convert1dArrayInto2dArray {

    /**
     * Solves the problem: Construct2 d array.
     *
     * @param original the original (int[])
     * @param m the m (int)
     * @param n the n (int)
     * @return the computed int[][] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m*n) return new int[][]{};
        int[][] res = new int[m][n];
        for (int i=0;i<original.length;i++) res[i/n][i%n]=original[i];
        return res;
    }

    public static void main(String[] args) {
        Convert1dArrayInto2dArray sol = new Convert1dArrayInto2dArray();
                System.out.println(java.util.Arrays.deepToString(sol.construct2DArray(new int[]{1,2,3,4},2,2))); // [[1,2],[3,4]]
                System.out.println(java.util.Arrays.deepToString(sol.construct2DArray(new int[]{1,2,3},1,3))); // [[1,2,3]]
                System.out.println(java.util.Arrays.deepToString(sol.construct2DArray(new int[]{1,2},1,1))); // []
    }
}
