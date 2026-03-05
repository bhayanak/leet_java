package org.leetcode.medium;


/**
 * <b>#3472 - Longest Palindromic Subsequence After at Most K Operations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer k.
 *
 *
 * In one operation, you can replace the character at any position with the next or previous letter in the alphabet (wrapping around so that 'a' is after 'z'). For example, replacing 'a' with the next letter results in 'b', and replacing 'a' with the previous letter results in 'z'. Similarly, replacing 'z' with the next letter results in 'a', and replacing 'z' with the previous letter results in 'y'.
 *
 *
 * Return the length of the longest palindromic subsequence of s that can be obtained after performing at most k operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abced", k = 2
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Replace s[1] with the next letter, and s becomes "acced".
 *
 * Replace s[4] with the previous letter, and s becomes "accec".
 *
 * The subsequence "ccc" forms a palindrome of length 3, which is the maximum.
 *
 * Example 2:
 *
 * Input: s = "aaazzz", k = 4
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Replace s[0] with the previous letter, and s becomes "zaazzz".
 *
 * Replace s[4] with the next letter, and s becomes "zaazaz".
 *
 * Replace s[3] with the next letter, and s becomes "zaaaaz".
 *
 * The entire string forms a palindrome of length 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 200
 *
 * 1 &lt;= k &lt;= 200
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: <code>dp[i][j][k]</code> is the length of the longest palindromic subsequence in substring <code>[i..j]</code> with cost at most <code>k</code>.
 * Hint 3: <code>dp[i][j][k] = max(dp[i + 1][j][k], dp[i][j - 1][k], dp[i + 1][j - 1][k - dist(s[i], s[j])] + 2)</code>, where <code>dist(x, y)</code> is the minimum cyclic distance between <code>x</code> and <code>y</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-subsequence-after-at-most-k-operations/">LeetCode #3472</a>
 */
public class LongestPalindromicSubsequenceAfterAtMostKOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Palindromic Subsequence After at Most K Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestPalindromicSubsequenceAfterAtMostKOperations ===");
        LongestPalindromicSubsequenceAfterAtMostKOperations sol = new LongestPalindromicSubsequenceAfterAtMostKOperations();
        System.out.println(sol.solve(null));
    }
}
