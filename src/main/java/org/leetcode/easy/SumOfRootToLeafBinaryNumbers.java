package org.leetcode.easy;


/**
 * <b>#1022 - Sum of Root To Leaf Binary Numbers</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path represents a binary number starting with the most significant bit.
 *
 *
 * For example, if the path is 0 -&gt; 1 -&gt; 1 -&gt; 0 -&gt; 1, then this could represent 01101 in binary, which is 13.
 *
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return the sum of these numbers.
 *
 *
 * The test cases are generated so that the answer fits in a 32-bits integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 *
 * Example 2:
 *
 * Input: root = [0]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 1000].
 *
 * Node.val is 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find each path, then transform that path to an integer in base 10.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/">LeetCode #1022</a>
 */
public class SumOfRootToLeafBinaryNumbers {

    /** Minimal binary tree node (self-contained).
 *
 * <p><b>Explanation:</b> Uses a graph traversal (DFS/BFS) to explore all reachable nodes systematically.</p>
 */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    private int total = 0;
    /**
     * Computes the sum of Sum root to leaf.
     * Uses Depth-First Search (DFS) traversal.
     *
     * @param root the root (TreeNode)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a graph traversal (DFS/BFS) to explore all reachable nodes systematically.</p>
      */
    public int sumRootToLeaf(TreeNode root) { dfs(root, 0); return total; }
    private void dfs(TreeNode node, int cur) {
        if (node == null) return;
        cur = (cur << 1) | node.val;
        if (node.left == null && node.right == null) total += cur;
        dfs(node.left, cur); dfs(node.right, cur);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SumOfRootToLeafBinaryNumbers.java &amp;&amp; java org.leetcode.easy.SumOfRootToLeafBinaryNumbers</pre>
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        SumOfRootToLeafBinaryNumbers sol = new SumOfRootToLeafBinaryNumbers();
                TreeNode root = new TreeNode(1);
                root.left = new TreeNode(0); root.right = new TreeNode(1);
                root.left.left = new TreeNode(0); root.left.right = new TreeNode(1);
                root.right.left = new TreeNode(0); root.right.right = new TreeNode(1);
                System.out.println(sol.sumRootToLeaf(root)); // 22
    }
}
