package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #700: Search in a Binary Search Tree
 * @see <a href="https://leetcode.com/problems/search-in-a-binary-search-tree/">Problem</a>
 */
public class SearchInABinarySearchTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * LeetCode #700 – Search in a Binary Search Tree
     * Difficulty: EASY
     * Topics: Tree, Binary Search Tree, Binary Tree
     *
     * You are given the root of a binary search tree (BST) and an integer val.
     * 
     * 
     * Find the node in the BST that the node's value equals val and return the
     * subtree rooted with that node. If such a node does not exist, return null.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [4,2,7,1,3], val = 2
     * Output: [2,1,3]
     * 
     * Example 2:
     * 
     * Input: root = [4,2,7,1,3], val = 5
     * Output: []
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [1, 5000].
     * 
     * 1 &lt;= Node.val &lt;= 107
     * 
     * root is a binary search tree.
     * 
     * 1 &lt;= val &lt;= 107
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    public static void main(String[] args) {
        SearchInABinarySearchTree sol = new SearchInABinarySearchTree();
        System.out.println(sol.searchBST(null, 0));
    }
}
