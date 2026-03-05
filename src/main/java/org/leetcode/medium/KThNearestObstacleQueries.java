package org.leetcode.medium;


/**
 * <b>#3275 - K-th Nearest Obstacle Queries</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an infinite 2D plane.
 *
 *
 * You are given a positive integer k. You are also given a 2D array queries, which contains the following queries:
 *
 *
 * queries[i] = [x, y]: Build an obstacle at coordinate (x, y) in the plane. It is guaranteed that there is no obstacle at this coordinate when this query is made.
 *
 * After each query, you need to find the distance of the kth nearest obstacle from the origin.
 *
 *
 * Return an integer array results where results[i] denotes the kth nearest obstacle after query i, or results[i] == -1 if there are less than k obstacles.
 *
 *
 * Note that initially there are no obstacles anywhere.
 *
 *
 * The distance of an obstacle at coordinate (x, y) from the origin is given by |x| + |y|.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = [[1,2],[3,4],[2,3],[-3,0]], k = 2
 *
 *
 * Output: [-1,7,5,3]
 *
 *
 * Explanation:
 *
 *
 * Initially, there are 0 obstacles.
 *
 * After queries[0], there are less than 2 obstacles.
 *
 * After queries[1], there are obstacles at distances 3 and 7.
 *
 * After queries[2], there are obstacles at distances 3, 5, and 7.
 *
 * After queries[3], there are obstacles at distances 3, 3, 5, and 7.
 *
 * Example 2:
 *
 * Input: queries = [[5,5],[4,4],[3,3]], k = 1
 *
 *
 * Output: [10,8,6]
 *
 *
 * Explanation:
 *
 *
 * After queries[0], there is an obstacle at distance 10.
 *
 * After queries[1], there are obstacles at distances 8 and 10.
 *
 * After queries[2], there are obstacles at distances 6, 8, and 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queries.length &lt;= 2 * 105
 *
 * All queries[i] are unique.
 *
 * -109 &lt;= queries[i][0], queries[i][1] &lt;= 109
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider if there are more than <code>k</code> obstacles. Can the <code>k + 1<sup>th</sup></code> obstacle ever be the answer to any query?
 * Hint 2: Maintain a max heap of size <code>k</code>, thus heap will contain minimum element at the top in that queue.
 * Hint 3: Remove top element and insert new element from input array if current max is larger than this.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/k-th-nearest-obstacle-queries/">LeetCode #3275</a>
 */
public class KThNearestObstacleQueries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: K-th Nearest Obstacle Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== KThNearestObstacleQueries ===");
        KThNearestObstacleQueries sol = new KThNearestObstacleQueries();
        System.out.println(sol.solve(null));
    }
}
