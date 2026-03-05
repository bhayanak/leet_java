package org.leetcode.hard;


/**
 * <b>#2493 - Divide Nodes Into the Maximum Number of Groups</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n representing the number of nodes in an undirected graph. The nodes are labeled from 1 to n.
 *
 *
 * You are also given a 2D integer array edges, where edges[i] = [ai, bi] indicates that there is a bidirectional edge between nodes ai and bi. Notice that the given graph may be disconnected.
 *
 *
 * Divide the nodes of the graph into m groups (1-indexed) such that:
 *
 *
 * Each node in the graph belongs to exactly one group.
 *
 * For every pair of nodes in the graph that are connected by an edge [ai, bi], if ai belongs to the group with index x, and bi belongs to the group with index y, then |y - x| = 1.
 *
 * Return the maximum number of groups (i.e., maximum m) into which you can divide the nodes. Return -1 if it is impossible to group the nodes with the given conditions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, edges = [[1,2],[1,4],[1,5],[2,6],[2,3],[4,6]]
 * Output: 4
 * Explanation: As shown in the image we:
 * - Add node 5 to the first group.
 * - Add node 1 to the second group.
 * - Add nodes 2 and 4 to the third group.
 * - Add nodes 3 and 6 to the fourth group.
 * We can see that every edge is satisfied.
 * It can be shown that that if we create a fifth group and move any node from the third or fourth group to it, at least on of the edges will not be satisfied.
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[1,2],[2,3],[3,1]]
 * Output: -1
 * Explanation: If we add node 1 to the first group, node 2 to the second group, and node 3 to the third group to satisfy the first two edges, we can see that the third edge will not be satisfied.
 * It can be shown that no grouping is possible.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 500
 *
 * 1 &lt;= edges.length &lt;= 104
 *
 * edges[i].length == 2
 *
 * 1 &lt;= ai, bi &lt;= n
 *
 * ai != bi
 *
 * There is at most one edge between any pair of vertices.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the graph is not bipartite, it is not possible to group the nodes.
 * Hint 2: Notice that we can solve the problem for each connected component independently, and the final answer will be just the sum of the maximum number of groups in each component.
 * Hint 3: Finally, to solve the problem for each connected component, we can notice that if for some node v we fix its position to be in the leftmost group, then we can also evaluate the position of every other node. That position is the depth of the node in a bfs tree after rooting at node v.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Union-Find, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/divide-nodes-into-the-maximum-number-of-groups/">LeetCode #2493</a>
 */
public class DivideNodesIntoTheMaximumNumberOfGroups {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Divide Nodes Into the Maximum Number of Groups");
    }

    public static void main(String[] args) {
        System.out.println("=== DivideNodesIntoTheMaximumNumberOfGroups ===");
        DivideNodesIntoTheMaximumNumberOfGroups sol = new DivideNodesIntoTheMaximumNumberOfGroups();
        System.out.println(sol.solve(null));
    }
}
