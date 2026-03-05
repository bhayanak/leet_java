package org.leetcode.medium;


/**
 * <b>#1828 - Queries on Number of Points Inside a Circle</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.
 *
 *
 * You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.
 *
 *
 * For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.
 *
 *
 * Return an array answer, where answer[j] is the answer to the jth query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
 * Output: [3,2,2]
 * Explanation: The points and circles are shown above.
 * queries[0] is the green circle, queries[1] is the red circle, and queries[2] is the blue circle.
 *
 * Example 2:
 *
 * Input: points = [[1,1],[2,2],[3,3],[4,4],[5,5]], queries = [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]
 * Output: [2,3,2,4]
 * Explanation: The points and circles are shown above.
 * queries[0] is green, queries[1] is red, queries[2] is blue, and queries[3] is purple.
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
 * 0 &lt;= x​​​​​​i, y​​​​​​i &lt;= 500
 *
 * 1 &lt;= queries.length &lt;= 500
 *
 * queries[j].length == 3
 *
 * 0 &lt;= xj, yj &lt;= 500
 *
 * 1 &lt;= rj &lt;= 500
 *
 * All coordinates are integers.
 *
 *
 *
 * Follow up: Could you find the answer for each query in better complexity than O(n)?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a point to be inside a circle, the euclidean distance between it and the circle's center needs to be less than or equal to the radius.
 * Hint 2: Brute force for each circle and iterate overall points and find those inside it.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/">LeetCode #1828</a>
 */
public class QueriesOnNumberOfPointsInsideACircle {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Queries on Number of Points Inside a Circle");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== QueriesOnNumberOfPointsInsideACircle ===");
        QueriesOnNumberOfPointsInsideACircle sol = new QueriesOnNumberOfPointsInsideACircle();
        System.out.println(sol.solve(null));
    }
}
