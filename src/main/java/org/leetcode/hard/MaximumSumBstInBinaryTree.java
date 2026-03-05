package org.leetcode.hard;


/**
 * <b>#1373 - Maximum Sum BST in Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree root, return the maximum sum of all keys of any sub-tree which is also a Binary Search Tree (BST).
 *
 *
 * Assume a BST is defined as follows:
 *
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 *
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 *
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
 * Output: 20
 * Explanation: Maximum sum in a valid Binary search tree is obtained in root node with key equal to 3.
 *
 * Example 2:
 *
 * Input: root = [4,3,null,1,2]
 * Output: 2
 * Explanation: Maximum sum in a valid Binary search tree is obtained in a single root node with key equal to 2.
 *
 * Example 3:
 *
 * Input: root = [-4,-2,-5]
 * Output: 0
 * Explanation: All values are negatives. Return an empty BST.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 4 * 104].
 *
 * -4 * 104 &lt;= Node.val &lt;= 4 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a datastructure with 4 parameters:  (sum, isBST, maxLeft, minRight).
 * Hint 2: In each node compute theses parameters, following the conditions of a Binary Search Tree.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Tree, Depth-First Search, Binary Search Tree, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/">LeetCode #1373</a>
 */
public class MaximumSumBstInBinaryTree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum BST in Binary Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumSumBstInBinaryTree ===");
        MaximumSumBstInBinaryTree sol = new MaximumSumBstInBinaryTree();
        System.out.println(sol.solve(null));
    }
}
