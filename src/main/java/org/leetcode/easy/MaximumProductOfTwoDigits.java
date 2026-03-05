package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MaximumProductOfTwoDigits solution. */
public class MaximumProductOfTwoDigits {

    /**
     * Returns the maximum product of any two digits of n.
     * @param n positive integer
     * @return maximum product of two digits
     * <p><b>Explanation:</b> Extract digits, sort descending, return product of top two.</p>
     */
    public int solve(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) { digits.add(n % 10); n /= 10; }
        digits.sort(Collections.reverseOrder());
        return digits.get(0) * digits.get(1);
    }

    public static void main(String[] args) {
        MaximumProductOfTwoDigits sol = new MaximumProductOfTwoDigits();
        System.out.println(sol.solve(31));   // 3
        System.out.println(sol.solve(22));   // 4
        System.out.println(sol.solve(124));  // 8 (2*4)
    }

}
