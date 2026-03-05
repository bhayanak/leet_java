package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #437: Path Sum III
 * @see <a href="https://leetcode.com/problems/path-sum-iii/">Problem</a>
 */
public class PathSumIii {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #437 – Path Sum III
     * Difficulty: MEDIUM
     * Topics: Tree, Depth-First Search, Binary Tree
     *
     * Given the root of a binary tree and an integer targetSum, return the number
     * of paths where the sum of the values along the path equals targetSum.
     * 
     * 
     * The path does not need to start or end at the root or a leaf, but it must
     * go downwards (i.e., traveling only from parent nodes to child nodes).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
     * Output: 3
     * Explanation: The paths that sum to 8 are shown.
     * 
     * Example 2:
     * 
     * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
     * Output: 3
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [0, 1000].
     * 
     * -109 &lt;= Node.val &lt;= 109
     * 
     * -1000 &lt;= targetSum &lt;= 1000
     */
    // Use prefix sum hashmap: count paths with sum = targetSum
    /**
     * Solves the problem: Path sum.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param root the root (TreeNode)
     * @param targetSum the targetSum (int)
     * @return the computed int result
     */
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1);
        return dfs(root, 0L, targetSum, prefixCount);
    }
    private int dfs(TreeNode node, long curr, int target, Map<Long,Integer> map) {
        if (node == null) return 0;
        curr += node.val;
        int count = map.getOrDefault(curr - target, 0);
        map.merge(curr, 1, Integer::sum);
        count += dfs(node.left, curr, target, map);
        count += dfs(node.right, curr, target, map);
        map.merge(curr, -1, Integer::sum);
        return count;
    }

    public static void main(String[] args) {
        PathSumIii sol = new PathSumIii();
        System.out.println(sol.pathSum(null, 0));
    }
}
