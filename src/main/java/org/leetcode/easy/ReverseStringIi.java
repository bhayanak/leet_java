package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #541: Reverse String II
 * @see <a href="https://leetcode.com/problems/reverse-string-ii/">Problem</a>
 */
public class ReverseStringIi {

    /**
     * LeetCode #541 – Reverse String II
     * Difficulty: EASY
     * Topics: Two Pointers, String
     *
     * Given a string s and an integer k, reverse the first k characters for every
     * 2k characters counting from the start of the string.
     * 
     * 
     * If there are fewer than k characters left, reverse all of them. If there
     * are less than 2k but greater than or equal to k characters, then reverse
     * the first k characters and leave the other as original.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * 
     * 
     * Example 2:
     * 
     * Input: s = "abcd", k = 2
     * Output: "bacd"
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 104
     * 
     * s consists of only lowercase English letters.
     * 
     * 1 &lt;= k &lt;= 104
      *
      * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
      */
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2*k) {
            int lo = i, hi = Math.min(i + k - 1, arr.length - 1);
            while (lo < hi) { char t = arr[lo]; arr[lo++] = arr[hi]; arr[hi--] = t; }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseStringIi sol = new ReverseStringIi();
        System.out.println(sol.reverseStr("test", 0));
    }
}
