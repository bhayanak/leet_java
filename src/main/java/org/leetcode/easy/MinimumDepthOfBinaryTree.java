package org.leetcode.easy;

/**
 * <b>#111 - Minimum Depth of Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree, find its minimum depth.
 * 
 * 
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * 
 * 
 * Note: A leaf is a node with no children.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 * 
 * Example 2:
 * 
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 105].
 * 	
 * -1000 &lt;= Node.val &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * BFS returns the first level that contains a leaf (both children null).
 * This is O(n) worst case but early-exits as soon as the first leaf is found.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">LeetCode #111</a>
  *
  * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
  */
public class MinimumDepthOfBinaryTree {

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
     * Returns the minimum depth: shortest path from root to any leaf.
     * @param root tree root
     * @return minimum depth
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                if (cur.left == null && cur.right == null) return depth; // leaf
                if (cur.left  != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            depth++;
        }
        return depth;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac MinimumDepthOfBinaryTree.java &amp;&amp; java org.leetcode.easy.MinimumDepthOfBinaryTree
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        MinimumDepthOfBinaryTree sol = new MinimumDepthOfBinaryTree();
        System.out.println(sol.minDepth(buildTree(new Integer[]{3,9,20,null,null,15,7}))); // 2
        System.out.println(sol.minDepth(buildTree(new Integer[]{2,null,3,null,4,null,5,null,6}))); // 5
    }
}
