package org.leetcode.medium;


/**
 * <b>#2368 - Reachable Nodes With Restrictions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Tree, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
 *
 *
 * You are given a 2D integer array edges of length n - 1 where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree. You are also given an integer array restricted which represents restricted nodes.
 *
 *
 * Return the maximum number of nodes you can reach from node 0 without visiting a restricted node.
 *
 *
 * Note that node 0 will not be a restricted node.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7, edges = [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]], restricted = [4,5]
 * Output: 4
 * Explanation: The diagram above shows the tree.
 * We have that [0,1,2,3] are the only nodes that can be reached from node 0 without visiting a restricted node.
 *
 * Example 2:
 *
 * Input: n = 7, edges = [[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]], restricted = [4,2,1]
 * Output: 3
 * Explanation: The diagram above shows the tree.
 * We have that [0,5,6] are the only nodes that can be reached from node 0 without visiting a restricted node.
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
 * 0 &lt;= ai, bi &lt; n
 *
 * ai != bi
 *
 * edges represents a valid tree.
 *
 * 1 &lt;= restricted.length &lt; n
 *
 * 1 &lt;= restricted[i] &lt; n
 *
 * All the values of restricted are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we find all the reachable nodes in a single traversal?
 * Hint 2: Traverse the graph from node 0 while avoiding the nodes in restricted and do not revisit nodes that have been visited.
 * Hint 3: Keep count of how many nodes are visited in total.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Tree, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/reachable-nodes-with-restrictions/">LeetCode #2368</a>
 */
public class ReachableNodesWithRestrictions {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reachable Nodes With Restrictions");
    }

    public static void main(String[] args) {
        System.out.println("=== ReachableNodesWithRestrictions ===");
        ReachableNodesWithRestrictions sol = new ReachableNodesWithRestrictions();
        System.out.println(sol.solve(null));
    }
}
