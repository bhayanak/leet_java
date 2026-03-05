package org.leetcode.hard;


/**
 * <b>#2514 - Count Anagrams</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, Math, String, Combinatorics, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s containing one or more words. Every consecutive pair of words is separated by a single space ' '.
 *
 *
 * A string t is an anagram of string s if the ith word of t is a permutation of the ith word of s.
 *
 *
 * For example, "acb dfe" is an anagram of "abc def", but "def cab" and "adc bef" are not.
 *
 * Return the number of distinct anagrams of s. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "too hot"
 * Output: 18
 * Explanation: Some of the anagrams of the given string are "too hot", "oot hot", "oto toh", "too toh", and "too oht".
 *
 * Example 2:
 *
 * Input: s = "aa"
 * Output: 1
 * Explanation: There is only one anagram possible for the given string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters and spaces ' '.
 *
 * There is single space between consecutive words.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each word, can you count the number of permutations possible if all characters are distinct?
 * Hint 2: How to reduce overcounting when letters are repeated?
 * Hint 3: The product of the counts of distinct permutations of all words will give the final answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math, String, Combinatorics, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-anagrams/">LeetCode #2514</a>
 */
public class CountAnagrams {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Anagrams");
    }

    public static void main(String[] args) {
        System.out.println("=== CountAnagrams ===");
        CountAnagrams sol = new CountAnagrams();
        System.out.println(sol.solve(null));
    }
}
