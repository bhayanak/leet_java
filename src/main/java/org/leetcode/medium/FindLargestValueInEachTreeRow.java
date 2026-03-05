package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode #515: Find Largest Value in Each Tree Row
 * @see <a href="https://leetcode.com/problems/find-largest-value-in-each-tree-row/">Problem</a>
 */
public class FindLargestValueInEachTreeRow {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #515 – Find Largest Value in Each Tree Row
     * Difficulty: MEDIUM
     * Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree
     *
     * Given the root of a binary tree, return an array of the largest value in
     * each row of the tree (0-indexed).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [1,3,2,5,3,null,9]
     * Output: [1,3,9]
     * 
     * Example 2:
     * 
     * Input: root = [1,2,3]
     * Output: [1,3]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree will be in the range [0, 104].
     * 
     * -231 &lt;= Node.val &lt;= 231 - 1
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size(), max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                max = Math.max(max, cur.val);
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        FindLargestValueInEachTreeRow sol = new FindLargestValueInEachTreeRow();
        System.out.println(sol.largestValues(null));
    }
}
