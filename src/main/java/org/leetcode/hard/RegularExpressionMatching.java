package org.leetcode.hard;

/**
 * <b>#10 - Regular Expression Matching</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 * 
 * 	
 * '.' Matches any single character.​​​​
 * 	
 * '*' Matches zero or more of the preceding element.
 * 
 * Return a boolean indicating whether the matching covers the entire input string (not partial).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * 
 * Example 2:
 * 
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * 
 * Example 3:
 * 
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 20
 * 	
 * 1 &lt;= p.length &lt;= 20
 * 	
 * s contains only lowercase English letters.
 * 	
 * p contains only lowercase English letters, '.', and '*'.
 * 	
 * It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Dynamic Programming on a 2-D table dp[i][j] = "does s[0..i-1] match p[0..j-1]?".
 * Key case: p[j-1]=='*' means the pair (pattern[j-2], '*') can match 0 or more chars.
 *   - Zero occurrences: dp[i][j] = dp[i][j-2]
 *   - One+ occurrences: dp[i][j] = dp[i-1][j] when chars match (s[i-1]==p[j-2] or p[j-2]=='.')
 *
 * <h2>Complexity</h2>
* Time: O(m·n)  |  Space: O(m·n)
 *
 * @see <a href="https://leetcode.com/problems/regular-expression-matching/">LeetCode #10</a>
 */
public class RegularExpressionMatching {

    /**
     * Returns true if the entire string s matches the pattern p.
     * Supported wildcards: '.' matches any single char, '*' matches 0+ of the preceding.
     *
     * @param s input string (lowercase letters)
     * @param p pattern string (lowercase letters, '.', '*')
     * @return  true if s fully matches p
     */
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Patterns like a*, a*b*, a*b*c* can match empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') dp[0][j] = dp[0][j - 2];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char pc = p.charAt(j - 1), sc = s.charAt(i - 1);
                if (pc == '*') {
                    dp[i][j] = dp[i][j - 2]; // 0 occurrences
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == sc) {
                        dp[i][j] |= dp[i - 1][j]; // 1+ occurrences
                    }
                } else if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                RegularExpressionMatching sol = new RegularExpressionMatching();
                System.out.println(sol.isMatch("aa", "a"));    // false
                System.out.println(sol.isMatch("aa", "a*"));   // true
                System.out.println(sol.isMatch("ab", ".*"));   // true
    }
}
