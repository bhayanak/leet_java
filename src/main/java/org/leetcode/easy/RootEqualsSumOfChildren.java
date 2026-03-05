package org.leetcode.easy;


/**
 * <b>#2236 - Root Equals Sum of Children</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
 *
 *
 * Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [10,4,6]
 * Output: true
 * Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
 * 10 is equal to 4 + 6, so we return true.
 *
 * Example 2:
 *
 * Input: root = [5,3,1]
 * Output: false
 * Explanation: The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
 * 5 is not equal to 3 + 1, so we return false.
 *
 *
 *
 * Constraints:
 *
 *
 * The tree consists only of the root, its left child, and its right child.
 *
 * -100 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/root-equals-sum-of-children/">LeetCode #2236</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class RootEqualsSumOfChildren {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Checks Check tree.
     *
     * @param root the root (TreeNode)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

    public static void main(String[] args) {
        RootEqualsSumOfChildren sol = new RootEqualsSumOfChildren();
        System.out.println(sol.checkTree(null));
    }
}
