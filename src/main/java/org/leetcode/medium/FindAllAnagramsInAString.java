package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #438: Find All Anagrams in a String
 * @see <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">Problem</a>
 */
public class FindAllAnagramsInAString {

    /**
     * LeetCode #438 – Find All Anagrams in a String
     * Difficulty: MEDIUM
     * Topics: Hash Table, String, Sliding Window
     *
     * Given two strings s and p, return an array of all the start indices of p's
     * anagrams in s. You may return the answer in any order.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "cbaebabacd", p = "abc"
     * Output: [0,6]
     * Explanation:
     * The substring with start index = 0 is "cba", which is an anagram of "abc".
     * The substring with start index = 6 is "bac", which is an anagram of "abc".
     * 
     * Example 2:
     * 
     * Input: s = "abab", p = "ab"
     * Output: [0,1,2]
     * Explanation:
     * The substring with start index = 0 is "ab", which is an anagram of "ab".
     * The substring with start index = 1 is "ba", which is an anagram of "ab".
     * The substring with start index = 2 is "ab", which is an anagram of "ab".
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length, p.length &lt;= 3 * 104
     * 
     * s and p consist of lowercase English letters.
     */
    // Sliding window with frequency arrays
    /**
     * Finds Find anagrams.
     *
     * @param s the s (String)
     * @param p the p (String)
     * @return the computed List&lt;Integer&gt; result
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pCount = new int[26], sCount = new int[26];
        for (char c : p.toCharArray()) pCount[c - 'a']++;
        for (int i = 0; i < p.length(); i++) sCount[s.charAt(i) - 'a']++;
        if (Arrays.equals(pCount, sCount)) result.add(0);
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(pCount, sCount)) result.add(i - p.length() + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString sol = new FindAllAnagramsInAString();
        System.out.println(sol.findAnagrams("hello", "hello"));
    }
}
