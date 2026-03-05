package org.leetcode.hard;


/**
 * <b>#1489 - Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Union-Find, Graph Theory, Sorting, Minimum Spanning Tree, Strongly Connected Component</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a weighted undirected connected graph with n vertices numbered from 0 to n - 1, and an array edges where edges[i] = [ai, bi, weighti] represents a bidirectional and weighted edge between nodes ai and bi. A minimum spanning tree (MST) is a subset of the graph's edges that connects all vertices without cycles and with the minimum possible total edge weight.
 *
 *
 * Find all the critical and pseudo-critical edges in the given graph's minimum spanning tree (MST). An MST edge whose deletion from the graph would cause the MST weight to increase is called a critical edge. On the other hand, a pseudo-critical edge is that which can appear in some MSTs but not all.
 *
 *
 * Note that you can return the indices of the edges in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
 * Output: [[0,1],[2,3,4,5]]
 * Explanation: The figure above describes the graph.
 * The following figure shows all the possible MSTs:
 *
 * Notice that the two edges 0 and 1 appear in all MSTs, therefore they are critical edges, so we return them in the first list of the output.
 * The edges 2, 3, 4, and 5 are only part of some MSTs, therefore they are considered pseudo-critical edges. We add them to the second list of the output.
 *
 * Example 2:
 *
 * Input: n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
 * Output: [[],[0,1,2,3]]
 * Explanation: We can observe that since all 4 edges have equal weight, choosing any 3 edges from the given 4 will yield an MST. Therefore all 4 edges are pseudo-critical.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 100
 *
 * 1 &lt;= edges.length &lt;= min(200, n * (n - 1) / 2)
 *
 * edges[i].length == 3
 *
 * 0 &lt;= ai &lt; bi &lt; n
 *
 * 1 &lt;= weighti &lt;= 1000
 *
 * All pairs (ai, bi) are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the Kruskal algorithm to find the minimum spanning tree by sorting the edges and picking edges from ones with smaller weights.
 * Hint 2: Use a disjoint set to avoid adding redundant edges that result in a cycle.
 * Hint 3: To find if one edge is critical, delete that edge and re-run the MST algorithm and see if the weight of the new MST increases.
 * Hint 4: To find if one edge is non-critical (in any MST), include that edge to the accepted edge list and continue the MST algorithm, then see if the resulting MST has the same weight of the initial MST of the entire graph.
 *
 * <h2>Approach</h2>
 * Think about the category (Union-Find, Graph Theory, Sorting, Minimum Spanning Tree, Strongly Connected Component).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/">LeetCode #1489</a>
 */
public class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree ===");
        FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree sol = new FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree();
        System.out.println(sol.solve(null));
    }
}
