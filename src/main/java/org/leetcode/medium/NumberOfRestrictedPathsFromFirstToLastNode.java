package org.leetcode.medium;


/**
 * <b>#1786 - Number of Restricted Paths From First to Last Node</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Graph Theory, Topological Sort, Heap (Priority Queue), Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected weighted connected graph. You are given a positive integer n which denotes that the graph has n nodes labeled from 1 to n, and an array edges where each edges[i] = [ui, vi, weighti] denotes that there is an edge between nodes ui and vi with weight equal to weighti.
 *
 *
 * A path from node start to node end is a sequence of nodes [z0, z1, z2, ..., zk] such that z0 = start and zk = end and there is an edge between zi and zi+1 where 0 &lt;= i &lt;= k-1.
 *
 *
 * The distance of a path is the sum of the weights on the edges of the path. Let distanceToLastNode(x) denote the shortest distance of a path between node n and node x. A restricted path is a path that also satisfies that distanceToLastNode(zi) &gt; distanceToLastNode(zi+1) where 0 &lt;= i &lt;= k-1.
 *
 *
 * Return the number of restricted paths from node 1 to node n. Since that number may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, edges = [[1,2,3],[1,3,3],[2,3,1],[1,4,2],[5,2,2],[3,5,1],[5,4,10]]
 * Output: 3
 * Explanation: Each circle contains the node number in black and its distanceToLastNode value in blue. The three restricted paths are:
 * 1) 1 --&gt; 2 --&gt; 5
 * 2) 1 --&gt; 2 --&gt; 3 --&gt; 5
 * 3) 1 --&gt; 3 --&gt; 5
 *
 * Example 2:
 *
 * Input: n = 7, edges = [[1,3,1],[4,1,2],[7,3,4],[2,5,3],[5,6,1],[6,7,2],[7,5,3],[2,6,4]]
 * Output: 1
 * Explanation: Each circle contains the node number in black and its distanceToLastNode value in blue. The only restricted path is 1 --&gt; 3 --&gt; 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 2 * 104
 *
 * n - 1 &lt;= edges.length &lt;= 4 * 104
 *
 * edges[i].length == 3
 *
 * 1 &lt;= ui, vi &lt;= n
 *
 * ui != vi
 *
 * 1 &lt;= weighti &lt;= 105
 *
 * There is at most one edge between any two nodes.
 *
 * There is at least one path between any two nodes.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Run a Dijkstra from node numbered n to compute distance from the last node.
 * Hint 2: Consider all edges [u, v] one by one and direct them such that distance of u to n &gt; distance of v to n. If both u and v are at the same distance from n, discard this edge.
 * Hint 3: Now this problem reduces to computing the number of paths from 1 to n in a DAG, a standard DP problem.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Graph Theory, Topological Sort, Heap (Priority Queue), Shortest Path).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-restricted-paths-from-first-to-last-node/">LeetCode #1786</a>
 */
public class NumberOfRestrictedPathsFromFirstToLastNode {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Restricted Paths From First to Last Node");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfRestrictedPathsFromFirstToLastNode ===");
        NumberOfRestrictedPathsFromFirstToLastNode sol = new NumberOfRestrictedPathsFromFirstToLastNode();
        System.out.println(sol.solve(null));
    }
}
