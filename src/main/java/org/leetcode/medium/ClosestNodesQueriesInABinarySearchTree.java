package org.leetcode.medium;


/**
 * <b>#2476 - Closest Nodes Queries in a Binary Search Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary search tree and an array queries of size n consisting of positive integers.
 *
 *
 * Find a 2D array answer of size n where answer[i] = [mini, maxi]:
 *
 *
 * mini is the largest value in the tree that is smaller than or equal to queries[i]. If a such value does not exist, add -1 instead.
 *
 * maxi is the smallest value in the tree that is greater than or equal to queries[i]. If a such value does not exist, add -1 instead.
 *
 * Return the array answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [6,2,13,1,4,9,15,null,null,null,null,null,null,14], queries = [2,5,16]
 * Output: [[2,2],[4,6],[15,-1]]
 * Explanation: We answer the queries in the following way:
 * - The largest number that is smaller or equal than 2 in the tree is 2, and the smallest number that is greater or equal than 2 is still 2. So the answer for the first query is [2,2].
 * - The largest number that is smaller or equal than 5 in the tree is 4, and the smallest number that is greater or equal than 5 is 6. So the answer for the second query is [4,6].
 * - The largest number that is smaller or equal than 16 in the tree is 15, and the smallest number that is greater or equal than 16 does not exist. So the answer for the third query is [15,-1].
 *
 * Example 2:
 *
 * Input: root = [4,null,9], queries = [3]
 * Output: [[-1,4]]
 * Explanation: The largest number that is smaller or equal to 3 in the tree does not exist, and the smallest number that is greater or equal to 3 is 4. So the answer for the query is [-1,4].
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [2, 105].
 *
 * 1 &lt;= Node.val &lt;= 106
 *
 * n == queries.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= queries[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to first convert the tree into a sorted array.
 * Hint 2: How do you solve each query in O(log(n)) time using the array of the tree?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Tree, Depth-First Search, Binary Search Tree, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/closest-nodes-queries-in-a-binary-search-tree/">LeetCode #2476</a>
 */
public class ClosestNodesQueriesInABinarySearchTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Closest Nodes Queries in a Binary Search Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== ClosestNodesQueriesInABinarySearchTree ===");
        ClosestNodesQueriesInABinarySearchTree sol = new ClosestNodesQueriesInABinarySearchTree();
        System.out.println(sol.solve(null));
    }
}
