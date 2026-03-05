package org.leetcode.easy;

/** BinaryTreePostorderTraversal solution. */
public class BinaryTreePostorderTraversal {
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v){val=v;} }

    /**
     * Returns nodes of the binary tree in postorder (left, right, root).
     *
     * @param root root of the binary tree
     * @return list of node values in postorder
     *
     * <p><b>Explanation:</b> Iterative: pushes root, then right before left; result list</p>
     *   is built by inserting each popped node at index 0 (reverse preorder trick).
     *   Time O(n), Space O(n).
     */
    public java.util.List<Integer> postorderTraversal(TreeNode root) {
        java.util.LinkedList<Integer> res = new java.util.LinkedList<>();
        java.util.Deque<TreeNode> stack = new java.util.ArrayDeque<>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.addFirst(node.val);
            if (node.left  != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return res;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinaryTreePostorderTraversal.java &amp;&amp; java org.leetcode.easy.BinaryTreePostorderTraversal
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== BinaryTreePostorderTraversal ===");
        BinaryTreePostorderTraversal sol = new BinaryTreePostorderTraversal();
        System.out.println(sol.postorderTraversal(null));
    }
}
