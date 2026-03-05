package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>EqualScoreSubstrings</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> String, Sliding Window, HashSet</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, an integer k, and a target, count the number of substrings of length 2k
 * whose first and second halves each have exactly target distinct characters.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Slide a window of length 2k over the string, and for each window, count distinct characters in both halves using a HashSet.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(n * k), where n is the length of s.</li>
 *   <li>Space: O(k) for the HashSet.</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Slides over all starting positions and scores each half independently for distinct characters.</p>
 */
public class EqualScoreSubstrings {

    /**
     * Counts substrings of length 2k whose first and second halves each have
     * exactly `target` distinct characters.
     * @param s input string
     * @param k half-length of each substring
     * @param target required distinct char count per half
     * @return count of qualifying substrings
     * <p><b>Explanation:</b> Slide over all starting positions; score each half independently.</p>
     */
    public int solve(String s, int k, int target) {
        int count = 0;
        for (int i = 0; i + 2 * k <= s.length(); i++) {
            if (distinct(s, i, i + k) == target && distinct(s, i + k, i + 2 * k) == target)
                count++;
        }
        return count;
    }

    private int distinct(String s, int l, int r) {
        Set<Character> set = new HashSet<>();
        for (int i = l; i < r; i++) set.add(s.charAt(i));
        return set.size();
    }

    public static void main(String[] args) {
        EqualScoreSubstrings sol = new EqualScoreSubstrings();
        System.out.println(sol.solve("abacaba", 2, 3)); // 1 ("abacab" halves "ab","ac" scores 2,2)
        System.out.println(sol.solve("abcdef", 2, 2));  // 1
    }

}
