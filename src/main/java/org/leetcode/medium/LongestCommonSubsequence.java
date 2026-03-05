package org.leetcode.medium;


/**
 * <b>#1143 - Longest Common Subsequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 *
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 *
 *
 * For example, "ace" is a subsequence of "abcde".
 *
 * A common subsequence of two strings is a subsequence that is common to both strings.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text1 = "abcde", text2 = "ace" 
 * Output: 3  
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 *
 * Example 2:
 *
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 *
 * Example 3:
 *
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text1.length, text2.length &lt;= 1000
 *
 * text1 and text2 consist of only lowercase English characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try dynamic programming. 
DP[i][j] represents the longest common subsequence of text1[0 ... i] &amp; text2[0 ... j].
 * Hint 2: DP[i][j] = DP[i - 1][j - 1] + 1 , if text1[i] == text2[j]
DP[i][j] = max(DP[i - 1][j], DP[i][j - 1]) , otherwise
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-common-subsequence/">LeetCode #1143</a>
 */
public class LongestCommonSubsequence {

    /**
     * Finds the longest Longest common subsequence.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param text1 the text1 (String)
     * @param text2 the text2 (String)
     * @return the computed int result
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length(), n=text2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i=1;i<=m;i++)
            for (int j=1;j<=n;j++)
                dp[i][j] = text1.charAt(i-1)==text2.charAt(j-1)
                    ? dp[i-1][j-1]+1
                    : Math.max(dp[i-1][j],dp[i][j-1]);
        return dp[m][n];
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestCommonSubsequence.java &amp;&amp; java org.leetcode.medium.LongestCommonSubsequence</pre>
     */
    public static void main(String[] args) {
        LongestCommonSubsequence sol = new LongestCommonSubsequence();
                System.out.println(sol.longestCommonSubsequence("abcde","ace")); // 3
                System.out.println(sol.longestCommonSubsequence("abc","abc"));   // 3
                System.out.println(sol.longestCommonSubsequence("abc","def"));   // 0
    }
}
