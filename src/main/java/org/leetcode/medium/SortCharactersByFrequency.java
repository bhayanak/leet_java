package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode #451: Sort Characters By Frequency
 * @see <a href="https://leetcode.com/problems/sort-characters-by-frequency/">Problem</a>
 */
public class SortCharactersByFrequency {

    /**
     * LeetCode #451 – Sort Characters By Frequency
     * Difficulty: MEDIUM
     * Topics: Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting
     *
     * Given a string s, sort it in decreasing order based on the frequency of the
     * characters. The frequency of a character is the number of times it appears
     * in the string.
     * 
     * 
     * Return the sorted string. If there are multiple answers, return any of them.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "tree"
     * Output: "eert"
     * Explanation: 'e' appears twice while 'r' and 't' both appear once.
     * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a
     * valid answer.
     * 
     * Example 2:
     * 
     * Input: s = "cccaaa"
     * Output: "aaaccc"
     * Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and
     * "aaaccc" are valid answers.
     * Note that "cacaca" is incorrect, as the same characters must be together.
     * 
     * Example 3:
     * 
     * Input: s = "Aabb"
     * Output: "bbAa"
     * Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
     * Note that 'A' and 'a' are treated as two different characters.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 5 * 105
     * 
     * s consists of uppercase and lowercase English letters and digits.
     */
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) freq.merge(c, 1, Integer::sum);
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> e : list)
            for (int i = 0; i < e.getValue(); i++) sb.append(e.getKey());
        return sb.toString();
    }

    public static void main(String[] args) {
        SortCharactersByFrequency sol = new SortCharactersByFrequency();
        System.out.println(sol.frequencySort("hello"));
    }
}
