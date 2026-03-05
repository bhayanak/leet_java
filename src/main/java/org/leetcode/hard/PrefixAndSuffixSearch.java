package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #745: Prefix and Suffix Search
 * @see <a href="https://leetcode.com/problems/prefix-and-suffix-search/">Problem</a>
 */
public class PrefixAndSuffixSearch {

    /**
     * LeetCode #745 – Prefix and Suffix Search
     * Difficulty: HARD
     * Topics: Array, Hash Table, String, Design, Trie
     *
     * Design a special dictionary that searches the words in it by a prefix and a
     * suffix.
     * 
     * 
     * Implement the WordFilter class:
     * 
     * 
     * WordFilter(string[] words) Initializes the object with the words in the
     * dictionary.
     * 
     * f(string pref, string suff) Returns the index of the word in the
     * dictionary, which has the prefix pref and the suffix suff. If there is more
     * than one valid index, return the largest of them. If there is no such word
     * in the dictionary, return -1.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["WordFilter", "f"]
     * [[["apple"]], ["a", "e"]]
     * Output
     * [null, 0]
     * Explanation
     * WordFilter wordFilter = new WordFilter(["apple"]);
     * wordFilter.f("a", "e"); // return 0, because the word at index 0 has prefix
     * = "a" and suffix = "e".
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= words.length &lt;= 104
     * 
     * 1 &lt;= words[i].length &lt;= 7
     * 
     * 1 &lt;= pref.length, suff.length &lt;= 7
     * 
     * words[i], pref and suff consist of lowercase English letters only.
     * 
     * At most 104 calls will be made to the function f.
     */
    // TODO: Implement solution for Prefix and Suffix Search
    // Difficulty: HARD | Topics: Array, Hash Table, String, Design, Trie
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
        PrefixAndSuffixSearch sol = new PrefixAndSuffixSearch();
        System.out.println(sol.solve());
    }
}
