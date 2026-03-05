package org.leetcode.hard;


/**
 * <b>#3288 - Length of the Longest Increasing Path</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D array of integers coordinates of length n and an integer k, where 0 &lt;= k &lt; n.
 *
 *
 * coordinates[i] = [xi, yi] indicates the point (xi, yi) in a 2D plane.
 *
 *
 * An increasing path of length m is defined as a list of points (x1, y1), (x2, y2), (x3, y3), ..., (xm, ym) such that:
 *
 *
 * xi &lt; xi + 1 and yi &lt; yi + 1 for all i where 1 &lt;= i &lt; m.
 *
 * (xi, yi) is in the given coordinates for all i where 1 &lt;= i &lt;= m.
 *
 * Return the maximum length of an increasing path that contains coordinates[k].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: coordinates = [[3,1],[2,2],[4,1],[0,0],[5,3]], k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * (0, 0), (2, 2), (5, 3) is the longest increasing path that contains (2, 2).
 *
 * Example 2:
 *
 * Input: coordinates = [[2,1],[7,0],[5,6]], k = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * (2, 1), (5, 6) is the longest increasing path that contains (5, 6).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == coordinates.length &lt;= 105
 *
 * coordinates[i].length == 2
 *
 * 0 &lt;= coordinates[i][0], coordinates[i][1] &lt;= 109
 *
 * All elements in coordinates are distinct.
 *
 * 0 &lt;= k &lt;= n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Only keep coordinates with both <code>x</code> and <code>y</code> being strictly less than <code>coordinates[k]</code>.
 * Hint 2: Sort them by <code>x</code>’s, in the case of equal, the <code>y</code> values should be decreasing.
 * Hint 3: Calculate LIS only using <code>y</code> values.
 * Hint 4: Do the same for coordinates with both <code>x</code> and <code>y</code> being strictly larger than <code>coordinates[k]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/length-of-the-longest-increasing-path/">LeetCode #3288</a>
 */
public class LengthOfTheLongestIncreasingPath {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Length of the Longest Increasing Path");
    }

    public static void main(String[] args) {
        System.out.println("=== LengthOfTheLongestIncreasingPath ===");
        LengthOfTheLongestIncreasingPath sol = new LengthOfTheLongestIncreasingPath();
        System.out.println(sol.solve(null));
    }
}
