package org.leetcode.easy;

/**
 * <b>#101 - Symmetric Tree</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [1, 1000].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 
 *  
 * Follow up: Could you solve it both recursively and iteratively?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Use a recursive helper that checks two subtrees mirror each other:
 * isSymmetric(left, right) where left.val==right.val and
 * isSymmetric(left.left, right.right) &amp;&amp; isSymmetric(left.right, right.left).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n) stack
 *
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">LeetCode #101</a>
  *
  * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
  */
public class SymmetricTree {

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
     * Checks whether a binary tree is symmetric (mirror of itself).
     * @param root root of the tree
     * @return true if symmetric
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isSymmetric(TreeNode root) {
        return root == null || mirror(root.left, root.right);
    }

    private boolean mirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.val == b.val && mirror(a.left, b.right) && mirror(a.right, b.left);
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac SymmetricTree.java &amp;&amp; java org.leetcode.easy.SymmetricTree
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        SymmetricTree sol = new SymmetricTree();
        // [1, 2, 2, 3, 4, 4, 3] → true
        TreeNode sym = buildTree(new Integer[]{1,2,2,3,4,4,3});
        System.out.println("Symmetric [1,2,2,3,4,4,3]: " + sol.isSymmetric(sym)); // true
        // [1, 2, 2, null, 3, null, 3] → false
        TreeNode notSym = buildTree(new Integer[]{1,2,2,null,3,null,3});
        System.out.println("Symmetric [1,2,2,null,3,null,3]: " + sol.isSymmetric(notSym)); // false
    }
}
