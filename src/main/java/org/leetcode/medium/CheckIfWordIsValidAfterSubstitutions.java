package org.leetcode.medium;


/**
 * <b>#1003 - Check If Word Is Valid After Substitutions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, determine if it is valid.
 *
 *
 * A string s is valid if, starting with an empty string t = "", you can transform t into s after performing the following operation any number of times:
 *
 *
 * Insert string "abc" into any position in t. More formally, t becomes tleft + "abc" + tright, where t == tleft + tright. Note that tleft and tright may be empty.
 *
 * Return true if s is a valid string, otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aabcbc"
 * Output: true
 * Explanation:
 * "" -&gt; "abc" -&gt; "aabcbc"
 * Thus, "aabcbc" is valid.
 *
 * Example 2:
 *
 * Input: s = "abcabcababcc"
 * Output: true
 * Explanation:
 * "" -&gt; "abc" -&gt; "abcabc" -&gt; "abcabcabc" -&gt; "abcabcababcc"
 * Thus, "abcabcababcc" is valid.
 *
 * Example 3:
 *
 * Input: s = "abccba"
 * Output: false
 * Explanation: It is impossible to get "abccba" using the operation.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 2 * 104
 *
 * s consists of letters 'a', 'b', and 'c'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/">LeetCode #1003</a>
 */
public class CheckIfWordIsValidAfterSubstitutions {

    /**
     * TODO: Implement "Check If Word Is Valid After Substitutions".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check If Word Is Valid After Substitutions");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CheckIfWordIsValidAfterSubstitutions.java &amp;&amp; java org.leetcode.medium.CheckIfWordIsValidAfterSubstitutions</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CheckIfWordIsValidAfterSubstitutions ===");
        CheckIfWordIsValidAfterSubstitutions sol = new CheckIfWordIsValidAfterSubstitutions();
        System.out.println(sol.solve(null));
    }
}
