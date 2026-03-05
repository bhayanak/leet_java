package org.leetcode.easy;


/**
 * <b>#938 - Range Sum of BST</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
 * Output: 32
 * Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
 *
 * Example 2:
 *
 * Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
 * Output: 23
 * Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 2 * 104].
 *
 * 1 &lt;= Node.val &lt;= 105
 *
 * 1 &lt;= low &lt;= high &lt;= 105
 *
 * All Node.val are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Search Tree, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/range-sum-of-bst/">LeetCode #938</a>
 */
public class RangeSumOfBst {

    /** Minimal binary tree node (self-contained).
 *
 * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
 */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Range sum b s t.
     *
     * @param root the root (TreeNode)
     * @param low the low (int)
     * @param high the high (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int sum = 0;
        if (root.val >= low && root.val <= high) sum += root.val;
        if (root.val > low)  sum += rangeSumBST(root.left,  low, high);
        if (root.val < high) sum += rangeSumBST(root.right, low, high);
        return sum;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RangeSumOfBst.java &amp;&amp; java org.leetcode.easy.RangeSumOfBst</pre>
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        RangeSumOfBst sol = new RangeSumOfBst();
                // Tree: [10,5,15,3,7,null,18]
                TreeNode root = new TreeNode(10);
                root.left = new TreeNode(5); root.right = new TreeNode(15);
                root.left.left = new TreeNode(3); root.left.right = new TreeNode(7);
                root.right.right = new TreeNode(18);
                System.out.println(sol.rangeSumBST(root, 7, 15)); // 32 (7+10+15)
    }
}
