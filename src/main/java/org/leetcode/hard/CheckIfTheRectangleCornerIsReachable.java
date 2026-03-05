package org.leetcode.hard;


/**
 * <b>#3235 - Check if the Rectangle Corner Is Reachable</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Depth-First Search, Breadth-First Search, Union-Find, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers xCorner and yCorner, and a 2D array circles, where circles[i] = [xi, yi, ri] denotes a circle with center at (xi, yi) and radius ri.
 *
 *
 * There is a rectangle in the coordinate plane with its bottom left corner at the origin and top right corner at the coordinate (xCorner, yCorner). You need to check whether there is a path from the bottom left corner to the top right corner such that the entire path lies inside the rectangle, does not touch or lie inside any circle, and touches the rectangle only at the two corners.
 *
 *
 * Return true if such a path exists, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: xCorner = 3, yCorner = 4, circles = [[2,1,1]]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 * The black curve shows a possible path between (0, 0) and (3, 4).
 *
 * Example 2:
 *
 * Input: xCorner = 3, yCorner = 3, circles = [[1,1,2]]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 * No path exists from (0, 0) to (3, 3).
 *
 * Example 3:
 *
 * Input: xCorner = 3, yCorner = 3, circles = [[2,1,1],[1,2,1]]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 * No path exists from (0, 0) to (3, 3).
 *
 * Example 4:
 *
 * Input: xCorner = 4, yCorner = 4, circles = [[5,5,1]]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= xCorner, yCorner &lt;= 109
 *
 * 1 &lt;= circles.length &lt;= 1000
 *
 * circles[i].length == 3
 *
 * 1 &lt;= xi, yi, ri &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a graph with <code>n + 4</code> vertices.
 * Hint 2: Vertices 0 to <code>n - 1</code> represent the circles, vertex <code>n</code> represents upper edge, vertex <code>n + 1</code> represents right edge, vertex <code>n + 2</code> represents lower edge, and vertex <code>n + 3</code> represents left edge.
 * Hint 3: Add an edge between these vertices if they intersect or touch.
 * Hint 4: Answer will be <code>false</code> when any of two sides left-right, left-bottom, right-top or top-bottom are reachable using the edges.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Depth-First Search, Breadth-First Search, Union-Find, Geometry).
 *
 * @see <a href="https://leetcode.com/problems/check-if-the-rectangle-corner-is-reachable/">LeetCode #3235</a>
 */
public class CheckIfTheRectangleCornerIsReachable {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if the Rectangle Corner Is Reachable");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfTheRectangleCornerIsReachable ===");
        CheckIfTheRectangleCornerIsReachable sol = new CheckIfTheRectangleCornerIsReachable();
        System.out.println(sol.solve(null));
    }
}
