package org.leetcode.medium;


/**
 * <b>#835 - Image Overlap</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two images, img1 and img2, represented as binary, square matrices of size n x n. A binary matrix has only 0s and 1s as values.
 *
 *
 * We translate one image however we choose by sliding all the 1 bits left, right, up, and/or down any number of units. We then place it on top of the other image. We can then calculate the overlap by counting the number of positions that have a 1 in both images.
 *
 *
 * Note also that a translation does not include any kind of rotation. Any 1 bits that are translated outside of the matrix borders are erased.
 *
 *
 * Return the largest possible overlap.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: img1 = [[1,1,0],[0,1,0],[0,1,0]], img2 = [[0,0,0],[0,1,1],[0,0,1]]
 * Output: 3
 * Explanation: We translate img1 to right by 1 unit and down by 1 unit.
 *
 * The number of positions that have a 1 in both images is 3 (shown in red).
 *
 * Example 2:
 *
 * Input: img1 = [[1]], img2 = [[1]]
 * Output: 1
 *
 * Example 3:
 *
 * Input: img1 = [[0]], img2 = [[0]]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * n == img1.length == img1[i].length
 *
 * n == img2.length == img2[i].length
 *
 * 1 &lt;= n &lt;= 30
 *
 * img1[i][j] is either 0 or 1.
 *
 * img2[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/image-overlap/">LeetCode #835</a>
 */
public class ImageOverlap {

    /**
     * TODO: Implement "Image Overlap".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Image Overlap");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ImageOverlap.java &amp;&amp; java org.leetcode.medium.ImageOverlap</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ImageOverlap ===");
        ImageOverlap sol = new ImageOverlap();
        System.out.println(sol.solve(null));
    }
}
