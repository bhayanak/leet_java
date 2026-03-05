package org.leetcode.hard;


/**
 * <b>#2458 - Height of Binary Tree After Subtree Removal Queries</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree with n nodes. Each node is assigned a unique value from 1 to n. You are also given an array queries of size m.
 *
 *
 * You have to perform m independent queries on the tree where in the ith query you do the following:
 *
 *
 * Remove the subtree rooted at the node with the value queries[i] from the tree. It is guaranteed that queries[i] will not be equal to the value of the root.
 *
 * Return an array answer of size m where answer[i] is the height of the tree after performing the ith query.
 *
 *
 * Note:
 *
 *
 * The queries are independent, so the tree returns to its initial state after each query.
 *
 * The height of a tree is the number of edges in the longest simple path from the root to some node in the tree.
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,3,4,2,null,6,5,null,null,null,null,null,7], queries = [4]
 * Output: [2]
 * Explanation: The diagram above shows the tree after removing the subtree rooted at node with value 4.
 * The height of the tree is 2 (The path 1 -&gt; 3 -&gt; 2).
 *
 * Example 2:
 *
 * Input: root = [5,8,9,2,1,3,7,4,6], queries = [3,2,4,8]
 * Output: [3,2,3,2]
 * Explanation: We have the following queries:
 * - Removing the subtree rooted at node with value 3. The height of the tree becomes 3 (The path 5 -&gt; 8 -&gt; 2 -&gt; 4).
 * - Removing the subtree rooted at node with value 2. The height of the tree becomes 2 (The path 5 -&gt; 8 -&gt; 1).
 * - Removing the subtree rooted at node with value 4. The height of the tree becomes 3 (The path 5 -&gt; 8 -&gt; 2 -&gt; 6).
 * - Removing the subtree rooted at node with value 8. The height of the tree becomes 2 (The path 5 -&gt; 9 -&gt; 3).
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
 * m == queries.length
 *
 * 1 &lt;= m &lt;= min(n, 104)
 *
 * 1 &lt;= queries[i] &lt;= n
 *
 * queries[i] != root.val
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try pre-computing the answer for each node from 1 to n, and answer each query in O(1).
 * Hint 2: The answers can be precomputed in a single tree traversal after computing the height of each subtree.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 *
 * @see <a href="https://leetcode.com/problems/height-of-binary-tree-after-subtree-removal-queries/">LeetCode #2458</a>
 */
public class HeightOfBinaryTreeAfterSubtreeRemovalQueries {

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
        throw new UnsupportedOperationException("Not yet implemented: Height of Binary Tree After Subtree Removal Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== HeightOfBinaryTreeAfterSubtreeRemovalQueries ===");
        HeightOfBinaryTreeAfterSubtreeRemovalQueries sol = new HeightOfBinaryTreeAfterSubtreeRemovalQueries();
        System.out.println(sol.solve(null));
    }
}
