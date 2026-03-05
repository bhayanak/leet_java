package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** EarliestTimeToFinishOneTask solution. */
public class EarliestTimeToFinishOneTask {

    /**
     * Finds the earliest start hour where `required` consecutive available hours exist.
     * @param hours array where 1 = available, 0 = busy
     * @param required number of consecutive hours needed
     * @return earliest start index, or -1 if impossible
     * <p><b>Explanation:</b> Sliding window of size `required`; return first window of all-1s.</p>
     */
    public int solve(int[] hours, int required) {
        for (int start = 0; start + required <= hours.length; start++) {
            boolean ok = true;
            for (int j = start; j < start + required; j++)
                if (hours[j] == 0) { ok = false; break; }
            if (ok) return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        EarliestTimeToFinishOneTask sol = new EarliestTimeToFinishOneTask();
        System.out.println(sol.solve(new int[]{0, 1, 1, 1, 0}, 3)); // 1
        System.out.println(sol.solve(new int[]{1, 0, 1, 0, 1}, 2)); // -1
    }

}
