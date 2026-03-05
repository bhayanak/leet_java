package org.leetcode.medium;


/**
 * <b>#1129 - Shortest Path with Alternating Colors</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n, the number of nodes in a directed graph where the nodes are labeled from 0 to n - 1. Each edge is red or blue in this graph, and there could be self-edges and parallel edges.
 *
 *
 * You are given two arrays redEdges and blueEdges where:
 *
 *
 * redEdges[i] = [ai, bi] indicates that there is a directed red edge from node ai to node bi in the graph, and
 *
 * blueEdges[j] = [uj, vj] indicates that there is a directed blue edge from node uj to node vj in the graph.
 *
 * Return an array answer of length n, where each answer[x] is the length of the shortest path from node 0 to node x such that the edge colors alternate along the path, or -1 if such a path does not exist.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, redEdges = [[0,1],[1,2]], blueEdges = []
 * Output: [0,1,-1]
 *
 * Example 2:
 *
 * Input: n = 3, redEdges = [[0,1]], blueEdges = [[2,1]]
 * Output: [0,1,-1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 *
 * 0 &lt;= redEdges.length, blueEdges.length &lt;= 400
 *
 * redEdges[i].length == blueEdges[j].length == 2
 *
 * 0 &lt;= ai, bi, uj, vj &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do a breadth-first search, where the "nodes" are actually (Node, color of last edge taken).
 *
 * <h2>Approach</h2>
 * Think about the category (Breadth-First Search, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-path-with-alternating-colors/">LeetCode #1129</a>
 */
public class ShortestPathWithAlternatingColors {

    /**
     * TODO: Implement "Shortest Path with Alternating Colors".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Path with Alternating Colors");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestPathWithAlternatingColors.java &amp;&amp; java org.leetcode.medium.ShortestPathWithAlternatingColors</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestPathWithAlternatingColors ===");
        ShortestPathWithAlternatingColors sol = new ShortestPathWithAlternatingColors();
        System.out.println(sol.solve(null));
    }
}
