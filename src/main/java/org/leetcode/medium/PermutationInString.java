package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #567: Permutation in String
 * @see <a href="https://leetcode.com/problems/permutation-in-string/">Problem</a>
 */
public class PermutationInString {

    /**
     * LeetCode #567 – Permutation in String
     * Difficulty: MEDIUM
     * Topics: Hash Table, Two Pointers, String, Sliding Window
     *
     * Given two strings s1 and s2, return true if s2 contains a permutation of
     * s1, or false otherwise.
     * 
     * 
     * In other words, return true if one of s1's permutations is the substring of
     * s2.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s1 = "ab", s2 = "eidbaooo"
     * Output: true
     * Explanation: s2 contains one permutation of s1 ("ba").
     * 
     * Example 2:
     * 
     * Input: s1 = "ab", s2 = "eidboaoo"
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s1.length, s2.length &lt;= 104
     * 
     * s1 and s2 consist of lowercase English letters.

     *
     * Hints:
     *   1. Obviously, brute force will result in TLE. Think of something else.
     *   2. How will you check whether one string is a permutation of another string?
     *   3. One way is to sort the string and then compare. But, Is there a better way?
     */
    // TODO: Implement solution for Permutation in String
    // Difficulty: MEDIUM | Topics: Hash Table, Two Pointers, String, Sliding Window
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
        PermutationInString sol = new PermutationInString();
        System.out.println(sol.solve());
    }
}
