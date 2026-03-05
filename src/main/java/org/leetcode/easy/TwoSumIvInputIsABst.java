package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #653: Two Sum IV - Input is a BST
 * @see <a href="https://leetcode.com/problems/two-sum-iv-input-is-a-bst/">Problem</a>
 */
public class TwoSumIvInputIsABst {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * LeetCode #653 – Two Sum IV - Input is a BST
     * Difficulty: EASY
     * Topics: Hash Table, Two Pointers, Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree
     *
     * Given the root of a binary search tree and an integer k, return true if
     * there exist two elements in the BST such that their sum is equal to k, or
     * false otherwise.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [5,3,6,2,4,null,7], k = 9
     * Output: true
     * 
     * Example 2:
     * 
     * Input: root = [5,3,6,2,4,null,7], k = 28
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [1, 104].
     * 
     * -104 &lt;= Node.val &lt;= 104
     * 
     * root is guaranteed to be a valid binary search tree.
     * 
     * -105 &lt;= k &lt;= 105
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Uses a graph traversal (DFS/BFS) to explore all reachable nodes systematically.</p>
      */
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return dfs(root, k, seen);
    }
    private boolean dfs(TreeNode node, int k, Set<Integer> seen) {
        if (node == null) return false;
        if (seen.contains(k - node.val)) return true;
        seen.add(node.val);
        return dfs(node.left, k, seen) || dfs(node.right, k, seen);
    }

    public static void main(String[] args) {
        TwoSumIvInputIsABst sol = new TwoSumIvInputIsABst();
        System.out.println(sol.findTarget(null, 0));
    }
}
