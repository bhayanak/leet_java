package org.leetcode.medium;


/**
 * <b>#2641 - Cousins in Binary Tree II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, replace the value of each node in the tree with the sum of all its cousins' values.
 *
 *
 * Two nodes of a binary tree are cousins if they have the same depth with different parents.
 *
 *
 * Return the root of the modified tree.
 *
 *
 * Note that the depth of a node is the number of edges in the path from the root node to it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [5,4,9,1,10,null,7]
 * Output: [0,0,0,7,7,null,11]
 * Explanation: The diagram above shows the initial binary tree and the binary tree after changing the value of each node.
 * - Node with value 5 does not have any cousins so its sum is 0.
 * - Node with value 4 does not have any cousins so its sum is 0.
 * - Node with value 9 does not have any cousins so its sum is 0.
 * - Node with value 1 has a cousin with value 7 so its sum is 7.
 * - Node with value 10 has a cousin with value 7 so its sum is 7.
 * - Node with value 7 has cousins with values 1 and 10 so its sum is 11.
 *
 * Example 2:
 *
 * Input: root = [3,1,2]
 * Output: [0,0,0]
 * Explanation: The diagram above shows the initial binary tree and the binary tree after changing the value of each node.
 * - Node with value 3 does not have any cousins so its sum is 0.
 * - Node with value 1 does not have any cousins so its sum is 0.
 * - Node with value 2 does not have any cousins so its sum is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 105].
 *
 * 1 &lt;= Node.val &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DFS two times.
 * Hint 2: For the first time, find the sum of values of all the levels of the binary tree.
 * Hint 3: For the second time, update the value of the node with the sum of the values of the current level - sibling node’s values.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/cousins-in-binary-tree-ii/">LeetCode #2641</a>
 */
public class CousinsInBinaryTreeIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Cousins in Binary Tree II");
    }

    public static void main(String[] args) {
        System.out.println("=== CousinsInBinaryTreeIi ===");
        CousinsInBinaryTreeIi sol = new CousinsInBinaryTreeIi();
        System.out.println(sol.solve(null));
    }
}
