package org.leetcode.medium;


/**
 * <b>#894 - All Possible Full Binary Trees</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Tree, Recursion, Memoization, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return a list of all possible full binary trees with n nodes. Each node of each tree in the answer must have Node.val == 0.
 *
 *
 * Each element of the answer is the root node of one possible tree. You may return the final list of trees in any order.
 *
 *
 * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7
 * Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: [[0,0,0]]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 20
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Tree, Recursion, Memoization, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/all-possible-full-binary-trees/">LeetCode #894</a>
 */
public class AllPossibleFullBinaryTrees {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "All Possible Full Binary Trees".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: All Possible Full Binary Trees");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AllPossibleFullBinaryTrees.java &amp;&amp; java org.leetcode.medium.AllPossibleFullBinaryTrees</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== AllPossibleFullBinaryTrees ===");
        AllPossibleFullBinaryTrees sol = new AllPossibleFullBinaryTrees();
        System.out.println(sol.solve(null));
    }
}
