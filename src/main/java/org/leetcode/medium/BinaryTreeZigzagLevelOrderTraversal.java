package org.leetcode.medium;

/**
 * <b>#103 - Binary Tree Zigzag Level Order Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[20,9],[15,7]]
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
 * -100 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * BFS same as level order, but alternate the direction of each level.
 * Use a boolean flag; on odd levels add to the front (LinkedList.addFirst) or reverse.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/">LeetCode #103</a>
 */
public class BinaryTreeZigzagLevelOrderTraversal {

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
     * Zigzag level-order: alternate left-to-right and right-to-left per level.
     * @param root tree root
     * @return zigzag level-order values
     */
    public java.util.List<java.util.List<Integer>> zigzagLevelOrder(TreeNode root) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        if (root == null) return result;
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while (!q.isEmpty()) {
            int sz = q.size();
            java.util.LinkedList<Integer> level = new java.util.LinkedList<>();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                if (leftToRight) level.addLast(cur.val); else level.addFirst(cur.val);
                if (cur.left  != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            result.add(level);
            leftToRight = !leftToRight;
        }
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinaryTreeZigzagLevelOrderTraversal.java &amp;&amp; java org.leetcode.medium.BinaryTreeZigzagLevelOrderTraversal
     *
     * @param args not used
     */
    public static void main(String[] args) {
        BinaryTreeZigzagLevelOrderTraversal sol = new BinaryTreeZigzagLevelOrderTraversal();
        System.out.println(sol.buildTree(null));
    }
}
