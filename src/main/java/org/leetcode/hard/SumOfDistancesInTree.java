package org.leetcode.hard;


/**
 * <b>#834 - Sum of Distances in Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Tree, Depth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
 *
 *
 * You are given the integer n and the array edges where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
 *
 *
 * Return an array answer of length n where answer[i] is the sum of the distances between the ith node in the tree and all other nodes.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
 * Output: [8,12,6,10,10,10]
 * Explanation: The tree is shown above.
 * We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
 * equals 1 + 1 + 2 + 2 + 2 = 8.
 * Hence, answer[0] = 8, and so on.
 *
 * Example 2:
 *
 * Input: n = 1, edges = []
 * Output: [0]
 *
 * Example 3:
 *
 * Input: n = 2, edges = [[1,0]]
 * Output: [1,1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 3 * 104
 *
 * edges.length == n - 1
 *
 * edges[i].length == 2
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * ai != bi
 *
 * The given input represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Tree, Depth-First Search, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-distances-in-tree/">LeetCode #834</a>
 */
public class SumOfDistancesInTree {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Sum of Distances in Tree".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Distances in Tree");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SumOfDistancesInTree.java &amp;&amp; java org.leetcode.hard.SumOfDistancesInTree</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfDistancesInTree ===");
        SumOfDistancesInTree sol = new SumOfDistancesInTree();
        System.out.println(sol.solve(null));
    }
}
