package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** IntervalCancellation solution. */
public class IntervalCancellation {

    /**
     * Java equivalent of JS setInterval + cancel: counts how many times fn fires
     * in the interval [0, cancelTime] with period delay.
     * @param delay      period between fires (ms)
     * @param cancelTime time at which interval is cancelled (ms)
     * @return number of times the function fires
     * <p><b>Explanation:</b> fires at t=0, delay, 2*delay, ... up to cancelTime: floor(t/delay)+1 invocations.</p>
     */
    public int solve(int delay, int cancelTime) {
        if (cancelTime < 0) return 0;
        return cancelTime / delay + 1;
    }

    public static void main(String[] args) {
        IntervalCancellation sol = new IntervalCancellation();
        System.out.println(sol.solve(2, 20)); // 11  (0,2,4,...,20)
        System.out.println(sol.solve(5, 15)); // 4   (0,5,10,15)
    }

}
