package org.leetcode.medium;


/**
 * <b>#1110 - Delete Nodes And Return Forest</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, each node in the tree has a distinct value.
 *
 *
 * After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
 *
 *
 * Return the roots of the trees in the remaining forest. You may return the result in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
 * Output: [[1,2,null,4],[6],[7]]
 *
 * Example 2:
 *
 * Input: root = [1,2,4,null,3], to_delete = [3]
 * Output: [[1,2,4]]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the given tree is at most 1000.
 *
 * Each node has a distinct value between 1 and 1000.
 *
 * to_delete.length &lt;= 1000
 *
 * to_delete contains distinct values between 1 and 1000.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/delete-nodes-and-return-forest/">LeetCode #1110</a>
 */
public class DeleteNodesAndReturnForest {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Delete Nodes And Return Forest".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Delete Nodes And Return Forest");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DeleteNodesAndReturnForest.java &amp;&amp; java org.leetcode.medium.DeleteNodesAndReturnForest</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DeleteNodesAndReturnForest ===");
        DeleteNodesAndReturnForest sol = new DeleteNodesAndReturnForest();
        System.out.println(sol.solve(null));
    }
}
