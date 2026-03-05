package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #530: Minimum Absolute Difference in BST
 * @see <a href="https://leetcode.com/problems/minimum-absolute-difference-in-bst/">Problem</a>
 */
public class MinimumAbsoluteDifferenceInBst {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #530 – Minimum Absolute Difference in BST
     * Difficulty: EASY
     * Topics: Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree
     *
     * Given the root of a Binary Search Tree (BST), return the minimum absolute
     * difference between the values of any two different nodes in the tree.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [4,2,6,1,3]
     * Output: 1
     * 
     * Example 2:
     * 
     * Input: root = [1,0,48,null,null,12,49]
     * Output: 1
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [2, 104].
     * 
     * 0 &lt;= Node.val &lt;= 105
     * 
     * 
     * 
     * Note: This question is the same as 783:
     * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    private int minDiff = Integer.MAX_VALUE, prev = -1;

    /**
     * Returns Get minimum difference.
     *
     * @param root the root (TreeNode)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != -1) minDiff = Math.min(minDiff, node.val - prev);
        prev = node.val;
        inorder(node.right);
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInBst sol = new MinimumAbsoluteDifferenceInBst();
        System.out.println(sol.getMinimumDifference(null));
    }
}
