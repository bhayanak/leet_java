package org.leetcode.hard;


/**
 * <b>#1316 - Distinct Echo Substrings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Trie, Rolling Hash, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Return the number of distinct non-empty substrings of text that can be written as the concatenation of some string with itself (i.e. it can be written as a + a where a is some string).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text = "abcabcabc"
 * Output: 3
 * Explanation: The 3 substrings are "abcabc", "bcabca" and "cabcab".
 *
 * Example 2:
 *
 * Input: text = "leetcodeleetcode"
 * Output: 2
 * Explanation: The 2 substrings are "ee" and "leetcodeleetcode".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text.length &lt;= 2000
 *
 * text has only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Given a substring of the text, how to check if it can be written as the concatenation of a string with itself ?
 * Hint 2: We can do that in linear time, a faster way is to use hashing.
 * Hint 3: Try all substrings and use hashing to check them.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Trie, Rolling Hash, Hash Function).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/distinct-echo-substrings/">LeetCode #1316</a>
 */
public class DistinctEchoSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distinct Echo Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DistinctEchoSubstrings ===");
        DistinctEchoSubstrings sol = new DistinctEchoSubstrings();
        System.out.println(sol.solve(null));
    }
}
