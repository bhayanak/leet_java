package org.leetcode.medium;

/**
 * <b>#113 - Path Sum II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Backtracking, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
 * 
 * 
 * A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: [[5,4,11,2],[5,8,4,5]]
 * Explanation: There are two paths whose sum equals targetSum:
 * 5 + 4 + 11 + 2 = 22
 * 5 + 8 + 4 + 5 = 22
 * 
 * Example 2:
 * 
 * Input: root = [1,2,3], targetSum = 5
 * Output: []
 * 
 * Example 3:
 * 
 * Input: root = [1,2], targetSum = 0
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 5000].
 * 	
 * -1000 &lt;= Node.val &lt;= 1000
 * 	
 * -1000 &lt;= targetSum &lt;= 1000
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
 * @see <a href="https://leetcode.com/problems/path-sum-ii/">LeetCode #113</a>
 */
public class PathSumIi {

    /**
     * TODO: Implement solution for "Path Sum II".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Path Sum II");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac PathSumIi.java &amp;&amp; java org.leetcode.medium.PathSumIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== PathSumIi ===");
        PathSumIi sol = new PathSumIi();
        System.out.println(sol.solve(null));
    }
}
