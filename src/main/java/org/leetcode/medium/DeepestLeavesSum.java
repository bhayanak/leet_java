package org.leetcode.medium;


/**
 * <b>#1302 - Deepest Leaves Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the sum of values of its deepest leaves.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * Output: 15
 *
 * Example 2:
 *
 * Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * Output: 19
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 104].
 *
 * 1 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Traverse the tree to find the max depth.
 * Hint 2: Traverse the tree again to compute the sum required.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/deepest-leaves-sum/">LeetCode #1302</a>
 */
public class DeepestLeavesSum {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Deepest leaves sum.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param root the root (TreeNode)
     * @return the computed int result
     */
    public int deepestLeavesSum(TreeNode root) {
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.offer(root); int sum=0;
        while (!q.isEmpty()) {
            sum=0;
            for (int s=q.size();s>0;s--) {
                TreeNode n=q.poll(); sum+=n.val;
                if (n.left!=null)  q.offer(n.left);
                if (n.right!=null) q.offer(n.right);
            }
        }
        return sum;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        DeepestLeavesSum sol = new DeepestLeavesSum();
                TreeNode root = new TreeNode(1);
                root.left = new TreeNode(2); root.right = new TreeNode(3);
                root.left.left = new TreeNode(4); root.left.right = new TreeNode(5);
                root.right.right = new TreeNode(6);
                root.left.left.left = new TreeNode(7); root.right.right.right = new TreeNode(8);
                System.out.println(sol.deepestLeavesSum(root)); // 15 (7+8)
    }
}
