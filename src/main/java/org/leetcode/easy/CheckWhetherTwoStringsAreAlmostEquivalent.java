package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CheckWhetherTwoStringsAreAlmostEquivalent solution. */
public class CheckWhetherTwoStringsAreAlmostEquivalent {

    /**
     * Returns true if the two words are "almost equivalent": frequency of each
     * character differs by at most 3.
     * @param word1 first word
     * @param word2 second word
     * @return true if almost equivalent
     * <p><b>Explanation:</b> Use a frequency delta array; if any delta &gt; 3, return false.</p>
     */
    public boolean solve(String word1, String word2) {
        int[] freq = new int[26];
        for (char c : word1.toCharArray()) freq[c - 'a']++;
        for (char c : word2.toCharArray()) freq[c - 'a']--;
        for (int f : freq) if (Math.abs(f) > 3) return false;
        return true;
    }

    public static void main(String[] args) {
        CheckWhetherTwoStringsAreAlmostEquivalent sol = new CheckWhetherTwoStringsAreAlmostEquivalent();
        System.out.println(sol.solve("aaaa", "bccb"));    // false
        System.out.println(sol.solve("abcdeef", "abaaacc")); // true
    }

}
