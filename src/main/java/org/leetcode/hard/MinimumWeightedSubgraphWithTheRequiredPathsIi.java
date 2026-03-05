package org.leetcode.hard;


/**
 * <b>#3553 - Minimum Weighted Subgraph With the Required Paths II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Tree, Depth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected weighted tree with n nodes, numbered from 0 to n - 1. It is represented by a 2D integer array edges of length n - 1, where edges[i] = [ui, vi, wi] indicates that there is an edge between nodes ui and vi with weight wi.​
 *
 *
 * Additionally, you are given a 2D integer array queries, where queries[j] = [src1j, src2j, destj].
 *
 *
 * Return an array answer of length equal to queries.length, where answer[j] is the minimum total weight of a subtree such that it is possible to reach destj from both src1j and src2j using edges in this subtree.
 *
 *
 * A subtree here is any connected subset of nodes and edges of the original tree forming a valid tree.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges = [[0,1,2],[1,2,3],[1,3,5],[1,4,4],[2,5,6]], queries = [[2,3,4],[0,2,5]]
 *
 *
 * Output: [12,11]
 *
 *
 * Explanation:
 *
 *
 * The blue edges represent one of the subtrees that yield the optimal answer.
 *
 *
 *
 *
 * answer[0]: The total weight of the selected subtree that ensures a path from src1 = 2 and src2 = 3 to dest = 4 is 3 + 5 + 4 = 12.
 *
 *
 *
 *
 * answer[1]: The total weight of the selected subtree that ensures a path from src1 = 0 and src2 = 2 to dest = 5 is 2 + 3 + 6 = 11.
 *
 *
 * Example 2:
 *
 * Input: edges = [[1,0,8],[0,2,7]], queries = [[0,1,2]]
 *
 *
 * Output: [15]
 *
 *
 * Explanation:
 *
 *
 * answer[0]: The total weight of the selected subtree that ensures a path from src1 = 0 and src2 = 1 to dest = 2 is 8 + 7 = 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 105
 *
 * edges.length == n - 1
 *
 * edges[i].length == 3
 *
 * 0 &lt;= ui, vi &lt; n
 *
 * 1 &lt;= wi &lt;= 104
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[j].length == 3
 *
 * 0 &lt;= src1j, src2j, destj &lt; n
 *
 * src1j, src2j, and destj are pairwise distinct.
 *
 * The input is generated such that edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary lifting
 * Hint 2: Find the lowest common ancestor (LCA) of any two nodes using binary lifting
 * Hint 3: For any node <code>x</code>, let <code>f(x)</code> be the distance from the root to <code>x</code>. Then for two nodes <code>x</code> and <code>y</code>:<code>d(x, y) = f(x) + f(y) - 2 * f(LCA(x, y))</code>
 * Hint 4: For three nodes <code>a</code>, <code>b</code> and <code>c</code>, the minimum total weight of the subtree connecting all three is:<code>(d(a, b) + d(b, c) + d(c, a)) / 2</code>, where <code>d(x, y)</code> is the distance between nodes <code>x</code> and <code>y</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Tree, Depth-First Search).
 *
 * @see <a href="https://leetcode.com/problems/minimum-weighted-subgraph-with-the-required-paths-ii/">LeetCode #3553</a>
 */
public class MinimumWeightedSubgraphWithTheRequiredPathsIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Minimum Weighted Subgraph With the Required Paths II");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumWeightedSubgraphWithTheRequiredPathsIi ===");
        MinimumWeightedSubgraphWithTheRequiredPathsIi sol = new MinimumWeightedSubgraphWithTheRequiredPathsIi();
        System.out.println(sol.solve(null));
    }
}
