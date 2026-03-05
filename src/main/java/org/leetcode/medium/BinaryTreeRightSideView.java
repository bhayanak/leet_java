package org.leetcode.medium;

/**
 * <b>#199 - Binary Tree Right Side View</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,3,null,5,null,4]
 * 
 * 
 * Output: [1,3,4]
 * 
 * 
 * Explanation:
 * 
 * Example 2:
 * 
 * Input: root = [1,2,3,4,null,null,null,5]
 * 
 * 
 * Output: [1,3,4,5]
 * 
 * 
 * Explanation:
 * 
 * Example 3:
 * 
 * Input: root = [1,null,3]
 * 
 * 
 * Output: [1,3]
 * 
 * Example 4:
 * 
 * Input: root = []
 * 
 * 
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 100].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * BFS level-by-level; record the last node of each level (rightmost visible).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-right-side-view/">LeetCode #199</a>
 */
public class BinaryTreeRightSideView {

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
     * Returns values visible from the right side of the tree (one per level).
     * @param root tree root
     * @return right-side view values
     */
    public java.util.List<Integer> rightSideView(TreeNode root) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        if (root == null) return result;
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                if (i == sz - 1) result.add(cur.val); // last in level = rightmost
                if (cur.left  != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
        }
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinaryTreeRightSideView.java &amp;&amp; java org.leetcode.medium.BinaryTreeRightSideView
     *
     * @param args not used
     */
    public static void main(String[] args) {
        BinaryTreeRightSideView sol = new BinaryTreeRightSideView();
        System.out.println(sol.buildTree(null));
    }
}
