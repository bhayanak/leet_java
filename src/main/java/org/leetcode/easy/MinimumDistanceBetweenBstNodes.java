package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #783: Minimum Distance Between BST Nodes
 * @see <a href="https://leetcode.com/problems/minimum-distance-between-bst-nodes/">Problem</a>
 */
public class MinimumDistanceBetweenBstNodes {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * LeetCode #783 – Minimum Distance Between BST Nodes
     * Difficulty: EASY
     * Topics: Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree
     *
     * Given the root of a Binary Search Tree (BST), return the minimum difference
     * between the values of any two different nodes in the tree.
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
     * The number of nodes in the tree is in the range [2, 100].
     * 
     * 0 &lt;= Node.val &lt;= 105
     * 
     * 
     * 
     * Note: This question is the same as 530:
     * https://leetcode.com/problems/minimum-absolute-difference-in-bst/
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    private int minDiff = Integer.MAX_VALUE, prev = -1;
    /**
     * Computes the minimum Min diff in b s t.
     *
     * @param root the root (TreeNode)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minDiffInBST(TreeNode root) {
        inorder(root); return minDiff;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != -1) minDiff = Math.min(minDiff, node.val - prev);
        prev = node.val;
        inorder(node.right);
    }

    public static void main(String[] args) {
        MinimumDistanceBetweenBstNodes sol = new MinimumDistanceBetweenBstNodes();
        System.out.println(sol.minDiffInBST(null));
    }
}
