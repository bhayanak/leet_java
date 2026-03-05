package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode #662: Maximum Width of Binary Tree
 * @see <a href="https://leetcode.com/problems/maximum-width-of-binary-tree/">Problem</a>
 */
public class MaximumWidthOfBinaryTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * LeetCode #662 – Maximum Width of Binary Tree
     * Difficulty: MEDIUM
     * Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree
     *
     * Given the root of a binary tree, return the maximum width of the given tree.
     * 
     * 
     * The maximum width of a tree is the maximum width among all levels.
     * 
     * 
     * The width of one level is defined as the length between the end-nodes (the
     * leftmost and rightmost non-null nodes), where the null nodes between the
     * end-nodes that would be present in a complete binary tree extending down to
     * that level are also counted into the length calculation.
     * 
     * 
     * It is guaranteed that the answer will in the range of a 32-bit signed
     * integer.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [1,3,2,5,3,null,9]
     * Output: 4
     * Explanation: The maximum width exists in the third level with length 4
     * (5,3,null,9).
     * 
     * Example 2:
     * 
     * Input: root = [1,3,2,5,null,null,9,6,null,7]
     * Output: 7
     * Explanation: The maximum width exists in the fourth level with length 7
     * (6,null,null,null,null,null,7).
     * 
     * Example 3:
     * 
     * Input: root = [1,3,2,5]
     * Output: 2
     * Explanation: The maximum width exists in the second level with length 2
     * (3,2).
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [1, 3000].
     * 
     * -100 &lt;= Node.val &lt;= 100
     */
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxWidth = 0;
        Queue<long[]> q = new LinkedList<>(); // [node, position]
        q.offer(new long[]{0, 0}); // dummy but we need the actual nodes
        // Use a queue of pairs
        Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{root, 0L});
        while (!queue.isEmpty()) {
            int size = queue.size();
            long start = 0, end = 0;
            for (int i = 0; i < size; i++) {
                Object[] pair = queue.poll();
                TreeNode node = (TreeNode) pair[0];
                long pos = (long) pair[1];
                if (i == 0) start = pos;
                end = pos;
                if (node.left != null) queue.offer(new Object[]{node.left, 2*pos});
                if (node.right != null) queue.offer(new Object[]{node.right, 2*pos+1});
            }
            maxWidth = (int) Math.max(maxWidth, end - start + 1);
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        MaximumWidthOfBinaryTree sol = new MaximumWidthOfBinaryTree();
        System.out.println(sol.widthOfBinaryTree(null));
    }
}
