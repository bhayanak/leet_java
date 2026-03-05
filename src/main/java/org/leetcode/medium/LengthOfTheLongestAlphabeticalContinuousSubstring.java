package org.leetcode.medium;


/**
 * <b>#2414 - Length of the Longest Alphabetical Continuous Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An alphabetical continuous string is a string consisting of consecutive letters in the alphabet. In other words, it is any substring of the string "abcdefghijklmnopqrstuvwxyz".
 *
 *
 * For example, "abc" is an alphabetical continuous string, while "acb" and "za" are not.
 *
 * Given a string s consisting of lowercase letters only, return the length of the longest alphabetical continuous substring.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abacaba"
 * Output: 2
 * Explanation: There are 4 distinct continuous substrings: "a", "b", "c" and "ab".
 * "ab" is the longest continuous substring.
 *
 * Example 2:
 *
 * Input: s = "abcde"
 * Output: 5
 * Explanation: "abcde" is the longest continuous substring.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of only English lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the longest possible continuous substring?
 * Hint 2: The size of the longest possible continuous substring is at most 26, so we can just brute force the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/">LeetCode #2414</a>
 */
public class LengthOfTheLongestAlphabeticalContinuousSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Length of the Longest Alphabetical Continuous Substring");
    }

    public static void main(String[] args) {
        System.out.println("=== LengthOfTheLongestAlphabeticalContinuousSubstring ===");
        LengthOfTheLongestAlphabeticalContinuousSubstring sol = new LengthOfTheLongestAlphabeticalContinuousSubstring();
        System.out.println(sol.solve(null));
    }
}
