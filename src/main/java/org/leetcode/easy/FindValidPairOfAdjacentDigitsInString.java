package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindValidPairOfAdjacentDigitsInString solution. */
public class FindValidPairOfAdjacentDigitsInString {

    /**
     * Finds the first pair of adjacent digits (s[i], s[i+1]) where they are distinct
     * and each appears exactly as many times as its own value.
     * @param s string of digits
     * @return two-character string of the valid pair, or ""
     * <p><b>Explanation:</b> Count digit frequencies; scan adjacent pairs for the validity condition.</p>
     */
    public String solve(String s) {
        int[] freq = new int[10];
        for (char c : s.toCharArray()) freq[c - '0']++;
        for (int i = 0; i < s.length() - 1; i++) {
            int a = s.charAt(i) - '0', b = s.charAt(i + 1) - '0';
            if (a != b && freq[a] == a && freq[b] == b)
                return "" + s.charAt(i) + s.charAt(i + 1);
        }
        return "";
    }

    public static void main(String[] args) {
        FindValidPairOfAdjacentDigitsInString sol = new FindValidPairOfAdjacentDigitsInString();
        System.out.println(sol.solve("2523533")); // "23"
        System.out.println(sol.solve("152")); // ""
    }

}
