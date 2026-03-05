package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #434: Number of Segments in a String
 * @see <a href="https://leetcode.com/problems/number-of-segments-in-a-string/">Problem</a>
 */
public class NumberOfSegmentsInAString {

    /**
     * Returns the number of segments (whitespace-separated tokens) in the string.
     * @param s the input string
     * @return number of segments
     * <p><b>Explanation:</b> Split on whitespace; filter empty tokens; count.</p>
     */
    public int solve(String s) {
        if (s.trim().isEmpty()) return 0;
        return s.trim().split("\s+").length;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInAString sol = new NumberOfSegmentsInAString();
        System.out.println(sol.solve("Hello, my name is John")); // 5
        System.out.println(sol.solve("   "));                     // 0
    }

}
