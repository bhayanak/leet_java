package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ToggleLightBulbs solution. */
public class ToggleLightBulbs {

    /**
     * n bulbs start off. Round i toggles every i-th bulb (1-indexed).
     * After n rounds, a bulb is on iff its position is a perfect square.
     * @param n number of bulbs and rounds
     * @return array of 1s/0s: 1 if bulb is on
     * <p><b>Explanation:</b> Bulb i is on iff i has odd number of divisors iff i is a perfect square.</p>
     */
    public int[] solve(int n) {
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) result[i-1] = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        ToggleLightBulbs sol = new ToggleLightBulbs();
        System.out.println(Arrays.toString(sol.solve(5)));  // [1,0,0,1,0]  (1,4 are perfect squares)
        System.out.println(Arrays.toString(sol.solve(9)));  // [1,0,0,1,0,0,0,0,1]
    }

}
