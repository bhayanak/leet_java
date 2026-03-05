package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountDaysSpentTogether solution. */
public class CountDaysSpentTogether {

    /**
     * Counts the number of days Alice and Bob spend together (overlap of date ranges).
     * @param arriveAlice Alice arrival "MM-DD"
     * @param leaveAlice  Alice departure "MM-DD"
     * @param arriveBob   Bob arrival "MM-DD"
     * @param leaveBob    Bob departure "MM-DD"
     * @return number of overlapping days
     * <p><b>Explanation:</b> Convert dates to day-of-year; overlap = max(0, min(leave)-max(arrive)+1).</p>
     */
    public int solve(String arriveAlice, String leaveAlice,
                     String arriveBob, String leaveBob) {
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        java.util.function.ToIntFunction<String> toDay = s -> {
            int m = Integer.parseInt(s.substring(0, 2));
            int d = Integer.parseInt(s.substring(3, 5));
            int tot = 0;
            for (int i = 1; i < m; i++) tot += daysInMonth[i];
            return tot + d;
        };
        int start = Math.max(toDay.applyAsInt(arriveAlice), toDay.applyAsInt(arriveBob));
        int end   = Math.min(toDay.applyAsInt(leaveAlice),  toDay.applyAsInt(leaveBob));
        return Math.max(0, end - start + 1);
    }

    public static void main(String[] args) {
        CountDaysSpentTogether sol = new CountDaysSpentTogether();
        System.out.println(sol.solve("08-15","08-18","08-16","08-19")); // 3
        System.out.println(sol.solve("10-01","10-31","11-01","12-31")); // 0
    }

}
