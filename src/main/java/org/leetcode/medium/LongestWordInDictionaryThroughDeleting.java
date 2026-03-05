package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #524: Longest Word in Dictionary through Deleting
 * @see <a href="https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/">Problem</a>
 */
public class LongestWordInDictionaryThroughDeleting {

    /**
     * LeetCode #524 – Longest Word in Dictionary through Deleting
     * Difficulty: MEDIUM
     * Topics: Array, Two Pointers, String, Sorting
     *
     * Given a string s and a string array dictionary, return the longest string
     * in the dictionary that can be formed by deleting some of the given string
     * characters. If there is more than one possible result, return the longest
     * word with the smallest lexicographical order. If there is no possible
     * result, return the empty string.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
     * Output: "apple"
     * 
     * Example 2:
     * 
     * Input: s = "abpcplea", dictionary = ["a","b","c"]
     * Output: "a"
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 1000
     * 
     * 1 &lt;= dictionary.length &lt;= 1000
     * 
     * 1 &lt;= dictionary[i].length &lt;= 1000
     * 
     * s and dictionary[i] consist of lowercase English letters.
     */
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        for (String word : dictionary) {
            if (isSubseq(s, word)) {
                if (word.length() > result.length() ||
                    (word.length() == result.length() && word.compareTo(result) < 0))
                    result = word;
            }
        }
        return result;
    }
    private boolean isSubseq(String s, String t) {
        int i = 0;
        for (char c : s.toCharArray()) if (i < t.length() && c == t.charAt(i)) i++;
        return i == t.length();
    }

    public static void main(String[] args) {
        LongestWordInDictionaryThroughDeleting sol = new LongestWordInDictionaryThroughDeleting();
        System.out.println(sol.findLongestWord("hello", java.util.Arrays.asList("a","b")));
    }
}
