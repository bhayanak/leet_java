package org.leetcode.hard;


/**
 * <b>#1761 - Minimum Degree of a Connected Trio in a Graph</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Graph Theory, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected graph. You are given an integer n which is the number of nodes in the graph and an array edges, where each edges[i] = [ui, vi] indicates that there is an undirected edge between ui and vi.
 *
 *
 * A connected trio is a set of three nodes where there is an edge between every pair of them.
 *
 *
 * The degree of a connected trio is the number of edges where one endpoint is in the trio, and the other is not.
 *
 *
 * Return the minimum degree of a connected trio in the graph, or -1 if the graph has no connected trios.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, edges = [[1,2],[1,3],[3,2],[4,1],[5,2],[3,6]]
 * Output: 3
 * Explanation: There is exactly one trio, which is [1,2,3]. The edges that form its degree are bolded in the figure above.
 *
 * Example 2:
 *
 * Input: n = 7, edges = [[1,3],[4,1],[4,3],[2,5],[5,6],[6,7],[7,5],[2,6]]
 * Output: 0
 * Explanation: There are exactly three trios:
 * 1) [1,4,3] with degree 0.
 * 2) [2,5,6] with degree 2.
 * 3) [5,6,7] with degree 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 400
 *
 * edges[i].length == 2
 *
 * 1 &lt;= edges.length &lt;= n * (n-1) / 2
 *
 * 1 &lt;= ui, vi &lt;= n
 *
 * ui != vi
 *
 * There are no repeated edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider a trio with nodes u, v, and w. The degree of the trio is just degree(u) + degree(v) + degree(w) - 6. The -6 comes from subtracting the edges u-v, u-w, and v-w, which are counted twice each in the vertex degree calculation.
 * Hint 2: To get the trios (u,v,w), you can iterate on u, then iterate on each w,v such that w and v are neighbors of u and are neighbors of each other.
 *
 * <h2>Approach</h2>
 * Think about the category (Graph Theory, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-degree-of-a-connected-trio-in-a-graph/">LeetCode #1761</a>
 */
public class MinimumDegreeOfAConnectedTrioInAGraph {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Degree of a Connected Trio in a Graph");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumDegreeOfAConnectedTrioInAGraph ===");
        MinimumDegreeOfAConnectedTrioInAGraph sol = new MinimumDegreeOfAConnectedTrioInAGraph();
        System.out.println(sol.solve(null));
    }
}
