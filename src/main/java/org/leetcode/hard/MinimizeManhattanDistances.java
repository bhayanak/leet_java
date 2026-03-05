package org.leetcode.hard;


/**
 * <b>#3102 - Minimize Manhattan Distances</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Geometry, Sorting, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array points representing integer coordinates of some points on a 2D plane, where points[i] = [xi, yi].
 *
 *
 * The distance between two points is defined as their Manhattan distance.
 *
 *
 * Return the minimum possible value for maximum distance between any two points by removing exactly one point.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[3,10],[5,15],[10,2],[4,4]]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The maximum distance after removing each point is the following:
 *
 *
 * After removing the 0th point the maximum distance is between points (5, 15) and (10, 2), which is |5 - 10| + |15 - 2| = 18.
 *
 * After removing the 1st point the maximum distance is between points (3, 10) and (10, 2), which is |3 - 10| + |10 - 2| = 15.
 *
 * After removing the 2nd point the maximum distance is between points (5, 15) and (4, 4), which is |5 - 4| + |15 - 4| = 12.
 *
 * After removing the 3rd point the maximum distance is between points (5, 15) and (10, 2), which is |5 - 10| + |15 - 2| = 18.
 *
 * 12 is the minimum possible maximum distance between any two points after removing exactly one point.
 *
 * Example 2:
 *
 * Input: points = [[1,1],[1,1],[1,1]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Removing any of the points results in the maximum distance between any two points of 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= points.length &lt;= 105
 *
 * points[i].length == 2
 *
 * 1 &lt;= points[i][0], points[i][1] &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that the Manhattan distance between two points <code>[x<sub>i</sub>, y<sub>i</sub>]</code> and <code>[x<sub>j</sub>, y<sub>j</sub>] is <code> max({x<sub>i</sub> - x<sub>j</sub> + y<sub>i</sub> - y<sub>j</sub>, x<sub>i</sub> - x<sub>j</sub> - y<sub>i</sub> + y<sub>j</sub>, - x<sub>i</sub> + x<sub>j</sub> + y<sub>i</sub> - y<sub>j</sub>, - x<sub>i</sub> + x<sub>j</sub> - y<sub>i</sub> + y<sub>j</sub>})</code></code>.
 * Hint 2: If you replace points as <code>[x<sub>i</sub> - y<sub>i</sub>, x<sub>i</sub> + y<sub>i</sub>]</code> then the Manhattan distance is <code>max(max(x<sub>i</sub>) - min(x<sub>i</sub>), max(y<sub>i</sub>) - min(y<sub>i</sub>))</code> over all <code>i</code>.
 * Hint 3: After those observations, the problem just becomes a simulation. Create multiset of points <code>[x<sub>i</sub> - y<sub>i</sub>, x<sub>i</sub> + y<sub>i</sub>]</code>, you can iterate on a point you might remove and get the maximum Manhattan distance over all other points.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry, Sorting, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/minimize-manhattan-distances/">LeetCode #3102</a>
 */
public class MinimizeManhattanDistances {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize Manhattan Distances");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimizeManhattanDistances ===");
        MinimizeManhattanDistances sol = new MinimizeManhattanDistances();
        System.out.println(sol.solve(null));
    }
}
