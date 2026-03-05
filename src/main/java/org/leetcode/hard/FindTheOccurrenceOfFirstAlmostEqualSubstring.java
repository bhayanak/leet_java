package org.leetcode.hard;


/**
 * <b>#3303 - Find the Occurrence of First Almost Equal Substring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and pattern.
 *
 *
 * A string x is called almost equal to y if you can change at most one character in x to make it identical to y.
 *
 *
 * Return the smallest starting index of a substring in s that is almost equal to pattern. If no such index exists, return -1.
 * A substring is a contiguous non-empty sequence of characters within a string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcdefg", pattern = "bcdffg"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The substring s[1..6] == "bcdefg" can be converted to "bcdffg" by changing s[4] to "f".
 *
 * Example 2:
 *
 * Input: s = "ababbababa", pattern = "bacaba"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The substring s[4..9] == "bababa" can be converted to "bacaba" by changing s[6] to "c".
 *
 * Example 3:
 *
 * Input: s = "abcd", pattern = "dba"
 *
 *
 * Output: -1
 *
 * Example 4:
 *
 * Input: s = "dde", pattern = "d"
 *
 *
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= pattern.length &lt; s.length &lt;= 105
 *
 * s and pattern consist only of lowercase English letters.
 *
 *
 * Follow-up: Could you solve the problem if at most k consecutive characters can be changed?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp1[i]</code> represent the maximum length of a substring of <code>s</code> starting at index <code>i</code> that is also a prefix of <code>pattern</code>.
 * Hint 2: Let <code>dp2[i]</code> represent the maximum length of a substring of <code>s</code> ending at index <code>i</code> that is also a suffix of <code>pattern</code>.
 * Hint 3: Consider a window of size <code>pattern.length</code>. If <code>dp1[i] + i == i + pattern.length - 1 - dp2[i + pattern.length - 1]</code>, what does this signify?
 *
 * <h2>Approach</h2>
 * Think about the category (String, String Matching).
 *
 * @see <a href="https://leetcode.com/problems/find-the-occurrence-of-first-almost-equal-substring/">LeetCode #3303</a>
 */
public class FindTheOccurrenceOfFirstAlmostEqualSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Occurrence of First Almost Equal Substring");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheOccurrenceOfFirstAlmostEqualSubstring ===");
        FindTheOccurrenceOfFirstAlmostEqualSubstring sol = new FindTheOccurrenceOfFirstAlmostEqualSubstring();
        System.out.println(sol.solve(null));
    }
}
