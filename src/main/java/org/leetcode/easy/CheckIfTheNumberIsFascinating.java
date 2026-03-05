package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CheckIfTheNumberIsFascinating solution. */
public class CheckIfTheNumberIsFascinating {

    /**
     * Returns true if n is a "fascinating" number: concatenation of n, 2n, 3n
     * contains exactly each digit 1-9 once.
     * @param n the number to check
     * @return true if fascinating
     * <p><b>Explanation:</b> Concatenate n+2n+3n; verify exactly 9 chars with each digit 1-9 once.</p>
     */
    public boolean solve(int n) {
        String s = "" + n + (2 * n) + (3 * n);
        if (s.length() != 9) return false;
        int[] seen = new int[10];
        for (char c : s.toCharArray()) seen[c - '0']++;
        if (seen[0] != 0) return false;
        for (int i = 1; i <= 9; i++) if (seen[i] != 1) return false;
        return true;
    }

    public static void main(String[] args) {
        CheckIfTheNumberIsFascinating sol = new CheckIfTheNumberIsFascinating();
        System.out.println(sol.solve(192)); // true  ("192384576")
        System.out.println(sol.solve(100)); // false
    }

}
