package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** GcdOfOddAndEvenSums solution. */
public class GcdOfOddAndEvenSums {

    /**
     * Returns the GCD of the sum of odd-indexed elements and even-indexed elements.
     * @param nums input array (0-indexed)
     * @return GCD(evenSum, oddSum)
     * <p><b>Explanation:</b> Sum by index parity; apply Euclidean GCD algorithm.</p>
     */
    public int solve(int[] nums) {
        long evenSum = 0, oddSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) evenSum += nums[i];
            else oddSum += nums[i];
        }
        return (int) gcd(evenSum, oddSum);
    }

    private long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }

    public static void main(String[] args) {
        GcdOfOddAndEvenSums sol = new GcdOfOddAndEvenSums();
        System.out.println(sol.solve(new int[]{2, 4, 6, 8})); // gcd(8, 12) = 4
        System.out.println(sol.solve(new int[]{3, 3}));        // gcd(3, 3) = 3
    }

}
