package org.leetcode.hard;


/**
 * <b>#1192 - Critical Connections in a Network</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Depth-First Search, Graph Theory, Biconnected Component</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections forming a network where connections[i] = [ai, bi] represents a connection between servers ai and bi. Any server can reach other servers directly or indirectly through the network.
 *
 *
 * A critical connection is a connection that, if removed, will make some servers unable to reach some other server.
 *
 *
 * Return all critical connections in the network in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
 * Output: [[1,3]]
 * Explanation: [[3,1]] is also accepted.
 *
 * Example 2:
 *
 * Input: n = 2, connections = [[0,1]]
 * Output: [[0,1]]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * n - 1 &lt;= connections.length &lt;= 105
 *
 * 0 &lt;= ai, bi &lt;= n - 1
 *
 * ai != bi
 *
 * There are no repeated connections.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Tarjan's algorithm.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Graph Theory, Biconnected Component).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/critical-connections-in-a-network/">LeetCode #1192</a>
 */
public class CriticalConnectionsInANetwork {

    /**
     * TODO: Implement "Critical Connections in a Network".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Critical Connections in a Network");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CriticalConnectionsInANetwork.java &amp;&amp; java org.leetcode.hard.CriticalConnectionsInANetwork</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CriticalConnectionsInANetwork ===");
        CriticalConnectionsInANetwork sol = new CriticalConnectionsInANetwork();
        System.out.println(sol.solve(null));
    }
}
