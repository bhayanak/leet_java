package org.leetcode.medium;


/**
 * <b>#1401 - Circle and Rectangle Overlapping</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a circle represented as (radius, xCenter, yCenter) and an axis-aligned rectangle represented as (x1, y1, x2, y2), where (x1, y1) are the coordinates of the bottom-left corner, and (x2, y2) are the coordinates of the top-right corner of the rectangle.
 *
 *
 * Return true if the circle and rectangle are overlapped otherwise return false. In other words, check if there is any point (xi, yi) that belongs to the circle and the rectangle at the same time.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1
 * Output: true
 * Explanation: Circle and rectangle share the point (1,0).
 *
 * Example 2:
 *
 * Input: radius = 1, xCenter = 1, yCenter = 1, x1 = 1, y1 = -3, x2 = 2, y2 = -1
 * Output: false
 *
 * Example 3:
 *
 * Input: radius = 1, xCenter = 0, yCenter = 0, x1 = -1, y1 = 0, x2 = 0, y2 = 1
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= radius &lt;= 2000
 *
 * -104 &lt;= xCenter, yCenter &lt;= 104
 *
 * -104 &lt;= x1 &lt; x2 &lt;= 104
 *
 * -104 &lt;= y1 &lt; y2 &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Locate the closest point of the square to the circle, you can then find the distance from this point to the center of the circle and check if this is less than or equal to the radius.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Geometry).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/circle-and-rectangle-overlapping/">LeetCode #1401</a>
 */
public class CircleAndRectangleOverlapping {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Circle and Rectangle Overlapping");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CircleAndRectangleOverlapping ===");
        CircleAndRectangleOverlapping sol = new CircleAndRectangleOverlapping();
        System.out.println(sol.solve(null));
    }
}
