package org.leetcode.medium;


/**
 * <b>#889 - Construct Binary Tree from Preorder and Postorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays, preorder and postorder where preorder is the preorder traversal of a binary tree of distinct values and postorder is the postorder traversal of the same tree, reconstruct and return the binary tree.
 *
 *
 * If there exist multiple answers, you can return any of them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
 * Output: [1,2,3,4,5,6,7]
 *
 * Example 2:
 *
 * Input: preorder = [1], postorder = [1]
 * Output: [1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= preorder.length &lt;= 30
 *
 * 1 &lt;= preorder[i] &lt;= preorder.length
 *
 * All the values of preorder are unique.
 *
 * postorder.length == preorder.length
 *
 * 1 &lt;= postorder[i] &lt;= postorder.length
 *
 * All the values of postorder are unique.
 *
 * It is guaranteed that preorder and postorder are the preorder traversal and postorder traversal of the same binary tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Divide and Conquer, Tree, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/">LeetCode #889</a>
 */
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Construct Binary Tree from Preorder and Postorder Traversal".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Construct Binary Tree from Preorder and Postorder Traversal");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ConstructBinaryTreeFromPreorderAndPostorderTraversal.java &amp;&amp; java org.leetcode.medium.ConstructBinaryTreeFromPreorderAndPostorderTraversal</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ConstructBinaryTreeFromPreorderAndPostorderTraversal ===");
        ConstructBinaryTreeFromPreorderAndPostorderTraversal sol = new ConstructBinaryTreeFromPreorderAndPostorderTraversal();
        System.out.println(sol.solve(null));
    }
}
