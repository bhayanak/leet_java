package org.leetcode.hard;

/**
 * <b>#124 - Binary Tree Maximum Path Sum</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 * 
 * 
 * The path sum of a path is the sum of the node's values in the path.
 * 
 * 
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,3]
 * Output: 6
 * Explanation: The optimal path is 2 -&gt; 1 -&gt; 3 with a path sum of 2 + 1 + 3 = 6.
 * 
 * Example 2:
 * 
 * Input: root = [-10,9,20,null,null,15,7]
 * Output: 42
 * Explanation: The optimal path is 15 -&gt; 20 -&gt; 7 with a path sum of 15 + 20 + 7 = 42.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [1, 3 * 104].
 * 	
 * -1000 &lt;= Node.val &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * DFS returning the best single-side path from each node.
 * At each node compute: left_gain + node + right_gain (full path through node).
 * Update global max; return node + max(left_gain, right_gain) upward.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/">LeetCode #124</a>
 */
public class BinaryTreeMaximumPathSum {

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

    private int maxSum;

    /**
     * Finds the maximum path sum (path may start/end at any node).
     * @param root tree root
     * @return maximum path sum
     */
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        gain(root);
        return maxSum;
    }

    private int gain(TreeNode node) {
        if (node == null) return 0;
        int leftGain  = Math.max(gain(node.left),  0); // discard negative branches
        int rightGain = Math.max(gain(node.right), 0);
        maxSum = Math.max(maxSum, node.val + leftGain + rightGain); // path through node
        return node.val + Math.max(leftGain, rightGain);            // single-side up
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinaryTreeMaximumPathSum.java &amp;&amp; java org.leetcode.hard.BinaryTreeMaximumPathSum
     *
     * @param args not used
     */
    public static void main(String[] args) {
        BinaryTreeMaximumPathSum sol = new BinaryTreeMaximumPathSum();
        System.out.println(sol.maxPathSum(buildTree(new Integer[]{1,2,3}))); // 6
        System.out.println(sol.maxPathSum(buildTree(new Integer[]{-10,9,20,null,null,15,7}))); // 42
    }
}
