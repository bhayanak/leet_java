package org.leetcode.hard;


/**
 * <b>#968 - Binary Tree Cameras</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree. We install cameras on the tree nodes where each camera at a node can monitor its parent, itself, and its immediate children.
 *
 *
 * Return the minimum number of cameras needed to monitor all nodes of the tree.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [0,0,null,0,0]
 * Output: 1
 * Explanation: One camera is enough to monitor all nodes if placed as shown.
 *
 * Example 2:
 *
 * Input: root = [0,0,null,0,null,0,null,null,0]
 * Output: 2
 * Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 1000].
 *
 * Node.val == 0
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-cameras/">LeetCode #968</a>
 */
public class BinaryTreeCameras {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Binary Tree Cameras".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Tree Cameras");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinaryTreeCameras.java &amp;&amp; java org.leetcode.hard.BinaryTreeCameras</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BinaryTreeCameras ===");
        BinaryTreeCameras sol = new BinaryTreeCameras();
        System.out.println(sol.solve(null));
    }
}
