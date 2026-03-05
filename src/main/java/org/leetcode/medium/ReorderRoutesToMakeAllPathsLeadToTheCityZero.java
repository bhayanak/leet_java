package org.leetcode.medium;


/**
 * <b>#1466 - Reorder Routes to Make All Paths Lead to the City Zero</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.
 *
 *
 * Roads are represented by connections where connections[i] = [ai, bi] represents a road from city ai to city bi.
 *
 *
 * This year, there will be a big event in the capital (city 0), and many people want to travel to this city.
 *
 *
 * Your task consists of reorienting some roads such that each city can visit the city 0. Return the minimum number of edges changed.
 *
 *
 * It's guaranteed that each city can reach city 0 after reorder.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]
 * Output: 3
 * Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).
 *
 * Example 2:
 *
 * Input: n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]
 * Output: 2
 * Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).
 *
 * Example 3:
 *
 * Input: n = 3, connections = [[1,0],[2,0]]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 5 * 104
 *
 * connections.length == n - 1
 *
 * connections[i].length == 2
 *
 * 0 &lt;= ai, bi &lt;= n - 1
 *
 * ai != bi
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Treat the graph as undirected. Start a dfs from the root, if you come across an edge in the forward direction, you need to reverse the edge.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/">LeetCode #1466</a>
 */
public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reorder Routes to Make All Paths Lead to the City Zero");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReorderRoutesToMakeAllPathsLeadToTheCityZero ===");
        ReorderRoutesToMakeAllPathsLeadToTheCityZero sol = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        System.out.println(sol.solve(null));
    }
}
