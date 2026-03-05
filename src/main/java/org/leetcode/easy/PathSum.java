package org.leetcode.easy;

/**
 * <b>#112 - Path Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * 
 * 
 * A leaf is a node with no children.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 * Explanation: The root-to-leaf path with the target sum is shown.
 * 
 * Example 2:
 * 
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There are two root-to-leaf paths in the tree:
 * (1 --&gt; 2): The sum is 3.
 * (1 --&gt; 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 * 
 * Example 3:
 * 
 * Input: root = [], targetSum = 0
 * Output: false
 * Explanation: Since the tree is empty, there are no root-to-leaf paths.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 5000].
 * 	
 * -1000 &lt;= Node.val &lt;= 1000
 * 	
 * -1000 &lt;= targetSum &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * DFS: subtract node value from target at each step.
 * Return true when a leaf is reached with remaining == 0.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/path-sum/">LeetCode #112</a>
  *
  * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
  */
public class PathSum {

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
     * Returns true if any root-to-leaf path sums to targetSum.
     * @param root      tree root
     * @param targetSum required sum
     * @return true if such a path exists
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == targetSum;
        return hasPathSum(root.left, targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac PathSum.java &amp;&amp; java org.leetcode.easy.PathSum
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        PathSum sol = new PathSum();
        TreeNode root = buildTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1});
        System.out.println(sol.hasPathSum(root, 22)); // true (5->4->11->2)
        System.out.println(sol.hasPathSum(root, 26)); // true (5->8->13)
        System.out.println(sol.hasPathSum(root,  5)); // false
    }
}
