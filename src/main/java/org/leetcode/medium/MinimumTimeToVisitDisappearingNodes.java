package org.leetcode.medium;


/**
 * <b>#3112 - Minimum Time to Visit Disappearing Nodes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Graph Theory, Heap (Priority Queue), Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected graph of n nodes. You are given a 2D array edges, where edges[i] = [ui, vi, lengthi] describes an edge between node ui and node vi with a traversal time of lengthi units.
 *
 *
 * Additionally, you are given an array disappear, where disappear[i] denotes the time when the node i disappears from the graph and you won't be able to visit it.
 *
 *
 * Note that the graph might be disconnected and might contain multiple edges.
 *
 *
 * Return the array answer, with answer[i] denoting the minimum units of time required to reach node i from node 0. If node i is unreachable from node 0 then answer[i] is -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1,2],[1,2,1],[0,2,4]], disappear = [1,1,5]
 *
 *
 * Output: [0,-1,4]
 *
 *
 * Explanation:
 *
 * We are starting our journey from node 0, and our goal is to find the minimum time required to reach each node before it disappears.
 *
 *
 * For node 0, we don't need any time as it is our starting point.
 *
 * For node 1, we need at least 2 units of time to traverse edges[0]. Unfortunately, it disappears at that moment, so we won't be able to visit it.
 *
 * For node 2, we need at least 4 units of time to traverse edges[2].
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[0,1,2],[1,2,1],[0,2,4]], disappear = [1,3,5]
 *
 *
 * Output: [0,2,3]
 *
 *
 * Explanation:
 *
 * We are starting our journey from node 0, and our goal is to find the minimum time required to reach each node before it disappears.
 *
 *
 * For node 0, we don't need any time as it is the starting point.
 *
 * For node 1, we need at least 2 units of time to traverse edges[0].
 *
 * For node 2, we need at least 3 units of time to traverse edges[0] and edges[1].
 *
 * Example 3:
 *
 * Input: n = 2, edges = [[0,1,1]], disappear = [1,1]
 *
 *
 * Output: [0,-1]
 *
 *
 * Explanation:
 *
 *
 * Exactly when we reach node 1, it disappears.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 5 * 104
 *
 * 0 &lt;= edges.length &lt;= 105
 *
 * edges[i] == [ui, vi, lengthi]
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * 1 &lt;= lengthi &lt;= 105
 *
 * disappear.length == n
 *
 * 1 &lt;= disappear[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Dijkstra’s algorithm, but only visit nodes if you can reach them before disappearance.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Graph Theory, Heap (Priority Queue), Shortest Path).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-visit-disappearing-nodes/">LeetCode #3112</a>
 */
public class MinimumTimeToVisitDisappearingNodes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Visit Disappearing Nodes");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToVisitDisappearingNodes ===");
        MinimumTimeToVisitDisappearingNodes sol = new MinimumTimeToVisitDisappearingNodes();
        System.out.println(sol.solve(null));
    }
}
