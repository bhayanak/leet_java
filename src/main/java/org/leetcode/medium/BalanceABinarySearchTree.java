package org.leetcode.medium;


/**
 * <b>#1382 - Balance a Binary Search Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Divide and Conquer, Greedy, Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.
 *
 *
 * A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,null,2,null,3,null,4,null,null]
 * Output: [2,1,3,null,null,null,4]
 * Explanation: This is not the only correct answer, [3,1,4,null,2] is also correct.
 *
 * Example 2:
 *
 * Input: root = [2,1,3]
 * Output: [2,1,3]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 104].
 *
 * 1 &lt;= Node.val &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert the tree to a sorted array using an in-order traversal.
 * Hint 2: Construct a new balanced tree from the sorted array recursively.
 *
 * <h2>Approach</h2>
 * Think about the category (Divide and Conquer, Greedy, Tree, Depth-First Search, Binary Search Tree, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/balance-a-binary-search-tree/">LeetCode #1382</a>
 */
public class BalanceABinarySearchTree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     * Uses binary search for O(log n) lookup.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Balance a Binary Search Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== BalanceABinarySearchTree ===");
        BalanceABinarySearchTree sol = new BalanceABinarySearchTree();
        System.out.println(sol.solve(null));
    }
}
