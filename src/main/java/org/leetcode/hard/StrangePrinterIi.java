package org.leetcode.hard;


/**
 * <b>#1591 - Strange Printer II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Graph Theory, Topological Sort, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a strange printer with the following two special requirements:
 *
 *
 * On each turn, the printer will print a solid rectangular pattern of a single color on the grid. This will cover up the existing colors in the rectangle.
 *
 * Once the printer has used a color for the above operation, the same color cannot be used again.
 *
 * You are given a m x n matrix targetGrid, where targetGrid[row][col] is the color in the position (row, col) of the grid.
 *
 *
 * Return true if it is possible to print the matrix targetGrid, otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: targetGrid = [[1,1,1,1],[1,2,2,1],[1,2,2,1],[1,1,1,1]]
 * Output: true
 *
 * Example 2:
 *
 * Input: targetGrid = [[1,1,1,1],[1,1,3,3],[1,1,3,4],[5,5,1,4]]
 * Output: true
 *
 * Example 3:
 *
 * Input: targetGrid = [[1,2,1],[2,1,2],[1,2,1]]
 * Output: false
 * Explanation: It is impossible to form targetGrid because it is not allowed to print the same color in different turns.
 *
 *
 *
 * Constraints:
 *
 *
 * m == targetGrid.length
 *
 * n == targetGrid[i].length
 *
 * 1 &lt;= m, n &lt;= 60
 *
 * 1 &lt;= targetGrid[row][col] &lt;= 60
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try thinking in reverse. Given the grid, how can you tell if a colour was painted last?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Graph Theory, Topological Sort, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/strange-printer-ii/">LeetCode #1591</a>
 */
public class StrangePrinterIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Strange Printer II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== StrangePrinterIi ===");
        StrangePrinterIi sol = new StrangePrinterIi();
        System.out.println(sol.solve(null));
    }
}
