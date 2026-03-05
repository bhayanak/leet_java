package org.leetcode.medium;


/**
 * <b>#973 - K Closest Points to Origin</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Divide and Conquer, Geometry, Sorting, Heap (Priority Queue), Quickselect</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
 *
 *
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 *
 *
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 * Explanation:
 * The distance between (1, 3) and the origin is sqrt(10).
 * The distance between (-2, 2) and the origin is sqrt(8).
 * Since sqrt(8) &lt; sqrt(10), (-2, 2) is closer to the origin.
 * We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
 *
 * Example 2:
 *
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= points.length &lt;= 104
 *
 * -104 &lt;= xi, yi &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Divide and Conquer, Geometry, Sorting, Heap (Priority Queue), Quickselect).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/k-closest-points-to-origin/">LeetCode #973</a>
 */
public class KClosestPointsToOrigin {

    /**
     * TODO: Implement "K Closest Points to Origin".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: K Closest Points to Origin");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac KClosestPointsToOrigin.java &amp;&amp; java org.leetcode.medium.KClosestPointsToOrigin</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== KClosestPointsToOrigin ===");
        KClosestPointsToOrigin sol = new KClosestPointsToOrigin();
        System.out.println(sol.solve(null));
    }
}
