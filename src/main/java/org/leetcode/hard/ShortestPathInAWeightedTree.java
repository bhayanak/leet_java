package org.leetcode.hard;


/**
 * <b>#3515 - Shortest Path in a Weighted Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Tree, Depth-First Search, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and an undirected, weighted tree rooted at node 1 with n nodes numbered from 1 to n. This is represented by a 2D array edges of length n - 1, where edges[i] = [ui, vi, wi] indicates an undirected edge from node ui to vi with weight wi.
 *
 *
 * You are also given a 2D integer array queries of length q, where each queries[i] is either:
 *
 *
 * [1, u, v, w'] – Update the weight of the edge between nodes u and v to w', where (u, v) is guaranteed to be an edge present in edges.
 *
 * [2, x] – Compute the shortest path distance from the root node 1 to node x.
 *
 * Return an integer array answer, where answer[i] is the shortest path distance from node 1 to x for the ith query of [2, x].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, edges = [[1,2,7]], queries = [[2,2],[1,1,2,4],[2,2]]
 *
 *
 * Output: [7,4]
 *
 *
 * Explanation:
 *
 *
 * Query [2,2]: The shortest path from root node 1 to node 2 is 7.
 *
 * Query [1,1,2,4]: The weight of edge (1,2) changes from 7 to 4.
 *
 * Query [2,2]: The shortest path from root node 1 to node 2 is 4.
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[1,2,2],[1,3,4]], queries = [[2,1],[2,3],[1,1,3,7],[2,2],[2,3]]
 *
 *
 * Output: [0,4,2,7]
 *
 *
 * Explanation:
 *
 *
 * Query [2,1]: The shortest path from root node 1 to node 1 is 0.
 *
 * Query [2,3]: The shortest path from root node 1 to node 3 is 4.
 *
 * Query [1,1,3,7]: The weight of edge (1,3) changes from 4 to 7.
 *
 * Query [2,2]: The shortest path from root node 1 to node 2 is 2.
 *
 * Query [2,3]: The shortest path from root node 1 to node 3 is 7.
 *
 * Example 3:
 *
 * Input: n = 4, edges = [[1,2,2],[2,3,1],[3,4,5]], queries = [[2,4],[2,3],[1,2,3,3],[2,2],[2,3]]
 *
 *
 * Output: [8,3,2,5]
 *
 *
 * Explanation:
 *
 *
 * Query [2,4]: The shortest path from root node 1 to node 4 consists of edges (1,2), (2,3), and (3,4) with weights 2 + 1 + 5 = 8.
 *
 * Query [2,3]: The shortest path from root node 1 to node 3 consists of edges (1,2) and (2,3) with weights 2 + 1 = 3.
 *
 * Query [1,2,3,3]: The weight of edge (2,3) changes from 1 to 3.
 *
 * Query [2,2]: The shortest path from root node 1 to node 2 is 2.
 *
 * Query [2,3]: The shortest path from root node 1 to node 3 consists of edges (1,2) and (2,3) with updated weights 2 + 3 = 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * edges.length == n - 1
 *
 * edges[i] == [ui, vi, wi]
 *
 * 1 &lt;= ui, vi &lt;= n
 *
 * 1 &lt;= wi &lt;= 104
 *
 * The input is generated such that edges represents a valid tree.
 *
 * 1 &lt;= queries.length == q &lt;= 105
 *
 * queries[i].length == 2 or 4
 *
 *
 *
 * queries[i] == [1, u, v, w'] or,
 *
 * queries[i] == [2, x]
 *
 * 1 &lt;= u, v, x &lt;= n
 *
 * (u, v) is always an edge from edges.
 *
 * 1 &lt;= w' &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use an Euler tour to flatten the tree into an array so each node’s subtree corresponds to a contiguous segment.
 * Hint 2: Build a segment tree over this Euler tour to support efficient range updates and point queries.
 * Hint 3: For an update query [1, <code>u</code>, <code>v</code>, <code>w'</code>], adjust the distance for all descendants by applying a delta update to the corresponding range in the flattened array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Tree, Depth-First Search, Binary Indexed Tree, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/shortest-path-in-a-weighted-tree/">LeetCode #3515</a>
 */
public class ShortestPathInAWeightedTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Shortest Path in a Weighted Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== ShortestPathInAWeightedTree ===");
        ShortestPathInAWeightedTree sol = new ShortestPathInAWeightedTree();
        System.out.println(sol.solve(null));
    }
}
