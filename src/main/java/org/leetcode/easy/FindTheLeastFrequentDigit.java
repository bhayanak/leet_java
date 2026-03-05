package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindTheLeastFrequentDigit solution. */
public class FindTheLeastFrequentDigit {

    /**
     * Returns the least frequent digit in the decimal representation of n.
     * @param n positive integer
     * @return least frequent digit (smallest if tie)
     * <p><b>Explanation:</b> Count digit frequencies; return digit with minimum non-zero count.</p>
     */
    public int solve(int n) {
        int[] freq = new int[10];
        int tmp = Math.abs(n);
        while (tmp > 0) { freq[tmp % 10]++; tmp /= 10; }
        int minFreq = Integer.MAX_VALUE, result = 0;
        for (int d = 0; d <= 9; d++)
            if (freq[d] > 0 && freq[d] < minFreq) { minFreq = freq[d]; result = d; }
        return result;
    }

    public static void main(String[] args) {
        FindTheLeastFrequentDigit sol = new FindTheLeastFrequentDigit();
        System.out.println(sol.solve(3111));  // 3
        System.out.println(sol.solve(11211)); // 2
    }

}
