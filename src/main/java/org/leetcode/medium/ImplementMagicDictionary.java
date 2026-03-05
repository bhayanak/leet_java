package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #676: Implement Magic Dictionary
 * @see <a href="https://leetcode.com/problems/implement-magic-dictionary/">Problem</a>
 */
public class ImplementMagicDictionary {

    /**
     * LeetCode #676 – Implement Magic Dictionary
     * Difficulty: MEDIUM
     * Topics: Hash Table, String, Depth-First Search, Design, Trie
     *
     * Design a data structure that is initialized with a list of different words.
     * Provided a string, you should determine if you can change exactly one
     * character in this string to match any word in the data structure.
     * 
     * 
     * Implement the MagicDictionary class:
     * 
     * 
     * MagicDictionary() Initializes the object.
     * 
     * void buildDict(String[] dictionary) Sets the data structure with an array
     * of distinct strings dictionary.
     * 
     * bool search(String searchWord) Returns true if you can change exactly one
     * character in searchWord to match any string in the data structure,
     * otherwise returns false.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["MagicDictionary", "buildDict", "search", "search", "search", "search"]
     * [[], [["hello", "leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
     * Output
     * [null, null, false, true, false, false]
     * 
     * Explanation
     * MagicDictionary magicDictionary = new MagicDictionary();
     * magicDictionary.buildDict(["hello", "leetcode"]);
     * magicDictionary.search("hello"); // return False
     * magicDictionary.search("hhllo"); // We can change the second 'h' to 'e' to
     * match "hello" so we return True
     * magicDictionary.search("hell"); // return False
     * magicDictionary.search("leetcoded"); // return False
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= dictionary.length &lt;= 100
     * 
     * 1 &lt;= dictionary[i].length &lt;= 100
     * 
     * dictionary[i] consists of only lower-case English letters.
     * 
     * All the strings in dictionary are distinct.
     * 
     * 1 &lt;= searchWord.length &lt;= 100
     * 
     * searchWord consists of only lower-case English letters.
     * 
     * buildDict will be called only once before search
     */
    // TODO: Implement solution for Implement Magic Dictionary
    // Difficulty: MEDIUM | Topics: Hash Table, String, Depth-First Search, Design, Trie
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
        ImplementMagicDictionary sol = new ImplementMagicDictionary();
        System.out.println(sol.solve());
    }
}
