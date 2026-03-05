package org.leetcode.medium;


/**
 * <b>#2249 - Count Lattice Points Inside a Circle</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Geometry, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D integer array circles where circles[i] = [xi, yi, ri] represents the center (xi, yi) and radius ri of the ith circle drawn on a grid, return the number of lattice points that are present inside at least one circle.
 *
 *
 * Note:
 *
 *
 * A lattice point is a point with integer coordinates.
 *
 * Points that lie on the circumference of a circle are also considered to be inside it.
 *
 *
 *
 * Example 1:
 *
 * Input: circles = [[2,2,1]]
 * Output: 5
 * Explanation:
 * The figure above shows the given circle.
 * The lattice points present inside the circle are (1, 2), (2, 1), (2, 2), (2, 3), and (3, 2) and are shown in green.
 * Other points such as (1, 1) and (1, 3), which are shown in red, are not considered inside the circle.
 * Hence, the number of lattice points present inside at least one circle is 5.
 *
 * Example 2:
 *
 * Input: circles = [[2,2,2],[3,4,1]]
 * Output: 16
 * Explanation:
 * The figure above shows the given circles.
 * There are exactly 16 lattice points which are present inside at least one circle. 
 * Some of them are (0, 2), (2, 0), (2, 4), (3, 2), and (4, 4).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= circles.length &lt;= 200
 *
 * circles[i].length == 3
 *
 * 1 &lt;= xi, yi &lt;= 100
 *
 * 1 &lt;= ri &lt;= min(xi, yi)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each circle, how can you check whether or not a lattice point lies inside it?
 * Hint 2: Since you need to reduce the search space, consider the minimum and maximum possible values of the coordinates of a lattice point contained in any circle.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Geometry, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-lattice-points-inside-a-circle/">LeetCode #2249</a>
 */
public class CountLatticePointsInsideACircle {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Lattice Points Inside a Circle");
    }

    public static void main(String[] args) {
        System.out.println("=== CountLatticePointsInsideACircle ===");
        CountLatticePointsInsideACircle sol = new CountLatticePointsInsideACircle();
        System.out.println(sol.solve(null));
    }
}
