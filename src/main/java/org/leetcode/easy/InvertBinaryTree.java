package org.leetcode.easy;

/**
 * <b>#226 - Invert Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, invert the tree, and return its root.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * 
 * Example 2:
 * 
 * Input: root = [2,1,3]
 * Output: [2,3,1]
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
 * The number of nodes in the tree is in the range [0, 100].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Recursively swap left and right subtrees at every node (post-order).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/invert-binary-tree/">LeetCode #226</a>
  *
  * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
  */
public class InvertBinaryTree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Bt.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param v the v (Integer...)
     * @return the computed TreeNode result
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static TreeNode bt(Integer... v) {
        if (v==null||v.length==0||v[0]==null) return null;
        TreeNode r=new TreeNode(v[0]);
        java.util.Queue<TreeNode> q=new java.util.LinkedList<>(); q.offer(r);
        int i=1;
        while(!q.isEmpty()&&i<v.length) {
            TreeNode c=q.poll();
            if(i<v.length&&v[i]!=null){c.left=new TreeNode(v[i]);q.offer(c.left);}i++;
            if(i<v.length&&v[i]!=null){c.right=new TreeNode(v[i]);q.offer(c.right);}i++;
        }
        return r;
    }
    /**
     * Solves the problem: Invert tree.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param root the root (TreeNode)
     * @return the computed TreeNode result
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;
        TreeNode tmp = root.left;
        root.left  = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        InvertBinaryTree sol = new InvertBinaryTree();
        // [4,2,7,1,3,6,9] → [4,7,2,9,6,3,1]
        TreeNode r = sol.invertTree(bt(4,2,7,1,3,6,9));
        java.util.Queue<TreeNode> q=new java.util.LinkedList<>(); q.offer(r);
        System.out.print("Inverted BFS: ");
        while(!q.isEmpty()){TreeNode c=q.poll();System.out.print(c.val+" ");
         if(c.left!=null)q.offer(c.left);if(c.right!=null)q.offer(c.right);}
        System.out.println(); // 4 7 2 9 6 3 1
    }
}
