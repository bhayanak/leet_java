package org.leetcode.medium;


/**
 * <b>#3503 - Longest Palindrome After Substring Concatenation I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings, s and t.
 *
 *
 * You can create a new string by selecting a substring from s (possibly empty) and a substring from t (possibly empty), then concatenating them in order.
 *
 *
 * Return the length of the longest palindrome that can be formed this way.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "a", t = "a"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Concatenating "a" from s and "a" from t results in "aa", which is a palindrome of length 2.
 *
 * Example 2:
 *
 * Input: s = "abc", t = "def"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Since all characters are different, the longest palindrome is any single character, so the answer is 1.
 *
 * Example 3:
 *
 * Input: s = "b", t = "aaaa"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Selecting "aaaa" from t is the longest palindrome, so the answer is 4.
 *
 * Example 4:
 *
 * Input: s = "abcde", t = "ecdba"
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Concatenating "abc" from s and "ba" from t results in "abcba", which is a palindrome of length 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, t.length &lt;= 30
 *
 * s and t consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Brute force
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Dynamic Programming, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/longest-palindrome-after-substring-concatenation-i/">LeetCode #3503</a>
 */
public class LongestPalindromeAfterSubstringConcatenationI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Palindrome After Substring Concatenation I");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestPalindromeAfterSubstringConcatenationI ===");
        LongestPalindromeAfterSubstringConcatenationI sol = new LongestPalindromeAfterSubstringConcatenationI();
        System.out.println(sol.solve(null));
    }
}
