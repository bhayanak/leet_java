package org.leetcode.medium;


/**
 * <b>#939 - Minimum Area Rectangle</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Geometry, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of points in the X-Y plane points where points[i] = [xi, yi].
 *
 *
 * Return the minimum area of a rectangle formed from these points, with sides parallel to the X and Y axes. If there is not any such rectangle, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,1],[1,3],[3,1],[3,3],[2,2]]
 * Output: 4
 *
 * Example 2:
 *
 * Input: points = [[1,1],[1,3],[3,1],[3,3],[4,1],[4,3]]
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= points.length &lt;= 500
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
 * Think about the category (Array, Hash Table, Math, Geometry, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-area-rectangle/">LeetCode #939</a>
 */
public class MinimumAreaRectangle {

    /**
     * TODO: Implement "Minimum Area Rectangle".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Area Rectangle");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumAreaRectangle.java &amp;&amp; java org.leetcode.medium.MinimumAreaRectangle</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumAreaRectangle ===");
        MinimumAreaRectangle sol = new MinimumAreaRectangle();
        System.out.println(sol.solve(null));
    }
}
