package org.leetcode.hard;


/**
 * <b>#1392 - Longest Happy Prefix</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Rolling Hash, String Matching, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A string is called a happy prefix if is a non-empty prefix which is also a suffix (excluding itself).
 *
 *
 * Given a string s, return the longest happy prefix of s. Return an empty string "" if no such prefix exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "level"
 * Output: "l"
 * Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".
 *
 * Example 2:
 *
 * Input: s = "ababab"
 * Output: "abab"
 * Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Longest Prefix Suffix (KMP-table) or String Hashing.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Rolling Hash, String Matching, Hash Function).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-happy-prefix/">LeetCode #1392</a>
 */
public class LongestHappyPrefix {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Happy Prefix");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LongestHappyPrefix ===");
        LongestHappyPrefix sol = new LongestHappyPrefix();
        System.out.println(sol.solve(null));
    }
}
