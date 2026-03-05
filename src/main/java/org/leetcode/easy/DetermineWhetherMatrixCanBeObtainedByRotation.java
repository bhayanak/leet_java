package org.leetcode.easy;


/**
 * <b>#1886 - Determine Whether Matrix Can Be Obtained By Rotation</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
 * Output: true
 * Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
 *
 * Example 2:
 *
 * Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
 * Output: false
 * Explanation: It is impossible to make mat equal to target by rotating mat.
 *
 * Example 3:
 *
 * Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
 * Output: true
 * Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 *
 *
 *
 * Constraints:
 *
 *
 * n == mat.length == target.length
 *
 * n == mat[i].length == target[i].length
 *
 * 1 &lt;= n &lt;= 10
 *
 * mat[i][j] and target[i][j] are either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the maximum number of rotations you have to check?
 * Hint 2: Is there a formula you can use to rotate a matrix 90 degrees?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/">LeetCode #1886</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class DetermineWhetherMatrixCanBeObtainedByRotation {

    /**
     * Finds Find rotation.
     *
     * @param mat the mat (int[][])
     * @param target the target (int[][])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int r=0;r<4;r++) {
            if (equals(mat,target)) return true;
            mat=rotate(mat);
        }
        return false;
    }
    private int[][] rotate(int[][] m) {
        int n=m.length; int[][] r=new int[n][n];
        for (int i=0;i<n;i++) for (int j=0;j<n;j++) r[j][n-1-i]=m[i][j];
        return r;
    }
    private boolean equals(int[][] a,int[][] b) {
        for (int i=0;i<a.length;i++) if (!java.util.Arrays.equals(a[i],b[i])) return false;
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        DetermineWhetherMatrixCanBeObtainedByRotation sol = new DetermineWhetherMatrixCanBeObtainedByRotation();
                System.out.println(sol.findRotation(new int[][]{{0,1},{1,0}}, new int[][]{{1,0},{0,1}})); // false
                System.out.println(sol.findRotation(new int[][]{{0,1},{1,1}}, new int[][]{{1,0},{0,1}})); // false
                System.out.println(sol.findRotation(new int[][]{{0,0,0},{0,1,0},{1,1,1}}, new int[][]{{1,1,1},{0,1,0},{0,0,0}})); // true
    }
}
