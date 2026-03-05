package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #405: Convert a Number to Hexadecimal
 * @see <a href="https://leetcode.com/problems/convert-a-number-to-hexadecimal/">Problem</a>
 */
public class ConvertANumberToHexadecimal {

    /**
     * LeetCode #405 – Convert a Number to Hexadecimal
     * Difficulty: EASY
     * Topics: Math, String, Bit Manipulation
     *
     * Given a 32-bit integer num, return a string representing its hexadecimal
     * representation. For negative integers, two’s complement method is used.
     * 
     * 
     * All the letters in the answer string should be lowercase characters, and
     * there should not be any leading zeros in the answer except for the zero
     * itself.
     * 
     * 
     * Note: You are not allowed to use any built-in library method to directly
     * solve this problem.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: num = 26
     * Output: "1a"
     * 
     * 
     * Example 2:
     * 
     * Input: num = -1
     * Output: "ffffffff"
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * -231 &lt;= num &lt;= 231 - 1
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    // Use bit manipulation: take 4 bits at a time
    /**
     * Solves the problem: To hex.
     *
     * @param num the num (int)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(hex[num & 0xf]);
            num >>>= 4;  // unsigned right shift handles negative numbers
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal sol = new ConvertANumberToHexadecimal();
        System.out.println(sol.toHex(0));
    }
}
