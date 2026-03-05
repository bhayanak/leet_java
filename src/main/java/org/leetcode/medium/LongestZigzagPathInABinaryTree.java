package org.leetcode.medium;


/**
 * <b>#1372 - Longest ZigZag Path in a Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree.
 *
 *
 * A ZigZag path for a binary tree is defined as follow:
 *
 *
 * Choose any node in the binary tree and a direction (right or left).
 *
 * If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
 *
 * Change the direction from right to left or from left to right.
 *
 * Repeat the second and third steps until you can't move in the tree.
 *
 * Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).
 *
 *
 * Return the longest ZigZag path contained in that tree.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
 * Output: 3
 * Explanation: Longest ZigZag path in blue nodes (right -&gt; left -&gt; right).
 *
 * Example 2:
 *
 * Input: root = [1,1,1,null,1,null,null,1,1,null,1]
 * Output: 4
 * Explanation: Longest ZigZag path in blue nodes (left -&gt; right -&gt; left -&gt; right).
 *
 * Example 3:
 *
 * Input: root = [1]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 5 * 104].
 *
 * 1 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create this function maxZigZag(node, direction) maximum zigzag given a node and direction (right or left).
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/">LeetCode #1372</a>
 */
public class LongestZigzagPathInABinaryTree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest ZigZag Path in a Binary Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LongestZigzagPathInABinaryTree ===");
        LongestZigzagPathInABinaryTree sol = new LongestZigzagPathInABinaryTree();
        System.out.println(sol.solve(null));
    }
}
