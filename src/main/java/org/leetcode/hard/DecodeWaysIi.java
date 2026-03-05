package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #639: Decode Ways II
 * @see <a href="https://leetcode.com/problems/decode-ways-ii/">Problem</a>
 */
public class DecodeWaysIi {

    /**
     * LeetCode #639 – Decode Ways II
     * Difficulty: HARD
     * Topics: String, Dynamic Programming
     *
     * A message containing letters from A-Z can be encoded into numbers using the
     * following mapping:
     * 
     * 'A' -&gt; "1"
     * 'B' -&gt; "2"
     * ...
     * 'Z' -&gt; "26"
     * 
     * To decode an encoded message, all the digits must be grouped then mapped
     * back into letters using the reverse of the mapping above (there may be
     * multiple ways). For example, "11106" can be mapped into:
     * 
     * 
     * "AAJF" with the grouping (1 1 10 6)
     * 
     * "KJF" with the grouping (11 10 6)
     * 
     * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped
     * into 'F' since "6" is different from "06".
     * 
     * 
     * In addition to the mapping above, an encoded message may contain the '*'
     * character, which can represent any digit from '1' to '9' ('0' is excluded).
     * For example, the encoded message "1*" may represent any of the encoded
     * messages "11", "12", "13", "14", "15", "16", "17", "18", or "19". Decoding
     * "1*" is equivalent to decoding any of the encoded messages it can
     * represent.
     * 
     * 
     * Given a string s consisting of digits and '*' characters, return the number
     * of ways to decode it.
     * 
     * 
     * Since the answer may be very large, return it modulo 109 + 7.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "*"
     * Output: 9
     * Explanation: The encoded message can represent any of the encoded messages
     * "1", "2", "3", "4", "5", "6", "7", "8", or "9".
     * Each of these can be decoded to the strings "A", "B", "C", "D", "E", "F",
     * "G", "H", and "I" respectively.
     * Hence, there are a total of 9 ways to decode "*".
     * 
     * Example 2:
     * 
     * Input: s = "1*"
     * Output: 18
     * Explanation: The encoded message can represent any of the encoded messag
     */
    // TODO: Implement solution for Decode Ways II
    // Difficulty: HARD | Topics: String, Dynamic Programming
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        DecodeWaysIi sol = new DecodeWaysIi();
        System.out.println(sol.solve());
    }
}
