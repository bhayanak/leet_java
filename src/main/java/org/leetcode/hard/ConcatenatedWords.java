package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #472: Concatenated Words
 * @see <a href="https://leetcode.com/problems/concatenated-words/">Problem</a>
 */
public class ConcatenatedWords {

    /**
     * LeetCode #472 – Concatenated Words
     * Difficulty: HARD
     * Topics: Array, String, Dynamic Programming, Depth-First Search, Trie, Sorting
     *
     * Given an array of strings words (without duplicates), return all the
     * concatenated words in the given list of words.
     * 
     * 
     * A concatenated word is defined as a string that is comprised entirely of at
     * least two shorter words (not necessarily distinct) in the given array.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: words =
     * ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
     * Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
     * Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats";
     * "dogcatsdog" can be concatenated by "dog", "cats" and "dog";
     * "ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
     * 
     * Example 2:
     * 
     * Input: words = ["cat","dog","catdog"]
     * Output: ["catdog"]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= words.length &lt;= 104
     * 
     * 1 &lt;= words[i].length &lt;= 30
     * 
     * words[i] consists of only lowercase English letters.
     * 
     * All the strings of words are unique.
     * 
     * 1 &lt;= sum(words[i].length) &lt;= 105
     */
    // TODO: Implement solution for Concatenated Words
    // Difficulty: HARD | Topics: Array, String, Dynamic Programming, Depth-First Search, Trie, Sorting
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
        ConcatenatedWords sol = new ConcatenatedWords();
        System.out.println(sol.solve());
    }
}
