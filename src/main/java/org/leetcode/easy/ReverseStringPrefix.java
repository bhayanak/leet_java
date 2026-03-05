package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ReverseStringPrefix solution. */
public class ReverseStringPrefix {

    /**
     * Reverses the segment of word from index 0 to the first occurrence of ch (inclusive).
     * @param word input string
     * @param ch   target character
     * @return modified string with prefix reversed
     * <p><b>Explanation:</b> Find first indexOf(ch); reverse word[0..idx]; return.</p>
     */
    public String solve(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;
        char[] arr = word.toCharArray();
        for (int l = 0, r = idx; l < r; l++, r--) {
            char tmp = arr[l]; arr[l] = arr[r]; arr[r] = tmp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseStringPrefix sol = new ReverseStringPrefix();
        System.out.println(sol.solve("abcdefd", 'd')); // "dcbaefd"
        System.out.println(sol.solve("xyxzxe", 'z'));  // "zxyxxe"
        System.out.println(sol.solve("abcd", 'z'));     // "abcd"
    }

}
