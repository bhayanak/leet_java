package org.leetcode.medium;


/**
 * <b>#1026 - Maximum Difference Between Node and Ancestor</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.
 *
 *
 * A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
 * Output: 7
 * Explanation: We have various ancestor-node differences, some of which are given below :
 * |8 - 3| = 5
 * |3 - 7| = 4
 * |8 - 1| = 7
 * |10 - 13| = 3
 * Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
 *
 * Example 2:
 *
 * Input: root = [1,null,2,null,0,3]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [2, 5000].
 *
 * 0 &lt;= Node.val &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each subtree, find the minimum value and maximum value of its descendants.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/">LeetCode #1026</a>
 */
public class MaximumDifferenceBetweenNodeAndAncestor {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Maximum Difference Between Node and Ancestor".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Difference Between Node and Ancestor");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumDifferenceBetweenNodeAndAncestor.java &amp;&amp; java org.leetcode.medium.MaximumDifferenceBetweenNodeAndAncestor</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumDifferenceBetweenNodeAndAncestor ===");
        MaximumDifferenceBetweenNodeAndAncestor sol = new MaximumDifferenceBetweenNodeAndAncestor();
        System.out.println(sol.solve(null));
    }
}
