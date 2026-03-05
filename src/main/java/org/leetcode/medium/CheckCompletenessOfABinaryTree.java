package org.leetcode.medium;


/**
 * <b>#958 - Check Completeness of a Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, determine if it is a complete binary tree.
 *
 *
 * In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,4,5,6]
 * Output: true
 * Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
 *
 * Example 2:
 *
 * Input: root = [1,2,3,4,5,null,7]
 * Output: false
 * Explanation: The node with value 7 isn't as far left as possible.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 100].
 *
 * 1 &lt;= Node.val &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-completeness-of-a-binary-tree/">LeetCode #958</a>
 */
public class CheckCompletenessOfABinaryTree {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Check Completeness of a Binary Tree".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check Completeness of a Binary Tree");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CheckCompletenessOfABinaryTree.java &amp;&amp; java org.leetcode.medium.CheckCompletenessOfABinaryTree</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CheckCompletenessOfABinaryTree ===");
        CheckCompletenessOfABinaryTree sol = new CheckCompletenessOfABinaryTree();
        System.out.println(sol.solve(null));
    }
}
