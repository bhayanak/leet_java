package org.leetcode.medium;


/**
 * <b>#1976 - Number of Ways to Arrive at Destination</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Graph Theory, Topological Sort, Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are in a city that consists of n intersections numbered from 0 to n - 1 with bi-directional roads between some intersections. The inputs are generated such that you can reach any intersection from any other intersection and that there is at most one road between any two intersections.
 *
 *
 * You are given an integer n and a 2D integer array roads where roads[i] = [ui, vi, timei] means that there is a road between intersections ui and vi that takes timei minutes to travel. You want to know in how many ways you can travel from intersection 0 to intersection n - 1 in the shortest amount of time.
 *
 *
 * Return the number of ways you can arrive at your destination in the shortest amount of time. Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7, roads = [[0,6,7],[0,1,2],[1,2,3],[1,3,3],[6,3,3],[3,5,1],[6,5,1],[2,5,1],[0,4,5],[4,6,2]]
 * Output: 4
 * Explanation: The shortest amount of time it takes to go from intersection 0 to intersection 6 is 7 minutes.
 * The four ways to get there in 7 minutes are:
 * - 0 ➝ 6
 * - 0 ➝ 4 ➝ 6
 * - 0 ➝ 1 ➝ 2 ➝ 5 ➝ 6
 * - 0 ➝ 1 ➝ 3 ➝ 5 ➝ 6
 *
 * Example 2:
 *
 * Input: n = 2, roads = [[1,0,10]]
 * Output: 1
 * Explanation: There is only one way to go from intersection 0 to intersection 1, and it takes 10 minutes.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 200
 *
 * n - 1 &lt;= roads.length &lt;= n * (n - 1) / 2
 *
 * roads[i].length == 3
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * 1 &lt;= timei &lt;= 109
 *
 * ui != vi
 *
 * There is at most one road connecting any two intersections.
 *
 * You can reach any intersection from any other intersection.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First use any shortest path algorithm to get edges where dist[u] + weight = dist[v], here dist[x] is the shortest distance between node 0 and x
 * Hint 2: Using those edges only the graph turns into a dag now we just need to know the number of ways to get from node 0 to node n - 1 on a dag using dp
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Graph Theory, Topological Sort, Shortest Path).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/">LeetCode #1976</a>
 */
public class NumberOfWaysToArriveAtDestination {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Arrive at Destination");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToArriveAtDestination ===");
        NumberOfWaysToArriveAtDestination sol = new NumberOfWaysToArriveAtDestination();
        System.out.println(sol.solve(null));
    }
}
