package org.leetcode.medium;

/**
 * <b>#106 - Construct Binary Tree from Inorder and Postorder Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * Output: [3,9,20,null,null,15,7]
 * 
 * Example 2:
 * 
 * Input: inorder = [-1], postorder = [-1]
 * Output: [-1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= inorder.length &lt;= 3000
 * 	
 * postorder.length == inorder.length
 * 	
 * -3000 &lt;= inorder[i], postorder[i] &lt;= 3000
 * 	
 * inorder and postorder consist of unique values.
 * 	
 * Each value of postorder also appears in inorder.
 * 	
 * inorder is guaranteed to be the inorder traversal of the tree.
 * 	
 * postorder is guaranteed to be the postorder traversal of the tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">LeetCode #106</a>
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    /**
     * TODO: Implement solution for "Construct Binary Tree from Inorder and Postorder Traversal".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Construct Binary Tree from Inorder and Postorder Traversal");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ConstructBinaryTreeFromInorderAndPostorderTraversal.java &amp;&amp; java org.leetcode.medium.ConstructBinaryTreeFromInorderAndPostorderTraversal
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== ConstructBinaryTreeFromInorderAndPostorderTraversal ===");
        ConstructBinaryTreeFromInorderAndPostorderTraversal sol = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        System.out.println(sol.solve(null));
    }
}
