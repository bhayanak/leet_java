package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CheckDivisibilityByDigitSumAndProduct solution. */
public class CheckDivisibilityByDigitSumAndProduct {

    /**
     * Returns true if n is divisible by both its digit sum and digit product.
     * @param n positive integer
     * @return true if divisible by digit sum AND digit product
     * <p><b>Explanation:</b> Extract digits; compute sum and product; check divisibility.</p>
     */
    public boolean solve(int n) {
        int sum = 0, product = 1, tmp = n;
        while (tmp > 0) {
            int d = tmp % 10;
            if (d == 0) return false; // digit product 0 means not divisible
            sum += d; product *= d; tmp /= 10;
        }
        return n % sum == 0 && n % product == 0;
    }

    public static void main(String[] args) {
        CheckDivisibilityByDigitSumAndProduct sol = new CheckDivisibilityByDigitSumAndProduct();
        System.out.println(sol.solve(12)); // true  (12%3==0 && 12%2==0)
        System.out.println(sol.solve(15)); // false (15%6!=0)
    }

}
