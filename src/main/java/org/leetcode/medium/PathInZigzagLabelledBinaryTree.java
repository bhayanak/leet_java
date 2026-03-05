package org.leetcode.medium;


/**
 * <b>#1104 - Path In Zigzag Labelled Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In an infinite binary tree where every node has two children, the nodes are labelled in row order.
 *
 *
 * In the odd numbered rows (ie., the first, third, fifth,...), the labelling is left to right, while in the even numbered rows (second, fourth, sixth,...), the labelling is right to left.
 *
 * Given the label of a node in this tree, return the labels in the path from the root of the tree to the node with that label.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: label = 14
 * Output: [1,3,4,14]
 *
 * Example 2:
 *
 * Input: label = 26
 * Output: [1,2,6,10,26]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= label &lt;= 10^6
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Based on the label of the current node, find what the label must be for the parent of that node.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Tree, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/path-in-zigzag-labelled-binary-tree/">LeetCode #1104</a>
 */
public class PathInZigzagLabelledBinaryTree {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Path In Zigzag Labelled Binary Tree".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Path In Zigzag Labelled Binary Tree");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PathInZigzagLabelledBinaryTree.java &amp;&amp; java org.leetcode.medium.PathInZigzagLabelledBinaryTree</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PathInZigzagLabelledBinaryTree ===");
        PathInZigzagLabelledBinaryTree sol = new PathInZigzagLabelledBinaryTree();
        System.out.println(sol.solve(null));
    }
}
