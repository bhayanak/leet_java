package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** UglyNumber solution. */
public class UglyNumber {

    /**
     * Returns true if n is an ugly number (positive integer whose prime factors
     * are only 2, 3, and 5).
     * @param n integer
     * @return true if n is ugly
     * <p><b>Explanation:</b> Divide by 2, 3, 5 while possible; if result == 1, it's ugly.</p>
     */
    public boolean solve(int n) {
        if (n <= 0) return false;
        for (int f : new int[]{2, 3, 5})
            while (n % f == 0) n /= f;
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNumber sol = new UglyNumber();
        System.out.println(sol.solve(6));   // true  (2*3)
        System.out.println(sol.solve(1));   // true
        System.out.println(sol.solve(14));  // false (2*7)
    }

}
