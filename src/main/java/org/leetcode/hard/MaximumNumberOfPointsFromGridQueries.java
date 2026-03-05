package org.leetcode.hard;


/**
 * <b>#2503 - Maximum Number of Points From Grid Queries</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Breadth-First Search, Union-Find, Sorting, Heap (Priority Queue), Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix grid and an array queries of size k.
 *
 *
 * Find an array answer of size k such that for each integer queries[i] you start in the top left cell of the matrix and repeat the following process:
 *
 *
 * If queries[i] is strictly greater than the value of the current cell that you are in, then you get one point if it is your first time visiting this cell, and you can move to any adjacent cell in all 4 directions: up, down, left, and right.
 *
 * Otherwise, you do not get any points, and you end this process.
 *
 * After the process, answer[i] is the maximum number of points you can get. Note that for each query you are allowed to visit the same cell multiple times.
 *
 *
 * Return the resulting array answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2,3],[2,5,7],[3,5,1]], queries = [5,6,2]
 * Output: [5,8,1]
 * Explanation: The diagrams above show which cells we visit to get points for each query.
 *
 * Example 2:
 *
 * Input: grid = [[5,2,1],[1,1,2]], queries = [3]
 * Output: [0]
 * Explanation: We can not get any points because the value of the top left cell is already greater than or equal to 3.
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 2 &lt;= m, n &lt;= 1000
 *
 * 4 &lt;= m * n &lt;= 105
 *
 * k == queries.length
 *
 * 1 &lt;= k &lt;= 104
 *
 * 1 &lt;= grid[i][j], queries[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The queries are all given to you beforehand so you can answer them in any order you want.
 * Hint 2: Sort the queries knowing their original order to be able to build the answer array.
 * Hint 3: Run a BFS on the graph and answer the queries in increasing order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Breadth-First Search, Union-Find, Sorting, Heap (Priority Queue), Matrix).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-points-from-grid-queries/">LeetCode #2503</a>
 */
public class MaximumNumberOfPointsFromGridQueries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Points From Grid Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfPointsFromGridQueries ===");
        MaximumNumberOfPointsFromGridQueries sol = new MaximumNumberOfPointsFromGridQueries();
        System.out.println(sol.solve(null));
    }
}
