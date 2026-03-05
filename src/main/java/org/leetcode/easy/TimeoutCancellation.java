package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** TimeoutCancellation solution. */
public class TimeoutCancellation {

    /**
     * Java equivalent of JS setTimeout + cancel: returns whether fn was called.
     * If cancelTime &lt; delay, fn is NOT called (returns 0).
     * Otherwise fn is called (returns 1).
     * <p>Fn fires if and only if delay &lt;= cancelTime.</p>
     * @param delay      when fn fires (ms)
     * @param cancelTime when cancel is called (ms)
     * @return 1 if fn was called, 0 if cancelled before firing
     */
    public int solve(int delay, int cancelTime) {
        return delay <= cancelTime ? 1 : 0;
    }

    public static void main(String[] args) {
        TimeoutCancellation sol = new TimeoutCancellation();
        System.out.println(sol.solve(100, 50));  // 0  (cancelled before fn fires)
        System.out.println(sol.solve(50, 100));  // 1  (fn fires before cancel)
        System.out.println(sol.solve(50, 50));   // 1  (fires at exactly cancelTime)
    }

}
