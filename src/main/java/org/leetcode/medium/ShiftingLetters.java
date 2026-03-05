package org.leetcode.medium;


/**
 * <b>#848 - Shifting Letters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of lowercase English letters and an integer array shifts of the same length.
 *
 *
 * Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').
 *
 *
 * For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 *
 * Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
 *
 *
 * Return the final string after all such shifts to s are applied.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", shifts = [3,5,9]
 * Output: "rpl"
 * Explanation: We start with "abc".
 * After shifting the first 1 letters of s by 3, we have "dbc".
 * After shifting the first 2 letters of s by 5, we have "igc".
 * After shifting the first 3 letters of s by 9, we have "rpl", the answer.
 *
 * Example 2:
 *
 * Input: s = "aaa", shifts = [1,2,3]
 * Output: "gfd"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 *
 * shifts.length == s.length
 *
 * 0 &lt;= shifts[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shifting-letters/">LeetCode #848</a>
 */
public class ShiftingLetters {

    /**
     * TODO: Implement "Shifting Letters".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shifting Letters");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShiftingLetters.java &amp;&amp; java org.leetcode.medium.ShiftingLetters</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShiftingLetters ===");
        ShiftingLetters sol = new ShiftingLetters();
        System.out.println(sol.solve(null));
    }
}
