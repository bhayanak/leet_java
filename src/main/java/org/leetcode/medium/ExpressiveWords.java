package org.leetcode.medium;


/**
 * <b>#809 - Expressive Words</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Sometimes people repeat letters to represent extra feeling. For example:
 *
 *
 * "hello" -&gt; "heeellooo"
 *
 * "hi" -&gt; "hiiii"
 *
 * In these strings like "heeellooo", we have groups of adjacent letters that are all the same: "h", "eee", "ll", "ooo".
 *
 *
 * You are given a string s and an array of query strings words. A query word is stretchy if it can be made to be equal to s by any number of applications of the following extension operation: choose a group consisting of characters c, and add some number of characters c to the group so that the size of the group is three or more.
 *
 *
 * For example, starting with "hello", we could do an extension on the group "o" to get "hellooo", but we cannot get "helloo" since the group "oo" has a size less than three. Also, we could do another extension like "ll" -&gt; "lllll" to get "helllllooo". If s = "helllllooo", then the query word "hello" would be stretchy because of these two extension operations: query = "hello" -&gt; "hellooo" -&gt; "helllllooo" = s.
 *
 * Return the number of query strings that are stretchy.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "heeellooo", words = ["hello", "hi", "helo"]
 * Output: 1
 * Explanation: 
 * We can extend "e" and "o" in the word "hello" to get "heeellooo".
 * We can't extend "helo" to get "heeellooo" because the group "ll" is not size 3 or more.
 *
 * Example 2:
 *
 * Input: s = "zzzzzyyyyy", words = ["zzyy","zy","zyy"]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 100
 *
 * s and words[i] consist of lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/expressive-words/">LeetCode #809</a>
 */
public class ExpressiveWords {

    /**
     * TODO: Implement "Expressive Words".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Expressive Words");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ExpressiveWords.java &amp;&amp; java org.leetcode.medium.ExpressiveWords</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ExpressiveWords ===");
        ExpressiveWords sol = new ExpressiveWords();
        System.out.println(sol.solve(null));
    }
}
