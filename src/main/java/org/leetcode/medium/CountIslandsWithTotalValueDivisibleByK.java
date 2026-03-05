package org.leetcode.medium;


/**
 * <b>#3619 - Count Islands With Total Value Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n matrix grid and a positive integer k. An island is a group of positive integers (representing land) that are 4-directionally connected (horizontally or vertically).
 *
 *
 * The total value of an island is the sum of the values of all cells in the island.
 *
 *
 * Return the number of islands with a total value divisible by k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,2,1,0,0],[0,5,0,0,5],[0,0,1,0,0],[0,1,4,7,0],[0,2,0,0,8]], k = 5
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The grid contains four islands. The islands highlighted in blue have a total value that is divisible by 5, while the islands highlighted in red do not.
 *
 * Example 2:
 *
 * Input: grid = [[3,0,3,0], [0,3,0,3], [3,0,3,0]], k = 3
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The grid contains six islands, each with a total value that is divisible by 3.
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
 * 1 &lt;= m, n &lt;= 1000
 *
 * 1 &lt;= m * n &lt;= 105
 *
 * 0 &lt;= grid[i][j] &lt;= 106
 *
 * 1 &lt;= k &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a BFS/DFS to find connected components.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/">LeetCode #3619</a>
 */
public class CountIslandsWithTotalValueDivisibleByK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Islands With Total Value Divisible by K");
    }

    public static void main(String[] args) {
        System.out.println("=== CountIslandsWithTotalValueDivisibleByK ===");
        CountIslandsWithTotalValueDivisibleByK sol = new CountIslandsWithTotalValueDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
