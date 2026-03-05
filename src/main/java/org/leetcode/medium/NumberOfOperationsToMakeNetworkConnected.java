package org.leetcode.medium;


/**
 * <b>#1319 - Number of Operations to Make Network Connected</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n computers numbered from 0 to n - 1 connected by ethernet cables connections forming a network where connections[i] = [ai, bi] represents a connection between computers ai and bi. Any computer can reach any other computer directly or indirectly through the network.
 *
 *
 * You are given an initial computer network connections. You can extract certain cables between two directly connected computers, and place them between any pair of disconnected computers to make them directly connected.
 *
 *
 * Return the minimum number of times you need to do this in order to make all the computers connected. If it is not possible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, connections = [[0,1],[0,2],[1,2]]
 * Output: 1
 * Explanation: Remove cable between computer 1 and 2 and place between computers 1 and 3.
 *
 * Example 2:
 *
 * Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2],[1,3]]
 * Output: 2
 *
 * Example 3:
 *
 * Input: n = 6, connections = [[0,1],[0,2],[0,3],[1,2]]
 * Output: -1
 * Explanation: There are not enough cables.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= connections.length &lt;= min(n * (n - 1) / 2, 105)
 *
 * connections[i].length == 2
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * ai != bi
 *
 * There are no repeated connections.
 *
 * No two computers are connected by more than one cable.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: As long as there are at least (n - 1) connections, there is definitely a way to connect all computers.
 * Hint 2: Use DFS to determine the number of isolated computer clusters.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Union-Find, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-operations-to-make-network-connected/">LeetCode #1319</a>
 */
public class NumberOfOperationsToMakeNetworkConnected {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Operations to Make Network Connected");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfOperationsToMakeNetworkConnected ===");
        NumberOfOperationsToMakeNetworkConnected sol = new NumberOfOperationsToMakeNetworkConnected();
        System.out.println(sol.solve(null));
    }
}
