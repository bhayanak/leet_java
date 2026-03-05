package org.leetcode.hard;


/**
 * <b>#1163 - Last Substring in Lexicographical Order</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the last substring of s in lexicographical order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abab"
 * Output: "bab"
 * Explanation: The substrings are ["a", "ab", "aba", "abab", "b", "ba", "bab"]. The lexicographically maximum substring is "bab".
 *
 * Example 2:
 *
 * Input: s = "leetcode"
 * Output: "tcode"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 4 * 105
 *
 * s contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Assume that the answer is a sub-string from index i to j. If you add the character at index j+1 you get a better answer.
 * Hint 2: The answer is always a suffix of the given string.
 * Hint 3: Since the limits are high, we need an efficient data structure.
 * Hint 4: Use suffix array.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/last-substring-in-lexicographical-order/">LeetCode #1163</a>
 */
public class LastSubstringInLexicographicalOrder {

    /**
     * TODO: Implement "Last Substring in Lexicographical Order".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Last Substring in Lexicographical Order");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LastSubstringInLexicographicalOrder.java &amp;&amp; java org.leetcode.hard.LastSubstringInLexicographicalOrder</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LastSubstringInLexicographicalOrder ===");
        LastSubstringInLexicographicalOrder sol = new LastSubstringInLexicographicalOrder();
        System.out.println(sol.solve(null));
    }
}
