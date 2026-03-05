package org.leetcode.medium;


/**
 * <b>#2583 - Kth Largest Sum in a Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Breadth-First Search, Sorting, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree and a positive integer k.
 *
 *
 * The level sum in the tree is the sum of the values of the nodes that are on the same level.
 *
 *
 * Return the kth largest level sum in the tree (not necessarily distinct). If there are fewer than k levels in the tree, return -1.
 *
 *
 * Note that two nodes are on the same level if they have the same distance from the root.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [5,8,9,2,1,3,7,4,6], k = 2
 * Output: 13
 * Explanation: The level sums are the following:
 * - Level 1: 5.
 * - Level 2: 8 + 9 = 17.
 * - Level 3: 2 + 1 + 3 + 7 = 13.
 * - Level 4: 4 + 6 = 10.
 * The 2nd largest level sum is 13.
 *
 * Example 2:
 *
 * Input: root = [1,2,null,3], k = 1
 * Output: 3
 * Explanation: The largest level sum is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is n.
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= Node.val &lt;= 106
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the sum of values of nodes on each level and return the kth largest one.
 * Hint 2: To find the sum of the values of nodes on each level, you can use a DFS or BFS algorithm to traverse the tree and keep track of the level of each node.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Breadth-First Search, Sorting, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/">LeetCode #2583</a>
 */
public class KthLargestSumInABinaryTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Kth Largest Sum in a Binary Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== KthLargestSumInABinaryTree ===");
        KthLargestSumInABinaryTree sol = new KthLargestSumInABinaryTree();
        System.out.println(sol.solve(null));
    }
}
