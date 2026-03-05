package org.leetcode.hard;


/**
 * <b>#1697 - Checking Existence of Edge Length Limited Paths</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Union-Find, Graph Theory, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An undirected graph of n nodes is defined by edgeList, where edgeList[i] = [ui, vi, disi] denotes an edge between nodes ui and vi with distance disi. Note that there may be multiple edges between two nodes.
 *
 *
 * Given an array queries, where queries[j] = [pj, qj, limitj], your task is to determine for each queries[j] whether there is a path between pj and qj such that each edge on the path has a distance strictly less than limitj .
 *
 *
 * Return a boolean array answer, where answer.length == queries.length and the jth value of answer is true if there is a path for queries[j] is true, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edgeList = [[0,1,2],[1,2,4],[2,0,8],[1,0,16]], queries = [[0,1,2],[0,2,5]]
 * Output: [false,true]
 * Explanation: The above figure shows the given graph. Note that there are two overlapping edges between 0 and 1 with distances 2 and 16.
 * For the first query, between 0 and 1 there is no path where each distance is less than 2, thus we return false for this query.
 * For the second query, there is a path (0 -&gt; 1 -&gt; 2) of two edges with distances less than 5, thus we return true for this query.
 *
 * Example 2:
 *
 * Input: n = 5, edgeList = [[0,1,10],[1,2,5],[2,3,9],[3,4,13]], queries = [[0,4,14],[1,4,13]]
 * Output: [true,false]
 * Explanation: The above figure shows the given graph.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= edgeList.length, queries.length &lt;= 105
 *
 * edgeList[i].length == 3
 *
 * queries[j].length == 3
 *
 * 0 &lt;= ui, vi, pj, qj &lt;= n - 1
 *
 * ui != vi
 *
 * pj != qj
 *
 * 1 &lt;= disi, limitj &lt;= 109
 *
 * There may be multiple edges between two nodes.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: All the queries are given in advance. Is there a way you can reorder the queries to avoid repeated computations?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Union-Find, Graph Theory, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/">LeetCode #1697</a>
 */
public class CheckingExistenceOfEdgeLengthLimitedPaths {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Checking Existence of Edge Length Limited Paths");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CheckingExistenceOfEdgeLengthLimitedPaths ===");
        CheckingExistenceOfEdgeLengthLimitedPaths sol = new CheckingExistenceOfEdgeLengthLimitedPaths();
        System.out.println(sol.solve(null));
    }
}
