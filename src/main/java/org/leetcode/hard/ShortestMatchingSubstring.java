package org.leetcode.hard;


/**
 * <b>#3455 - Shortest Matching Substring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, String, Binary Search, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and a pattern string p, where p contains exactly two '*' characters.
 *
 *
 * The '*' in p matches any sequence of zero or more characters.
 *
 *
 * Return the length of the shortest substring in s that matches p. If there is no such substring, return -1.
 * Note: The empty substring is considered valid.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abaacbaecebce", p = "ba*c*ce"
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * The shortest matching substring of p in s is "baecebce".
 *
 * Example 2:
 *
 * Input: s = "baccbaadbc", p = "cc*baa*adb"
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * There is no matching substring in s.
 *
 * Example 3:
 *
 * Input: s = "a", p = "**"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The empty substring is the shortest matching substring.
 *
 * Example 4:
 *
 * Input: s = "madlogic", p = "*adlogi*"
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The shortest matching substring of p in s is "adlogi".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * 2 &lt;= p.length &lt;= 105
 *
 * s contains only lowercase English letters.
 *
 * p contains only lowercase English letters and exactly two '*'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The pattern string <code>p</code> can be divided into three segments.
 * Hint 2: Use the KMP algorithm to locate all occurrences of each segment in <code>s</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Binary Search, String Matching).
 *
 * @see <a href="https://leetcode.com/problems/shortest-matching-substring/">LeetCode #3455</a>
 */
public class ShortestMatchingSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Matching Substring");
    }

    public static void main(String[] args) {
        System.out.println("=== ShortestMatchingSubstring ===");
        ShortestMatchingSubstring sol = new ShortestMatchingSubstring();
        System.out.println(sol.solve(null));
    }
}
