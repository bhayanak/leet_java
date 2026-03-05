package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountResiduePrefixes solution. */
public class CountResiduePrefixes {

    /**
     * Counts the number of distinct prefix XOR values in the array.
     * @param nums input array
     * @return number of distinct prefix XOR values (including 0)
     * <p><b>Explanation:</b> Running XOR into a HashSet; set size is the answer.</p>
     */
    public int solve(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int prefix = 0;
        seen.add(0);
        for (int x : nums) { prefix ^= x; seen.add(prefix); }
        return seen.size();
    }

    public static void main(String[] args) {
        CountResiduePrefixes sol = new CountResiduePrefixes();
        System.out.println(sol.solve(new int[]{1, 2, 3})); // depends on xors
        System.out.println(sol.solve(new int[]{0, 0, 0})); // 2  (0, 0 → {0})? actually {0}=1
    }

}
