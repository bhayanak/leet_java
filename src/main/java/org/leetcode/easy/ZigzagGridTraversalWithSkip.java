package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ZigzagGridTraversalWithSkip solution. */
public class ZigzagGridTraversalWithSkip {

    /**
     * Traverses a 2D grid in zigzag order (left-to-right on even rows, right-to-left on odd rows),
     * skipping every alternate cell during traversal.
     * @param grid 2D integer grid
     * @return array of visited values in zigzag-skip order
     * <p><b>Explanation:</b> Traverse row by row reversing direction; collect every other cell.</p>
     */
    public int[] solve(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        boolean skip = false;
        for (int r = 0; r < grid.length; r++) {
            int[] row = grid[r];
            if (r % 2 == 1) {
                // reverse traversal
                for (int c = row.length - 1; c >= 0; c--) {
                    if (!skip) result.add(row[c]);
                    skip = !skip;
                }
            } else {
                for (int c = 0; c < row.length; c++) {
                    if (!skip) result.add(row[c]);
                    skip = !skip;
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        ZigzagGridTraversalWithSkip sol = new ZigzagGridTraversalWithSkip();
        System.out.println(Arrays.toString(sol.solve(new int[][]{{1,2},{3,4}}))); // [1,4] or similar
        System.out.println(Arrays.toString(sol.solve(new int[][]{{2,1},{2,1},{2,1}}))); // [2,1,2]
    }

}
