package org.leetcode.medium;


/**
 * <b>#3604 - Minimum Time to Reach Destination in Directed Graph</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Graph Theory, Heap (Priority Queue), Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and a directed graph with n nodes labeled from 0 to n - 1. This is represented by a 2D array edges, where edges[i] = [ui, vi, starti, endi] indicates an edge from node ui to vi that can only be used at any integer time t such that starti &lt;= t &lt;= endi.
 *
 *
 * You start at node 0 at time 0.
 *
 *
 * In one unit of time, you can either:
 *
 *
 * Wait at your current node without moving, or
 *
 * Travel along an outgoing edge from your current node if the current time t satisfies starti &lt;= t &lt;= endi.
 *
 * Return the minimum time required to reach node n - 1. If it is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1,0,1],[1,2,2,5]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 * The optimal path is:
 *
 *
 * At time t = 0, take the edge (0 → 1) which is available from 0 to 1. You arrive at node 1 at time t = 1, then wait until t = 2.
 *
 * At time t = 2, take the edge (1 → 2) which is available from 2 to 5. You arrive at node 2 at time 3.
 *
 * Hence, the minimum time to reach node 2 is 3.
 *
 * Example 2:
 *
 * Input: n = 4, edges = [[0,1,0,3],[1,3,7,8],[0,2,1,5],[2,3,4,7]]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 * The optimal path is:
 *
 *
 * Wait at node 0 until time t = 1, then take the edge (0 → 2) which is available from 1 to 5. You arrive at node 2 at t = 2.
 *
 * Wait at node 2 until time t = 4, then take the edge (2 → 3) which is available from 4 to 7. You arrive at node 3 at t = 5.
 *
 * Hence, the minimum time to reach node 3 is 5.
 *
 * Example 3:
 *
 * Input: n = 3, edges = [[1,0,1,3],[1,2,3,5]]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * Since there is no outgoing edge from node 0, it is impossible to reach node 2. Hence, the output is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 0 &lt;= edges.length &lt;= 105
 *
 * edges[i] == [ui, vi, starti, endi]
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * ui != vi
 *
 * 0 &lt;= starti &lt;= endi &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the <code>Dijkstra</code> algorithm over states (node, time).
 * Hint 2: At node <code>u</code> with current time <code>t</code>, you can only use an edge <code>[u, v, start, end]</code> if <code>t &lt;= end</code>.
 * Hint 3: If <code>t &lt; start</code>, wait until <code>start</code>, then traverse (arriving at <code>start + 1</code>).
 *
 * <h2>Approach</h2>
 * Think about the category (Graph Theory, Heap (Priority Queue), Shortest Path).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-reach-destination-in-directed-graph/">LeetCode #3604</a>
 */
public class MinimumTimeToReachDestinationInDirectedGraph {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Reach Destination in Directed Graph");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToReachDestinationInDirectedGraph ===");
        MinimumTimeToReachDestinationInDirectedGraph sol = new MinimumTimeToReachDestinationInDirectedGraph();
        System.out.println(sol.solve(null));
    }
}
