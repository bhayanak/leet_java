package org.leetcode.easy;

/**
 * <b>#110 - Balanced Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree, determine if it is height-balanced.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * 
 * Example 3:
 * 
 * Input: root = []
 * Output: true
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 5000].
 * 	
 * -104 &lt;= Node.val &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * DFS returning height; return -1 as a sentinel for "unbalanced".
 * At each node: if left or right returns -1, propagate -1 immediately.
 * Otherwise, if |left-right| &gt; 1 return -1, else return max+1.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/balanced-binary-tree/">LeetCode #110</a>
  *
  * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
  */
public class BalancedBinaryTree {

    /** Minimal binary tree node (self-contained).
 *
 * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
 */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    /** Helper to build a tree from level-order array (null = absent node).
 *
 * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
 */
    public static TreeNode buildTree(Integer[] vals) {
        if (vals == null || vals.length == 0 || vals[0] == null) return null;
        TreeNode root = new TreeNode(vals[0]);
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < vals.length) {
            TreeNode cur = q.poll();
            if (i < vals.length && vals[i] != null) { cur.left  = new TreeNode(vals[i]); q.offer(cur.left);  } i++;
            if (i < vals.length && vals[i] != null) { cur.right = new TreeNode(vals[i]); q.offer(cur.right); } i++;
        }
        return root;
    }

    /**
     * Determines if a binary tree is height-balanced (no subtree differs by more than 1).
     * @param root tree root
     * @return true if balanced
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        int l = height(node.left);  if (l == -1) return -1;
        int r = height(node.right); if (r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        return Math.max(l, r) + 1;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BalancedBinaryTree.java &amp;&amp; java org.leetcode.easy.BalancedBinaryTree
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        System.out.println(sol.isBalanced(buildTree(new Integer[]{3,9,20,null,null,15,7}))); // true
        System.out.println(sol.isBalanced(buildTree(new Integer[]{1,2,2,3,3,null,null,4,4}))); // false
    }
}
