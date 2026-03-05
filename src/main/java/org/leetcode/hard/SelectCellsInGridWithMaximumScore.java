package org.leetcode.hard;


/**
 * <b>#3276 - Select Cells in Grid With Maximum Score</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Matrix, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D matrix grid consisting of positive integers.
 *
 *
 * You have to select one or more cells from the matrix such that the following conditions are satisfied:
 *
 *
 * No two selected cells are in the same row of the matrix.
 *
 * The values in the set of selected cells are unique.
 *
 * Your score will be the sum of the values of the selected cells.
 *
 *
 * Return the maximum score you can achieve.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2,3],[4,3,2],[1,1,1]]
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 * We can select the cells with values 1, 3, and 4 that are colored above.
 *
 * Example 2:
 *
 * Input: grid = [[8,7,6],[8,3,2]]
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 * We can select the cells with values 7 and 8 that are colored above.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= grid.length, grid[i].length &lt;= 10
 *
 * 1 &lt;= grid[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort all the cells in the grid by their values and keep track of their original positions.
 * Hint 2: Try dynamic programming with the following states: the current cell that we might select and a bitmask representing all the rows from which we have already selected a cell so far.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Matrix, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/select-cells-in-grid-with-maximum-score/">LeetCode #3276</a>
 */
public class SelectCellsInGridWithMaximumScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Select Cells in Grid With Maximum Score");
    }

    public static void main(String[] args) {
        System.out.println("=== SelectCellsInGridWithMaximumScore ===");
        SelectCellsInGridWithMaximumScore sol = new SelectCellsInGridWithMaximumScore();
        System.out.println(sol.solve(null));
    }
}
