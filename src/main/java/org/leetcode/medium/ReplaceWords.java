package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode #648: Replace Words
 * @see <a href="https://leetcode.com/problems/replace-words/">Problem</a>
 */
public class ReplaceWords {

    /**
     * LeetCode #648 – Replace Words
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, String, Trie
     *
     * In English, we have a concept called root, which can be followed by some
     * other word to form another longer word - let's call this word derivative.
     * For example, when the root "help" is followed by the word "ful", we can
     * form a derivative "helpful".
     * 
     * 
     * Given a dictionary consisting of many roots and a sentence consisting of
     * words separated by spaces, replace all the derivatives in the sentence with
     * the root forming it. If a derivative can be replaced by more than one root,
     * replace it with the root that has the shortest length.
     * 
     * 
     * Return the sentence after the replacement.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled
     * by the battery"
     * Output: "the cat was rat by the bat"
     * 
     * Example 2:
     * 
     * Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
     * Output: "a a b c"
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= dictionary.length &lt;= 1000
     * 
     * 1 &lt;= dictionary[i].length &lt;= 100
     * 
     * dictionary[i] consists of only lower-case letters.
     * 
     * 1 &lt;= sentence.length &lt;= 106
     * 
     * sentence consists of only lower-case letters and spaces.
     * 
     * The number of words in sentence is in the range [1, 1000]
     * 
     * The length of each word in sentence is in the range [1, 1000]
     * 
     * Every two consecutive words in sentence will be separated by exactly one
     * space.
     * 
     * sentence does not have leading or trailing spaces.
     */
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> roots = new HashSet<>(dictionary);
        StringBuilder sb = new StringBuilder();
        for (String word : sentence.split(" ")) {
            String shortest = word;
            for (int i = 1; i <= word.length(); i++) {
                if (roots.contains(word.substring(0, i))) { shortest = word.substring(0, i); break; }
            }
            if (sb.length() > 0) sb.append(" ");
            sb.append(shortest);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReplaceWords sol = new ReplaceWords();
        System.out.println(sol.replaceWords(java.util.Arrays.asList("a","b"), "hello"));
    }
}
