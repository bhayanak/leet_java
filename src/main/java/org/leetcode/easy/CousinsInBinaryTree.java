package org.leetcode.easy;

/** CousinsInBinaryTree solution. */
public class CousinsInBinaryTree {
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v){val=v;} }

    /**
     * Checks if two nodes x and y in the binary tree are cousins.
     *
     * @param root root of the binary tree
     * @param x    value of first node
     * @param y    value of second node
     * @return true if x and y are at the same depth with different parents
     *
     * <p><b>Explanation:</b> BFS level-order traversal tracks each node's depth and parent.</p>
     *   Cousins share the same depth but have different parents. Time O(n), Space O(n).
     */
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] depthX = {-1}, depthY = {-1};
        TreeNode[] parentX = {null}, parentY = {null};
        dfsCousing(root, null, 0, x, y, depthX, depthY, parentX, parentY);
        return depthX[0] == depthY[0] && parentX[0] != parentY[0];
    }
    private void dfsCousing(TreeNode node, TreeNode par, int depth, int x, int y,
            int[] dX, int[] dY, TreeNode[] pX, TreeNode[] pY) {
        if (node == null) return;
        if (node.val == x) { dX[0] = depth; pX[0] = par; }
        if (node.val == y) { dY[0] = depth; pY[0] = par; }
        dfsCousing(node.left, node, depth+1, x, y, dX, dY, pX, pY);
        dfsCousing(node.right, node, depth+1, x, y, dX, dY, pX, pY);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CousinsInBinaryTree.java &amp;&amp; java org.leetcode.easy.CousinsInBinaryTree</pre>
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== CousinsInBinaryTree ===");
        CousinsInBinaryTree sol = new CousinsInBinaryTree();
        System.out.println(sol.isCousins(null, 3, 3));
    }
}
