package org.leetcode.medium;


/**
 * <b>#979 - Distribute Coins in Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree with n nodes where each node in the tree has node.val coins. There are n coins in total throughout the whole tree.
 *
 *
 * In one move, we may choose two adjacent nodes and move one coin from one node to another. A move may be from parent to child, or from child to parent.
 *
 *
 * Return the minimum number of moves required to make every node have exactly one coin.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [3,0,0]
 * Output: 2
 * Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child.
 *
 * Example 2:
 *
 * Input: root = [0,3,0]
 * Output: 3
 * Explanation: From the left child of the root, we move two coins to the root [taking two moves]. Then, we move one coin from the root of the tree to the right child.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is n.
 *
 * 1 &lt;= n &lt;= 100
 *
 * 0 &lt;= Node.val &lt;= n
 *
 * The sum of all Node.val is n.
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
 * @see <a href="https://leetcode.com/problems/distribute-coins-in-binary-tree/">LeetCode #979</a>
 */
public class DistributeCoinsInBinaryTree {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Distribute Coins in Binary Tree".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distribute Coins in Binary Tree");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DistributeCoinsInBinaryTree.java &amp;&amp; java org.leetcode.medium.DistributeCoinsInBinaryTree</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DistributeCoinsInBinaryTree ===");
        DistributeCoinsInBinaryTree sol = new DistributeCoinsInBinaryTree();
        System.out.println(sol.solve(null));
    }
}
