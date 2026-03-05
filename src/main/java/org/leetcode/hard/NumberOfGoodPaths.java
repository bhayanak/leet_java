package org.leetcode.hard;


/**
 * <b>#2421 - Number of Good Paths</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Tree, Union-Find, Graph Theory, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a tree (i.e. a connected, undirected graph with no cycles) consisting of n nodes numbered from 0 to n - 1 and exactly n - 1 edges.
 *
 *
 * You are given a 0-indexed integer array vals of length n where vals[i] denotes the value of the ith node. You are also given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting nodes ai and bi.
 *
 *
 * A good path is a simple path that satisfies the following conditions:
 *
 *
 * The starting node and the ending node have the same value.
 *
 * All nodes between the starting node and the ending node have values less than or equal to the starting node (i.e. the starting node's value should be the maximum value along the path).
 *
 * Return the number of distinct good paths.
 *
 *
 * Note that a path and its reverse are counted as the same path. For example, 0 -&gt; 1 is considered to be the same as 1 -&gt; 0. A single node is also considered as a valid path.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: vals = [1,3,2,1,3], edges = [[0,1],[0,2],[2,3],[2,4]]
 * Output: 6
 * Explanation: There are 5 good paths consisting of a single node.
 * There is 1 additional good path: 1 -&gt; 0 -&gt; 2 -&gt; 4.
 * (The reverse path 4 -&gt; 2 -&gt; 0 -&gt; 1 is treated as the same as 1 -&gt; 0 -&gt; 2 -&gt; 4.)
 * Note that 0 -&gt; 2 -&gt; 3 is not a good path because vals[2] &gt; vals[0].
 *
 * Example 2:
 *
 * Input: vals = [1,1,2,2,3], edges = [[0,1],[1,2],[2,3],[2,4]]
 * Output: 7
 * Explanation: There are 5 good paths consisting of a single node.
 * There are 2 additional good paths: 0 -&gt; 1 and 2 -&gt; 3.
 *
 * Example 3:
 *
 * Input: vals = [1], edges = []
 * Output: 1
 * Explanation: The tree consists of only one node, so there is one good path.
 *
 *
 *
 * Constraints:
 *
 *
 * n == vals.length
 *
 * 1 &lt;= n &lt;= 3 * 104
 *
 * 0 &lt;= vals[i] &lt;= 105
 *
 * edges.length == n - 1
 *
 * edges[i].length == 2
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * ai != bi
 *
 * edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you process nodes from smallest to largest value?
 * Hint 2: Try to build the graph from nodes with the smallest value to the largest value.
 * Hint 3: May union find help?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Tree, Union-Find, Graph Theory, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/number-of-good-paths/">LeetCode #2421</a>
 */
public class NumberOfGoodPaths {

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
        throw new UnsupportedOperationException("Not yet implemented: Number of Good Paths");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfGoodPaths ===");
        NumberOfGoodPaths sol = new NumberOfGoodPaths();
        System.out.println(sol.solve(null));
    }
}
