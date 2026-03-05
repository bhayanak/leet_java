package org.leetcode.medium;


/**
 * <b>#1536 - Minimum Swaps to Arrange a Binary Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an n x n binary grid, in one step you can choose two adjacent rows of the grid and swap them.
 *
 *
 * A grid is said to be valid if all the cells above the main diagonal are zeros.
 *
 *
 * Return the minimum number of steps needed to make the grid valid, or -1 if the grid cannot be valid.
 *
 *
 * The main diagonal of a grid is the diagonal that starts at cell (1, 1) and ends at cell (n, n).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,0,1],[1,1,0],[1,0,0]]
 * Output: 3
 *
 * Example 2:
 *
 * Input: grid = [[0,1,1,0],[0,1,1,0],[0,1,1,0],[0,1,1,0]]
 * Output: -1
 * Explanation: All rows are similar, swaps have no effect on the grid.
 *
 * Example 3:
 *
 * Input: grid = [[1,0,0],[1,1,0],[1,1,1]]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == grid[i].length
 *
 * 1 &lt;= n &lt;= 200
 *
 * grid[i][j] is either 0 or 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each row of the grid calculate the most right 1 in the grid in the array maxRight.
 * Hint 2: To check if there exist answer, sort maxRight and check if maxRight[i] ≤ i for all possible i's.
 * Hint 3: If there exist an answer, simulate the swaps.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/">LeetCode #1536</a>
 */
public class MinimumSwapsToArrangeABinaryGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Swaps to Arrange a Binary Grid");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumSwapsToArrangeABinaryGrid ===");
        MinimumSwapsToArrangeABinaryGrid sol = new MinimumSwapsToArrangeABinaryGrid();
        System.out.println(sol.solve(null));
    }
}
