package org.leetcode.medium;


/**
 * <b>#1615 - Maximal Network Rank</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an infrastructure of n cities with some number of roads connecting these cities. Each roads[i] = [ai, bi] indicates that there is a bidirectional road between cities ai and bi.
 *
 *
 * The network rank of two different cities is defined as the total number of directly connected roads to either city. If a road is directly connected to both cities, it is only counted once.
 *
 *
 * The maximal network rank of the infrastructure is the maximum network rank of all pairs of different cities.
 *
 *
 * Given the integer n and the array roads, return the maximal network rank of the entire infrastructure.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, roads = [[0,1],[0,3],[1,2],[1,3]]
 * Output: 4
 * Explanation: The network rank of cities 0 and 1 is 4 as there are 4 roads that are connected to either 0 or 1. The road between 0 and 1 is only counted once.
 *
 * Example 2:
 *
 * Input: n = 5, roads = [[0,1],[0,3],[1,2],[1,3],[2,3],[2,4]]
 * Output: 5
 * Explanation: There are 5 roads that are connected to cities 1 or 2.
 *
 * Example 3:
 *
 * Input: n = 8, roads = [[0,1],[1,2],[2,3],[2,4],[5,6],[5,7]]
 * Output: 5
 * Explanation: The network rank of 2 and 5 is 5. Notice that all the cities do not have to be connected.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 100
 *
 * 0 &lt;= roads.length &lt;= n * (n - 1) / 2
 *
 * roads[i].length == 2
 *
 * 0 &lt;= ai, bi &lt;= n-1
 *
 * ai != bi
 *
 * Each pair of cities has at most one road connecting them.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try every pair of different cities and calculate its network rank.
 * Hint 2: The network rank of two vertices is <i>almost</i> the sum of their degrees.
 * Hint 3: How can you efficiently check if there is a road connecting two different cities?
 *
 * <h2>Approach</h2>
 * Think about the category (Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximal-network-rank/">LeetCode #1615</a>
 */
public class MaximalNetworkRank {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximal Network Rank");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximalNetworkRank ===");
        MaximalNetworkRank sol = new MaximalNetworkRank();
        System.out.println(sol.solve(null));
    }
}
