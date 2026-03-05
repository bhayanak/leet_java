package org.leetcode.medium;


/**
 * <b>#963 - Minimum Area Rectangle II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of points in the X-Y plane points where points[i] = [xi, yi].
 *
 *
 * Return the minimum area of any rectangle formed from these points, with sides not necessarily parallel to the X and Y axes. If there is not any such rectangle, return 0.
 *
 *
 * Answers within 10-5 of the actual answer will be accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,2],[2,1],[1,0],[0,1]]
 * Output: 2.00000
 * Explanation: The minimum area rectangle occurs at [1,2],[2,1],[1,0],[0,1], with an area of 2.
 *
 * Example 2:
 *
 * Input: points = [[0,1],[2,1],[1,1],[1,0],[2,0]]
 * Output: 1.00000
 * Explanation: The minimum area rectangle occurs at [1,0],[1,1],[2,1],[2,0], with an area of 1.
 *
 * Example 3:
 *
 * Input: points = [[0,3],[1,2],[3,1],[1,3],[2,1]]
 * Output: 0
 * Explanation: There is no possible rectangle to form from these points.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= points.length &lt;= 50
 *
 * points[i].length == 2
 *
 * 0 &lt;= xi, yi &lt;= 4 * 104
 *
 * All the given points are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Geometry).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-area-rectangle-ii/">LeetCode #963</a>
 */
public class MinimumAreaRectangleIi {

    /**
     * TODO: Implement "Minimum Area Rectangle II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Area Rectangle II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumAreaRectangleIi.java &amp;&amp; java org.leetcode.medium.MinimumAreaRectangleIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumAreaRectangleIi ===");
        MinimumAreaRectangleIi sol = new MinimumAreaRectangleIi();
        System.out.println(sol.solve(null));
    }
}
