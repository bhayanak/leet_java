package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #401: Binary Watch
 * @see <a href="https://leetcode.com/problems/binary-watch/">Problem</a>
 */
public class BinaryWatch {

    /**
     * LeetCode #401 – Binary Watch
     * Difficulty: EASY
     * Topics: Backtracking, Bit Manipulation
     *
     * A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6
     * LEDs on the bottom to represent the minutes (0-59). Each LED represents a
     * zero or one, with the least significant bit on the right.
     * 
     * 
     * For example, the below binary watch reads "4:51".
     * 
     * Given an integer turnedOn which represents the number of LEDs that are
     * currently on (ignoring the PM), return all possible times the watch could
     * represent. You may return the answer in any order.
     * 
     * 
     * The hour must not contain a leading zero.
     * 
     * 
     * For example, "01:00" is not valid. It should be "1:00".
     * 
     * The minute must consist of two digits and may contain a leading zero.
     * 
     * 
     * For example, "10:2" is not valid. It should be "10:02".
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: turnedOn = 1
     * Output:
     * ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]
     * 
     * 
     * Example 2:
     * 
     * Input: turnedOn = 9
     * Output: []
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 0 &lt;= turnedOn &lt;= 10

     *
     * Hints:
     *   1. Simplify by seeking for solutions that involve comparing set bit counts.
     *   2. Consider precomputing all possible times for comparison.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    // Count number of 1-bits in hour (max 3) and minute (max 5)
    // Use Integer.bitCount() to count set bits
    /**
     * Solves the problem: Read binary watch.
     *
     * @param turnedOn the turnedOn (int)
     * @return the computed List&lt;String&gt; result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryWatch sol = new BinaryWatch();
        System.out.println(sol.readBinaryWatch(0));
    }
}
