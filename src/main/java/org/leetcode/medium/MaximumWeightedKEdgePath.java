package org.leetcode.medium;


/**
 * <b>#3543 - Maximum Weighted K-Edge Path</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Dynamic Programming, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and a Directed Acyclic Graph (DAG) with n nodes labeled from 0 to n - 1. This is represented by a 2D array edges, where edges[i] = [ui, vi, wi] indicates a directed edge from node ui to vi with weight wi.
 *
 *
 * You are also given two integers, k and t.
 *
 *
 * Your task is to determine the maximum possible sum of edge weights for any path in the graph such that:
 *
 *
 * The path contains exactly k edges.
 *
 * The total sum of edge weights in the path is strictly less than t.
 *
 * Return the maximum possible sum of weights for such a path. If no such path exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1,1],[1,2,2]], k = 2, t = 4
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The only path with k = 2 edges is 0 -&gt; 1 -&gt; 2 with weight 1 + 2 = 3 &lt; t.
 *
 * Thus, the maximum possible sum of weights less than t is 3.
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[0,1,2],[0,2,3]], k = 1, t = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are two paths with k = 1 edge:
 *
 *
 *
 *
 * 0 -&gt; 1 with weight 2 &lt; t.
 *
 * 0 -&gt; 2 with weight 3 = t, which is not strictly less than t.
 *
 *
 *
 * Thus, the maximum possible sum of weights less than t is 2.
 *
 * Example 3:
 *
 * Input: n = 3, edges = [[0,1,6],[1,2,8]], k = 1, t = 6
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * There are two paths with k = 1 edge:
 *
 *
 *
 * 0 -&gt; 1 with weight 6 = t, which is not strictly less than t.
 *
 * 1 -&gt; 2 with weight 8 &gt; t, which is not strictly less than t.
 *
 *
 *
 * Since there is no path with sum of weights strictly less than t, the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 300
 *
 * 0 &lt;= edges.length &lt;= 300
 *
 * edges[i] = [ui, vi, wi]
 *
 * 0 &lt;= ui, vi &lt; n
 *
 * ui != vi
 *
 * 1 &lt;= wi &lt;= 10
 *
 * 0 &lt;= k &lt;= 300
 *
 * 1 &lt;= t &lt;= 600
 *
 * The input graph is guaranteed to be a DAG.
 *
 * There are no duplicate edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Dynamic Programming
 * Hint 2: How many paths and path sums are possible? Can we maintain the pathSums for a given path length ending at a particular node in a set?
 * Hint 3: The set <code>dp[i][j]</code> contains all possible path weights that end at node <code>i</code>, have total weight less than <code>T</code>, and consist of exactly <code>j</code> edges
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Dynamic Programming, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/maximum-weighted-k-edge-path/">LeetCode #3543</a>
 */
public class MaximumWeightedKEdgePath {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Weighted K-Edge Path");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumWeightedKEdgePath ===");
        MaximumWeightedKEdgePath sol = new MaximumWeightedKEdgePath();
        System.out.println(sol.solve(null));
    }
}
