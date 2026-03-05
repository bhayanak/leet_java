package org.leetcode.medium;

/**
 * <b>#230 - Kth Smallest Element in a BST</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is n.
 * 	
 * 1 &lt;= k &lt;= n &lt;= 104
 * 	
 * 0 &lt;= Node.val &lt;= 104
 * 
 *  
 * 
 * Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to utilize the property of a BST.
 * Hint 2: Try in-order traversal. (Credits to @chan13)
 * Hint 3: What if you could modify the BST node's structure?
 * Hint 4: The optimal runtime complexity is O(height of BST).
 *
 * <h2>Approach</h2>
 * In-order traversal of BST yields sorted order. Stop at k-th element.
 *
 * <h2>Complexity</h2>
* Time: O(k)  |  Space: O(n) stack
 *
 * @see <a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst/">LeetCode #230</a>
 */
public class KthSmallestElementInABst {

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
    private int count, result;
    /**
     * Solves the problem: Kth smallest.
     *
     * @param root the root (TreeNode)
     * @param k the k (int)
     * @return the computed int result
     */
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return result;
    }
    private void inorder(TreeNode node) {
        if (node==null||count<=0) return;
        inorder(node.left);
        if (--count==0) result=node.val;
        inorder(node.right);
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        KthSmallestElementInABst sol = new KthSmallestElementInABst();
        System.out.println(sol.kthSmallest(bt(3,1,4,null,2),1)); // 1
        System.out.println(sol.kthSmallest(bt(5,3,6,2,4,null,null,1),3)); // 3
    }
}
