package org.leetcode.hard;


/**
 * <b>#2508 - Add Edges to Make Degrees of All Nodes Even</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected graph consisting of n nodes numbered from 1 to n. You are given the integer n and a 2D array edges where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi. The graph can be disconnected.
 *
 *
 * You can add at most two additional edges (possibly none) to this graph so that there are no repeated edges and no self-loops.
 *
 *
 * Return true if it is possible to make the degree of each node in the graph even, otherwise return false.
 *
 *
 * The degree of a node is the number of edges connected to it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, edges = [[1,2],[2,3],[3,4],[4,2],[1,4],[2,5]]
 * Output: true
 * Explanation: The above diagram shows a valid way of adding an edge.
 * Every node in the resulting graph is connected to an even number of edges.
 *
 * Example 2:
 *
 * Input: n = 4, edges = [[1,2],[3,4]]
 * Output: true
 * Explanation: The above diagram shows a valid way of adding two edges.
 *
 * Example 3:
 *
 * Input: n = 4, edges = [[1,2],[1,3],[1,4]]
 * Output: false
 * Explanation: It is not possible to obtain a valid graph with adding at most 2 edges.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 105
 *
 * 2 &lt;= edges.length &lt;= 105
 *
 * edges[i].length == 2
 *
 * 1 &lt;= ai, bi &lt;= n
 *
 * ai != bi
 *
 * There are no repeated edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that each edge that we add changes the degree of exactly 2 nodes.
 * Hint 2: The number of nodes with an odd degree in the original graph should be either 0, 2, or 4. Try to work on each of these cases.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/add-edges-to-make-degrees-of-all-nodes-even/">LeetCode #2508</a>
 */
public class AddEdgesToMakeDegreesOfAllNodesEven {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Add Edges to Make Degrees of All Nodes Even");
    }

    public static void main(String[] args) {
        System.out.println("=== AddEdgesToMakeDegreesOfAllNodesEven ===");
        AddEdgesToMakeDegreesOfAllNodesEven sol = new AddEdgesToMakeDegreesOfAllNodesEven();
        System.out.println(sol.solve(null));
    }
}
