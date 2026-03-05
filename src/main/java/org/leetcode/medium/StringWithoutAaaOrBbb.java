package org.leetcode.medium;


/**
 * <b>#984 - String Without AAA or BBB</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers a and b, return any string s such that:
 *
 *
 * s has length a + b and contains exactly a 'a' letters, and exactly b 'b' letters,
 *
 * The substring 'aaa' does not occur in s, and
 *
 * The substring 'bbb' does not occur in s.
 *
 *
 *
 * Example 1:
 *
 * Input: a = 1, b = 2
 * Output: "abb"
 * Explanation: "abb", "bab" and "bba" are all correct answers.
 *
 * Example 2:
 *
 * Input: a = 4, b = 1
 * Output: "aabaa"
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= a, b &lt;= 100
 *
 * It is guaranteed such an s exists for the given a and b.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/string-without-aaa-or-bbb/">LeetCode #984</a>
 */
public class StringWithoutAaaOrBbb {

    /**
     * TODO: Implement "String Without AAA or BBB".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: String Without AAA or BBB");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac StringWithoutAaaOrBbb.java &amp;&amp; java org.leetcode.medium.StringWithoutAaaOrBbb</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== StringWithoutAaaOrBbb ===");
        StringWithoutAaaOrBbb sol = new StringWithoutAaaOrBbb();
        System.out.println(sol.solve(null));
    }
}
