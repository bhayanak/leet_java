package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #583: Delete Operation for Two Strings
 * @see <a href="https://leetcode.com/problems/delete-operation-for-two-strings/">Problem</a>
 */
public class DeleteOperationForTwoStrings {

    /**
     * LeetCode #583 – Delete Operation for Two Strings
     * Difficulty: MEDIUM
     * Topics: String, Dynamic Programming
     *
     * Given two strings word1 and word2, return the minimum number of steps
     * required to make word1 and word2 the same.
     * 
     * 
     * In one step, you can delete exactly one character in either string.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: word1 = "sea", word2 = "eat"
     * Output: 2
     * Explanation: You need one step to make "sea" to "ea" and another step to
     * make "eat" to "ea".
     * 
     * Example 2:
     * 
     * Input: word1 = "leetcode", word2 = "etco"
     * Output: 4
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= word1.length, word2.length &lt;= 500
     * 
     * word1 and word2 consist of only lowercase English letters.
     */
    // LCS approach: deletions = m + n - 2*LCS
    /**
     * Computes the minimum Min distance.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param word1 the word1 (String)
     * @param word2 the word2 (String)
     * @return the computed int result
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                dp[i][j] = word1.charAt(i-1) == word2.charAt(j-1)
                    ? dp[i-1][j-1] + 1
                    : Math.max(dp[i-1][j], dp[i][j-1]);
        return m + n - 2 * dp[m][n];
    }

    public static void main(String[] args) {
        DeleteOperationForTwoStrings sol = new DeleteOperationForTwoStrings();
        System.out.println(sol.minDistance("hello", "hello"));
    }
}
