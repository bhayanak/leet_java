package org.leetcode.medium;


/**
 * <b>#2096 - Step-By-Step Directions From a Binary Tree Node to Another</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree with n nodes. Each node is uniquely assigned a value from 1 to n. You are also given an integer startValue representing the value of the start node s, and a different integer destValue representing the value of the destination node t.
 *
 *
 * Find the shortest path starting from node s and ending at node t. Generate step-by-step directions of such path as a string consisting of only the uppercase letters 'L', 'R', and 'U'. Each letter indicates a specific direction:
 *
 *
 * 'L' means to go from a node to its left child node.
 *
 * 'R' means to go from a node to its right child node.
 *
 * 'U' means to go from a node to its parent node.
 *
 * Return the step-by-step directions of the shortest path from node s to node t.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
 * Output: "UURL"
 * Explanation: The shortest path is: 3 → 1 → 5 → 2 → 6.
 *
 * Example 2:
 *
 * Input: root = [2,1], startValue = 2, destValue = 1
 * Output: "L"
 * Explanation: The shortest path is: 2 → 1.
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
 * 1 &lt;= Node.val &lt;= n
 *
 * All the values in the tree are unique.
 *
 * 1 &lt;= startValue, destValue &lt;= n
 *
 * startValue != destValue
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The shortest path between any two nodes in a tree must pass through their Lowest Common Ancestor (LCA). The path will travel upwards from node s to the LCA and then downwards from the LCA to node t.
 * Hint 2: Find the path strings from root → s, and root → t. Can you use these two strings to prepare the final answer?
 * Hint 3: Remove the longest common prefix of the two path strings to get the path LCA → s, and LCA → t. Each step in the path of LCA → s should be reversed as 'U'.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Tree, Depth-First Search, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/">LeetCode #2096</a>
 */
public class StepByStepDirectionsFromABinaryTreeNodeToAnother {

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
        throw new UnsupportedOperationException("Not yet implemented: Step-By-Step Directions From a Binary Tree Node to Another");
    }

    public static void main(String[] args) {
        System.out.println("=== StepByStepDirectionsFromABinaryTreeNodeToAnother ===");
        StepByStepDirectionsFromABinaryTreeNodeToAnother sol = new StepByStepDirectionsFromABinaryTreeNodeToAnother();
        System.out.println(sol.solve(null));
    }
}
