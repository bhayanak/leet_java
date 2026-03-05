package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode #508: Most Frequent Subtree Sum
 * @see <a href="https://leetcode.com/problems/most-frequent-subtree-sum/">Problem</a>
 */
public class MostFrequentSubtreeSum {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #508 – Most Frequent Subtree Sum
     * Difficulty: MEDIUM
     * Topics: Hash Table, Tree, Depth-First Search, Binary Tree
     *
     * Given the root of a binary tree, return the most frequent subtree sum. If
     * there is a tie, return all the values with the highest frequency in any
     * order.
     * 
     * 
     * The subtree sum of a node is defined as the sum of all the node values
     * formed by the subtree rooted at that node (including the node itself).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [5,2,-3]
     * Output: [2,-3,4]
     * 
     * Example 2:
     * 
     * Input: root = [5,2,-5]
     * Output: [2]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [1, 104].
     * 
     * -105 &lt;= Node.val &lt;= 105
     */
    private Map<Integer,Integer> freq = new HashMap<>();
    private int maxFreq = 0;

    /**
     * Finds Find frequent tree sum.
     *
     * @param root the root (TreeNode)
     * @return the computed int[] result
     */
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[0];
        sumTree(root);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> e : freq.entrySet())
            if (e.getValue() == maxFreq) result.add(e.getKey());
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    private int sumTree(TreeNode node) {
        if (node == null) return 0;
        int sum = node.val + sumTree(node.left) + sumTree(node.right);
        int cnt = freq.merge(sum, 1, Integer::sum);
        maxFreq = Math.max(maxFreq, cnt);
        return sum;
    }

    public static void main(String[] args) {
        MostFrequentSubtreeSum sol = new MostFrequentSubtreeSum();
        System.out.println(sol.findFrequentTreeSum(null));
    }
}
