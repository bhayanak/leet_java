package org.leetcode.medium;


/**
 * <b>#3623 - Count Number of Trapezoids I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array points, where points[i] = [xi, yi] represents the coordinates of the ith point on the Cartesian plane.
 *
 *
 * A horizontal trapezoid is a convex quadrilateral with at least one pair of horizontal sides (i.e. parallel to the x-axis). Two lines are parallel if and only if they have the same slope.
 *
 *
 * Return the  number of unique horizontal trapezoids that can be formed by choosing any four distinct points from points.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,0],[2,0],[3,0],[2,2],[3,2]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * There are three distinct ways to pick four points that form a horizontal trapezoid:
 *
 *
 * Using points [1,0], [2,0], [3,2], and [2,2].
 *
 * Using points [2,0], [3,0], [3,2], and [2,2].
 *
 * Using points [1,0], [3,0], [3,2], and [2,2].
 *
 * Example 2:
 *
 * Input: points = [[0,0],[1,0],[0,1],[2,1]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 * There is only one horizontal trapezoid that can be formed.
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= points.length &lt;= 105
 *
 * –108 &lt;= xi, yi &lt;= 108
 *
 * All points are pairwise distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a line parallel to the x‑axis, all its points must share the same y‑coordinate.
 * Hint 2: Group the points by their y‑coordinate.
 * Hint 3: Choose two distinct groups (two horizontal lines), and from each group select two points to form a trapezoid.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Geometry).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-trapezoids-i/">LeetCode #3623</a>
 */
public class CountNumberOfTrapezoidsI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Trapezoids I");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNumberOfTrapezoidsI ===");
        CountNumberOfTrapezoidsI sol = new CountNumberOfTrapezoidsI();
        System.out.println(sol.solve(null));
    }
}
