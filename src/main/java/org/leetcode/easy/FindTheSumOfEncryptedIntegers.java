package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindTheSumOfEncryptedIntegers solution. */
public class FindTheSumOfEncryptedIntegers {

    /**
     * Replaces each digit of every number with its maximum digit, then returns the total sum.
     * @param nums array of positive integers
     * @return sum of encrypted integers
     * <p><b>Explanation:</b> For each number: find max digit, build number with all digits = max, accumulate.</p>
     */
    public int solve(int[] nums) {
        int total = 0;
        for (int x : nums) {
            int maxDigit = 0, digits = 0, tmp = x;
            while (tmp > 0) { maxDigit = Math.max(maxDigit, tmp % 10); digits++; tmp /= 10; }
            int encrypted = 0;
            for (int i = 0; i < digits; i++) encrypted = encrypted * 10 + maxDigit;
            total += encrypted;
        }
        return total;
    }

    public static void main(String[] args) {
        FindTheSumOfEncryptedIntegers sol = new FindTheSumOfEncryptedIntegers();
        System.out.println(sol.solve(new int[]{1,2,3}));    // 6  (1+2+3)
        System.out.println(sol.solve(new int[]{10,21,31})); // 66 (11+22+33)
    }

}
