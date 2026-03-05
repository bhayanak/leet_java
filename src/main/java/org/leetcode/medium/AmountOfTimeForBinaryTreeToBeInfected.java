package org.leetcode.medium;


/**
 * <b>#2385 - Amount of Time for Binary Tree to Be Infected</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.
 *
 *
 * Each minute, a node becomes infected if:
 *
 *
 * The node is currently uninfected.
 *
 * The node is adjacent to an infected node.
 *
 * Return the number of minutes needed for the entire tree to be infected.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,5,3,null,4,10,6,9,2], start = 3
 * Output: 4
 * Explanation: The following nodes are infected during:
 * - Minute 0: Node 3
 * - Minute 1: Nodes 1, 10 and 6
 * - Minute 2: Node 5
 * - Minute 3: Node 4
 * - Minute 4: Nodes 9 and 2
 * It takes 4 minutes for the whole tree to be infected so we return 4.
 *
 * Example 2:
 *
 * Input: root = [1], start = 1
 * Output: 0
 * Explanation: At minute 0, the only node in the tree is infected so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 105].
 *
 * 1 &lt;= Node.val &lt;= 105
 *
 * Each node has a unique value.
 *
 * A node with a value of start exists in the tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert the tree to an undirected graph to make it easier to handle.
 * Hint 2: Use BFS starting at the start node to find the distance between each node and the start node. The answer is the maximum distance.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/">LeetCode #2385</a>
 */
public class AmountOfTimeForBinaryTreeToBeInfected {

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
        throw new UnsupportedOperationException("Not yet implemented: Amount of Time for Binary Tree to Be Infected");
    }

    public static void main(String[] args) {
        System.out.println("=== AmountOfTimeForBinaryTreeToBeInfected ===");
        AmountOfTimeForBinaryTreeToBeInfected sol = new AmountOfTimeForBinaryTreeToBeInfected();
        System.out.println(sol.solve(null));
    }
}
