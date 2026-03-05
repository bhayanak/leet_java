package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CheckIfStringsCanBeMadeEqualWithOperationsI solution. */
public class CheckIfStringsCanBeMadeEqualWithOperationsI {

    /**
     * Returns true if s1 can be made equal to s2 by swapping chars at even or odd positions.
     * @param s1 first string (length 4)
     * @param s2 second string (length 4)
     * @return true if strings can be made equal via parity-preserving swaps
     * <p><b>Explanation:</b> Sort even-indexed and odd-indexed chars separately; compare.</p>
     */
    public boolean solve(String s1, String s2) {
        char[] e1 = {s1.charAt(0), s1.charAt(2)};
        char[] e2 = {s2.charAt(0), s2.charAt(2)};
        char[] o1 = {s1.charAt(1), s1.charAt(3)};
        char[] o2 = {s2.charAt(1), s2.charAt(3)};
        Arrays.sort(e1); Arrays.sort(e2);
        Arrays.sort(o1); Arrays.sort(o2);
        return Arrays.equals(e1, e2) && Arrays.equals(o1, o2);
    }

    public static void main(String[] args) {
        CheckIfStringsCanBeMadeEqualWithOperationsI sol = new CheckIfStringsCanBeMadeEqualWithOperationsI();
        System.out.println(sol.solve("abcd", "cdab")); // true
        System.out.println(sol.solve("abcd", "dacb")); // false
    }

}
