package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FlipSquareSubmatrixVertically solution. */
public class FlipSquareSubmatrixVertically {

    /**
     * Counts the maximum number of 1s achievable by choosing one square sub-matrix
     * and flipping it vertically (reversing its rows). Returns the count of 1s.
     * @param grid binary matrix
     * @param k    side length of the square to flip
     * @return maximum count of 1s after one optional flip
     * <p><b>Explanation:</b> Try all possible top-left corners; flip rows, count 1s, keep maximum.</p>
     */
    public int solve(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int baseCount = 0;
        for (int[] r : grid) for (int x : r) baseCount += x;

        int best = baseCount;
        for (int r = 0; r + k <= m; r++) {
            for (int c = 0; c + k <= n; c++) {
                // Count delta from flipping this sub-matrix vertically
                int delta = 0;
                for (int i = 0; i < k / 2; i++) {
                    for (int j = c; j < c + k; j++) {
                        // Swap rows r+i and r+k-1-i within columns c..c+k-1
                        int top = grid[r + i][j], bot = grid[r + k - 1 - i][j];
                        if (top != bot) delta += 0; // no net change for this pair
                    }
                }
                best = Math.max(best, baseCount + delta);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        FlipSquareSubmatrixVertically sol = new FlipSquareSubmatrixVertically();
        System.out.println(sol.solve(new int[][]{{0,1},{1,0}}, 1)); // 2
    }

}
