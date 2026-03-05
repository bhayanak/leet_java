package org.leetcode.easy;

/**
 * <b>#257 - Binary Tree Paths</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Backtracking, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * 
 * 
 * A leaf is a node with no children.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,3,null,5]
 * Output: ["1-&gt;2-&gt;5","1-&gt;3"]
 * 
 * Example 2:
 * 
 * Input: root = [1]
 * Output: ["1"]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [1, 100].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * DFS with a path string. Append node value; at leaves add to result.
 * Backtracking via string immutability.
 *
 * <h2>Complexity</h2>
* Time: O(n·h)  |  Space: O(n·h)
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-paths/">LeetCode #257</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class BinaryTreePaths {

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
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
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
    public java.util.List<String> binaryTreePaths(TreeNode root) {
        java.util.List<String> res=new java.util.ArrayList<>();
        dfs(root,"",res); return res;
    }
    private void dfs(TreeNode n, String path, java.util.List<String> res) {
        if(n==null) return;
        path += n.val;
        if(n.left==null&&n.right==null){res.add(path);return;}
        path+="->";
        dfs(n.left,path,res); dfs(n.right,path,res);
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        BinaryTreePaths sol = new BinaryTreePaths();
        System.out.println(sol.binaryTreePaths(bt(1,2,3,null,5))); // ["1->2->5","1->3"]
        System.out.println(sol.binaryTreePaths(bt(1))); // ["1"]
    }
}
