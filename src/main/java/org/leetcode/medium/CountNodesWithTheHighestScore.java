package org.leetcode.medium;


/**
 * <b>#2049 - Count Nodes With the Highest Score</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a binary tree rooted at 0 consisting of n nodes. The nodes are labeled from 0 to n - 1. You are given a 0-indexed integer array parents representing the tree, where parents[i] is the parent of node i. Since node 0 is the root, parents[0] == -1.
 *
 *
 * Each node has a score. To find the score of a node, consider if the node and the edges connected to it were removed. The tree would become one or more non-empty subtrees. The size of a subtree is the number of the nodes in it. The score of the node is the product of the sizes of all those subtrees.
 *
 *
 * Return the number of nodes that have the highest score.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: parents = [-1,2,0,2,0]
 * Output: 3
 * Explanation:
 * - The score of node 0 is: 3 * 1 = 3
 * - The score of node 1 is: 4 = 4
 * - The score of node 2 is: 1 * 1 * 2 = 2
 * - The score of node 3 is: 4 = 4
 * - The score of node 4 is: 4 = 4
 * The highest score is 4, and three nodes (node 1, node 3, and node 4) have the highest score.
 *
 * Example 2:
 *
 * Input: parents = [-1,2,0]
 * Output: 2
 * Explanation:
 * - The score of node 0 is: 2 = 2
 * - The score of node 1 is: 2 = 2
 * - The score of node 2 is: 1 * 1 = 1
 * The highest score is 2, and two nodes (node 0 and node 1) have the highest score.
 *
 *
 *
 * Constraints:
 *
 *
 * n == parents.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * parents[0] == -1
 *
 * 0 &lt;= parents[i] &lt;= n - 1 for i != 0
 *
 * parents represents a valid binary tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each node, you need to find the sizes of the subtrees rooted in each of its children. Maybe DFS?
 * Hint 2: How to determine the number of nodes in the rest of the tree? Can you subtract the size of the subtree rooted at the node from the total number of nodes of the tree?
 * Hint 3: Use these values to compute the score of the node. Track the maximum score, and how many nodes achieve such score.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Tree, Depth-First Search, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/count-nodes-with-the-highest-score/">LeetCode #2049</a>
 */
public class CountNodesWithTheHighestScore {

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
        throw new UnsupportedOperationException("Not yet implemented: Count Nodes With the Highest Score");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNodesWithTheHighestScore ===");
        CountNodesWithTheHighestScore sol = new CountNodesWithTheHighestScore();
        System.out.println(sol.solve(null));
    }
}
