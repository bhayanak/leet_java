package org.leetcode.medium;


/**
 * <b>#2730 - Find the Longest Semi-Repetitive Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a digit string s that consists of digits from 0 to 9.
 *
 *
 * A string is called semi-repetitive if there is at most one adjacent pair of the same digit. For example, "0010", "002020", "0123", "2002", and "54944" are semi-repetitive while the following are not: "00101022" (adjacent same digit pairs are 00 and 22), and "1101234883" (adjacent same digit pairs are 11 and 88).
 *
 *
 * Return the length of the longest semi-repetitive substring of s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "52233"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The longest semi-repetitive substring is "5223". Picking the whole string "52233" has two adjacent same digit pairs 22 and 33, but at most one is allowed.
 *
 * Example 2:
 *
 * Input: s = "5494"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * s is a semi-repetitive string.
 *
 * Example 3:
 *
 * Input: s = "1111111"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The longest semi-repetitive substring is "11". Picking the substring "111" has two adjacent same digit pairs, but at most one is allowed.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 50
 *
 * '0' &lt;= s[i] &lt;= '9'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since n is small, we can just check every substring, and if the substring is semi-repetitive, maximize the answer with its length.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/find-the-longest-semi-repetitive-substring/">LeetCode #2730</a>
 */
public class FindTheLongestSemiRepetitiveSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Longest Semi-Repetitive Substring");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheLongestSemiRepetitiveSubstring ===");
        FindTheLongestSemiRepetitiveSubstring sol = new FindTheLongestSemiRepetitiveSubstring();
        System.out.println(sol.solve(null));
    }
}
