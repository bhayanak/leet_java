package org.leetcode.medium;


/**
 * <b>#1219 - Path with Maximum Gold</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.
 *
 *
 * Return the maximum amount of gold you can collect under the conditions:
 *
 *
 * Every time you are located in a cell you will collect all the gold in that cell.
 *
 * From your position, you can walk one step to the left, right, up, or down.
 *
 * You can't visit the same cell more than once.
 *
 * Never visit a cell with 0 gold.
 *
 * You can start and stop collecting gold from any position in the grid that has some gold.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,6,0],[5,8,7],[0,9,0]]
 * Output: 24
 * Explanation:
 * [[0,6,0],
 *  [5,8,7],
 *  [0,9,0]]
 * Path to get the maximum gold, 9 -&gt; 8 -&gt; 7.
 *
 * Example 2:
 *
 * Input: grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
 * Output: 28
 * Explanation:
 * [[1,0,7],
 *  [2,0,6],
 *  [3,4,5],
 *  [0,3,0],
 *  [9,0,20]]
 * Path to get the maximum gold, 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 7.
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
 * 1 &lt;= m, n &lt;= 15
 *
 * 0 &lt;= grid[i][j] &lt;= 100
 *
 * There are at most 25 cells containing gold.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use recursion to try all such paths and find the one with the maximum value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Backtracking, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/path-with-maximum-gold/">LeetCode #1219</a>
 */
public class PathWithMaximumGold {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Path with Maximum Gold");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PathWithMaximumGold ===");
        PathWithMaximumGold sol = new PathWithMaximumGold();
        System.out.println(sol.solve(null));
    }
}
