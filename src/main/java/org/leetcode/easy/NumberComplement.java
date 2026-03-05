package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #476: Number Complement
 * @see <a href="https://leetcode.com/problems/number-complement/">Problem</a>
 */
public class NumberComplement {

    /**
     * LeetCode #476 – Number Complement
     * Difficulty: EASY
     * Topics: Bit Manipulation
     *
     * The complement of an integer is the integer you get when you flip all the
     * 0's to 1's and all the 1's to 0's in its binary representation.
     * 
     * 
     * For example, The integer 5 is "101" in binary and its complement is "010"
     * which is the integer 2.
     * 
     * Given an integer num, return its complement.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: num = 5
     * Output: 2
     * Explanation: The binary representation of 5 is 101 (no leading zero bits),
     * and its complement is 010. So you need to output 2.
     * 
     * Example 2:
     * 
     * Input: num = 1
     * Output: 0
     * Explanation: The binary representation of 1 is 1 (no leading zero bits),
     * and its complement is 0. So you need to output 0.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= num &lt; 231
     * 
     * 
     * 
     * Note: This question is the same as 1009:
     * https://leetcode.com/problems/complement-of-base-10-integer/
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num);
        mask = mask | (mask - 1);
        return num ^ mask;
    }

    public static void main(String[] args) {
        NumberComplement sol = new NumberComplement();
        System.out.println(sol.findComplement(0));
    }
}
