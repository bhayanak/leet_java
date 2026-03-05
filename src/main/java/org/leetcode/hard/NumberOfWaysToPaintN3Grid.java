package org.leetcode.hard;


/**
 * <b>#1411 - Number of Ways to Paint N × 3 Grid</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a grid of size n x 3 and you want to paint each cell of the grid with exactly one of the three colors: Red, Yellow, or Green while making sure that no two adjacent cells have the same color (i.e., no two cells that share vertical or horizontal sides have the same color).
 *
 *
 * Given n the number of rows of the grid, return the number of ways you can paint this grid. As the answer may grow large, the answer must be computed modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 12
 * Explanation: There are 12 possible way to paint the grid as shown.
 *
 * Example 2:
 *
 * Input: n = 5000
 * Output: 30228214
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length
 *
 * 1 &lt;= n &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We will use Dynamic programming approach. we will try all possible configuration.
 * Hint 2: Let dp[idx][prev1col][prev2col][prev3col] be the number of ways to color the rows of the grid from idx to n-1 keeping in mind that the previous row (idx - 1) has colors prev1col, prev2col and prev3col. Build the dp array to get the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/">LeetCode #1411</a>
 */
public class NumberOfWaysToPaintN3Grid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Paint N × 3 Grid");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToPaintN3Grid ===");
        NumberOfWaysToPaintN3Grid sol = new NumberOfWaysToPaintN3Grid();
        System.out.println(sol.solve(null));
    }
}
