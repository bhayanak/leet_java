package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #459: Repeated Substring Pattern
 * @see <a href="https://leetcode.com/problems/repeated-substring-pattern/">Problem</a>
 */
public class RepeatedSubstringPattern {

    /**
     * LeetCode #459 – Repeated Substring Pattern
     * Difficulty: EASY
     * Topics: String, String Matching
     *
     * Given a string s, check if it can be constructed by taking a substring of
     * it and appending multiple copies of the substring together.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abab"
     * Output: true
     * Explanation: It is the substring "ab" twice.
     * 
     * Example 2:
     * 
     * Input: s = "aba"
     * Output: false
     * 
     * Example 3:
     * 
     * Input: s = "abcabcabcabc"
     * Output: true
     * Explanation: It is the substring "abc" four times or the substring "abcabc"
     * twice.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 104
     * 
     * s consists of lowercase English letters.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    // s is in (s+s) starting at index 1, not including last char
    /**
     * Solves the problem: Repeated substring pattern.
     *
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern sol = new RepeatedSubstringPattern();
        System.out.println(sol.repeatedSubstringPattern("hello"));
    }
}
