package org.leetcode.medium;


/**
 * <b>#1170 - Compare Strings by Frequency of the Smallest Character</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Let the function f(s) be the frequency of the lexicographically smallest character in a non-empty string s. For example, if s = "dcce" then f(s) = 2 because the lexicographically smallest character is 'c', which has a frequency of 2.
 *
 *
 * You are given an array of strings words and another array of query strings queries. For each query queries[i], count the number of words in words such that f(queries[i]) &lt; f(W) for each W in words.
 *
 *
 * Return an integer array answer, where each answer[i] is the answer to the ith query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = ["cbd"], words = ["zaaaz"]
 * Output: [1]
 * Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") &lt; f("zaaaz").
 *
 * Example 2:
 *
 * Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
 * Output: [1,2]
 * Explanation: On the first query only f("bbb") &lt; f("aaaa"). On the second query both f("aaa") and f("aaaa") are both &gt; f("cc").
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queries.length &lt;= 2000
 *
 * 1 &lt;= words.length &lt;= 2000
 *
 * 1 &lt;= queries[i].length, words[i].length &lt;= 10
 *
 * queries[i][j], words[i][j] consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each string from words calculate the leading count and store it in an array, then sort the integer array.
 * Hint 2: For each string from queries calculate the leading count "p" and in base of the sorted array calculated on the step 1 do a binary search to count the number of items greater than "p".
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Binary Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/">LeetCode #1170</a>
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {

    /**
     * TODO: Implement "Compare Strings by Frequency of the Smallest Character".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Compare Strings by Frequency of the Smallest Character");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CompareStringsByFrequencyOfTheSmallestCharacter.java &amp;&amp; java org.leetcode.medium.CompareStringsByFrequencyOfTheSmallestCharacter</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CompareStringsByFrequencyOfTheSmallestCharacter ===");
        CompareStringsByFrequencyOfTheSmallestCharacter sol = new CompareStringsByFrequencyOfTheSmallestCharacter();
        System.out.println(sol.solve(null));
    }
}
