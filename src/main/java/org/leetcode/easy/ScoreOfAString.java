package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ScoreOfAString solution. */
public class ScoreOfAString {

    /**
     * Returns the sum of absolute differences of ASCII values of adjacent characters.
     * @param s input string
     * @return score
     * <p><b>Explanation:</b> Single pass: sum |s[i] - s[i-1]| for i in 1..n-1.</p>
     */
    public int solve(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) score += Math.abs(s.charAt(i) - s.charAt(i-1));
        return score;
    }

    public static void main(String[] args) {
        ScoreOfAString sol = new ScoreOfAString();
        System.out.println(sol.solve("hello")); // |h-e|+|e-l|+|l-l|+|l-o| = 3+7+0+3 = 13
        System.out.println(sol.solve("zaz"));   // 25+25 = 50
    }

}
