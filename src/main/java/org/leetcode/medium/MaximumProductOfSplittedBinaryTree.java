package org.leetcode.medium;


/**
 * <b>#1339 - Maximum Product of Splitted Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.
 *
 *
 * Return the maximum product of the sums of the two subtrees. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * Note that you need to maximize the answer before taking the mod and not after taking it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,4,5,6]
 * Output: 110
 * Explanation: Remove the red edge and get 2 binary trees with sum 11 and 10. Their product is 110 (11*10)
 *
 * Example 2:
 *
 * Input: root = [1,null,2,3,4,null,null,5,6]
 * Output: 90
 * Explanation: Remove the red edge and get 2 binary trees with sum 15 and 6.Their product is 90 (15*6)
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [2, 5 * 104].
 *
 * 1 &lt;= Node.val &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we know the sum of a subtree, the answer is max( (total_sum - subtree_sum) * subtree_sum) in each node.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/">LeetCode #1339</a>
 */
public class MaximumProductOfSplittedBinaryTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Maximum Product of Splitted Binary Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumProductOfSplittedBinaryTree ===");
        MaximumProductOfSplittedBinaryTree sol = new MaximumProductOfSplittedBinaryTree();
        System.out.println(sol.solve(null));
    }
}
