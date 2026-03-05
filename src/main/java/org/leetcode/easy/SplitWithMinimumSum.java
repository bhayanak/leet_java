package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** SplitWithMinimumSum solution. */
public class SplitWithMinimumSum {

    /**
     * Splits the digits of n into two numbers num1 and num2 such that num1 + num2 is minimized.
     * @param n positive integer
     * @return minimum sum of the two numbers
     * <p><b>Explanation:</b> Distribute sorted digits alternately to minimise leading significance.</p>
     */
    public int solve(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        long num1 = 0, num2 = 0;
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) num1 = num1 * 10 + (digits[i] - '0');
            else num2 = num2 * 10 + (digits[i] - '0');
        }
        return (int)(num1 + num2);
    }

    public static void main(String[] args) {
        SplitWithMinimumSum sol = new SplitWithMinimumSum();
        System.out.println(sol.solve(4325)); // min(43+25, 42+35, ...) → 59 (2,4→num1: 24; 3,5→num2: 35 → 59)
        System.out.println(sol.solve(687));  // digits 6,7,8 sorted: 6,7,8 → 68+7=75? no: i=0→num1=6, i=1→num2=7, i=2→num1=68 → 68+7=75
    }

}
