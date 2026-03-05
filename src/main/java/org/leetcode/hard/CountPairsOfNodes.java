package org.leetcode.hard;


/**
 * <b>#1782 - Count Pairs Of Nodes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Binary Search, Graph Theory, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected graph defined by an integer n, the number of nodes, and a 2D integer array edges, the edges in the graph, where edges[i] = [ui, vi] indicates that there is an undirected edge between ui and vi. You are also given an integer array queries.
 *
 *
 * Let incident(a, b) be defined as the number of edges that are connected to either node a or b.
 *
 *
 * The answer to the jth query is the number of pairs of nodes (a, b) that satisfy both of the following conditions:
 *
 *
 * a &lt; b
 *
 * incident(a, b) &gt; queries[j]
 *
 * Return an array answers such that answers.length == queries.length and answers[j] is the answer of the jth query.
 *
 *
 * Note that there can be multiple edges between the same two nodes.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, edges = [[1,2],[2,4],[1,3],[2,3],[2,1]], queries = [2,3]
 * Output: [6,5]
 * Explanation: The calculations for incident(a, b) are shown in the table above.
 * The answers for each of the queries are as follows:
 * - answers[0] = 6. All the pairs have an incident(a, b) value greater than 2.
 * - answers[1] = 5. All the pairs except (3, 4) have an incident(a, b) value greater than 3.
 *
 * Example 2:
 *
 * Input: n = 5, edges = [[1,5],[1,5],[3,4],[2,5],[1,3],[5,1],[2,3],[2,5]], queries = [1,2,3,4,5]
 * Output: [10,10,9,8,6]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 2 * 104
 *
 * 1 &lt;= edges.length &lt;= 105
 *
 * 1 &lt;= ui, vi &lt;= n
 *
 * ui != vi
 *
 * 1 &lt;= queries.length &lt;= 20
 *
 * 0 &lt;= queries[j] &lt; edges.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We want to count pairs (x,y) such that degree[x] + degree[y] - occurrences(x,y) &gt; k
 * Hint 2: Think about iterating on x, and counting the number of valid y to pair with x.
 * Hint 3: You can consider at first that the (- occurrences(x,y)) isn't there, or it is 0 at first for all y. Count the valid y this way.
 * Hint 4: Then you can iterate on the neighbors of x, let that neighbor be y, and update occurrences(x,y).
 * Hint 5: When you update occurrences(x,y), the left-hand side decreases. Once it reaches k, then y is not valid for x anymore, so you should decrease the answer by 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Binary Search, Graph Theory, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-pairs-of-nodes/">LeetCode #1782</a>
 */
public class CountPairsOfNodes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Pairs Of Nodes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountPairsOfNodes ===");
        CountPairsOfNodes sol = new CountPairsOfNodes();
        System.out.println(sol.solve(null));
    }
}
