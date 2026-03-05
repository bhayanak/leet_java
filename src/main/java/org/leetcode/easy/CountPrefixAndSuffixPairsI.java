package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountPrefixAndSuffixPairsI solution. */
public class CountPrefixAndSuffixPairsI {

    /**
     * Counts pairs (i, j) where i &lt; j and words[i] is both a prefix and suffix of words[j].
     * @param words array of strings
     * @return count of valid (i, j) pairs
     * <p><b>Explanation:</b> Brute-force O(n²): for each pair check startsWith and endsWith.</p>
     */
    public int solve(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++)
            for (int j = i + 1; j < words.length; j++)
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i]))
                    count++;
        return count;
    }

    public static void main(String[] args) {
        CountPrefixAndSuffixPairsI sol = new CountPrefixAndSuffixPairsI();
        System.out.println(sol.solve(new String[]{"a","aba","ababa","aa"})); // 4
        System.out.println(sol.solve(new String[]{"pa","papa","ma","mama"})); // 2
    }

}
