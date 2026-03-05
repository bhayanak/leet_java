package org.leetcode.medium;

/**
 * <b>#72 - Edit Distance</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 * 
 * 
 * You have the following three operations permitted on a word:
 * 
 * 	
 * Insert a character
 * 	
 * Delete a character
 * 	
 * Replace a character
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation: 
 * horse -&gt; rorse (replace 'h' with 'r')
 * rorse -&gt; rose (remove 'r')
 * rose -&gt; ros (remove 'e')
 * 
 * Example 2:
 * 
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation: 
 * intention -&gt; inention (remove 't')
 * inention -&gt; enention (replace 'i' with 'e')
 * enention -&gt; exention (replace 'n' with 'x')
 * exention -&gt; exection (replace 'n' with 'c')
 * exection -&gt; execution (insert 'u')
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= word1.length, word2.length &lt;= 500
 * 	
 * word1 and word2 consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Classic DP: dp[i][j] = min edits to convert word1[0..i-1] to word2[0..j-1].
 * If chars match: dp[i][j] = dp[i-1][j-1].
 * Else: dp[i][j] = 1 + min(insert, delete, replace).
 *
 * <h2>Complexity</h2>
* Time: O(m·n)  |  Space: O(m·n) — reducible to O(min(m,n))
 *
 * @see <a href="https://leetcode.com/problems/edit-distance/">LeetCode #72</a>
 */
public class EditDistance {

    /**
     * Computes the minimum edit distance (Levenshtein distance) between two words.
     *
     * @param word1 source string
     * @param word2 target string
     * @return      minimum insert/delete/replace operations to convert word1 → word2
     */
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) dp[i][0] = i;
        for (int j = 0; j <= n; j++) dp[0][j] = j;
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
            }
        return dp[m][n];
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                EditDistance sol = new EditDistance();
                System.out.println(sol.minDistance("horse","ros"));   // 3
                System.out.println(sol.minDistance("intention","execution")); // 5
    }
}
