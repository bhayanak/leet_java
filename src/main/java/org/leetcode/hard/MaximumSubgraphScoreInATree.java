package org.leetcode.hard;


/**
 * <b>#3772 - Maximum Subgraph Score in a Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Tree, Depth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected tree with n nodes, numbered from 0 to n - 1. It is represented by a 2D integer array edges​​​​​​​ of length n - 1, where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
 *
 *
 * You are also given an integer array good of length n, where good[i] is 1 if the ith node is good, and 0 if it is bad.
 *
 *
 * Define the score of a subgraph as the number of good nodes minus the number of bad nodes in that subgraph.
 *
 *
 * For each node i, find the maximum possible score among all connected subgraphs that contain node i.
 *
 *
 * Return an array of n integers where the ith element is the maximum score for node i.
 *
 *
 * A subgraph is a graph whose vertices and edges are subsets of the original graph.
 *
 *
 * A connected subgraph is a subgraph in which every pair of its vertices is reachable from one another using only its edges.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1],[1,2]], good = [1,0,1]
 *
 *
 * Output: [1,1,1]
 *
 *
 * Explanation:
 *
 *
 * Green nodes are good and red nodes are bad.
 *
 * For each node, the best connected subgraph containing it is the whole tree, which has 2 good nodes and 1 bad node, resulting in a score of 1.
 *
 * Other connected subgraphs containing a node may have the same score.
 *
 * Example 2:
 *
 * Input: n = 5, edges = [[1,0],[1,2],[1,3],[3,4]], good = [0,1,0,1,1]
 *
 *
 * Output: [2,3,2,3,3]
 *
 *
 * Explanation:
 *
 *
 * Node 0: The best connected subgraph consists of nodes 0, 1, 3, 4, which has 3 good nodes and 1 bad node, resulting in a score of 3 - 1 = 2.
 *
 * Nodes 1, 3, and 4: The best connected subgraph consists of nodes 1, 3, 4, which has 3 good nodes, resulting in a score of 3.
 *
 * Node 2: The best connected subgraph consists of nodes 1, 2, 3, 4, which has 3 good nodes and 1 bad node, resulting in a score of 3 - 1 = 2.
 *
 * Example 3:
 *
 * Input: n = 2, edges = [[0,1]], good = [0,0]
 *
 *
 * Output: [-1,-1]
 *
 *
 * Explanation:
 *
 *
 * For each node, including the other node only adds another bad node, so the best score for both nodes is -1.
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
 * edges[i] = [ai, bi]
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * good.length == n
 *
 * 0 &lt;= good[i] &lt;= 1
 *
 * The input is generated such that edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use rerooting dynamic programming
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Tree, Depth-First Search).
 *
 * @see <a href="https://leetcode.com/problems/maximum-subgraph-score-in-a-tree/">LeetCode #3772</a>
 */
public class MaximumSubgraphScoreInATree {

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
        throw new UnsupportedOperationException("Not yet implemented: Maximum Subgraph Score in a Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSubgraphScoreInATree ===");
        MaximumSubgraphScoreInATree sol = new MaximumSubgraphScoreInATree();
        System.out.println(sol.solve(null));
    }
}
