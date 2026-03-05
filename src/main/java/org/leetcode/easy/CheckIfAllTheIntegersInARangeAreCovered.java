package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CheckIfAllTheIntegersInARangeAreCovered solution. */
public class CheckIfAllTheIntegersInARangeAreCovered {

    /**
     * Returns true if every integer in [left, right] is covered by at least one range.
     * @param ranges list of [start, end] intervals
     * @param left left bound of the query
     * @param right right bound of the query
     * @return true if all integers in [left,right] are covered
     * <p><b>Explanation:</b> Mark covered positions in a boolean array; verify [left,right] fully covered.</p>
     */
    public boolean solve(int[][] ranges, int left, int right) {
        boolean[] covered = new boolean[52];
        for (int[] r : ranges)
            for (int i = r[0]; i <= r[1] && i <= 50; i++) covered[i] = true;
        for (int i = left; i <= right; i++) if (!covered[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        CheckIfAllTheIntegersInARangeAreCovered sol = new CheckIfAllTheIntegersInARangeAreCovered();
        System.out.println(sol.solve(new int[][]{{1,2},{3,4},{5,6}}, 2, 5)); // true
        System.out.println(sol.solve(new int[][]{{1,10},{10,20}}, 21, 21));  // false
    }

}
