package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode #652: Find Duplicate Subtrees
 * @see <a href="https://leetcode.com/problems/find-duplicate-subtrees/">Problem</a>
 */
public class FindDuplicateSubtrees {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * LeetCode #652 – Find Duplicate Subtrees
     * Difficulty: MEDIUM
     * Topics: Hash Table, Tree, Depth-First Search, Binary Tree
     *
     * Given the root of a binary tree, return all duplicate subtrees.
     * 
     * 
     * For each kind of duplicate subtrees, you only need to return the root node
     * of any one of them.
     * 
     * 
     * Two trees are duplicate if they have the same structure with the same node
     * values.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [1,2,3,4,null,2,4,null,null,4]
     * Output: [[2,4],[4]]
     * 
     * Example 2:
     * 
     * Input: root = [2,1,1]
     * Output: [[1]]
     * 
     * Example 3:
     * 
     * Input: root = [2,2,2,3,null,3,null]
     * Output: [[2,3],[3]]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of the nodes in the tree will be in the range [1, 5000]
     * 
     * -200 &lt;= Node.val &lt;= 200
     */
    private Map<String,Integer> count = new HashMap<>();
    private List<TreeNode> result = new ArrayList<>();

    /**
     * Finds Find duplicate subtrees.
     *
     * @param root the root (TreeNode)
     * @return the computed List&lt;TreeNode&gt; result
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return result;
    }
    private String serialize(TreeNode node) {
        if (node == null) return "#";
        String serial = node.val + "," + serialize(node.left) + "," + serialize(node.right);
        int cnt = count.merge(serial, 1, Integer::sum);
        if (cnt == 2) result.add(node);
        return serial;
    }

    public static void main(String[] args) {
        FindDuplicateSubtrees sol = new FindDuplicateSubtrees();
        System.out.println(sol.findDuplicateSubtrees(null));
    }
}
