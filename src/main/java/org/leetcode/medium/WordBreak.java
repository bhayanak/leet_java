package org.leetcode.medium;

/**
 * <b>#139 - Word Break</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Dynamic Programming, Trie, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 * 
 * 
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * 
 * Example 2:
 * 
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 * 
 * Example 3:
 * 
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 300
 * 	
 * 1 &lt;= wordDict.length &lt;= 1000
 * 	
 * 1 &lt;= wordDict[i].length &lt;= 20
 * 	
 * s and wordDict[i] consist of only lowercase English letters.
 * 	
 * All the strings of wordDict are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * DP: dp[i] = true if s[0..i-1] can be segmented using wordDict.
 * For each i, try all j &lt; i where dp[j] is true and s[j..i-1] is in the dict.
 *
 * <h2>Complexity</h2>
* Time: O(n²·m) where m=avg word length  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/word-break/">LeetCode #139</a>
 */
public class WordBreak {

    /**
     * Determines if s can be segmented into words from wordDict.
     * @param s        input string
     * @param wordDict list of valid words
     * @return true if s can be fully segmented
     */
    public boolean wordBreak(String s, java.util.List<String> wordDict) {
        java.util.Set<String> dict = new java.util.HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // empty string
        for (int i = 1; i <= n; i++)
            for (int j = 0; j < i; j++)
                if (dp[j] && dict.contains(s.substring(j, i))) { dp[i] = true; break; }
        return dp[n];
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac WordBreak.java &amp;&amp; java org.leetcode.medium.WordBreak
     *
     * @param args not used
     */
    public static void main(String[] args) {
        WordBreak sol = new WordBreak();
        System.out.println(sol.wordBreak("leetcode", java.util.Arrays.asList("leet","code"))); // true
        System.out.println(sol.wordBreak("applepenapple", java.util.Arrays.asList("apple","pen"))); // true
        System.out.println(sol.wordBreak("catsandog", java.util.Arrays.asList("cats","dog","sand","and","cat"))); // false
    }
}
