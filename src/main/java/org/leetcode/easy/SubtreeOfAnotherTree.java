package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #572: Subtree of Another Tree
 * @see <a href="https://leetcode.com/problems/subtree-of-another-tree/">Problem</a>
 */
public class SubtreeOfAnotherTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #572 – Subtree of Another Tree
     * Difficulty: EASY
     * Topics: Tree, Depth-First Search, String Matching, Binary Tree, Hash Function
     *
     * Given the roots of two binary trees root and subRoot, return true if there
     * is a subtree of root with the same structure and node values of subRoot and
     * false otherwise.
     * 
     * 
     * A subtree of a binary tree tree is a tree that consists of a node in tree
     * and all of this node's descendants. The tree tree could also be considered
     * as a subtree of itself.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
     * Output: true
     * 
     * Example 2:
     * 
     * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the root tree is in the range [1, 2000].
     * 
     * The number of nodes in the subRoot tree is in the range [1, 1000].
     * 
     * -104 &lt;= root.val &lt;= 104
     * 
     * -104 &lt;= subRoot.val &lt;= 104

     *
     * Hints:
     *   1. Which approach is better here- recursive or iterative?
     *   2. If recursive approach is better, can you write recursive function with its parameters?
     *   3. Two trees s and t are said to be identical if their root values are same and their left and right subtrees are identical. Can you write this in form of recursive formulae?
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        return s.val == t.val && isSame(s.left, t.left) && isSame(s.right, t.right);
    }

    public static void main(String[] args) {
        SubtreeOfAnotherTree sol = new SubtreeOfAnotherTree();
        System.out.println(sol.isSubtree(null, null));
    }
}
