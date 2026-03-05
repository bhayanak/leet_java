package org.leetcode.medium;


/**
 * <b>#1557 - Minimum Number of Vertices to Reach All Nodes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a directed acyclic graph, with n vertices numbered from 0 to n-1, and an array edges where edges[i] = [fromi, toi] represents a directed edge from node fromi to node toi.
 *
 *
 * Find the smallest set of vertices from which all nodes in the graph are reachable. It's guaranteed that a unique solution exists.
 *
 *
 * Notice that you can return the vertices in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, edges = [[0,1],[0,2],[2,5],[3,4],[4,2]]
 * Output: [0,3]
 * Explanation: It's not possible to reach all the nodes from a single vertex. From 0 we can reach [0,1,2,5]. From 3 we can reach [3,4,2,5]. So we output [0,3].
 *
 * Example 2:
 *
 * Input: n = 5, edges = [[0,1],[2,1],[3,1],[1,4],[2,4]]
 * Output: [0,2,3]
 * Explanation: Notice that vertices 0, 3 and 2 are not reachable from any other node, so we must include them. Also any of these vertices can reach nodes 1 and 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 10^5
 *
 * 1 &lt;= edges.length &lt;= min(10^5, n * (n - 1) / 2)
 *
 * edges[i].length == 2
 *
 * 0 &lt;= fromi, toi &lt; n
 *
 * All pairs (fromi, toi) are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A node that does not have any incoming edge can only be reached by itself.
 * Hint 2: Any other node with incoming edges can be reached from some other node.
 * Hint 3: We only have to count the number of nodes with zero incoming edges.
 *
 * <h2>Approach</h2>
 * Think about the category (Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/">LeetCode #1557</a>
 */
public class MinimumNumberOfVerticesToReachAllNodes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Vertices to Reach All Nodes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfVerticesToReachAllNodes ===");
        MinimumNumberOfVerticesToReachAllNodes sol = new MinimumNumberOfVerticesToReachAllNodes();
        System.out.println(sol.solve(null));
    }
}
