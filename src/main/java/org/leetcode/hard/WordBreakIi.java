package org.leetcode.hard;

/**
 * <b>#140 - Word Break II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Dynamic Programming, Backtracking, Trie, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.
 * 
 * 
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
 * Output: ["cats and dog","cat sand dog"]
 * 
 * Example 2:
 * 
 * Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
 * Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
 * Explanation: Note that you are allowed to reuse a dictionary word.
 * 
 * Example 3:
 * 
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 20
 * 	
 * 1 &lt;= wordDict.length &lt;= 1000
 * 	
 * 1 &lt;= wordDict[i].length &lt;= 10
 * 	
 * s and wordDict[i] consist of only lowercase English letters.
 * 	
 * All the strings of wordDict are unique.
 * 	
 * Input is generated in a way that the length of the answer doesn't exceed 105.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/word-break-ii/">LeetCode #140</a>
 */
public class WordBreakIi {

    /**
     * TODO: Implement solution for "Word Break II".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Word Break II");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac WordBreakIi.java &amp;&amp; java org.leetcode.hard.WordBreakIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== WordBreakIi ===");
        WordBreakIi sol = new WordBreakIi();
        System.out.println(sol.solve(null));
    }
}
