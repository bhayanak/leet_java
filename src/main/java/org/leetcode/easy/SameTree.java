package org.leetcode.easy;

/**
 * <b>#100 - Same Tree</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * 
 * 
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * 
 * Example 3:
 * 
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in both trees is in the range [0, 100].
 * 	
 * -104 &lt;= Node.val &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Recursive: two trees are the same if their roots match and both subtrees are the same.
 * Base cases: both null → true; one null → false.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n) stack
 *
 * @see <a href="https://leetcode.com/problems/same-tree/">LeetCode #100</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class SameTree {

    public static class TreeNode { int val; TreeNode left, right; TreeNode(int v){val=v;} }

    /**
     * Checks whether two binary trees are identical (same structure and node values).
     *
     * @param p first tree root
     * @param q second tree root
     * @return  true if both trees are equal
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
                SameTree sol = new SameTree();
                TreeNode t1 = new TreeNode(1);
                t1.left = new TreeNode(2); t1.right = new TreeNode(3);
                TreeNode t2 = new TreeNode(1);
                t2.left = new TreeNode(2); t2.right = new TreeNode(3);
                System.out.println(sol.isSameTree(t1, t2)); // true
    }
}
