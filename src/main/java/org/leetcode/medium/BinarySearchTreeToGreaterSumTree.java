package org.leetcode.medium;


/**
 * <b>#1038 - Binary Search Tree to Greater Sum Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.
 *
 *
 * As a reminder, a binary search tree is a tree that satisfies these constraints:
 *
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 *
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 *
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
 *
 * Example 2:
 *
 * Input: root = [0,null,1]
 * Output: [1,null,1]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 100].
 *
 * 0 &lt;= Node.val &lt;= 100
 *
 * All the values in the tree are unique.
 *
 *
 *
 * Note: This question is the same as 538: https://leetcode.com/problems/convert-bst-to-greater-tree/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What traversal method organizes all nodes in sorted order?
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Search Tree, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/">LeetCode #1038</a>
 */
public class BinarySearchTreeToGreaterSumTree {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Binary Search Tree to Greater Sum Tree".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Search Tree to Greater Sum Tree");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinarySearchTreeToGreaterSumTree.java &amp;&amp; java org.leetcode.medium.BinarySearchTreeToGreaterSumTree</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BinarySearchTreeToGreaterSumTree ===");
        BinarySearchTreeToGreaterSumTree sol = new BinarySearchTreeToGreaterSumTree();
        System.out.println(sol.solve(null));
    }
}
