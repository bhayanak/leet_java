package org.leetcode.easy;

/**
 * <b>#94 - Binary Tree Inorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Stack, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,null,2,3]
 * 
 * 
 * Output: [1,3,2]
 * 
 * 
 * Explanation:
 * 
 * Example 2:
 * 
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * 
 * 
 * Output: [4,2,6,5,7,1,3,9,8]
 * 
 * 
 * Explanation:
 * 
 * Example 3:
 * 
 * Input: root = []
 * 
 * 
 * Output: []
 * 
 * Example 4:
 * 
 * Input: root = [1]
 * 
 * 
 * Output: [1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 100].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 
 *  
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Iterative inorder using a stack: push down all left children,
 * then process the node and move to the right child.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">LeetCode #94</a>
 */
public class BinaryTreeInorderTraversal {

    public static class TreeNode { int val; TreeNode left, right; TreeNode(int v){val=v;} }

    /**
     * Returns inorder traversal (left → root → right) of a binary tree.
     *
     * @param root root of the binary tree
     * @return     list of values in inorder
     */
    public java.util.List<Integer> inorderTraversal(TreeNode root) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        java.util.Deque<TreeNode> stack = new java.util.ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) { stack.push(cur); cur = cur.left; } // go left
            cur = stack.pop();
            result.add(cur.val);  // visit
            cur = cur.right;      // go right
        }
        return result;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Recursively traverses the binary tree, computing the result from leaf-to-root post-order.</p>
      */
    public static void main(String[] args) {
        BinaryTreeInorderTraversal sol = new BinaryTreeInorderTraversal();
        System.out.println("No method available");
    }
}
