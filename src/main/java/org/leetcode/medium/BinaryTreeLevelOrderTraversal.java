package org.leetcode.medium;

/**
 * <b>#102 - Binary Tree Level Order Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 * 
 * Example 2:
 * 
 * Input: root = [1]
 * Output: [[1]]
 * 
 * Example 3:
 * 
 * Input: root = []
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 2000].
 * 	
 * -1000 &lt;= Node.val &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a queue to perform BFS.
 *
 * <h2>Approach</h2>
 * BFS with a Queue. At each level, poll exactly queue.size() nodes (captured before
 * expanding children) and record their values in one level list.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">LeetCode #102</a>
 */
public class BinaryTreeLevelOrderTraversal {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    /** Helper to build a tree from level-order array (null = absent node). */
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
     * Returns values of each level of the tree in a list of lists (BFS).
     * @param root tree root
     * @return level-order traversal
     */
    public java.util.List<java.util.List<Integer>> levelOrder(TreeNode root) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        if (root == null) return result;
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            java.util.List<Integer> level = new java.util.ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                level.add(cur.val);
                if (cur.left  != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            result.add(level);
        }
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinaryTreeLevelOrderTraversal.java &amp;&amp; java org.leetcode.medium.BinaryTreeLevelOrderTraversal
     *
     * @param args not used
     */
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal sol = new BinaryTreeLevelOrderTraversal();
        System.out.println(sol.buildTree(null));
    }
}
