package org.leetcode.medium;

/**
 * <b>#236 - Lowest Common Ancestor of a Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * 
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 * Explanation: The LCA of nodes 5 and 1 is 3.
 * 
 * Example 2:
 * 
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * Output: 5
 * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 * 
 * Example 3:
 * 
 * Input: root = [1,2], p = 1, q = 2
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [2, 105].
 * 	
 * -109 &lt;= Node.val &lt;= 109
 * 	
 * All Node.val are unique.
 * 	
 * p != q
 * 	
 * p and q will exist in the tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * DFS: if current node is p or q, return it.
 * Combine below: if both sides return non-null → current is LCA.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/">LeetCode #236</a>
 */
public class LowestCommonAncestorOfABinaryTree {

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
     * Solves the problem: Lowest common ancestor.
     *
     * @param root the root (TreeNode)
     * @param p the p (TreeNode)
     * @param q the q (TreeNode)
     * @return the computed TreeNode result
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q) return root;
        TreeNode left  = lowestCommonAncestor(root.left,  p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return (left!=null&&right!=null) ? root : (left!=null?left:right);
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        LowestCommonAncestorOfABinaryTree sol = new LowestCommonAncestorOfABinaryTree();
        TreeNode root = bt(3,5,1,6,2,0,8,null,null,7,4);
        TreeNode p=root.left, q=root.right; // 5 and 1
        System.out.println("LCA(5,1)=" + sol.lowestCommonAncestor(root,p,q).val); // 3
    }
}
