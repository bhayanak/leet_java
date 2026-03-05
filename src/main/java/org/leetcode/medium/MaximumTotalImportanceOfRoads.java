package org.leetcode.medium;


/**
 * <b>#2285 - Maximum Total Importance of Roads</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Greedy, Graph Theory, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.
 *
 *
 * You are also given a 2D integer array roads where roads[i] = [ai, bi] denotes that there exists a bidirectional road connecting cities ai and bi.
 *
 *
 * You need to assign each city with an integer value from 1 to n, where each value can only be used once. The importance of a road is then defined as the sum of the values of the two cities it connects.
 *
 *
 * Return the maximum total importance of all roads possible after assigning the values optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, roads = [[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]
 * Output: 43
 * Explanation: The figure above shows the country and the assigned values of [2,4,5,3,1].
 * - The road (0,1) has an importance of 2 + 4 = 6.
 * - The road (1,2) has an importance of 4 + 5 = 9.
 * - The road (2,3) has an importance of 5 + 3 = 8.
 * - The road (0,2) has an importance of 2 + 5 = 7.
 * - The road (1,3) has an importance of 4 + 3 = 7.
 * - The road (2,4) has an importance of 5 + 1 = 6.
 * The total importance of all roads is 6 + 9 + 8 + 7 + 7 + 6 = 43.
 * It can be shown that we cannot obtain a greater total importance than 43.
 *
 * Example 2:
 *
 * Input: n = 5, roads = [[0,3],[2,4],[1,3]]
 * Output: 20
 * Explanation: The figure above shows the country and the assigned values of [4,3,2,5,1].
 * - The road (0,3) has an importance of 4 + 5 = 9.
 * - The road (2,4) has an importance of 2 + 1 = 3.
 * - The road (1,3) has an importance of 3 + 5 = 8.
 * The total importance of all roads is 9 + 3 + 8 = 20.
 * It can be shown that we cannot obtain a greater total importance than 20.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 5 * 104
 *
 * 1 &lt;= roads.length &lt;= 5 * 104
 *
 * roads[i].length == 2
 *
 * 0 &lt;= ai, bi &lt;= n - 1
 *
 * ai != bi
 *
 * There are no duplicate roads.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider what each city contributes to the total importance of all roads.
 * Hint 2: Based on that, how can you sort the cities such that assigning them values in that order will yield the maximum total importance?
 *
 * <h2>Approach</h2>
 * Think about the category (Greedy, Graph Theory, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximum-total-importance-of-roads/">LeetCode #2285</a>
 */
public class MaximumTotalImportanceOfRoads {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Total Importance of Roads");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumTotalImportanceOfRoads ===");
        MaximumTotalImportanceOfRoads sol = new MaximumTotalImportanceOfRoads();
        System.out.println(sol.solve(null));
    }
}
