package org.leetcode.hard;


/**
 * <b>#1028 - Recover a Tree From Preorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We run a preorder depth-first search (DFS) on the root of a binary tree.
 *
 *
 * At each node in this traversal, we output D dashes (where D is the depth of this node), then we output the value of this node.  If the depth of a node is D, the depth of its immediate child is D + 1.  The depth of the root node is 0.
 *
 *
 * If a node has only one child, that child is guaranteed to be the left child.
 *
 *
 * Given the output traversal of this traversal, recover the tree and return its root.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: traversal = "1-2--3--4-5--6--7"
 * Output: [1,2,5,3,4,6,7]
 *
 * Example 2:
 *
 * Input: traversal = "1-2--3---4-5--6---7"
 * Output: [1,2,5,3,null,6,null,4,null,7]
 *
 * Example 3:
 *
 * Input: traversal = "1-401--349---90--88"
 * Output: [1,401,null,349,88,90]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the original tree is in the range [1, 1000].
 *
 * 1 &lt;= Node.val &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do an iterative depth first search, parsing dashes from the string to inform you how to link the nodes together.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/">LeetCode #1028</a>
 */
public class RecoverATreeFromPreorderTraversal {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Recover a Tree From Preorder Traversal".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Recover a Tree From Preorder Traversal");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RecoverATreeFromPreorderTraversal.java &amp;&amp; java org.leetcode.hard.RecoverATreeFromPreorderTraversal</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== RecoverATreeFromPreorderTraversal ===");
        RecoverATreeFromPreorderTraversal sol = new RecoverATreeFromPreorderTraversal();
        System.out.println(sol.solve(null));
    }
}
