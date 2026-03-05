package org.leetcode.medium;


/**
 * <b>#1023 - Camelcase Matching</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, String, Trie, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings queries and a string pattern, return a boolean array answer where answer[i] is true if queries[i] matches pattern, and false otherwise.
 *
 *
 * A query word queries[i] matches pattern if you can insert lowercase English letters into the pattern so that it equals the query. You may insert a character at any position in pattern or you may choose not to insert any characters at all.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
 * Output: [true,false,true,true,false]
 * Explanation: "FooBar" can be generated like this "F" + "oo" + "B" + "ar".
 * "FootBall" can be generated like this "F" + "oot" + "B" + "all".
 * "FrameBuffer" can be generated like this "F" + "rame" + "B" + "uffer".
 *
 * Example 2:
 *
 * Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBa"
 * Output: [true,false,true,false,false]
 * Explanation: "FooBar" can be generated like this "Fo" + "o" + "Ba" + "r".
 * "FootBall" can be generated like this "Fo" + "ot" + "Ba" + "ll".
 *
 * Example 3:
 *
 * Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBaT"
 * Output: [false,true,false,false,false]
 * Explanation: "FooBarTest" can be generated like this "Fo" + "o" + "Ba" + "r" + "T" + "est".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= pattern.length, queries.length &lt;= 100
 *
 * 1 &lt;= queries[i].length &lt;= 100
 *
 * queries[i] and pattern consist of English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Given a single pattern and word, how can we solve it?
 * Hint 2: One way to do it is using a DP (pos1, pos2) where pos1 is a pointer to the word and pos2 to the pattern and returns true if we can match the pattern with the given word.
 * Hint 3: We have two scenarios: The first one is when <code>word[pos1] == pattern[pos2]</code>, then the transition will be just DP(pos1 + 1, pos2 + 1). The second scenario is when <code>word[pos1]</code> is lowercase then we can add this character to the pattern so that the transition is just DP(pos1 + 1, pos2)
The case base is <code>if (pos1 == n &amp;&amp; pos2 == m) return true;</code> Where n and m are the sizes of the strings word and pattern respectively.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String, Trie, String Matching).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/camelcase-matching/">LeetCode #1023</a>
 */
public class CamelcaseMatching {

    /**
     * TODO: Implement "Camelcase Matching".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Camelcase Matching");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CamelcaseMatching.java &amp;&amp; java org.leetcode.medium.CamelcaseMatching</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CamelcaseMatching ===");
        CamelcaseMatching sol = new CamelcaseMatching();
        System.out.println(sol.solve(null));
    }
}
