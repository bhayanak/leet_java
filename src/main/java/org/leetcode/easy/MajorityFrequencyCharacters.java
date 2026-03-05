package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MajorityFrequencyCharacters solution. */
public class MajorityFrequencyCharacters {

    /**
     * Returns all characters whose frequency is strictly greater than half the string length.
     * @param s input string
     * @return string of majority-frequency characters (in any order), or ""
     * <p><b>Explanation:</b> Frequency map; filter chars where count &gt; s.length()/2.</p>
     */
    public String solve(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++)
            if (freq[i] * 2 > s.length()) sb.append((char)('a' + i));
        return sb.toString();
    }

    public static void main(String[] args) {
        MajorityFrequencyCharacters sol = new MajorityFrequencyCharacters();
        System.out.println(sol.solve("aab"));   // "a"
        System.out.println(sol.solve("abcde")); // ""
    }

}
