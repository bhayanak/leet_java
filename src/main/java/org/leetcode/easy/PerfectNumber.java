package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #507: Perfect Number
 * @see <a href="https://leetcode.com/problems/perfect-number/">Problem</a>
 */
public class PerfectNumber {

    /**
     * Returns true if n is a perfect number (equals sum of proper divisors).
     * @param n positive integer
     * @return true if perfect
     * <p><b>Explanation:</b> Sum divisors up to sqrt(n); perfect numbers are 6,28,496,8128,33550336.</p>
     */
    public boolean solve(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; (long)i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        PerfectNumber sol = new PerfectNumber();
        System.out.println(sol.solve(28));  // true  (1+2+4+7+14=28)
        System.out.println(sol.solve(7));   // false
        System.out.println(sol.solve(6));   // true
    }

}
