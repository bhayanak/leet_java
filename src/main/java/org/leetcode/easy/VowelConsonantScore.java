package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** VowelConsonantScore solution. */
public class VowelConsonantScore {

    /**
     * Returns the sum over all substrings of: 1 if first char is vowel, 1 if last char is consonant.
     * For each substring s[i..j]: +1 if s[i] is vowel, +1 if s[j] is consonant.
     * @param word input lowercase string
     * @return total score
     * <p><b>Explanation:</b> For each position: count how many substrings start at i (vowel bonus: n-i substrings)</p>
     *              and end at j (consonant bonus: j+1 substrings). Sum both contributions.
     */
    public long solve(String word) {
        int n = word.length();
        String vowels = "aeiou";
        long score = 0;
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(word.charAt(i)) >= 0)
                score += (long)(n - i); // substrings starting at i
            else
                score += (long)(i + 1); // substrings ending at i (consonant)
        }
        return score;
    }

    public static void main(String[] args) {
        VowelConsonantScore sol = new VowelConsonantScore();
        System.out.println(sol.solve("aba")); // computed...
        System.out.println(sol.solve("abc")); // computed...
    }

}
