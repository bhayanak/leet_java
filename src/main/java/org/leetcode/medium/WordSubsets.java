package org.leetcode.medium;


/**
 * <b>#916 - Word Subsets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two string arrays words1 and words2.
 *
 *
 * A string b is a subset of string a if every letter in b occurs in a including multiplicity.
 *
 *
 * For example, "wrr" is a subset of "warrior" but is not a subset of "world".
 *
 * A string a from words1 is universal if for every string b in words2, b is a subset of a.
 *
 *
 * Return an array of all the universal strings in words1. You may return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
 *
 *
 * Output: ["facebook","google","leetcode"]
 *
 * Example 2:
 *
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["lc","eo"]
 *
 *
 * Output: ["leetcode"]
 *
 * Example 3:
 *
 * Input: words1 = ["acaac","cccbb","aacbb","caacc","bcbbb"], words2 = ["c","cc","b"]
 *
 *
 * Output: ["cccbb"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words1.length, words2.length &lt;= 104
 *
 * 1 &lt;= words1[i].length, words2[i].length &lt;= 10
 *
 * words1[i] and words2[i] consist only of lowercase English letters.
 *
 * All the strings of words1 are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/word-subsets/">LeetCode #916</a>
 */
public class WordSubsets {

    /**
     * TODO: Implement "Word Subsets".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Word Subsets");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac WordSubsets.java &amp;&amp; java org.leetcode.medium.WordSubsets</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== WordSubsets ===");
        WordSubsets sol = new WordSubsets();
        System.out.println(sol.solve(null));
    }
}
