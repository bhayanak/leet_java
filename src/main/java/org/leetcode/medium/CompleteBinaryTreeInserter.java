package org.leetcode.medium;


/**
 * <b>#919 - Complete Binary Tree Inserter</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Breadth-First Search, Design, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.
 *
 *
 * Design an algorithm to insert a new node to a complete binary tree keeping it complete after the insertion.
 *
 *
 * Implement the CBTInserter class:
 *
 *
 * CBTInserter(TreeNode root) Initializes the data structure with the root of the complete binary tree.
 *
 * int insert(int v) Inserts a TreeNode into the tree with value Node.val == val so that the tree remains complete, and returns the value of the parent of the inserted TreeNode.
 *
 * TreeNode get_root() Returns the root node of the tree.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["CBTInserter", "insert", "insert", "get_root"]
 * [[[1, 2]], [3], [4], []]
 * Output
 * [null, 1, 2, [1, 2, 3, 4]]
 *
 * Explanation
 * CBTInserter cBTInserter = new CBTInserter([1, 2]);
 * cBTInserter.insert(3);  // return 1
 * cBTInserter.insert(4);  // return 2
 * cBTInserter.get_root(); // return [1, 2, 3, 4]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree will be in the range [1, 1000].
 *
 * 0 &lt;= Node.val &lt;= 5000
 *
 * root is a complete binary tree.
 *
 * 0 &lt;= val &lt;= 5000
 *
 * At most 104 calls will be made to insert and get_root.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Breadth-First Search, Design, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/complete-binary-tree-inserter/">LeetCode #919</a>
 */
public class CompleteBinaryTreeInserter {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Complete Binary Tree Inserter".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Complete Binary Tree Inserter");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CompleteBinaryTreeInserter.java &amp;&amp; java org.leetcode.medium.CompleteBinaryTreeInserter</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CompleteBinaryTreeInserter ===");
        CompleteBinaryTreeInserter sol = new CompleteBinaryTreeInserter();
        System.out.println(sol.solve(null));
    }
}
