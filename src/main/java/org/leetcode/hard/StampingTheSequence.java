package org.leetcode.hard;


/**
 * <b>#936 - Stamping The Sequence</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Stack, Greedy, Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings stamp and target. Initially, there is a string s of length target.length with all s[i] == '?'.
 *
 *
 * In one turn, you can place stamp over s and replace every letter in the s with the corresponding letter from stamp.
 *
 *
 * For example, if stamp = "abc" and target = "abcba", then s is "?????" initially. In one turn you can:
 *
 *
 *
 *
 * place stamp at index 0 of s to obtain "abc??",
 *
 * place stamp at index 1 of s to obtain "?abc?", or
 *
 * place stamp at index 2 of s to obtain "??abc".
 *
 * 	Note that stamp must be fully contained in the boundaries of s in order to stamp (i.e., you cannot place stamp at index 3 of s).
 *
 * We want to convert s to target using at most 10 * target.length turns.
 *
 *
 * Return an array of the index of the left-most letter being stamped at each turn. If we cannot obtain target from s within 10 * target.length turns, return an empty array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: stamp = "abc", target = "ababc"
 * Output: [0,2]
 * Explanation: Initially s = "?????".
 * - Place stamp at index 0 to get "abc??".
 * - Place stamp at index 2 to get "ababc".
 * [1,0,2] would also be accepted as an answer, as well as some other answers.
 *
 * Example 2:
 *
 * Input: stamp = "abca", target = "aabcaca"
 * Output: [3,0,1]
 * Explanation: Initially s = "???????".
 * - Place stamp at index 3 to get "???abca".
 * - Place stamp at index 0 to get "abcabca".
 * - Place stamp at index 1 to get "aabcaca".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= stamp.length &lt;= target.length &lt;= 1000
 *
 * stamp and target consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Greedy, Queue).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stamping-the-sequence/">LeetCode #936</a>
 */
public class StampingTheSequence {

    /**
     * TODO: Implement "Stamping The Sequence".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stamping The Sequence");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac StampingTheSequence.java &amp;&amp; java org.leetcode.hard.StampingTheSequence</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== StampingTheSequence ===");
        StampingTheSequence sol = new StampingTheSequence();
        System.out.println(sol.solve(null));
    }
}
