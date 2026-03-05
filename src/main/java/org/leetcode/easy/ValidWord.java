package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ValidWord solution. */
public class ValidWord {

    /**
     * Returns true if the string is a valid word: length &gt;= 3, contains only letters and digits,
     * and has at least one vowel and one consonant.
     * @param word input string
     * @return true if valid
     * <p><b>Explanation:</b> Check constraints: length, characters, vowel/consonant presence.</p>
     */
    public boolean solve(String word) {
        if (word.length() < 3) return false;
        boolean hasVowel = false, hasConsonant = false;
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return false;
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) >= 0) hasVowel = true;
                else hasConsonant = true;
            }
        }
        return hasVowel && hasConsonant;
    }

    public static void main(String[] args) {
        ValidWord sol = new ValidWord();
        System.out.println(sol.solve("234Adas")); // true
        System.out.println(sol.solve("b3"));      // false (length < 3)
        System.out.println(sol.solve("a3$e"));    // false (special char)
    }

}
