package org.leetcode.medium;


/**
 * <b>#1325 - Delete Leaves With a Given Value</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree root and an integer target, delete all the leaf nodes with value target.
 *
 *
 * Note that once you delete a leaf node with value target, if its parent node becomes a leaf node and has the value target, it should also be deleted (you need to continue doing that until you cannot).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,2,null,2,4], target = 2
 * Output: [1,null,3,null,4]
 * Explanation: Leaf nodes in green with value (target = 2) are removed (Picture in left). 
 * After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).
 *
 * Example 2:
 *
 * Input: root = [1,3,3,3,2], target = 3
 * Output: [1,3,null,null,2]
 *
 * Example 3:
 *
 * Input: root = [1,2,null,2,null,2], target = 2
 * Output: [1]
 * Explanation: Leaf nodes in green with value (target = 2) are removed at each step.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 3000].
 *
 * 1 &lt;= Node.val, target &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the DFS to reconstruct the tree such that no leaf node is equal to the target. If the leaf node is equal to the target, return an empty object instead.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/delete-leaves-with-a-given-value/">LeetCode #1325</a>
 */
public class DeleteLeavesWithAGivenValue {

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
        throw new UnsupportedOperationException("Not yet implemented: Delete Leaves With a Given Value");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DeleteLeavesWithAGivenValue ===");
        DeleteLeavesWithAGivenValue sol = new DeleteLeavesWithAGivenValue();
        System.out.println(sol.solve(null));
    }
}
