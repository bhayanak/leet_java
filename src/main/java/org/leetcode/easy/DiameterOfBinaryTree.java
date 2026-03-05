package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #543: Diameter of Binary Tree
 * @see <a href="https://leetcode.com/problems/diameter-of-binary-tree/">Problem</a>
 */
public class DiameterOfBinaryTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #543 – Diameter of Binary Tree
     * Difficulty: EASY
     * Topics: Tree, Depth-First Search, Binary Tree
     *
     * Given the root of a binary tree, return the length of the diameter of the
     * tree.
     * 
     * 
     * The diameter of a binary tree is the length of the longest path between any
     * two nodes in a tree. This path may or may not pass through the root.
     * 
     * 
     * The length of a path between two nodes is represented by the number of
     * edges between them.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [1,2,3,4,5]
     * Output: 3
     * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
     * 
     * Example 2:
     * 
     * Input: root = [1,2]
     * Output: 1
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [1, 104].
     * 
     * -100 &lt;= Node.val &lt;= 100
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    private int diameter = 0;
    /**
     * Solves the problem: Diameter of binary tree.
     *
     * @param root the root (TreeNode)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }
    private int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left), right = depth(node.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree sol = new DiameterOfBinaryTree();
        System.out.println(sol.diameterOfBinaryTree(null));
    }
}
