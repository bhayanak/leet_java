package org.leetcode.medium;


/**
 * <b>#3111 - Minimum Rectangles to Cover Points</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array points, where points[i] = [xi, yi]. You are also given an integer w. Your task is to cover all the given points with rectangles.
 *
 *
 * Each rectangle has its lower end at some point (x1, 0) and its upper end at some point (x2, y2), where x1 &lt;= x2, y2 &gt;= 0, and the condition x2 - x1 &lt;= w must be satisfied for each rectangle.
 *
 *
 * A point is considered covered by a rectangle if it lies within or on the boundary of the rectangle.
 *
 *
 * Return an integer denoting the minimum number of rectangles needed so that each point is covered by at least one rectangle.
 *
 *
 * Note: A point may be covered by more than one rectangle.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[2,1],[1,0],[1,4],[1,8],[3,5],[4,6]], w = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation: 
 *
 *
 * The image above shows one possible placement of rectangles to cover the points:
 *
 *
 * A rectangle with a lower end at (1, 0) and its upper end at (2, 8)
 *
 * A rectangle with a lower end at (3, 0) and its upper end at (4, 8)
 *
 * Example 2:
 *
 * Input: points = [[0,0],[1,1],[2,2],[3,3],[4,4],[5,5],[6,6]], w = 2
 *
 *
 * Output: 3
 *
 *
 * Explanation: 
 *
 *
 * The image above shows one possible placement of rectangles to cover the points:
 *
 *
 * A rectangle with a lower end at (0, 0) and its upper end at (2, 2)
 *
 * A rectangle with a lower end at (3, 0) and its upper end at (5, 5)
 *
 * A rectangle with a lower end at (6, 0) and its upper end at (6, 6)
 *
 * Example 3:
 *
 * Input: points = [[2,3],[1,2]], w = 0
 *
 *
 * Output: 2
 *
 *
 * Explanation: 
 *
 *
 * The image above shows one possible placement of rectangles to cover the points:
 *
 *
 * A rectangle with a lower end at (1, 0) and its upper end at (1, 2)
 *
 * A rectangle with a lower end at (2, 0) and its upper end at (2, 3)
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= points.length &lt;= 105
 *
 * points[i].length == 2
 *
 * 0 &lt;= xi == points[i][0] &lt;= 109
 *
 * 0 &lt;= yi == points[i][1] &lt;= 109
 *
 * 0 &lt;= w &lt;= 109
 *
 * All pairs (xi, yi) are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The <code>y</code> values don't matter; only the <code>x</code> values matter.
 * Hint 2: Sort all the points by <code>x<sub>i</sub></code>.
 * Hint 3: Each time, select the smallest <code>x</code> value, <code>x<sub>0</sub></code>, from the unselected points, and then select all the points with <code>x</code> values not larger than <code>x<sub>0</sub> + w</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-rectangles-to-cover-points/">LeetCode #3111</a>
 */
public class MinimumRectanglesToCoverPoints {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Rectangles to Cover Points");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumRectanglesToCoverPoints ===");
        MinimumRectanglesToCoverPoints sol = new MinimumRectanglesToCoverPoints();
        System.out.println(sol.solve(null));
    }
}
