package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ReverseDegreeOfAString solution. */
public class ReverseDegreeOfAString {

    /**
     * Returns sum of (reverse alphabetical positions) of each character, multiplied by its 1-based index.
     * Reverse alphabetical: 'a'=26, 'b'=25, ..., 'z'=1.
     * @param s input lowercase string
     * @return reverse-degree sum
     * <p><b>Explanation:</b> For each char at position i (1-based): score += ('z' - c + 1) * i.</p>
     */
    public int solve(String s) {
        int score = 0;
        for (int i = 0; i < s.length(); i++)
            score += ('z' - s.charAt(i) + 1) * (i + 1);
        return score;
    }

    public static void main(String[] args) {
        ReverseDegreeOfAString sol = new ReverseDegreeOfAString();
        System.out.println(sol.solve("ab")); // ('z'-'a'+1)*1 + ('z'-'b'+1)*2 = 26 + 25*2 = 76
        System.out.println(sol.solve("z"));  // 1
    }

}
