package org.leetcode.medium;


/**
 * <b>#2850 - Minimum Moves to Spread Stones Over Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Backtracking, Bit Manipulation, Matrix, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D integer matrix grid of size 3 * 3, representing the number of stones in each cell. The grid contains exactly 9 stones, and there can be multiple stones in a single cell.
 *
 *
 * In one move, you can move a single stone from its current cell to any other cell if the two cells share a side.
 *
 *
 * Return the minimum number of moves required to place one stone in each cell.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,1,0],[1,1,1],[1,2,1]]
 * Output: 3
 * Explanation: One possible sequence of moves to place one stone in each cell is: 
 * 1- Move one stone from cell (2,1) to cell (2,2).
 * 2- Move one stone from cell (2,2) to cell (1,2).
 * 3- Move one stone from cell (1,2) to cell (0,2).
 * In total, it takes 3 moves to place one stone in each cell of the grid.
 * It can be shown that 3 is the minimum number of moves required to place one stone in each cell.
 *
 * Example 2:
 *
 * Input: grid = [[1,3,0],[1,0,0],[1,0,3]]
 * Output: 4
 * Explanation: One possible sequence of moves to place one stone in each cell is:
 * 1- Move one stone from cell (0,1) to cell (0,2).
 * 2- Move one stone from cell (0,1) to cell (1,1).
 * 3- Move one stone from cell (2,2) to cell (1,2).
 * 4- Move one stone from cell (2,2) to cell (2,1).
 * In total, it takes 4 moves to place one stone in each cell of the grid.
 * It can be shown that 4 is the minimum number of moves required to place one stone in each cell.
 *
 *
 *
 * Constraints:
 *
 *
 * grid.length == grid[i].length == 3
 *
 * 0 &lt;= grid[i][j] &lt;= 9
 *
 * Sum of grid is equal to 9.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are at most <code>4</code> cells with more than one stone.
 * Hint 2: Let <code>a</code> be the number of cells containing more than one stone, and <code>b</code> be the number of cells containing no stones. <code></code>. <code>b^a ≤ 6561</code>. Use this fact to come up with a bruteforce.
 * Hint 3: For all empty cells, bruteforce over all possible cells from which a stone can come. Note that a stone will always come from a cell containing at least 2 stones.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Backtracking, Bit Manipulation, Matrix, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-spread-stones-over-grid/">LeetCode #2850</a>
 */
public class MinimumMovesToSpreadStonesOverGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Moves to Spread Stones Over Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumMovesToSpreadStonesOverGrid ===");
        MinimumMovesToSpreadStonesOverGrid sol = new MinimumMovesToSpreadStonesOverGrid();
        System.out.println(sol.solve(null));
    }
}
