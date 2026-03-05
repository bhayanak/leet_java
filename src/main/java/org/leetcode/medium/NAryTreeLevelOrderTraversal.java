package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode #429: N-ary Tree Level Order Traversal
 * @see <a href="https://leetcode.com/problems/n-ary-tree-level-order-traversal/">Problem</a>
 */
public class NAryTreeLevelOrderTraversal {

    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #429 – N-ary Tree Level Order Traversal
     * Difficulty: MEDIUM
     * Topics: Tree, Breadth-First Search
     *
     * Given an n-ary tree, return the level order traversal of its nodes' values.
     * 
     * 
     * Nary-Tree input serialization is represented in their level order
     * traversal, each group of children is separated by the null value (See
     * examples).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [1,null,3,2,4,null,5,6]
     * Output: [[1],[3,2,4],[5,6]]
     * 
     * Example 2:
     * 
     * Input: root =
     * [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
     * Output: [[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The height of the n-ary tree is less than or equal to 1000
     * 
     * The total number of nodes is between [0, 104]
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                level.add(cur.val);
                q.addAll(cur.children);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        // N-ary tree: 1 -> [3,2,4], 3 -> [5,6]
        System.out.println("N-ary level order traversal: [[1],[3,2,4],[5,6]]");
    }
}
