package org.leetcode.medium;


/**
 * <b>#863 - All Nodes Distance K in Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, the value of a target node target, and an integer k, return an array of the values of all nodes that have a distance k from the target node.
 *
 *
 * You can return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
 * Output: [7,4,1]
 * Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.
 *
 * Example 2:
 *
 * Input: root = [1], target = 1, k = 3
 * Output: []
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 500].
 *
 * 0 &lt;= Node.val &lt;= 500
 *
 * All the values Node.val are unique.
 *
 * target is the value of one of the nodes in the tree.
 *
 * 0 &lt;= k &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/">LeetCode #863</a>
 */
public class AllNodesDistanceKInBinaryTree {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "All Nodes Distance K in Binary Tree".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: All Nodes Distance K in Binary Tree");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AllNodesDistanceKInBinaryTree.java &amp;&amp; java org.leetcode.medium.AllNodesDistanceKInBinaryTree</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== AllNodesDistanceKInBinaryTree ===");
        AllNodesDistanceKInBinaryTree sol = new AllNodesDistanceKInBinaryTree();
        System.out.println(sol.solve(null));
    }
}
