package org.leetcode.easy;

/**
 * <b>#104 - Maximum Depth of Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return its maximum depth.
 * 
 * 
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: root = [1,null,2]
 * Output: 2
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 104].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Simple recursion: maxDepth = 1 + max(maxDepth(left), maxDepth(right)).
 * Base case: null node returns 0.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n) stack
 *
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">LeetCode #104</a>
  *
  * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
  */
public class MaximumDepthOfBinaryTree {

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
     * Returns the maximum depth (number of nodes along the longest root-to-leaf path).
     * @param root tree root
     * @return maximum depth
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac MaximumDepthOfBinaryTree.java &amp;&amp; java org.leetcode.easy.MaximumDepthOfBinaryTree
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree sol = new MaximumDepthOfBinaryTree();
        TreeNode t1 = buildTree(new Integer[]{3,9,20,null,null,15,7});
        System.out.println("Max depth [3,9,20,null,null,15,7]: " + sol.maxDepth(t1)); // 3
        TreeNode t2 = buildTree(new Integer[]{1,null,2});
        System.out.println("Max depth [1,null,2]: " + sol.maxDepth(t2)); // 2
    }
}
