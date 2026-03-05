package org.leetcode.hard;


/**
 * <b>#3108 - Minimum Cost Walk in Weighted Graph</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected weighted graph with n vertices labeled from 0 to n - 1.
 *
 *
 * You are given the integer n and an array edges, where edges[i] = [ui, vi, wi] indicates that there is an edge between vertices ui and vi with a weight of wi.
 *
 *
 * A walk on a graph is a sequence of vertices and edges. The walk starts and ends with a vertex, and each edge connects the vertex that comes before it and the vertex that comes after it. It's important to note that a walk may visit the same edge or vertex more than once.
 *
 *
 * The cost of a walk starting at node u and ending at node v is defined as the bitwise AND of the weights of the edges traversed during the walk. In other words, if the sequence of edge weights encountered during the walk is w0, w1, w2, ..., wk, then the cost is calculated as w0 &amp; w1 &amp; w2 &amp; ... &amp; wk, where &amp; denotes the bitwise AND operator.
 *
 *
 * You are also given a 2D array query, where query[i] = [si, ti]. For each query, you need to find the minimum cost of the walk starting at vertex si and ending at vertex ti. If there exists no such walk, the answer is -1.
 *
 *
 * Return the array answer, where answer[i] denotes the minimum cost of a walk for query i.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, edges = [[0,1,7],[1,3,7],[1,2,1]], query = [[0,3],[3,4]]
 *
 *
 * Output: [1,-1]
 *
 *
 * Explanation:
 *
 *
 * To achieve the cost of 1 in the first query, we need to move on the following edges: 0-&gt;1 (weight 7), 1-&gt;2 (weight 1), 2-&gt;1 (weight 1), 1-&gt;3 (weight 7).
 *
 *
 * In the second query, there is no walk between nodes 3 and 4, so the answer is -1.
 *
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[0,2,7],[0,1,15],[1,2,6],[1,2,1]], query = [[1,2]]
 *
 *
 * Output: [0]
 *
 *
 * Explanation:
 *
 *
 * To achieve the cost of 0 in the first query, we need to move on the following edges: 1-&gt;2 (weight 1), 2-&gt;1 (weight 6), 1-&gt;2 (weight 1).
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 0 &lt;= edges.length &lt;= 105
 *
 * edges[i].length == 3
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * ui != vi
 *
 * 0 &lt;= wi &lt;= 105
 *
 * 1 &lt;= query.length &lt;= 105
 *
 * query[i].length == 2
 *
 * 0 &lt;= si, ti &lt;= n - 1
 *
 * si != ti
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The intended solution uses Disjoint Set Union.
 * Hint 2: Notice that, if <code>u</code> and <code>v</code> are not connected then the answer is <code>-1</code>, otherwise we can use all the edges from the connected component where both belong to.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Union-Find, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-walk-in-weighted-graph/">LeetCode #3108</a>
 */
public class MinimumCostWalkInWeightedGraph {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost Walk in Weighted Graph");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostWalkInWeightedGraph ===");
        MinimumCostWalkInWeightedGraph sol = new MinimumCostWalkInWeightedGraph();
        System.out.println(sol.solve(null));
    }
}
