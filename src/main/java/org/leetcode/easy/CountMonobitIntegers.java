package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountMonobitIntegers solution. */
public class CountMonobitIntegers {

    /**
     * Counts integers in [1..n] whose binary representation consists only of 1s
     * (i.e., numbers of the form 2^k - 1: 1, 3, 7, 15, ...).
     * @param n upper bound
     * @return count of such "monobit" integers
     * <p><b>Explanation:</b> Generate 2^k-1 sequence; count those ≤ n.</p>
     */
    public int solve(int n) {
        int count = 0;
        for (long x = 1; x <= n; x = x * 2 + 1) count++;
        return count;
    }

    public static void main(String[] args) {
        CountMonobitIntegers sol = new CountMonobitIntegers();
        System.out.println(sol.solve(5));  // 2  (1, 3)
        System.out.println(sol.solve(7));  // 3  (1, 3, 7)
        System.out.println(sol.solve(10)); // 3  (1, 3, 7)
    }

}
