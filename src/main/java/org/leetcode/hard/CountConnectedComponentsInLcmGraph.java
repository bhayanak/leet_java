package org.leetcode.hard;


/**
 * <b>#3378 - Count Connected Components in LCM Graph</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Union-Find, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums of size n and a positive integer threshold.
 *
 *
 * There is a graph consisting of n nodes with the ith node having a value of nums[i]. Two nodes i and j in the graph are connected via an undirected edge if lcm(nums[i], nums[j]) &lt;= threshold.
 *
 *
 * Return the number of connected components in this graph.
 *
 *
 * A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.
 *
 *
 * The term lcm(a, b) denotes the least common multiple of a and b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,8,3,9], threshold = 5
 *
 *
 * Output: 4
 *
 *
 * Explanation: 
 *
 *
 *
 *
 * The four connected components are (2, 4), (3), (8), (9).
 *
 * Example 2:
 *
 * Input: nums = [2,4,8,3,9,12], threshold = 10
 *
 *
 * Output: 2
 *
 *
 * Explanation: 
 *
 * The two connected components are (2, 3, 4, 8, 9), and (12).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * All elements of nums are unique.
 *
 * 1 &lt;= threshold &lt;= 2 * 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DSU
 * Hint 2: Connect a number to all its multiples less than threshold
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Union-Find, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/count-connected-components-in-lcm-graph/">LeetCode #3378</a>
 */
public class CountConnectedComponentsInLcmGraph {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Connected Components in LCM Graph");
    }

    public static void main(String[] args) {
        System.out.println("=== CountConnectedComponentsInLcmGraph ===");
        CountConnectedComponentsInLcmGraph sol = new CountConnectedComponentsInLcmGraph();
        System.out.println(sol.solve(null));
    }
}
