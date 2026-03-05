package org.leetcode.hard;


/**
 * <b>#2876 - Count Visited Nodes in a Directed Graph</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Graph Theory, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a directed graph consisting of n nodes numbered from 0 to n - 1 and n directed edges.
 *
 *
 * You are given a 0-indexed array edges where edges[i] indicates that there is an edge from node i to node edges[i].
 *
 *
 * Consider the following process on the graph:
 *
 *
 * You start from a node x and keep visiting other nodes through edges until you reach a node that you have already visited before on this same process.
 *
 * Return an array answer where answer[i] is the number of different nodes that you will visit if you perform the process starting from node i.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges = [1,2,0,0]
 * Output: [3,3,3,4]
 * Explanation: We perform the process starting from each node in the following way:
 * - Starting from node 0, we visit the nodes 0 -&gt; 1 -&gt; 2 -&gt; 0. The number of different nodes we visit is 3.
 * - Starting from node 1, we visit the nodes 1 -&gt; 2 -&gt; 0 -&gt; 1. The number of different nodes we visit is 3.
 * - Starting from node 2, we visit the nodes 2 -&gt; 0 -&gt; 1 -&gt; 2. The number of different nodes we visit is 3.
 * - Starting from node 3, we visit the nodes 3 -&gt; 0 -&gt; 1 -&gt; 2 -&gt; 0. The number of different nodes we visit is 4.
 *
 * Example 2:
 *
 * Input: edges = [1,2,3,4,0]
 * Output: [5,5,5,5,5]
 * Explanation: Starting from any node we can visit every node in the graph in the process.
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
 * 0 &lt;= edges[i] &lt;= n - 1
 *
 * edges[i] != i
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider if the graph was only one cycle, what will be the answer for each node?
 * Hint 2: The actual graph will always consist of at least one cycle and some other nodes.
 * Hint 3: Calculate the answer for nodes in cycles the same way as in hint 1. How do you calculate the answer for the remaining nodes?
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Graph Theory, Memoization).
 *
 * @see <a href="https://leetcode.com/problems/count-visited-nodes-in-a-directed-graph/">LeetCode #2876</a>
 */
public class CountVisitedNodesInADirectedGraph {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Visited Nodes in a Directed Graph");
    }

    public static void main(String[] args) {
        System.out.println("=== CountVisitedNodesInADirectedGraph ===");
        CountVisitedNodesInADirectedGraph sol = new CountVisitedNodesInADirectedGraph();
        System.out.println(sol.solve(null));
    }
}
