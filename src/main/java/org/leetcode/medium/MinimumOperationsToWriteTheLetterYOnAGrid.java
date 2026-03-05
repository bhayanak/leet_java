package org.leetcode.medium;


/**
 * <b>#3071 - Minimum Operations to Write the Letter Y on a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed n x n grid where n is odd, and grid[r][c] is 0, 1, or 2.
 *
 *
 * We say that a cell belongs to the Letter Y if it belongs to one of the following:
 *
 *
 * The diagonal starting at the top-left cell and ending at the center cell of the grid.
 *
 * The diagonal starting at the top-right cell and ending at the center cell of the grid.
 *
 * The vertical line starting at the center cell and ending at the bottom border of the grid.
 *
 * The Letter Y is written on the grid if and only if:
 *
 *
 * All values at cells belonging to the Y are equal.
 *
 * All values at cells not belonging to the Y are equal.
 *
 * The values at cells belonging to the Y are different from the values at cells not belonging to the Y.
 *
 * Return the minimum number of operations needed to write the letter Y on the grid given that in one operation you can change the value at any cell to 0, 1, or 2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2,2],[1,1,0],[0,1,0]]
 * Output: 3
 * Explanation: We can write Y on the grid by applying the changes highlighted in blue in the image above. After the operations, all cells that belong to Y, denoted in bold, have the same value of 1 while those that do not belong to Y are equal to 0.
 * It can be shown that 3 is the minimum number of operations needed to write Y on the grid.
 *
 * Example 2:
 *
 * Input: grid = [[0,1,0,1,0],[2,1,0,1,2],[2,2,2,0,1],[2,2,2,2,2],[2,1,2,2,2]]
 * Output: 12
 * Explanation: We can write Y on the grid by applying the changes highlighted in blue in the image above. After the operations, all cells that belong to Y, denoted in bold, have the same value of 0 while those that do not belong to Y are equal to 2. 
 * It can be shown that 12 is the minimum number of operations needed to write Y on the grid.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 49 
 *
 * n == grid.length == grid[i].length
 *
 * 0 &lt;= grid[i][j] &lt;= 2
 *
 * n is odd.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-write-the-letter-y-on-a-grid/">LeetCode #3071</a>
 */
public class MinimumOperationsToWriteTheLetterYOnAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Write the Letter Y on a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToWriteTheLetterYOnAGrid ===");
        MinimumOperationsToWriteTheLetterYOnAGrid sol = new MinimumOperationsToWriteTheLetterYOnAGrid();
        System.out.println(sol.solve(null));
    }
}
