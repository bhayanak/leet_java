package org.leetcode.medium;

/**
 * <b>#98 - Validate Binary Search Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * 
 * A valid BST is defined as follows:
 * 
 * 	
 * The left subtree of a node contains only nodes with keys strictly less than the node's key.
 * 	
 * The right subtree of a node contains only nodes with keys strictly greater than the node's key.
 * 	
 * Both the left and right subtrees must also be binary search trees.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [2,1,3]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [1, 104].
 * 	
 * -231 &lt;= Node.val &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Recursion with valid range [min, max]: every node must satisfy min &lt; node.val &lt; max.
 * Update ranges when descending: max = node.val going left, min = node.val going right.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n) stack
 *
 * @see <a href="https://leetcode.com/problems/validate-binary-search-tree/">LeetCode #98</a>
 */
public class ValidateBinarySearchTree {

    public static class TreeNode { int val; TreeNode left, right; TreeNode(int v){val=v;} }

    /**
     * Determines whether a binary tree is a valid BST.
     *
     * @param root root of the binary tree
     * @return     true if the tree satisfies BST properties
     */
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                ValidateBinarySearchTree sol = new ValidateBinarySearchTree();
                TreeNode t1 = new TreeNode(2);
                t1.left = new TreeNode(1); t1.right = new TreeNode(3);
                System.out.println(sol.isValidBST(t1)); // true
                TreeNode t2 = new TreeNode(5);
                t2.left = new TreeNode(1); t2.right = new TreeNode(4);
                t2.right.left = new TreeNode(3); t2.right.right = new TreeNode(6);
                System.out.println(sol.isValidBST(t2)); // false
    }
}
