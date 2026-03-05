package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #686: Repeated String Match
 * @see <a href="https://leetcode.com/problems/repeated-string-match/">Problem</a>
 */
public class RepeatedStringMatch {

    /**
     * LeetCode #686 – Repeated String Match
     * Difficulty: MEDIUM
     * Topics: String, String Matching
     *
     * Given two strings a and b, return the minimum number of times you should
     * repeat string a so that string b is a substring of it. If it is impossible
     * for b​​​​​​ to be a substring of a after repeating it, return -1.
     * 
     * 
     * Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and
     * repeated 2 times is "abcabc".
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: a = "abcd", b = "cdabcdab"
     * Output: 3
     * Explanation: We return 3 because by repeating a three times "abcdabcdabcd",
     * b is a substring of it.
     * 
     * Example 2:
     * 
     * Input: a = "a", b = "aa"
     * Output: 2
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= a.length, b.length &lt;= 104
     * 
     * a and b consist of lowercase English letters.
     */
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int count = 1;
        while (sb.length() < b.length()) { sb.append(a); count++; }
        if (sb.toString().contains(b)) return count;
        sb.append(a); count++;
        return sb.toString().contains(b) ? count : -1;
    }

    public static void main(String[] args) {
        RepeatedStringMatch sol = new RepeatedStringMatch();
        System.out.println(sol.repeatedStringMatch("hello", "hello"));
    }
}
