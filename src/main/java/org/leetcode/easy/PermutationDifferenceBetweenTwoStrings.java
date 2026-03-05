package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** PermutationDifferenceBetweenTwoStrings solution. */
public class PermutationDifferenceBetweenTwoStrings {

    /**
     * Returns the sum of |index_in_s(c) - index_in_t(c)| for all characters c.
     * s and t are permutations of the same characters.
     * @param s first permutation string
     * @param t second permutation string
     * @return sum of absolute index differences
     * <p><b>Explanation:</b> Build index maps for s and t; sum absolute differences per character.</p>
     */
    public int solve(String s, String t) {
        int[] idxS = new int[26], idxT = new int[26];
        for (int i = 0; i < s.length(); i++) idxS[s.charAt(i) - 'a'] = i;
        for (int i = 0; i < t.length(); i++) idxT[t.charAt(i) - 'a'] = i;
        int sum = 0;
        for (char c : s.toCharArray()) sum += Math.abs(idxS[c - 'a'] - idxT[c - 'a']);
        return sum;
    }

    public static void main(String[] args) {
        PermutationDifferenceBetweenTwoStrings sol = new PermutationDifferenceBetweenTwoStrings();
        System.out.println(sol.solve("abc", "bac")); // 2  (a:0vs1=1, b:1vs0=1, c:2vs2=0 → 2)
        System.out.println(sol.solve("abcd", "cbad")); // 4
    }

}
