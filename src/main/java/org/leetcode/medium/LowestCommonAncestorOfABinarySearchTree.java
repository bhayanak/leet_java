package org.leetcode.medium;

/**
 * <b>#235 - Lowest Common Ancestor of a Binary Search Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 * 
 * 
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 * Explanation: The LCA of nodes 2 and 8 is 6.
 * 
 * Example 2:
 * 
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * Output: 2
 * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 * 
 * Example 3:
 * 
 * Input: root = [2,1], p = 2, q = 1
 * Output: 2
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
 * p and q will exist in the BST.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * In a BST, if both p and q are less than root → go left.
 * If both greater → go right. Otherwise, root is the LCA.
 *
 * <h2>Complexity</h2>
* Time: O(h)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">LeetCode #235</a>
 */
public class LowestCommonAncestorOfABinarySearchTree {

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
     * Uses a sliding window to scan subarrays in linear time.
     *
     * @param root the root (TreeNode)
     * @param p the p (TreeNode)
     * @param q the q (TreeNode)
     * @return the computed TreeNode result
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val)      root = root.left;
            else if (p.val > root.val && q.val > root.val) root = root.right;
            else return root;
        }
        return null;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        LowestCommonAncestorOfABinarySearchTree sol = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = bt(6,2,8,0,4,7,9,null,null,3,5);
        TreeNode p = root.left, q = root.right; // 2 and 8
        System.out.println("LCA(2,8)=" + sol.lowestCommonAncestor(root,p,q).val); // 6
        TreeNode p2=root.left, q2=root.left.right; // 2 and 4
        System.out.println("LCA(2,4)=" + sol.lowestCommonAncestor(root,p2,q2).val); // 2
    }
}
