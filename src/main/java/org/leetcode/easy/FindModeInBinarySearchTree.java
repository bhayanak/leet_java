package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #501: Find Mode in Binary Search Tree
 * @see <a href="https://leetcode.com/problems/find-mode-in-binary-search-tree/">Problem</a>
 */
public class FindModeInBinarySearchTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #501 – Find Mode in Binary Search Tree
     * Difficulty: EASY
     * Topics: Tree, Depth-First Search, Binary Search Tree, Binary Tree
     *
     * Given the root of a binary search tree (BST) with duplicates, return all
     * the mode(s) (i.e., the most frequently occurred element) in it.
     * 
     * 
     * If the tree has more than one mode, return them in any order.
     * 
     * 
     * Assume a BST is defined as follows:
     * 
     * 
     * The left subtree of a node contains only nodes with keys less than or equal
     * to the node's key.
     * 
     * The right subtree of a node contains only nodes with keys greater than or
     * equal to the node's key.
     * 
     * Both the left and right subtrees must also be binary search trees.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [1,null,2,2]
     * Output: [2]
     * 
     * Example 2:
     * 
     * Input: root = [0]
     * Output: [0]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [1, 104].
     * 
     * -105 &lt;= Node.val &lt;= 105
     * 
     * 
     * Follow up: Could you do that without using any extra space? (Assume that
     * the implicit stack space incurred due to recursion does not count).
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    private int maxCount = 0, currCount = 0, prevVal = Integer.MIN_VALUE;
    private List<Integer> modes = new ArrayList<>();

    /**
     * Finds Find mode.
     *
     * @param root the root (TreeNode)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) result[i] = modes.get(i);
        return result;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (node.val == prevVal) currCount++;
        else { currCount = 1; prevVal = node.val; }
        if (currCount > maxCount) { maxCount = currCount; modes.clear(); modes.add(node.val); }
        else if (currCount == maxCount) modes.add(node.val);
        inorder(node.right);
    }

    public static void main(String[] args) {
        FindModeInBinarySearchTree sol = new FindModeInBinarySearchTree();
        System.out.println(sol.findMode(null));
    }
}
