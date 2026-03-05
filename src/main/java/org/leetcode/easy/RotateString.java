package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #796: Rotate String
 * @see <a href="https://leetcode.com/problems/rotate-string/">Problem</a>
 */
public class RotateString {

    /**
     * LeetCode #796 – Rotate String
     * Difficulty: EASY
     * Topics: String, String Matching
     *
     * Given two strings s and goal, return true if and only if s can become goal
     * after some number of shifts on s.
     * 
     * 
     * A shift on s consists of moving the leftmost character of s to the
     * rightmost position.
     * 
     * 
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abcde", goal = "cdeab"
     * Output: true
     * 
     * 
     * Example 2:
     * 
     * Input: s = "abcde", goal = "abced"
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length, goal.length &lt;= 100
     * 
     * s and goal consist of lowercase English letters.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        RotateString sol = new RotateString();
        System.out.println(sol.rotateString("test", "test"));
    }
}
