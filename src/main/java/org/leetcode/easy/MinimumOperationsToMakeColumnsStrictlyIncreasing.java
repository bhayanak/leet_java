package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumOperationsToMakeColumnsStrictlyIncreasing solution. */
public class MinimumOperationsToMakeColumnsStrictlyIncreasing {

    /**
     * Returns the minimum number of increments to make each column strictly increasing.
     * @param grid the 2D grid encoded as a flat array (row-major), with cols derived from row equality
     * @return total number of increment operations
     * <p><b>Explanation:</b> For each column: if grid[r][c] &lt;= grid[r-1][c], add (grid[r-1][c]+1 - grid[r][c]) to ops.</p>
     */
    public int solve(int[][] grid) {
        int ops = 0, rows = grid.length, cols = grid[0].length;
        for (int c = 0; c < cols; c++)
            for (int r = 1; r < rows; r++)
                if (grid[r][c] <= grid[r-1][c]) {
                    ops += grid[r-1][c] + 1 - grid[r][c];
                    grid[r][c] = grid[r-1][c] + 1;
                }
        return ops;
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeColumnsStrictlyIncreasing sol = new MinimumOperationsToMakeColumnsStrictlyIncreasing();
        System.out.println(sol.solve(new int[][]{{3,2},{1,3},{3,4},{0,1}})); // 15
        System.out.println(sol.solve(new int[][]{{3,2,1},{2,1,0},{1,2,3}})); // 12
    }

}
