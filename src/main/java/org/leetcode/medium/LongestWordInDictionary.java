package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #720: Longest Word in Dictionary
 * @see <a href="https://leetcode.com/problems/longest-word-in-dictionary/">Problem</a>
 */
public class LongestWordInDictionary {

    /**
     * LeetCode #720 – Longest Word in Dictionary
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, String, Trie, Sorting
     *
     * Given an array of strings words representing an English Dictionary, return
     * the longest word in words that can be built one character at a time by
     * other words in words.
     * 
     * 
     * If there is more than one possible answer, return the longest word with the
     * smallest lexicographical order. If there is no answer, return the empty
     * string.
     * 
     * 
     * Note that the word should be built from left to right with each additional
     * character being added to the end of a previous word.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: words = ["w","wo","wor","worl","world"]
     * Output: "world"
     * Explanation: The word "world" can be built one character at a time by "w",
     * "wo", "wor", and "worl".
     * 
     * Example 2:
     * 
     * Input: words = ["a","banana","app","appl","ap","apply","apple"]
     * Output: "apple"
     * Explanation: Both "apply" and "apple" can be built from other words in the
     * dictionary. However, "apple" is lexicographically smaller than "apply".
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= words.length &lt;= 1000
     * 
     * 1 &lt;= words[i].length &lt;= 30
     * 
     * words[i] consists of lowercase English letters.
     */
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<>();
        built.add("");
        String result = "";
        for (String w : words) {
            if (built.contains(w.substring(0, w.length()-1))) {
                built.add(w);
                if (w.length() > result.length()) result = w;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestWordInDictionary sol = new LongestWordInDictionary();
        System.out.println(sol.longestWord(new String[]{"a","b"}));
    }
}
