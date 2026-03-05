package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <b>LeetCode #637 – Average of Levels in Binary Tree</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the average value of the nodes on
 * each level in the form of an array. Answers within 10^-5 of the actual
 * answer will be accepted.
 *
 * Example 1:
 *   Input: root = [3,9,20,null,null,15,7]
 *   Output: [3.00000,14.50000,11.00000]
 *   Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
 *
 * Example 2:
 *   Input: root = [3,9,20,15,7]
 *   Output: [3.00000,14.50000,11.00000]
 *
 * Constraints:
 *   The number of nodes in the tree is in the range [1, 10^4].
 *   -2^31 &lt;= Node.val &lt;= 2^31 - 1
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Use Breadth-First Search (BFS) to traverse the tree level by level, summing node values and counting nodes at each level, then compute the average for each level.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(N), where N is the number of nodes in the tree.</li>
 *   <li>Space: O(W), where W is the maximum width of the tree (queue size).</li>
 * </ul>
 *
 * <p><b>Explanation:</b> This solution processes each node exactly once using a queue for level-order traversal, ensuring efficient computation of averages per level.</p>
 * @see <a href="https://leetcode.com/problems/average-of-levels-in-binary-tree/">Problem</a>
 */
public class AverageOfLevelsInBinaryTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * LeetCode #637 – Average of Levels in Binary Tree
     * Difficulty: EASY
     * Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree
     *
     * Given the root of a binary tree, return the average value of the nodes on
     * each level in the form of an array. Answers within 10-5 of the actual
     * answer will be accepted.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [3,9,20,null,null,15,7]
     * Output: [3.00000,14.50000,11.00000]
     * Explanation: The average value of nodes on level 0 is 3, on level 1 is
     * 14.5, and on level 2 is 11.
     * Hence return [3, 14.5, 11].
     * 
     * Example 2:
     * 
     * Input: root = [3,9,20,15,7]
     * Output: [3.00000,14.50000,11.00000]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [1, 104].
     * 
     * -231 &lt;= Node.val &lt;= 231 - 1
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size(); double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                sum += cur.val;
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            result.add(sum / size);
        }
        return result;
    }

    public static void main(String[] args) {
        AverageOfLevelsInBinaryTree sol = new AverageOfLevelsInBinaryTree();
        System.out.println(sol.averageOfLevels(null));
    }
}
