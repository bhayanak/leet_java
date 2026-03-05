package org.leetcode.medium;


/**
 * <b>#833 - Find And Replace in String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s that you must perform k replacement operations on. The replacement operations are given as three 0-indexed parallel arrays, indices, sources, and targets, all of length k.
 *
 *
 * To complete the ith replacement operation:
 *
 *
 * Check if the substring sources[i] occurs at index indices[i] in the original string s.
 *
 * If it does not occur, do nothing.
 *
 * Otherwise if it does occur, replace that substring with targets[i].
 *
 * For example, if s = "abcd", indices[i] = 0, sources[i] = "ab", and targets[i] = "eee", then the result of this replacement will be "eeecd".
 *
 *
 * All replacement operations must occur simultaneously, meaning the replacement operations should not affect the indexing of each other. The testcases will be generated such that the replacements will not overlap.
 *
 *
 * For example, a testcase with s = "abc", indices = [0, 1], and sources = ["ab","bc"] will not be generated because the "ab" and "bc" replacements overlap.
 *
 * Return the resulting string after performing all replacement operations on s.
 *
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcd", indices = [0, 2], sources = ["a", "cd"], targets = ["eee", "ffff"]
 * Output: "eeebffff"
 * Explanation:
 * "a" occurs at index 0 in s, so we replace it with "eee".
 * "cd" occurs at index 2 in s, so we replace it with "ffff".
 *
 * Example 2:
 *
 * Input: s = "abcd", indices = [0, 2], sources = ["ab","ec"], targets = ["eee","ffff"]
 * Output: "eeecd"
 * Explanation:
 * "ab" occurs at index 0 in s, so we replace it with "eee".
 * "ec" does not occur at index 2 in s, so we do nothing.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * k == indices.length == sources.length == targets.length
 *
 * 1 &lt;= k &lt;= 100
 *
 * 0 &lt;= indexes[i] &lt; s.length
 *
 * 1 &lt;= sources[i].length, targets[i].length &lt;= 50
 *
 * s consists of only lowercase English letters.
 *
 * sources[i] and targets[i] consist of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-and-replace-in-string/">LeetCode #833</a>
 */
public class FindAndReplaceInString {

    /**
     * TODO: Implement "Find And Replace in String".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find And Replace in String");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FindAndReplaceInString.java &amp;&amp; java org.leetcode.medium.FindAndReplaceInString</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FindAndReplaceInString ===");
        FindAndReplaceInString sol = new FindAndReplaceInString();
        System.out.println(sol.solve(null));
    }
}
