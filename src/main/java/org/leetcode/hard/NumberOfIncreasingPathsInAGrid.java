package org.leetcode.hard;


/**
 * <b>#2328 - Number of Increasing Paths in a Grid</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort, Memoization, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix grid, where you can move from a cell to any adjacent cell in all 4 directions.
 *
 *
 * Return the number of strictly increasing paths in the grid such that you can start from any cell and end at any cell. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * Two paths are considered different if they do not have exactly the same sequence of visited cells.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,1],[3,4]]
 * Output: 8
 * Explanation: The strictly increasing paths are:
 * - Paths with length 1: [1], [1], [3], [4].
 * - Paths with length 2: [1 -&gt; 3], [1 -&gt; 4], [3 -&gt; 4].
 * - Paths with length 3: [1 -&gt; 3 -&gt; 4].
 * The total number of paths is 4 + 3 + 1 = 8.
 *
 * Example 2:
 *
 * Input: grid = [[1],[2]]
 * Output: 3
 * Explanation: The strictly increasing paths are:
 * - Paths with length 1: [1], [2].
 * - Paths with length 2: [1 -&gt; 2].
 * The total number of paths is 2 + 1 = 3.
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
 * 1 &lt;= grid[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can you calculate the number of increasing paths that start from a cell (i, j)? Think about dynamic programming.
 * Hint 2: Define f(i, j) as the number of increasing paths starting from cell (i, j). Try to find how f(i, j) is related to each of f(i, j+1), f(i, j-1), f(i+1, j) and f(i-1, j).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort, Memoization, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/">LeetCode #2328</a>
 */
public class NumberOfIncreasingPathsInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Increasing Paths in a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfIncreasingPathsInAGrid ===");
        NumberOfIncreasingPathsInAGrid sol = new NumberOfIncreasingPathsInAGrid();
        System.out.println(sol.solve(null));
    }
}
