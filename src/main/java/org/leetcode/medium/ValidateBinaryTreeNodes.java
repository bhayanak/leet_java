package org.leetcode.medium;


/**
 * <b>#1361 - Validate Binary Tree Nodes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n binary tree nodes numbered from 0 to n - 1 where node i has two children leftChild[i] and rightChild[i], return true if and only if all the given nodes form exactly one valid binary tree.
 *
 *
 * If node i has no left child then leftChild[i] will equal -1, similarly for the right child.
 *
 *
 * Note that the nodes have no values and that we only use the node numbers in this problem.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
 * Output: true
 *
 * Example 2:
 *
 * Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,3,-1,-1]
 * Output: false
 *
 * Example 3:
 *
 * Input: n = 2, leftChild = [1,0], rightChild = [-1,-1]
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * n == leftChild.length == rightChild.length
 *
 * 1 &lt;= n &lt;= 104
 *
 * -1 &lt;= leftChild[i], rightChild[i] &lt;= n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the parent of each node.
 * Hint 2: A valid tree must have nodes with only one parent and exactly one node with no parent.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/validate-binary-tree-nodes/">LeetCode #1361</a>
 */
public class ValidateBinaryTreeNodes {

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
        throw new UnsupportedOperationException("Not yet implemented: Validate Binary Tree Nodes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ValidateBinaryTreeNodes ===");
        ValidateBinaryTreeNodes sol = new ValidateBinaryTreeNodes();
        System.out.println(sol.solve(null));
    }
}
