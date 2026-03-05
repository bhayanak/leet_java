package org.leetcode.medium;


/**
 * <b>#1080 - Insufficient Nodes in Root to Leaf Paths</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree and an integer limit, delete all insufficient nodes in the tree simultaneously, and return the root of the resulting binary tree.
 *
 *
 * A node is insufficient if every root to leaf path intersecting this node has a sum strictly less than limit.
 *
 *
 * A leaf is a node with no children.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14], limit = 1
 * Output: [1,2,3,4,null,null,7,8,9,null,14]
 *
 * Example 2:
 *
 * Input: root = [5,4,8,11,null,17,4,7,1,null,null,5,3], limit = 22
 * Output: [5,4,8,11,null,17,4,7,null,null,null,5]
 *
 * Example 3:
 *
 * Input: root = [1,2,-3,-5,null,4,null], limit = -1
 * Output: [1,null,-3,4]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 5000].
 *
 * -105 &lt;= Node.val &lt;= 105
 *
 * -109 &lt;= limit &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider a DFS traversal of the tree.  You can keep track of the current path sum from root to this node, and you can also use DFS to return the maximum value of any path from this node to the leaf.  This will tell you if this node is insufficient.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths/">LeetCode #1080</a>
 */
public class InsufficientNodesInRootToLeafPaths {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Insufficient Nodes in Root to Leaf Paths".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Insufficient Nodes in Root to Leaf Paths");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac InsufficientNodesInRootToLeafPaths.java &amp;&amp; java org.leetcode.medium.InsufficientNodesInRootToLeafPaths</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== InsufficientNodesInRootToLeafPaths ===");
        InsufficientNodesInRootToLeafPaths sol = new InsufficientNodesInRootToLeafPaths();
        System.out.println(sol.solve(null));
    }
}
