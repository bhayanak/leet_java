package org.leetcode.hard;


/**
 * <b>#2858 - Minimum Edge Reversals So Every Node Is Reachable</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Depth-First Search, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a simple directed graph with n nodes labeled from 0 to n - 1. The graph would form a tree if its edges were bi-directional.
 *
 *
 * You are given an integer n and a 2D integer array edges, where edges[i] = [ui, vi] represents a directed edge going from node ui to node vi.
 *
 *
 * An edge reversal changes the direction of an edge, i.e., a directed edge going from node ui to node vi becomes a directed edge going from node vi to node ui.
 *
 *
 * For every node i in the range [0, n - 1], your task is to independently calculate the minimum number of edge reversals required so it is possible to reach any other node starting from node i through a sequence of directed edges.
 *
 *
 * Return an integer array answer, where answer[i] is the  minimum number of edge reversals required so it is possible to reach any other node starting from node i through a sequence of directed edges.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, edges = [[2,0],[2,1],[1,3]]
 * Output: [1,1,0,2]
 * Explanation: The image above shows the graph formed by the edges.
 * For node 0: after reversing the edge [2,0], it is possible to reach any other node starting from node 0.
 * So, answer[0] = 1.
 * For node 1: after reversing the edge [2,1], it is possible to reach any other node starting from node 1.
 * So, answer[1] = 1.
 * For node 2: it is already possible to reach any other node starting from node 2.
 * So, answer[2] = 0.
 * For node 3: after reversing the edges [1,3] and [2,1], it is possible to reach any other node starting from node 3.
 * So, answer[3] = 2.
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[1,2],[2,0]]
 * Output: [2,0,1]
 * Explanation: The image above shows the graph formed by the edges.
 * For node 0: after reversing the edges [2,0] and [1,2], it is possible to reach any other node starting from node 0.
 * So, answer[0] = 2.
 * For node 1: it is already possible to reach any other node starting from node 1.
 * So, answer[1] = 0.
 * For node 2: after reversing the edge [1, 2], it is possible to reach any other node starting from node 2.
 * So, answer[2] = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * edges.length == n - 1
 *
 * edges[i].length == 2
 *
 * 0 &lt;= ui == edges[i][0] &lt; n
 *
 * 0 &lt;= vi == edges[i][1] &lt; n
 *
 * ui != vi
 *
 * The input is generated such that if the edges were bi-directional, the graph would be a tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be solved using tree DP.
 * Hint 2: Using node <code>0</code> as the root, let <code>dp[x]</code> be the minimum number of edge reversals so node <code>x</code> can reach every node in its subtree.
 * Hint 3: Using a DFS traversing the edges bidirectionally, we can compute <code>dp</code>.<br />
<code>dp[x] = dp[y] +</code> (<code>1</code> if the edge between <code>x</code> and <code>y</code> is going from <code>y</code> to <code>x</code>; <code>0</code> otherwise), where <code>x</code> is the parent of <code>y</code>.
 * Hint 4: Let <code>answer[x]</code> be the minimum number of edge reversals so it is possible to reach any other node starting from node <code>x</code>.
 * Hint 5: Using another DFS starting from node <code>0</code> and traversing the edges bidirectionally, we can compute <code>answer</code>.<br />
<code>answer[0] = dp[0]</code><br />
<code>answer[y] = answer[x] +</code> (<code>1</code> if the edge between <code>x</code> and <code>y</code> is going from <code>x</code> to <code>y</code>; <code>-1</code> otherwise), where <code>x</code> is the parent of <code>y</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Depth-First Search, Breadth-First Search, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/minimum-edge-reversals-so-every-node-is-reachable/">LeetCode #2858</a>
 */
public class MinimumEdgeReversalsSoEveryNodeIsReachable {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Edge Reversals So Every Node Is Reachable");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumEdgeReversalsSoEveryNodeIsReachable ===");
        MinimumEdgeReversalsSoEveryNodeIsReachable sol = new MinimumEdgeReversalsSoEveryNodeIsReachable();
        System.out.println(sol.solve(null));
    }
}
