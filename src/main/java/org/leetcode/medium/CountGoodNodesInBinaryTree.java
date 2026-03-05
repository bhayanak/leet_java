package org.leetcode.medium;


/**
 * <b>#1448 - Count Good Nodes in Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 *
 *
 * Return the number of good nodes in the binary tree.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 *
 *
 *
 * Input: root = [3,1,4,3,null,1,5]
 * Output: 4
 * Explanation: Nodes in blue are good.
 * Root Node (3) is always a good node.
 * Node 4 -&gt; (3,4) is the maximum value in the path starting from the root.
 * Node 5 -&gt; (3,4,5) is the maximum value in the path
 * Node 3 -&gt; (3,1,3) is the maximum value in the path.
 *
 *
 *
 * Example 2:
 *
 *
 *
 *
 *
 *
 * Input: root = [3,3,null,4,2]
 * Output: 3
 * Explanation: Node 2 -&gt; (3, 3, 2) is not good, because "3" is higher than it.
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: root = [1]
 * Output: 1
 * Explanation: Root is considered as good.
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * The number of nodes in the binary tree is in the range [1, 10^5].
 *
 * Each node's value is between [-10^4, 10^4].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DFS (Depth First Search) to traverse the tree, and constantly keep track of the current path maximum.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/">LeetCode #1448</a>
 */
public class CountGoodNodesInBinaryTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Count Good Nodes in Binary Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountGoodNodesInBinaryTree ===");
        CountGoodNodesInBinaryTree sol = new CountGoodNodesInBinaryTree();
        System.out.println(sol.solve(null));
    }
}
