package org.leetcode.medium;


/**
 * <b>#890 - Find and Replace Pattern</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.
 *
 *
 * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
 *
 *
 * Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * Output: ["mee","aqq"]
 * Explanation: "mee" matches the pattern because there is a permutation {a -&gt; m, b -&gt; e, ...}. 
 * "ccc" does not match the pattern because {a -&gt; c, b -&gt; c, ...} is not a permutation, since a and b map to the same letter.
 *
 * Example 2:
 *
 * Input: words = ["a","b","c"], pattern = "a"
 * Output: ["a","b","c"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= pattern.length &lt;= 20
 *
 * 1 &lt;= words.length &lt;= 50
 *
 * words[i].length == pattern.length
 *
 * pattern and words[i] are lowercase English letters.
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
 * @see <a href="https://leetcode.com/problems/find-and-replace-pattern/">LeetCode #890</a>
 */
public class FindAndReplacePattern {

    /**
     * TODO: Implement "Find and Replace Pattern".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find and Replace Pattern");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FindAndReplacePattern.java &amp;&amp; java org.leetcode.medium.FindAndReplacePattern</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FindAndReplacePattern ===");
        FindAndReplacePattern sol = new FindAndReplacePattern();
        System.out.println(sol.solve(null));
    }
}
