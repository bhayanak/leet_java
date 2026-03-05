package org.leetcode.medium;


/**
 * <b>#3030 - Find the Grid of Region Average</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given m x n grid image which represents a grayscale image, where image[i][j] represents a pixel with intensity in the range [0..255]. You are also given a non-negative integer threshold.
 *
 *
 * Two pixels are adjacent if they share an edge.
 *
 *
 * A region is a 3 x 3 subgrid where the absolute difference in intensity between any two adjacent pixels is less than or equal to threshold.
 *
 *
 * All pixels in a region belong to that region, note that a pixel can belong to multiple regions.
 *
 *
 * You need to calculate a m x n grid result, where result[i][j] is the average intensity of the regions to which image[i][j] belongs, rounded down to the nearest integer. If image[i][j] belongs to multiple regions, result[i][j] is the average of the rounded-down average intensities of these regions, rounded down to the nearest integer. If image[i][j] does not belong to any region, result[i][j] is equal to image[i][j].
 *
 *
 * Return the grid result.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: image = [[5,6,7,10],[8,9,10,10],[11,12,13,10]], threshold = 3
 *
 *
 * Output: [[9,9,9,9],[9,9,9,9],[9,9,9,9]]
 *
 *
 * Explanation:
 *
 * There are two regions as illustrated above. The average intensity of the first region is 9, while the average intensity of the second region is 9.67 which is rounded down to 9. The average intensity of both of the regions is (9 + 9) / 2 = 9. As all the pixels belong to either region 1, region 2, or both of them, the intensity of every pixel in the result is 9.
 *
 *
 * Please note that the rounded-down values are used when calculating the average of multiple regions, hence the calculation is done using 9 as the average intensity of region 2, not 9.67.
 *
 * Example 2:
 *
 * Input: image = [[10,20,30],[15,25,35],[20,30,40],[25,35,45]], threshold = 12
 *
 *
 * Output: [[25,25,25],[27,27,27],[27,27,27],[30,30,30]]
 *
 *
 * Explanation:
 *
 * There are two regions as illustrated above. The average intensity of the first region is 25, while the average intensity of the second region is 30. The average intensity of both of the regions is (25 + 30) / 2 = 27.5 which is rounded down to 27.
 *
 *
 * All the pixels in row 0 of the image belong to region 1, hence all the pixels in row 0 in the result are 25. Similarly, all the pixels in row 3 in the result are 30. The pixels in rows 1 and 2 of the image belong to region 1 and region 2, hence their assigned value is 27 in the result.
 *
 * Example 3:
 *
 * Input: image = [[5,6,7],[8,9,10],[11,12,13]], threshold = 1
 *
 *
 * Output: [[5,6,7],[8,9,10],[11,12,13]]
 *
 *
 * Explanation:
 *
 *
 * There is only one 3 x 3 subgrid, while it does not have the condition on difference of adjacent pixels, for example, the difference between image[0][0] and image[1][0] is |5 - 8| = 3 &gt; threshold = 1. None of them belong to any valid regions, so the result should be the same as image.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n, m &lt;= 500
 *
 * 0 &lt;= image[i][j] &lt;= 255
 *
 * 0 &lt;= threshold &lt;= 255
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try all the <code>3 * 3</code> sub-grids to find all the regions.
 * Hint 2: Keep two 2-D arrays <code>sum</code> and <code>num</code>, for each position <code>(x, y)</code> in a region, increase <code>sum[x][y]</code> by the average sum of the region and increase <code>num[x][y]</code> by <code>1</code>.
 * Hint 3: For each position (x, y), <code>sum[x][y] / num[x][y]</code> is the answer. Note when <code>num[x][y] == 0</code>, we use the original value in <code>image</code> instead.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/find-the-grid-of-region-average/">LeetCode #3030</a>
 */
public class FindTheGridOfRegionAverage {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Grid of Region Average");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheGridOfRegionAverage ===");
        FindTheGridOfRegionAverage sol = new FindTheGridOfRegionAverage();
        System.out.println(sol.solve(null));
    }
}
