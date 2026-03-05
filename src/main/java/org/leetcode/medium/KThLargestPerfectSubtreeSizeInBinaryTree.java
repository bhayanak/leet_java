package org.leetcode.medium;


/**
 * <b>#3319 - K-th Largest Perfect Subtree Size in Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Sorting, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree and an integer k.
 *
 *
 * Return an integer denoting the size of the kth largest perfect binary subtree, or -1 if it doesn't exist.
 *
 *
 * A perfect binary tree is a tree where all leaves are on the same level, and every parent has two children.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [5,3,6,5,2,5,7,1,8,null,null,6,8], k = 2
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 * The roots of the perfect binary subtrees are highlighted in black. Their sizes, in non-increasing order are [3, 3, 1, 1, 1, 1, 1, 1].
 *
 * The 2nd largest size is 3.
 *
 * Example 2:
 *
 * Input: root = [1,2,3,4,5,6,7], k = 1
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 * The sizes of the perfect binary subtrees in non-increasing order are [7, 3, 3, 1, 1, 1, 1]. The size of the largest perfect binary subtree is 7.
 *
 * Example 3:
 *
 * Input: root = [1,2,3,null,4], k = 3
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 * The sizes of the perfect binary subtrees in non-increasing order are [1, 1]. There are fewer than 3 perfect binary subtrees.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 2000].
 *
 * 1 &lt;= Node.val &lt;= 2000
 *
 * 1 &lt;= k &lt;= 1024
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a subtree to form a perfect binary subtree, its children should also be perfect binary subtrees.
 * Hint 2: Check recursively that both the node and its children are perfect binary subtrees.
 * Hint 3: Gather all the perfect binary subtrees and return the kth largest.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Sorting, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/k-th-largest-perfect-subtree-size-in-binary-tree/">LeetCode #3319</a>
 */
public class KThLargestPerfectSubtreeSizeInBinaryTree {

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
        throw new UnsupportedOperationException("Not yet implemented: K-th Largest Perfect Subtree Size in Binary Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== KThLargestPerfectSubtreeSizeInBinaryTree ===");
        KThLargestPerfectSubtreeSizeInBinaryTree sol = new KThLargestPerfectSubtreeSizeInBinaryTree();
        System.out.println(sol.solve(null));
    }
}
