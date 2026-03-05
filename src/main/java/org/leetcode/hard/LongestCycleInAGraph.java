package org.leetcode.hard;


/**
 * <b>#2360 - Longest Cycle in a Graph</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a directed graph of n nodes numbered from 0 to n - 1, where each node has at most one outgoing edge.
 *
 *
 * The graph is represented with a given 0-indexed array edges of size n, indicating that there is a directed edge from node i to node edges[i]. If there is no outgoing edge from node i, then edges[i] == -1.
 *
 *
 * Return the length of the longest cycle in the graph. If no cycle exists, return -1.
 *
 *
 * A cycle is a path that starts and ends at the same node.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges = [3,3,4,2,3]
 * Output: 3
 * Explanation: The longest cycle in the graph is the cycle: 2 -&gt; 4 -&gt; 3 -&gt; 2.
 * The length of this cycle is 3, so 3 is returned.
 *
 * Example 2:
 *
 * Input: edges = [2,-1,3,1]
 * Output: -1
 * Explanation: There are no cycles in this graph.
 *
 *
 *
 * Constraints:
 *
 *
 * n == edges.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * -1 &lt;= edges[i] &lt; n
 *
 * edges[i] != i
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How many cycles can each node at most be part of?
 * Hint 2: Each node can be part of at most one cycle. Start from each node and find the cycle that it is part of if there is any. Save the already visited nodes to not repeat visiting the same cycle multiple times.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort).
 *
 * @see <a href="https://leetcode.com/problems/longest-cycle-in-a-graph/">LeetCode #2360</a>
 */
public class LongestCycleInAGraph {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Cycle in a Graph");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestCycleInAGraph ===");
        LongestCycleInAGraph sol = new LongestCycleInAGraph();
        System.out.println(sol.solve(null));
    }
}
