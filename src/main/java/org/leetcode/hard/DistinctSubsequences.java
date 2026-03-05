package org.leetcode.hard;

/**
 * <b>#115 - Distinct Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 * 
 * 
 * The test cases are generated so that the answer fits on a 32-bit signed integer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "rabbbit", t = "rabbit"
 * Output: 3
 * Explanation:
 * As shown below, there are 3 ways you can generate "rabbit" from s.
 * rabbbit
 * rabbbit
 * rabbbit
 * 
 * Example 2:
 * 
 * Input: s = "babgbag", t = "bag"
 * Output: 5
 * Explanation:
 * As shown below, there are 5 ways you can generate "bag" from s.
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length, t.length &lt;= 1000
 * 	
 * s and t consist of English letters.
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
 * @see <a href="https://leetcode.com/problems/distinct-subsequences/">LeetCode #115</a>
 */
public class DistinctSubsequences {

    /**
     * TODO: Implement solution for "Distinct Subsequences".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Distinct Subsequences");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac DistinctSubsequences.java &amp;&amp; java org.leetcode.hard.DistinctSubsequences
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== DistinctSubsequences ===");
        DistinctSubsequences sol = new DistinctSubsequences();
        System.out.println(sol.solve(null));
    }
}
