package org.leetcode.hard;


/**
 * <b>#1377 - Frog Position After T Seconds</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an undirected tree consisting of n vertices numbered from 1 to n. A frog starts jumping from vertex 1. In one second, the frog jumps from its current vertex to another unvisited vertex if they are directly connected. The frog can not jump back to a visited vertex. In case the frog can jump to several vertices, it jumps randomly to one of them with the same probability. Otherwise, when the frog can not jump to any unvisited vertex, it jumps forever on the same vertex.
 *
 *
 * The edges of the undirected tree are given in the array edges, where edges[i] = [ai, bi] means that exists an edge connecting the vertices ai and bi.
 *
 *
 * Return the probability that after t seconds the frog is on the vertex target. Answers within 10-5 of the actual answer will be accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7, edges = [[1,2],[1,3],[1,7],[2,4],[2,6],[3,5]], t = 2, target = 4
 * Output: 0.16666666666666666 
 * Explanation: The figure above shows the given graph. The frog starts at vertex 1, jumping with 1/3 probability to the vertex 2 after second 1 and then jumping with 1/2 probability to vertex 4 after second 2. Thus the probability for the frog is on the vertex 4 after 2 seconds is 1/3 * 1/2 = 1/6 = 0.16666666666666666. 
 *
 * Example 2:
 *
 * Input: n = 7, edges = [[1,2],[1,3],[1,7],[2,4],[2,6],[3,5]], t = 1, target = 7
 * Output: 0.3333333333333333
 * Explanation: The figure above shows the given graph. The frog starts at vertex 1, jumping with 1/3 = 0.3333333333333333 probability to the vertex 7 after second 1. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 *
 * edges.length == n - 1
 *
 * edges[i].length == 2
 *
 * 1 &lt;= ai, bi &lt;= n
 *
 * 1 &lt;= t &lt;= 50
 *
 * 1 &lt;= target &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a variation of DFS with parameters 'curent_vertex' and 'current_time'.
 * Hint 2: Update the probability considering to jump to one of the children vertices.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/frog-position-after-t-seconds/">LeetCode #1377</a>
 */
public class FrogPositionAfterTSeconds {

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
        throw new UnsupportedOperationException("Not yet implemented: Frog Position After T Seconds");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FrogPositionAfterTSeconds ===");
        FrogPositionAfterTSeconds sol = new FrogPositionAfterTSeconds();
        System.out.println(sol.solve(null));
    }
}
