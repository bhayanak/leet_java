package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** AntOnTheBoundary solution. */
public class AntOnTheBoundary {

    /**
     * Counts how many times the prefix sum returns to 0 (ant back at boundary).
     * @param nums array of +1/-1 representing directions
     * @return number of times the ant returns to the origin
     * <p><b>Explanation:</b> Running prefix sum: each time it hits 0, ant is at boundary.</p>
     */
    public int solve(int[] nums) {
        int count = 0, prefix = 0;
        for (int x : nums) {
            prefix += x;
            if (prefix == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        AntOnTheBoundary sol = new AntOnTheBoundary();
        System.out.println(sol.solve(new int[]{2, 3, -5}));     // 1
        System.out.println(sol.solve(new int[]{3, 2, -3, -4})); // 0
    }

}
