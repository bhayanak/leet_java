package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #670: Maximum Swap
 * @see <a href="https://leetcode.com/problems/maximum-swap/">Problem</a>
 */
public class MaximumSwap {

    /**
     * LeetCode #670 – Maximum Swap
     * Difficulty: MEDIUM
     * Topics: Math, Greedy
     *
     * You are given an integer num. You can swap two digits at most once to get
     * the maximum valued number.
     * 
     * 
     * Return the maximum valued number you can get.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: num = 2736
     * Output: 7236
     * Explanation: Swap the number 2 and the number 7.
     * 
     * Example 2:
     * 
     * Input: num = 9973
     * Output: 9973
     * Explanation: No swap.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 0 &lt;= num &lt;= 108
     */
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < digits.length; i++) last[digits[i]-'0'] = i;
        for (int i = 0; i < digits.length; i++) {
            for (int d = 9; d > digits[i]-'0'; d--) {
                if (last[d] > i) {
                    char tmp = digits[i]; digits[i] = digits[last[d]]; digits[last[d]] = tmp;
                    return Integer.parseInt(new String(digits));
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        MaximumSwap sol = new MaximumSwap();
        System.out.println(sol.maximumSwap(0));
    }
}
