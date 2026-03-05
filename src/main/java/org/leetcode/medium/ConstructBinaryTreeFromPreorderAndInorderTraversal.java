package org.leetcode.medium;

/**
 * <b>#105 - Construct Binary Tree from Preorder and Inorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * 
 * Example 2:
 * 
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= preorder.length &lt;= 3000
 * 	
 * inorder.length == preorder.length
 * 	
 * -3000 &lt;= preorder[i], inorder[i] &lt;= 3000
 * 	
 * preorder and inorder consist of unique values.
 * 	
 * Each value of inorder also appears in preorder.
 * 	
 * preorder is guaranteed to be the preorder traversal of the tree.
 * 	
 * inorder is guaranteed to be the inorder traversal of the tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Preorder first element is always the root. Find it in inorder to split left/right subtrees.
 * Use a HashMap for O(1) inorder index lookup. Recurse on each half.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">LeetCode #105</a>
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

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

    private java.util.Map<Integer,Integer> inMap;
    private int preIdx;

    /**
     * Constructs a binary tree from preorder and inorder traversal arrays.
     * @param preorder preorder array
     * @param inorder  inorder array
     * @return root of constructed tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inMap = new java.util.HashMap<>();
        for (int i = 0; i < inorder.length; i++) inMap.put(inorder[i], i);
        preIdx = 0;
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] pre, int inLeft, int inRight) {
        if (inLeft > inRight) return null;
        int val = pre[preIdx++];
        TreeNode node = new TreeNode(val);
        int mid = inMap.get(val);
        node.left  = build(pre, inLeft,   mid - 1);
        node.right = build(pre, mid + 1,  inRight);
        return node;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ConstructBinaryTreeFromPreorderAndInorderTraversal.java &amp;&amp; java org.leetcode.medium.ConstructBinaryTreeFromPreorderAndInorderTraversal
     *
     * @param args not used
     */
    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal sol = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        int[] pre = {3,9,20,15,7}, in = {9,3,15,20,7};
        TreeNode root = sol.buildTree(pre, in);
        // Verify with level order
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root);
        System.out.print("Constructed tree (BFS): ");
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.print(cur.val + " ");
            if (cur.left  != null) q.offer(cur.left);
            if (cur.right != null) q.offer(cur.right);
        }
        System.out.println(); // 3 9 20 15 7
    }
}
