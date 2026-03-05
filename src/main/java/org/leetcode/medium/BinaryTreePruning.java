package org.leetcode.medium;


/**
 * <b>#814 - Binary Tree Pruning</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 *
 *
 * A subtree of a node node is node plus every node that is a descendant of node.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,null,0,0,1]
 * Output: [1,null,0,null,1]
 * Explanation: 
 * Only the red nodes satisfy the property "every subtree not containing a 1".
 * The diagram on the right represents the answer.
 *
 * Example 2:
 *
 * Input: root = [1,0,1,0,0,0,1]
 * Output: [1,null,1,null,1]
 *
 * Example 3:
 *
 * Input: root = [1,1,0,1,1,0,1,0]
 * Output: [1,1,0,1,1,null,1]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 200].
 *
 * Node.val is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-pruning/">LeetCode #814</a>
 */
public class BinaryTreePruning {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Binary Tree Pruning".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Tree Pruning");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinaryTreePruning.java &amp;&amp; java org.leetcode.medium.BinaryTreePruning</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BinaryTreePruning ===");
        BinaryTreePruning sol = new BinaryTreePruning();
        System.out.println(sol.solve(null));
    }
}
