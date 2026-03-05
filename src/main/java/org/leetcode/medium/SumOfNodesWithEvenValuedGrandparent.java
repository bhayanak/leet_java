package org.leetcode.medium;


/**
 * <b>#1315 - Sum of Nodes with Even-Valued Grandparent</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent. If there are no nodes with an even-valued grandparent, return 0.
 *
 *
 * A grandparent of a node is the parent of its parent if it exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * Output: 18
 * Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.
 *
 * Example 2:
 *
 * Input: root = [1]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 104].
 *
 * 1 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Traverse the tree keeping the parent and the grandparent.
 * Hint 2: If the grandparent of the current node is even-valued, add the value of this node to the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/">LeetCode #1315</a>
 */
public class SumOfNodesWithEvenValuedGrandparent {

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
        throw new UnsupportedOperationException("Not yet implemented: Sum of Nodes with Even-Valued Grandparent");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfNodesWithEvenValuedGrandparent ===");
        SumOfNodesWithEvenValuedGrandparent sol = new SumOfNodesWithEvenValuedGrandparent();
        System.out.println(sol.solve(null));
    }
}
