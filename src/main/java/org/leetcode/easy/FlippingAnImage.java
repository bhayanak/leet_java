package org.leetcode.easy;


/**
 * <b>#832 - Flipping an Image</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, Bit Manipulation, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 *
 *
 * To flip an image horizontally means that each row of the image is reversed.
 *
 *
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 *
 *
 * For example, inverting [0,1,1] results in [1,0,0].
 *
 *
 *
 * Example 1:
 *
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * Example 2:
 *
 * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 *
 *
 * Constraints:
 *
 *
 * n == image.length
 *
 * n == image[i].length
 *
 * 1 &lt;= n &lt;= 20
 *
 * images[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Bit Manipulation, Matrix, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/flipping-an-image/">LeetCode #832</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class FlippingAnImage {

    /**
     * Solves the problem: Flip and invert image.
     * Uses a two-pointer approach for in-place linear scan.
     *
     * @param image the image (int[][])
     * @return the computed int[][] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int l = 0, r = row.length - 1;
            while (l <= r) {
                int tmp = row[l] ^ 1;
                row[l] = row[r] ^ 1;
                row[r] = tmp;
                l++; r--;
            }
        }
        return image;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FlippingAnImage.java &amp;&amp; java org.leetcode.easy.FlippingAnImage</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        FlippingAnImage sol = new FlippingAnImage();
                int[][] r = sol.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
                for (int[] row : r) System.out.println(java.util.Arrays.toString(row));
                // [1,0,0][0,1,0][1,1,1]
    }
}
