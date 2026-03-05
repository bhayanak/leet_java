package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** PassThePillow solution. */
public class PassThePillow {

    /**
     * n people stand in a line; pillow passes forward then backward, time=1 per pass.
     * Returns who holds the pillow at second t.
     * @param n number of people (1-indexed)
     * @param time elapsed time in seconds
     * @return position (1-indexed) of pillow holder
     * <p><b>Explanation:</b> Period = 2*(n-1). Within each period: first half forward, second half backward.</p>
     */
    public int solve(int n, int time) {
        int period = 2 * (n - 1);
        int t = time % period;
        return t < n ? t + 1 : period - t + 1;
    }

    public static void main(String[] args) {
        PassThePillow sol = new PassThePillow();
        System.out.println(sol.solve(4, 5)); // 2
        System.out.println(sol.solve(3, 2)); // 3
    }

}
