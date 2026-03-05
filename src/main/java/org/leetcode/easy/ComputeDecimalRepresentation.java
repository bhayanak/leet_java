package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ComputeDecimalRepresentation solution. */
public class ComputeDecimalRepresentation {

    /**
     * Returns the binary string representation of a positive integer.
     * @param n non-negative integer
     * @return binary string
     * <p><b>Explanation:</b> Use Integer.toBinaryString for O(log n) base-2 conversion.</p>
     */
    public String solve(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        ComputeDecimalRepresentation sol = new ComputeDecimalRepresentation();
        System.out.println(sol.solve(10)); // "1010"
        System.out.println(sol.solve(7));  // "111"
    }

}
