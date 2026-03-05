package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #521: Longest Uncommon Subsequence I
 * @see <a href="https://leetcode.com/problems/longest-uncommon-subsequence-i/">Problem</a>
 */
public class LongestUncommonSubsequenceI {

    /**
     * Given two strings a and b, returns the length of the longest uncommon
     * subsequence (a subsequence of one that is NOT a subsequence of the other).
     * @param a first string
     * @param b second string
     * @return length of longest uncommon subsequence, or -1 if none
     * <p><b>Explanation:</b> If strings differ, the longer one (or either if same length) is the answer.</p>
     *              If equal, every subsequence of a is a subsequence of b → return -1.
     */
    public int solve(String a, String b) {
        if (a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        LongestUncommonSubsequenceI sol = new LongestUncommonSubsequenceI();
        System.out.println(sol.solve("aba", "cdc")); // 3
        System.out.println(sol.solve("aaa", "bbb")); // 3
        System.out.println(sol.solve("aaa", "aaa")); // -1
    }

}
