package org.leetcode.easy;

/**
 * <b>#144 - Binary Tree Preorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Stack, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,null,2,3]
 * 
 * 
 * Output: [1,2,3]
 * 
 * 
 * Explanation:
 * 
 * Example 2:
 * 
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * 
 * 
 * Output: [1,2,4,5,6,7,3,8,9]
 * 
 * 
 * Explanation:
 * 
 * Example 3:
 * 
 * Input: root = []
 * 
 * 
 * Output: []
 * 
 * Example 4:
 * 
 * Input: root = [1]
 * 
 * 
 * Output: [1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 100].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 
 *  
 * 
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Iterative preorder: push root; while stack non-empty, pop → visit → push right then left
 * (so left is processed first).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">LeetCode #144</a>
  *
  * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
  */
public class BinaryTreePreorderTraversal {

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
     * Returns preorder traversal (root → left → right) of binary tree.
     * @param root tree root
     * @return preorder list
     */
    public java.util.List<Integer> preorderTraversal(TreeNode root) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        java.util.Deque<TreeNode> stack = new java.util.ArrayDeque<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            result.add(cur.val);
            if (cur.right != null) stack.push(cur.right); // right first (LIFO)
            if (cur.left  != null) stack.push(cur.left);
        }
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinaryTreePreorderTraversal.java &amp;&amp; java org.leetcode.easy.BinaryTreePreorderTraversal
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        BinaryTreePreorderTraversal sol = new BinaryTreePreorderTraversal();
        System.out.println(sol.buildTree(null));
    }
}
