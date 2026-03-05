package org.leetcode.medium;

/**
 * <b>#337 - House Robber III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.
 * 
 * 
 * Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree. It will automatically contact the police if two directly-linked houses were broken into on the same night.
 * 
 * 
 * Given the root of the binary tree, return the maximum amount of money the thief can rob without alerting the police.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,2,3,null,3,null,1]
 * Output: 7
 * Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 * 
 * Example 2:
 * 
 * Input: root = [3,4,5,1,3,null,1]
 * Output: 9
 * Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [1, 104].
 * 	
 * 0 &lt;= Node.val &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Tree DP: each node returns [robWithNode, robWithoutNode].
 * robWith = node.val + left[1] + right[1]
 * robWithout = max(left) + max(right)
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/house-robber-iii/">LeetCode #337</a>
 */
public class HouseRobberIii {

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
     * Solves the problem: Rob.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param root the root (TreeNode)
     * @return the computed int result
     */
    public int rob(TreeNode root) {
        int[] res=dp(root);
        return Math.max(res[0],res[1]);
    }
    private int[] dp(TreeNode n){
        if(n==null) return new int[]{0,0};
        int[] l=dp(n.left), r=dp(n.right);
        int robCur  = n.val+l[1]+r[1];
        int skipCur = Math.max(l[0],l[1])+Math.max(r[0],r[1]);
        return new int[]{robCur,skipCur};
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        HouseRobberIii sol = new HouseRobberIii();
        System.out.println(sol.rob(bt(3,2,3,null,3,null,1))); // 7 (3+3+1)
        System.out.println(sol.rob(bt(3,4,5,1,3,null,1)));    // 9 (4+5)
    }
}
