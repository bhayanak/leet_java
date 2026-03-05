package org.leetcode.medium;


/**
 * <b>#1039 - Minimum Score Triangulation of Polygon</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a convex n-sided polygon where each vertex has an integer value. You are given an integer array values where values[i] is the value of the ith vertex in clockwise order.
 *
 *
 * Polygon triangulation is a process where you divide a polygon into a set of triangles and the vertices of each triangle must also be vertices of the original polygon. Note that no other shapes other than triangles are allowed in the division. This process will result in n - 2 triangles.
 *
 *
 * You will triangulate the polygon. For each triangle, the weight of that triangle is the product of the values at its vertices. The total score of the triangulation is the sum of these weights over all n - 2 triangles.
 *
 *
 * Return the minimum possible score that you can achieve with some triangulation of the polygon.
 *
 *
 *
 * Example 1:
 *
 * Input: values = [1,2,3]
 *
 *
 * Output: 6
 *
 *
 * Explanation: The polygon is already triangulated, and the score of the only triangle is 6.
 *
 * Example 2:
 *
 * Input: values = [3,7,4,5]
 *
 *
 * Output: 144
 *
 *
 * Explanation: There are two triangulations, with possible scores: 3*7*5 + 4*5*7 = 245, or 3*4*5 + 3*4*7 = 144.
 *
 * The minimum score is 144.
 *
 * Example 3:
 *
 *
 * ​​​​​​​
 *
 * Input: values = [1,3,1,4,1,5]
 *
 *
 * Output: 13
 *
 *
 * Explanation: The minimum score triangulation is 1*1*3 + 1*1*4 + 1*1*5 + 1*1*1 = 13.
 *
 *
 *
 * Constraints:
 *
 *
 * n == values.length
 *
 * 3 &lt;= n &lt;= 50
 *
 * 1 &lt;= values[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Without loss of generality, there is a triangle that uses adjacent vertices A[0] and A[N-1] (where N = A.length).  Depending on your choice K of it, this breaks down the triangulation into two subproblems A[1:K] and A[K+1:N-1].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-score-triangulation-of-polygon/">LeetCode #1039</a>
 */
public class MinimumScoreTriangulationOfPolygon {

    /**
     * TODO: Implement "Minimum Score Triangulation of Polygon".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Score Triangulation of Polygon");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumScoreTriangulationOfPolygon.java &amp;&amp; java org.leetcode.medium.MinimumScoreTriangulationOfPolygon</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumScoreTriangulationOfPolygon ===");
        MinimumScoreTriangulationOfPolygon sol = new MinimumScoreTriangulationOfPolygon();
        System.out.println(sol.solve(null));
    }
}
