package org.leetcode.medium;


/**
 * <b>#937 - Reorder Data in Log Files</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.
 *
 *
 * There are two types of logs:
 *
 *
 * Letter-logs: All words (except the identifier) consist of lowercase English letters.
 *
 * Digit-logs: All words (except the identifier) consist of digits.
 *
 * Reorder these logs so that:
 *
 *
 * The letter-logs come before all digit-logs.
 *
 * The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
 *
 * The digit-logs maintain their relative ordering.
 *
 * Return the final order of the logs.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
 * Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 * Explanation:
 * The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
 * The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
 *
 * Example 2:
 *
 * Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= logs.length &lt;= 100
 *
 * 3 &lt;= logs[i].length &lt;= 100
 *
 * All the tokens of logs[i] are separated by a single space.
 *
 * logs[i] is guaranteed to have an identifier and at least one word after the identifier.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reorder-data-in-log-files/">LeetCode #937</a>
 */
public class ReorderDataInLogFiles {

    /**
     * TODO: Implement "Reorder Data in Log Files".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reorder Data in Log Files");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ReorderDataInLogFiles.java &amp;&amp; java org.leetcode.medium.ReorderDataInLogFiles</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ReorderDataInLogFiles ===");
        ReorderDataInLogFiles sol = new ReorderDataInLogFiles();
        System.out.println(sol.solve(null));
    }
}
