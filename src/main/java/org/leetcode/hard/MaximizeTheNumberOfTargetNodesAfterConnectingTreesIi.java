package org.leetcode.hard;


/**
 * <b>#3373 - Maximize the Number of Target Nodes After Connecting Trees II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There exist two undirected trees with n and m nodes, labeled from [0, n - 1] and [0, m - 1], respectively.
 *
 *
 * You are given two 2D integer arrays edges1 and edges2 of lengths n - 1 and m - 1, respectively, where edges1[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the first tree and edges2[i] = [ui, vi] indicates that there is an edge between nodes ui and vi in the second tree.
 *
 *
 * Node u is target to node v if the number of edges on the path from u to v is even. Note that a node is always target to itself.
 *
 *
 * Return an array of n integers answer, where answer[i] is the maximum possible number of nodes that are target to node i of the first tree if you had to connect one node from the first tree to another node in the second tree.
 *
 *
 * Note that queries are independent from each other. That is, for every query you will remove the added edge before proceeding to the next query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges1 = [[0,1],[0,2],[2,3],[2,4]], edges2 = [[0,1],[0,2],[0,3],[2,7],[1,4],[4,5],[4,6]]
 *
 *
 * Output: [8,7,7,8,8]
 *
 *
 * Explanation:
 *
 *
 * For i = 0, connect node 0 from the first tree to node 0 from the second tree.
 *
 * For i = 1, connect node 1 from the first tree to node 4 from the second tree.
 *
 * For i = 2, connect node 2 from the first tree to node 7 from the second tree.
 *
 * For i = 3, connect node 3 from the first tree to node 0 from the second tree.
 *
 * For i = 4, connect node 4 from the first tree to node 4 from the second tree.
 *
 * Example 2:
 *
 * Input: edges1 = [[0,1],[0,2],[0,3],[0,4]], edges2 = [[0,1],[1,2],[2,3]]
 *
 *
 * Output: [3,6,6,6,6]
 *
 *
 * Explanation:
 *
 *
 * For every i, connect node i of the first tree with any node of the second tree.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n, m &lt;= 105
 *
 * edges1.length == n - 1
 *
 * edges2.length == m - 1
 *
 * edges1[i].length == edges2[i].length == 2
 *
 * edges1[i] = [ai, bi]
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * edges2[i] = [ui, vi]
 *
 * 0 &lt;= ui, vi &lt; m
 *
 * The input is generated such that edges1 and edges2 represent valid trees.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Compute an array <code>even</code> where <code>even[u]</code> is the number of nodes at an even distance from node <code>u</code>, for every <code>u</code> of the first tree.
 * Hint 2: Compute an array <code>odd</code> where <code>odd[u]</code> is the number of nodes at an odd distance from node <code>u</code>, for every <code>u</code> of the second tree.
 * Hint 3: <code>answer[i] = even[i]+ max(odd[1], odd[2], …, odd[m - 1])</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search).
 *
 * @see <a href="https://leetcode.com/problems/maximize-the-number-of-target-nodes-after-connecting-trees-ii/">LeetCode #3373</a>
 */
public class MaximizeTheNumberOfTargetNodesAfterConnectingTreesIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Maximize the Number of Target Nodes After Connecting Trees II");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTheNumberOfTargetNodesAfterConnectingTreesIi ===");
        MaximizeTheNumberOfTargetNodesAfterConnectingTreesIi sol = new MaximizeTheNumberOfTargetNodesAfterConnectingTreesIi();
        System.out.println(sol.solve(null));
    }
}
