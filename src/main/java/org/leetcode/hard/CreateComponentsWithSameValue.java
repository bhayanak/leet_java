package org.leetcode.hard;


/**
 * <b>#2440 - Create Components With Same Value</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Tree, Depth-First Search, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected tree with n nodes labeled from 0 to n - 1.
 *
 *
 * You are given a 0-indexed integer array nums of length n where nums[i] represents the value of the ith node. You are also given a 2D integer array edges of length n - 1 where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
 *
 *
 * You are allowed to delete some edges, splitting the tree into multiple connected components. Let the value of a component be the sum of all nums[i] for which node i is in the component.
 *
 *
 * Return the maximum number of edges you can delete, such that every connected component in the tree has the same value.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [6,2,2,2,6], edges = [[0,1],[1,2],[1,3],[3,4]] 
 * Output: 2 
 * Explanation: The above figure shows how we can delete the edges [0,1] and [3,4]. The created components are nodes [0], [1,2,3] and [4]. The sum of the values in each component equals 6. It can be proven that no better deletion exists, so the answer is 2.
 *
 * Example 2:
 *
 * Input: nums = [2], edges = []
 * Output: 0
 * Explanation: There are no edges to be deleted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 2 * 104
 *
 * nums.length == n
 *
 * 1 &lt;= nums[i] &lt;= 50
 *
 * edges.length == n - 1
 *
 * edges[i].length == 2
 *
 * 0 &lt;= edges[i][0], edges[i][1] &lt;= n - 1
 *
 * edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider all divisors of the sum of values.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Tree, Depth-First Search, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/create-components-with-same-value/">LeetCode #2440</a>
 */
public class CreateComponentsWithSameValue {

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
        throw new UnsupportedOperationException("Not yet implemented: Create Components With Same Value");
    }

    public static void main(String[] args) {
        System.out.println("=== CreateComponentsWithSameValue ===");
        CreateComponentsWithSameValue sol = new CreateComponentsWithSameValue();
        System.out.println(sol.solve(null));
    }
}
