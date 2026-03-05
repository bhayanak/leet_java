package org.leetcode.hard;


/**
 * <b>#3244 - Shortest Distance After Road Addition Queries II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Graph Theory, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and a 2D integer array queries.
 *
 *
 * There are n cities numbered from 0 to n - 1. Initially, there is a unidirectional road from city i to city i + 1 for all 0 &lt;= i &lt; n - 1.
 *
 *
 * queries[i] = [ui, vi] represents the addition of a new unidirectional road from city ui to city vi. After each query, you need to find the length of the shortest path from city 0 to city n - 1.
 *
 *
 * There are no two queries such that queries[i][0] &lt; queries[j][0] &lt; queries[i][1] &lt; queries[j][1].
 *
 *
 * Return an array answer where for each i in the range [0, queries.length - 1], answer[i] is the length of the shortest path from city 0 to city n - 1 after processing the first i + 1 queries.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, queries = [[2,4],[0,2],[0,4]]
 *
 *
 * Output: [3,2,1]
 *
 *
 * Explanation: 
 *
 * After the addition of the road from 2 to 4, the length of the shortest path from 0 to 4 is 3.
 *
 * After the addition of the road from 0 to 2, the length of the shortest path from 0 to 4 is 2.
 *
 * After the addition of the road from 0 to 4, the length of the shortest path from 0 to 4 is 1.
 *
 * Example 2:
 *
 * Input: n = 4, queries = [[0,3],[0,2]]
 *
 *
 * Output: [1,1]
 *
 *
 * Explanation:
 *
 * After the addition of the road from 0 to 3, the length of the shortest path from 0 to 3 is 1.
 *
 * After the addition of the road from 0 to 2, the length of the shortest path remains 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i].length == 2
 *
 * 0 &lt;= queries[i][0] &lt; queries[i][1] &lt; n
 *
 * 1 &lt; queries[i][1] - queries[i][0]
 *
 * There are no repeated roads among the queries.
 *
 * There are no two queries such that i != j and queries[i][0] &lt; queries[j][0] &lt; queries[i][1] &lt; queries[j][1].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Graph Theory, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/shortest-distance-after-road-addition-queries-ii/">LeetCode #3244</a>
 */
public class ShortestDistanceAfterRoadAdditionQueriesIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Distance After Road Addition Queries II");
    }

    public static void main(String[] args) {
        System.out.println("=== ShortestDistanceAfterRoadAdditionQueriesIi ===");
        ShortestDistanceAfterRoadAdditionQueriesIi sol = new ShortestDistanceAfterRoadAdditionQueriesIi();
        System.out.println(sol.solve(null));
    }
}
