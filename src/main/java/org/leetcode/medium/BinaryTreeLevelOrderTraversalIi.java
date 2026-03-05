package org.leetcode.medium;

/**
 * <b>#107 - Binary Tree Level Order Traversal II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[15,7],[9,20],[3]]
 * 
 * Example 2:
 * 
 * Input: root = [1]
 * Output: [[1]]
 * 
 * Example 3:
 * 
 * Input: root = []
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 2000].
 * 	
 * -1000 &lt;= Node.val &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal-ii/">LeetCode #107</a>
 */
public class BinaryTreeLevelOrderTraversalIi {

    /**
     * TODO: Implement solution for "Binary Tree Level Order Traversal II".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Tree Level Order Traversal II");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinaryTreeLevelOrderTraversalIi.java &amp;&amp; java org.leetcode.medium.BinaryTreeLevelOrderTraversalIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== BinaryTreeLevelOrderTraversalIi ===");
        BinaryTreeLevelOrderTraversalIi sol = new BinaryTreeLevelOrderTraversalIi();
        System.out.println(sol.solve(null));
    }
}
