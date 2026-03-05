package org.leetcode.easy;


/**
 * <b>#2946 - Matrix Similarity After Cyclic Shifts</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix mat and an integer k. The matrix rows are 0-indexed.
 *
 *
 * The following proccess happens k times:
 *
 *
 * Even-indexed rows (0, 2, 4, ...) are cyclically shifted to the left.
 *
 *
 * Odd-indexed rows (1, 3, 5, ...) are cyclically shifted to the right.
 *
 * Return true if the final modified matrix after k steps is identical to the original matrix, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 4
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * In each step left shift is applied to rows 0 and 2 (even indices), and right shift to row 1 (odd index).
 *
 * Example 2:
 *
 * Input: mat = [[1,2,1,2],[5,5,5,5],[6,3,6,3]], k = 2
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 * Example 3:
 *
 * Input: mat = [[2,2],[2,2]], k = 3
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * As all the values are equal in the matrix, even after performing cyclic shifts the matrix will remain the same.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= mat.length &lt;= 25
 *
 * 1 &lt;= mat[i].length &lt;= 25
 *
 * 1 &lt;= mat[i][j] &lt;= 25
 *
 * 1 &lt;= k &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can reduce <code>k</code> shifts to <code>(k % n)</code> shifts as after <code>n</code> shifts the matrix will become similar to the initial matrix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Matrix, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/">LeetCode #2946</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
  */
public class MatrixSimilarityAfterCyclicShifts {

    /**
     * Finds the longest Longest common prefix.
     *
     * @param arr1 the arr1 (int[])
     * @param arr2 the arr2 (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
      */
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        java.util.Set<String> prefixes=new java.util.HashSet<>();
        for (int n:arr1) { String s=String.valueOf(n); for (int i=1;i<=s.length();i++) prefixes.add(s.substring(0,i)); }
        int max=0;
        for (int n:arr2) { String s=String.valueOf(n); for (int i=1;i<=s.length();i++) if (prefixes.contains(s.substring(0,i))) max=Math.max(max,i); }
        return max;
    }

    public static void main(String[] args) {
        MatrixSimilarityAfterCyclicShifts sol = new MatrixSimilarityAfterCyclicShifts();
        System.out.println(sol.longestCommonPrefix(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
