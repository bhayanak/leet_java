package org.leetcode.hard;


/**
 * <b>#1928 - Minimum Cost to Reach Destination in Time</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a country of n cities numbered from 0 to n - 1 where all the cities are connected by bi-directional roads. The roads are represented as a 2D integer array edges where edges[i] = [xi, yi, timei] denotes a road between cities xi and yi that takes timei minutes to travel. There may be multiple roads of differing travel times connecting the same two cities, but no road connects a city to itself.
 *
 *
 * Each time you pass through a city, you must pay a passing fee. This is represented as a 0-indexed integer array passingFees of length n where passingFees[j] is the amount of dollars you must pay when you pass through city j.
 *
 *
 * In the beginning, you are at city 0 and want to reach city n - 1 in maxTime minutes or less. The cost of your journey is the summation of passing fees for each city that you passed through at some moment of your journey (including the source and destination cities).
 *
 *
 * Given maxTime, edges, and passingFees, return the minimum cost to complete your journey, or -1 if you cannot complete it within maxTime minutes.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: maxTime = 30, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees = [5,1,2,20,20,3]
 * Output: 11
 * Explanation: The path to take is 0 -&gt; 1 -&gt; 2 -&gt; 5, which takes 30 minutes and has $11 worth of passing fees.
 *
 * Example 2:
 *
 * Input: maxTime = 29, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees = [5,1,2,20,20,3]
 * Output: 48
 * Explanation: The path to take is 0 -&gt; 3 -&gt; 4 -&gt; 5, which takes 26 minutes and has $48 worth of passing fees.
 * You cannot take path 0 -&gt; 1 -&gt; 2 -&gt; 5 since it would take too long.
 *
 * Example 3:
 *
 * Input: maxTime = 25, edges = [[0,1,10],[1,2,10],[2,5,10],[0,3,1],[3,4,10],[4,5,15]], passingFees = [5,1,2,20,20,3]
 * Output: -1
 * Explanation: There is no way to reach city 5 from city 0 within 25 minutes.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= maxTime &lt;= 1000
 *
 * n == passingFees.length
 *
 * 2 &lt;= n &lt;= 1000
 *
 * n - 1 &lt;= edges.length &lt;= 1000
 *
 * 0 &lt;= xi, yi &lt;= n - 1
 *
 * 1 &lt;= timei &lt;= 1000
 *
 * 1 &lt;= passingFees[j] &lt;= 1000 
 *
 * The graph may contain multiple edges between two nodes.
 *
 * The graph does not contain self loops.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider a new graph where each node is one of the old nodes at a specific time. For example, node 0 at time 5.
 * Hint 2: You need to find the shortest path in the new graph.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-reach-destination-in-time/">LeetCode #1928</a>
 */
public class MinimumCostToReachDestinationInTime {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Reach Destination in Time");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostToReachDestinationInTime ===");
        MinimumCostToReachDestinationInTime sol = new MinimumCostToReachDestinationInTime();
        System.out.println(sol.solve(null));
    }
}
