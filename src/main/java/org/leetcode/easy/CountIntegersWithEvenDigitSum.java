package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountIntegersWithEvenDigitSum solution. */
public class CountIntegersWithEvenDigitSum {

    /**
     * Counts integers in [1..num] whose digit sum is even.
     * @param num upper bound (inclusive)
     * @return count of integers with even digit sum
     * <p><b>Explanation:</b> Iterate 1..num; compute digit sum; roughly half qualify.</p>
     */
    public int solve(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int s = 0, tmp = i;
            while (tmp > 0) { s += tmp % 10; tmp /= 10; }
            if (s % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountIntegersWithEvenDigitSum sol = new CountIntegersWithEvenDigitSum();
        System.out.println(sol.solve(4));  // 2  (2, 4)
        System.out.println(sol.solve(30)); // 14
    }

}
