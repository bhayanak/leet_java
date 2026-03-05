package org.leetcode.medium;


/**
 * <b>#1457 - Pseudo-Palindromic Paths in a Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Bit Manipulation, Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree where node values are digits from 1 to 9. A path in the binary tree is said to be pseudo-palindromic if at least one permutation of the node values in the path is a palindrome.
 *
 *
 * Return the number of pseudo-palindromic paths going from the root node to leaf nodes.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [2,3,1,3,1,null,1]
 * Output: 2 
 * Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the red path [2,3,3], the green path [2,1,1], and the path [2,3,1]. Among these paths only red path and green path are pseudo-palindromic paths since the red path [2,3,3] can be rearranged in [3,2,3] (palindrome) and the green path [2,1,1] can be rearranged in [1,2,1] (palindrome).
 *
 * Example 2:
 *
 * Input: root = [2,1,1,1,3,null,null,null,null,null,1]
 * Output: 1 
 * Explanation: The figure above represents the given binary tree. There are three paths going from the root node to leaf nodes: the green path [2,1,1], the path [2,1,3,1], and the path [2,1]. Among these paths only the green path is pseudo-palindromic since [2,1,1] can be rearranged in [1,2,1] (palindrome).
 *
 * Example 3:
 *
 * Input: root = [9]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 105].
 *
 * 1 &lt;= Node.val &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that the node values of a path form a palindrome if at most one digit has an odd frequency (parity).
 * Hint 2: Use a Depth First Search (DFS) keeping the frequency (parity) of the digits. Once you are in a leaf node check if at most one digit has an odd frequency (parity).
 *
 * <h2>Approach</h2>
 * Think about the category (Bit Manipulation, Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/">LeetCode #1457</a>
 */
public class PseudoPalindromicPathsInABinaryTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Pseudo-Palindromic Paths in a Binary Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PseudoPalindromicPathsInABinaryTree ===");
        PseudoPalindromicPathsInABinaryTree sol = new PseudoPalindromicPathsInABinaryTree();
        System.out.println(sol.solve(null));
    }
}
