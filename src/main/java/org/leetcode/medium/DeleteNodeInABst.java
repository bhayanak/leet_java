package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #450: Delete Node in a BST
 * @see <a href="https://leetcode.com/problems/delete-node-in-a-bst/">Problem</a>
 */
public class DeleteNodeInABst {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #450 – Delete Node in a BST
     * Difficulty: MEDIUM
     * Topics: Tree, Binary Search Tree, Binary Tree
     *
     * Given a root node reference of a BST and a key, delete the node with the
     * given key in the BST. Return the root node reference (possibly updated) of
     * the BST.
     * 
     * 
     * Basically, the deletion can be divided into two stages:
     * 
     * 
     * Search for a node to remove.
     * 
     * If the node is found, delete the node.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [5,3,6,2,4,null,7], key = 3
     * Output: [5,4,6,2,null,null,7]
     * Explanation: Given key to delete is 3. So we find the node with value 3 and
     * delete it.
     * One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
     * Please notice that another valid answer is [5,2,6,null,4,null,7] and it's
     * also accepted.
     * 
     * Example 2:
     * 
     * Input: root = [5,3,6,2,4,null,7], key = 0
     * Output: [5,3,6,2,4,null,7]
     * Explanation: The tree does not contain a node with value = 0.
     * 
     * Example 3:
     * 
     * Input: root = [], key = 0
     * Output: []
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [0, 104].
     * 
     * -105 &lt;= Node.val &lt;= 105
     * 
     * Each node has a unique value.
     * 
     * root is a valid binary search tree.
     * 
     * -105 &lt;= key &lt;= 105
     * 
     * 
     * 
     * Follow up: Could you solve it with time complexity O(height of tree)?
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) root.left = deleteNode(root.left, key);
        else if (key > root.val) root.right = deleteNode(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // Find inorder successor (min of right subtree)
            TreeNode successor = root.right;
            while (successor.left != null) successor = successor.left;
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }

    public static void main(String[] args) {
        DeleteNodeInABst sol = new DeleteNodeInABst();
        System.out.println(sol.deleteNode(null, 0));
    }
}
