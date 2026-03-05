package org.leetcode.medium;


/**
 * <b>#1008 - Construct Binary Search Tree from Preorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Tree, Binary Search Tree, Monotonic Stack, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.
 *
 *
 * It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.
 *
 *
 * A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
 *
 *
 * A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: preorder = [8,5,1,7,10,12]
 * Output: [8,5,10,1,7,null,12]
 *
 * Example 2:
 *
 * Input: preorder = [1,3]
 * Output: [1,null,3]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= preorder.length &lt;= 100
 *
 * 1 &lt;= preorder[i] &lt;= 1000
 *
 * All the values of preorder are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Tree, Binary Search Tree, Monotonic Stack, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/">LeetCode #1008</a>
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Bst from preorder.
     *
     * @param preorder the preorder (int[])
     * @return the computed TreeNode result
     */
    public TreeNode bstFromPreorder(int[] preorder) {
        return insert(preorder, new int[]{0}, Integer.MAX_VALUE);
    }
    private TreeNode insert(int[] pre, int[] idx, int bound) {
        if (idx[0] == pre.length || pre[idx[0]] > bound) return null;
        TreeNode node = new TreeNode(pre[idx[0]++]);
        node.left  = insert(pre, idx, node.val);
        node.right = insert(pre, idx, bound);
        return node;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ConstructBinarySearchTreeFromPreorderTraversal.java &amp;&amp; java org.leetcode.medium.ConstructBinarySearchTreeFromPreorderTraversal</pre>
     */
    public static void main(String[] args) {
        ConstructBinarySearchTreeFromPreorderTraversal sol = new ConstructBinarySearchTreeFromPreorderTraversal();
                TreeNode root = sol.bstFromPreorder(new int[]{8,5,1,7,10,12});
                System.out.println("Root: " + root.val);           // 8
                System.out.println("Root.left: " + root.left.val); // 5
    }
}
