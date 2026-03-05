package org.leetcode.medium;


/**
 * <b>#1514 - Path with Maximum Probability</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Graph Theory, Heap (Priority Queue), Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].
 *
 *
 * Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.
 *
 *
 * If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
 * Output: 0.25000
 * Explanation: There are two paths from start to end, one having a probability of success = 0.2 and the other has 0.5 * 0.5 = 0.25.
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2
 * Output: 0.30000
 *
 * Example 3:
 *
 * Input: n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
 * Output: 0.00000
 * Explanation: There is no path between 0 and 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 10^4
 *
 * 0 &lt;= start, end &lt; n
 *
 * start != end
 *
 * 0 &lt;= a, b &lt; n
 *
 * a != b
 *
 * 0 &lt;= succProb.length == edges.length &lt;= 2*10^4
 *
 * 0 &lt;= succProb[i] &lt;= 1
 *
 * There is at most one edge between every two nodes.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Multiplying probabilities will result in precision errors.
 * Hint 2: Take log probabilities to sum up numbers instead of multiplying them.
 * Hint 3: Use Dijkstra's algorithm to find the minimum path between the two nodes after negating all costs.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Graph Theory, Heap (Priority Queue), Shortest Path).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/path-with-maximum-probability/">LeetCode #1514</a>
 */
public class PathWithMaximumProbability {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Path with Maximum Probability");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PathWithMaximumProbability ===");
        PathWithMaximumProbability sol = new PathWithMaximumProbability();
        System.out.println(sol.solve(null));
    }
}
