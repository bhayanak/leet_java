package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumDeletionsForAtMostKDistinctCharacters solution. */
public class MinimumDeletionsForAtMostKDistinctCharacters {

    /**
     * Returns the minimum deletions needed to ensure the string has at most k distinct characters.
     * @param s input string
     * @param k maximum number of distinct characters allowed
     * @return minimum number of deletions
     * <p><b>Explanation:</b> Count frequencies; sort ascending; delete entire groups of least frequent chars.</p>
     */
    public int solve(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        int[] pos = Arrays.stream(freq).filter(f -> f > 0).sorted().toArray();
        int distinct = pos.length, del = 0;
        for (int i = 0; distinct - i > k; i++) del += pos[i];
        return del;
    }

    public static void main(String[] args) {
        MinimumDeletionsForAtMostKDistinctCharacters sol = new MinimumDeletionsForAtMostKDistinctCharacters();
        System.out.println(sol.solve("aabcde", 3)); // 2 (remove c and d or similar)
        System.out.println(sol.solve("aab", 1));    // 1
    }

}
