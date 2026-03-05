package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MakeASquareWithTheSameColor solution. */
public class MakeASquareWithTheSameColor {

    /**
     * Returns true if you can make a 3x3 square of same color by changing at most one cell.
     * The grid is encoded as a flat array of 9 elements (0 = white, 1 = black).
     * @param grid 3x3 grid flattened (row-major)
     * @return true if achievable
     * <p><b>Explanation:</b> Count black and white cells; if either &gt;= 8, one change suffices.</p>
     */
    public boolean solve(int[] grid) {
        int black = 0;
        for (int x : grid) if (x == 1) black++;
        return black >= 8 || (9 - black) >= 8;
    }

    public static void main(String[] args) {
        MakeASquareWithTheSameColor sol = new MakeASquareWithTheSameColor();
        System.out.println(sol.solve(new int[]{0,0,0, 0,1,0, 0,0,0})); // true (1 black, change to white)
        System.out.println(sol.solve(new int[]{0,1,1, 0,1,1, 0,1,1})); // false (balance 3/6)
    }

}
