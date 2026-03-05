package org.leetcode.hard;


/**
 * <b>#2608 - Shortest Cycle in a Graph</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1. The edges in the graph are represented by a given 2D integer array edges, where edges[i] = [ui, vi] denotes an edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
 *
 *
 * Return the length of the shortest cycle in the graph. If no cycle exists, return -1.
 *
 *
 * A cycle is a path that starts and ends at the same node, and each edge in the path is used only once.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7, edges = [[0,1],[1,2],[2,0],[3,4],[4,5],[5,6],[6,3]]
 * Output: 3
 * Explanation: The cycle with the smallest length is : 0 -&gt; 1 -&gt; 2 -&gt; 0 
 *
 * Example 2:
 *
 * Input: n = 4, edges = [[0,1],[0,2]]
 * Output: -1
 * Explanation: There are no cycles in this graph.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 1000
 *
 * 1 &lt;= edges.length &lt;= 1000
 *
 * edges[i].length == 2
 *
 * 0 &lt;= ui, vi &lt; n
 *
 * ui != vi
 *
 * There are no repeated edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can BFS be used?
 * Hint 2: For each vertex u, calculate the length of the shortest cycle that contains vertex u using BFS
 *
 * <h2>Approach</h2>
 * Think about the category (Breadth-First Search, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/shortest-cycle-in-a-graph/">LeetCode #2608</a>
 */
public class ShortestCycleInAGraph {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Cycle in a Graph");
    }

    public static void main(String[] args) {
        System.out.println("=== ShortestCycleInAGraph ===");
        ShortestCycleInAGraph sol = new ShortestCycleInAGraph();
        System.out.println(sol.solve(null));
    }
}
