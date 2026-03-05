package org.leetcode.hard;


/**
 * <b>#847 - Shortest Path Visiting All Nodes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Bit Manipulation, Breadth-First Search, Graph Theory, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have an undirected, connected graph of n nodes labeled from 0 to n - 1. You are given an array graph where graph[i] is a list of all the nodes connected with node i by an edge.
 *
 *
 * Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: graph = [[1,2,3],[0],[0],[0]]
 * Output: 4
 * Explanation: One possible path is [1,0,2,0,3]
 *
 * Example 2:
 *
 * Input: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]]
 * Output: 4
 * Explanation: One possible path is [0,1,4,2,3]
 *
 *
 *
 * Constraints:
 *
 *
 * n == graph.length
 *
 * 1 &lt;= n &lt;= 12
 *
 * 0 &lt;= graph[i].length &lt; n
 *
 * graph[i] does not contain i.
 *
 * If graph[a] contains b, then graph[b] contains a.
 *
 * The input graph is always connected.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Bit Manipulation, Breadth-First Search, Graph Theory, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-path-visiting-all-nodes/">LeetCode #847</a>
 */
public class ShortestPathVisitingAllNodes {

    /**
     * TODO: Implement "Shortest Path Visiting All Nodes".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Path Visiting All Nodes");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestPathVisitingAllNodes.java &amp;&amp; java org.leetcode.hard.ShortestPathVisitingAllNodes</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestPathVisitingAllNodes ===");
        ShortestPathVisitingAllNodes sol = new ShortestPathVisitingAllNodes();
        System.out.println(sol.solve(null));
    }
}
