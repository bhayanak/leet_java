package org.leetcode.medium;


/**
 * <b>#2196 - Create Binary Tree From Descriptions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array descriptions where descriptions[i] = [parenti, childi, isLefti] indicates that parenti is the parent of childi in a binary tree of unique values. Furthermore,
 *
 *
 * If isLefti == 1, then childi is the left child of parenti.
 *
 * If isLefti == 0, then childi is the right child of parenti.
 *
 * Construct the binary tree described by descriptions and return its root.
 *
 *
 * The test cases will be generated such that the binary tree is valid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
 * Output: [50,20,80,15,17,19]
 * Explanation: The root node is the node with value 50 since it has no parent.
 * The resulting binary tree is shown in the diagram.
 *
 * Example 2:
 *
 * Input: descriptions = [[1,2,1],[2,3,0],[3,4,1]]
 * Output: [1,2,null,null,3,4]
 * Explanation: The root node is the node with value 1 since it has no parent.
 * The resulting binary tree is shown in the diagram.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= descriptions.length &lt;= 104
 *
 * descriptions[i].length == 3
 *
 * 1 &lt;= parenti, childi &lt;= 105
 *
 * 0 &lt;= isLefti &lt;= 1
 *
 * The binary tree described by descriptions is valid.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could you represent and store the descriptions more efficiently?
 * Hint 2: Could you find the root node?
 * Hint 3: The node that is not a child in any of the descriptions is the root node.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Tree, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/create-binary-tree-from-descriptions/">LeetCode #2196</a>
 */
public class CreateBinaryTreeFromDescriptions {

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
        throw new UnsupportedOperationException("Not yet implemented: Create Binary Tree From Descriptions");
    }

    public static void main(String[] args) {
        System.out.println("=== CreateBinaryTreeFromDescriptions ===");
        CreateBinaryTreeFromDescriptions sol = new CreateBinaryTreeFromDescriptions();
        System.out.println(sol.solve(null));
    }
}
