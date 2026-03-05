package org.leetcode.medium;


/**
 * <b>#971 - Flip Binary Tree To Match Preorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree with n nodes, where each node is uniquely assigned a value from 1 to n. You are also given a sequence of n values voyage, which is the desired pre-order traversal of the binary tree.
 *
 *
 * Any node in the binary tree can be flipped by swapping its left and right subtrees. For example, flipping node 1 will have the following effect:
 *
 *
 * Flip the smallest number of nodes so that the pre-order traversal of the tree matches voyage.
 *
 *
 * Return a list of the values of all flipped nodes. You may return the answer in any order. If it is impossible to flip the nodes in the tree to make the pre-order traversal match voyage, return the list [-1].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2], voyage = [2,1]
 * Output: [-1]
 * Explanation: It is impossible to flip the nodes such that the pre-order traversal matches voyage.
 *
 * Example 2:
 *
 * Input: root = [1,2,3], voyage = [1,3,2]
 * Output: [1]
 * Explanation: Flipping node 1 swaps nodes 2 and 3, so the pre-order traversal matches voyage.
 *
 * Example 3:
 *
 * Input: root = [1,2,3], voyage = [1,2,3]
 * Output: []
 * Explanation: The tree's pre-order traversal already matches voyage, so no nodes need to be flipped.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is n.
 *
 * n == voyage.length
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= Node.val, voyage[i] &lt;= n
 *
 * All the values in the tree are unique.
 *
 * All the values in voyage are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/">LeetCode #971</a>
 */
public class FlipBinaryTreeToMatchPreorderTraversal {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Flip Binary Tree To Match Preorder Traversal".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Flip Binary Tree To Match Preorder Traversal");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FlipBinaryTreeToMatchPreorderTraversal.java &amp;&amp; java org.leetcode.medium.FlipBinaryTreeToMatchPreorderTraversal</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FlipBinaryTreeToMatchPreorderTraversal ===");
        FlipBinaryTreeToMatchPreorderTraversal sol = new FlipBinaryTreeToMatchPreorderTraversal();
        System.out.println(sol.solve(null));
    }
}
