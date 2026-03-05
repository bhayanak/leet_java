package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #538: Convert BST to Greater Tree
 * @see <a href="https://leetcode.com/problems/convert-bst-to-greater-tree/">Problem</a>
 */
public class ConvertBstToGreaterTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #538 – Convert BST to Greater Tree
     * Difficulty: MEDIUM
     * Topics: Tree, Depth-First Search, Binary Search Tree, Binary Tree
     *
     * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree
     * such that every key of the original BST is changed to the original key plus
     * the sum of all keys greater than the original key in BST.
     * 
     * 
     * As a reminder, a binary search tree is a tree that satisfies these
     * constraints:
     * 
     * 
     * The left subtree of a node contains only nodes with keys less than the
     * node's key.
     * 
     * The right subtree of a node contains only nodes with keys greater than the
     * node's key.
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
     * The number of nodes in the tree is in the range [0, 104].
     * 
     * -104 &lt;= Node.val &lt;= 104
     * 
     * All the values in the tree are unique.
     * 
     * root is guaranteed to be a valid binary search tree.
     * 
     * 
     * 
     * Note: This question is the same as 1038:
     * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
     */
    private int sum = 0;
    /**
     * Solves the problem: Convert b s t.
     *
     * @param root the root (TreeNode)
     * @return the computed TreeNode result
     */
    public TreeNode convertBST(TreeNode root) {
        // Reverse inorder: right -> node -> left; accumulate running sum
        if (root == null) return null;
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }

    public static void main(String[] args) {
        ConvertBstToGreaterTree sol = new ConvertBstToGreaterTree();
        System.out.println(sol.convertBST(null));
    }
}
