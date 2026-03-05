package org.leetcode.hard;


/**
 * <b>#3464 - Maximize the Distance Between Points on a Square</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Binary Search, Geometry, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer side, representing the edge length of a square with corners at (0, 0), (0, side), (side, 0), and (side, side) on a Cartesian plane.
 *
 *
 * You are also given a positive integer k and a 2D integer array points, where points[i] = [xi, yi] represents the coordinate of a point lying on the boundary of the square.
 *
 *
 * You need to select k elements among points such that the minimum Manhattan distance between any two points is maximized.
 *
 *
 * Return the maximum possible minimum Manhattan distance between the selected k points.
 *
 *
 * The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: side = 2, points = [[0,2],[2,0],[2,2],[0,0]], k = 4
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * Select all four points.
 *
 * Example 2:
 *
 * Input: side = 2, points = [[0,0],[1,2],[2,0],[2,2],[2,1]], k = 4
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 * Select the points (0, 0), (2, 0), (2, 2), and (2, 1).
 *
 * Example 3:
 *
 * Input: side = 2, points = [[0,0],[0,1],[0,2],[1,2],[2,0],[2,2],[2,1]], k = 5
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 * Select the points (0, 0), (0, 1), (0, 2), (1, 2), and (2, 2).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= side &lt;= 109
 *
 * 4 &lt;= points.length &lt;= min(4 * side, 15 * 103)
 *
 * points[i] == [xi, yi]
 *
 * The input is generated such that:
 *
 *
 *
 * points[i] lies on the boundary of the square.
 *
 * All points[i] are unique.
 *
 *
 *
 * 4 &lt;= k &lt;= min(25, points.length)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use binary search for this problem?
 * Hint 2: Think of the coordinates on a straight line in clockwise order.
 * Hint 3: Binary search on the minimum Manhattan distance <code>x</code>.
 * Hint 4: During the binary search, for each coordinate, find the immediate next coordinate with distance &gt;= <code>x</code>.
 * Hint 5: Greedily select up to <code>k</code> coordinates.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Search, Geometry, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-the-distance-between-points-on-a-square/">LeetCode #3464</a>
 */
public class MaximizeTheDistanceBetweenPointsOnASquare {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize the Distance Between Points on a Square");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTheDistanceBetweenPointsOnASquare ===");
        MaximizeTheDistanceBetweenPointsOnASquare sol = new MaximizeTheDistanceBetweenPointsOnASquare();
        System.out.println(sol.solve(null));
    }
}
