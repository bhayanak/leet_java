package org.leetcode.medium;


/**
 * <b>#1161 - Maximum Level Sum of a Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
 *
 *
 * Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,7,0,7,-8,null,null]
 * Output: 2
 * Explanation: 
 * Level 1 sum = 1.
 * Level 2 sum = 7 + 0 = 7.
 * Level 3 sum = 7 + -8 = -1.
 * So we return the level with the maximum sum which is level 2.
 *
 * Example 2:
 *
 * Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 104].
 *
 * -105 &lt;= Node.val &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Calculate the sum for each level then find the level with the maximum sum.
 * Hint 2: How can you traverse the tree ?
 * Hint 3: How can you sum up the values for every level ?
 * Hint 4: Use DFS or BFS to traverse the tree keeping the level of each node, and sum up those values with a map or a frequency array.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/">LeetCode #1161</a>
 */
public class MaximumLevelSumOfABinaryTree {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Maximum Level Sum of a Binary Tree".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Level Sum of a Binary Tree");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumLevelSumOfABinaryTree.java &amp;&amp; java org.leetcode.medium.MaximumLevelSumOfABinaryTree</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumLevelSumOfABinaryTree ===");
        MaximumLevelSumOfABinaryTree sol = new MaximumLevelSumOfABinaryTree();
        System.out.println(sol.solve(null));
    }
}
