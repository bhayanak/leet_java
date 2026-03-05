package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #693: Binary Number with Alternating Bits
 * @see <a href="https://leetcode.com/problems/binary-number-with-alternating-bits/">Problem</a>
 */
public class BinaryNumberWithAlternatingBits {

    /**
     * Returns true if the integer has alternating bits (no two adjacent bits equal).
     * @param n the integer to check
     * @return true if bits alternate
     * <p><b>Explanation:</b> n XOR (n&gt;&gt;1) should be all-1s: check with (x &amp; (x+1)) == 0.</p>
     */
    public boolean solve(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }

    public static void main(String[] args) {
        BinaryNumberWithAlternatingBits sol = new BinaryNumberWithAlternatingBits();
        System.out.println(sol.solve(5));  // true  (101)
        System.out.println(sol.solve(7));  // false (111)
        System.out.println(sol.solve(10)); // true  (1010)
        System.out.println(sol.solve(11)); // false (1011)
    }

}
