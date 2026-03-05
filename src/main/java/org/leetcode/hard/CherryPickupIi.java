package org.leetcode.hard;


/**
 * <b>#1463 - Cherry Pickup II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.
 *
 *
 * You have two robots that can collect cherries for you:
 *
 *
 * Robot #1 is located at the top-left corner (0, 0), and
 *
 * Robot #2 is located at the top-right corner (0, cols - 1).
 *
 * Return the maximum number of cherries collection using both robots by following the rules below:
 *
 *
 * From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
 *
 * When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
 *
 * When both robots stay in the same cell, only one takes the cherries.
 *
 * Both robots cannot move outside of the grid at any moment.
 *
 * Both robots should reach the bottom row in grid.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
 * Output: 24
 * Explanation: Path of robot #1 and #2 are described in color green and blue respectively.
 * Cherries taken by Robot #1, (3 + 2 + 5 + 2) = 12.
 * Cherries taken by Robot #2, (1 + 5 + 5 + 1) = 12.
 * Total of cherries: 12 + 12 = 24.
 *
 * Example 2:
 *
 * Input: grid = [[1,0,0,0,0,0,1],[2,0,0,0,0,3,0],[2,0,9,0,0,0,0],[0,3,0,5,4,0,0],[1,0,2,3,0,0,6]]
 * Output: 28
 * Explanation: Path of robot #1 and #2 are described in color green and blue respectively.
 * Cherries taken by Robot #1, (1 + 9 + 5 + 2) = 17.
 * Cherries taken by Robot #2, (1 + 3 + 4 + 3) = 11.
 * Total of cherries: 17 + 11 = 28.
 *
 *
 *
 * Constraints:
 *
 *
 * rows == grid.length
 *
 * cols == grid[i].length
 *
 * 2 &lt;= rows, cols &lt;= 70
 *
 * 0 &lt;= grid[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming, define DP[i][j][k]: The maximum cherries that both robots can take  starting on the ith row, and column j and k of Robot 1 and 2 respectively.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/cherry-pickup-ii/">LeetCode #1463</a>
 */
public class CherryPickupIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Cherry Pickup II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CherryPickupIi ===");
        CherryPickupIi sol = new CherryPickupIi();
        System.out.println(sol.solve(null));
    }
}
