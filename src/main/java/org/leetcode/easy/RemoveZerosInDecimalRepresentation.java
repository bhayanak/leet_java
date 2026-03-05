package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** RemoveZerosInDecimalRepresentation solution. */
public class RemoveZerosInDecimalRepresentation {

    /**
     * Removes all '0' digits from the decimal representation of n.
     * @param n non-negative integer
     * @return integer with all zeros removed from decimal digits
     * <p><b>Explanation:</b> Filter '0' chars from digit string; parse back to int.</p>
     */
    public int solve(int n) {
        String s = String.valueOf(n).replace("0", "");
        return s.isEmpty() ? 0 : Integer.parseInt(s);
    }

    public static void main(String[] args) {
        RemoveZerosInDecimalRepresentation sol = new RemoveZerosInDecimalRepresentation();
        System.out.println(sol.solve(1045));  // 145
        System.out.println(sol.solve(1000));  // 1
        System.out.println(sol.solve(100));   // 1
    }

}
