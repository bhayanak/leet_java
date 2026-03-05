package org.leetcode.medium;


/**
 * <b>#2257 - Count Unguarded Cells in the Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers m and n representing a 0-indexed m x n grid. You are also given two 2D integer arrays guards and walls where guards[i] = [rowi, coli] and walls[j] = [rowj, colj] represent the positions of the ith guard and jth wall respectively.
 *
 *
 * A guard can see every cell in the four cardinal directions (north, east, south, or west) starting from their position unless obstructed by a wall or another guard. A cell is guarded if there is at least one guard that can see it.
 *
 *
 * Return the number of unoccupied cells that are not guarded.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: m = 4, n = 6, guards = [[0,0],[1,1],[2,3]], walls = [[0,1],[2,2],[1,4]]
 * Output: 7
 * Explanation: The guarded and unguarded cells are shown in red and green respectively in the above diagram.
 * There are a total of 7 unguarded cells, so we return 7.
 *
 * Example 2:
 *
 * Input: m = 3, n = 3, guards = [[1,1]], walls = [[0,1],[1,0],[2,1],[1,2]]
 * Output: 4
 * Explanation: The unguarded cells are shown in green in the above diagram.
 * There are a total of 4 unguarded cells, so we return 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m, n &lt;= 105
 *
 * 2 &lt;= m * n &lt;= 105
 *
 * 1 &lt;= guards.length, walls.length &lt;= 5 * 104
 *
 * 2 &lt;= guards.length + walls.length &lt;= m * n
 *
 * guards[i].length == walls[j].length == 2
 *
 * 0 &lt;= rowi, rowj &lt; m
 *
 * 0 &lt;= coli, colj &lt; n
 *
 * All the positions in guards and walls are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a 2D array to represent the grid. Can you mark the tiles that can be seen by a guard?
 * Hint 2: Iterate over the guards, and for each of the 4 directions, advance the current tile and mark the tile. When should you stop advancing?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/count-unguarded-cells-in-the-grid/">LeetCode #2257</a>
 */
public class CountUnguardedCellsInTheGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Unguarded Cells in the Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== CountUnguardedCellsInTheGrid ===");
        CountUnguardedCellsInTheGrid sol = new CountUnguardedCellsInTheGrid();
        System.out.println(sol.solve(null));
    }
}
