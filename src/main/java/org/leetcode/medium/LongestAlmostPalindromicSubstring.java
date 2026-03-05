package org.leetcode.medium;


/**
 * <b>#3844 - Longest Almost-Palindromic Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters.
 *
 *
 * A substring is almost-palindromic if it becomes a palindrome after removing exactly one character from it.
 *
 *
 * Return an integer denoting the length of the longest almost-palindromic substring in s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abca"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Choose the substring "abca".
 *
 *
 * Remove "abca".
 *
 * The string becomes "aba", which is a palindrome.
 *
 * Therefore, "abca" is almost-palindromic.
 *
 * Example 2:
 *
 * Input: s = "abba"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Choose the substring "abba".
 *
 *
 * Remove "abba".
 *
 * The string becomes "aba", which is a palindrome.
 *
 * Therefore, "abba" is almost-palindromic.
 *
 * Example 3:
 *
 * Input: s = "zzabba"
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Choose the substring "zzabba".
 *
 *
 * Remove "zabba".
 *
 * The string becomes "abba", which is a palindrome.
 *
 * Therefore, "zabba" is almost-palindromic.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 2500
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve greedily
 * Hint 2: Fix the center (consider both odd and even centers) and expand outwards
 * Hint 3: On the first mismatch, try skipping the left character and continue expanding, and also try skipping the right character; take the longer result
 * Hint 4: Track the maximum length found across all centers
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/longest-almost-palindromic-substring/">LeetCode #3844</a>
 */
public class LongestAlmostPalindromicSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Almost-Palindromic Substring");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestAlmostPalindromicSubstring ===");
        LongestAlmostPalindromicSubstring sol = new LongestAlmostPalindromicSubstring();
        System.out.println(sol.solve(null));
    }
}
