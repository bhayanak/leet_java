package org.leetcode.easy;


/**
 * <b>#965 - Univalued Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A binary tree is uni-valued if every node in the tree has the same value.
 *
 *
 * Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,1,1,1,1,null,1]
 * Output: true
 *
 * Example 2:
 *
 * Input: root = [2,2,2,5,2]
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 100].
 *
 * 0 &lt;= Node.val &lt; 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/univalued-binary-tree/">LeetCode #965</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class UnivaluedBinaryTree {

    /** Minimal binary tree node (self-contained).
 *
 * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
 */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Returns true if Is unival tree.
     *
     * @param root the root (TreeNode)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isUnivalTree(TreeNode root) {
        return root == null
            || (root.left  == null || (root.val == root.left.val  && isUnivalTree(root.left)))
            && (root.right == null || (root.val == root.right.val && isUnivalTree(root.right)));
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac UnivaluedBinaryTree.java &amp;&amp; java org.leetcode.easy.UnivaluedBinaryTree</pre>
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        UnivaluedBinaryTree sol = new UnivaluedBinaryTree();
                TreeNode t1 = new TreeNode(1);
                t1.left = new TreeNode(1); t1.right = new TreeNode(1);
                t1.left.left = new TreeNode(1); t1.left.right = new TreeNode(1);
                t1.right.right = new TreeNode(1);
                System.out.println(sol.isUnivalTree(t1)); // true
                TreeNode t2 = new TreeNode(2);
                t2.left = new TreeNode(2); t2.right = new TreeNode(2);
                t2.left.left = new TreeNode(5); t2.left.right = new TreeNode(2);
                System.out.println(sol.isUnivalTree(t2)); // false
    }
}
