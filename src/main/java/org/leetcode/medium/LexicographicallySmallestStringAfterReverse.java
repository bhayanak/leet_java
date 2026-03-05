package org.leetcode.medium;


/**
 * <b>#3722 - Lexicographically Smallest String After Reverse</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, Binary Search, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of length n consisting of lowercase English letters.
 *
 *
 * You must perform exactly one operation by choosing any integer k such that 1 &lt;= k &lt;= n and either:
 *
 *
 * reverse the first k characters of s, or
 *
 * reverse the last k characters of s.
 *
 * Return the lexicographically smallest string that can be obtained after exactly one such operation.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "dcab"
 *
 *
 * Output: "acdb"
 *
 *
 * Explanation:
 *
 *
 * Choose k = 3, reverse the first 3 characters.
 *
 * Reverse "dca" to "acd", resulting string s = "acdb", which is the lexicographically smallest string achievable.
 *
 * Example 2:
 *
 * Input: s = "abba"
 *
 *
 * Output: "aabb"
 *
 *
 * Explanation:
 *
 *
 * Choose k = 3, reverse the last 3 characters.
 *
 * Reverse "bba" to "abb", so the resulting string is "aabb", which is the lexicographically smallest string achievable.
 *
 * Example 3:
 *
 * Input: s = "zxy"
 *
 *
 * Output: "xzy"
 *
 *
 * Explanation:
 *
 *
 * Choose k = 2, reverse the first 2 characters.
 *
 * Reverse "zx" to "xz", so the resulting string is "xzy", which is the lexicographically smallest string achievable.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == s.length &lt;= 1000
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use bruteforce
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, Binary Search, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-string-after-reverse/">LeetCode #3722</a>
 */
public class LexicographicallySmallestStringAfterReverse {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Lexicographically Smallest String After Reverse");
    }

    public static void main(String[] args) {
        System.out.println("=== LexicographicallySmallestStringAfterReverse ===");
        LexicographicallySmallestStringAfterReverse sol = new LexicographicallySmallestStringAfterReverse();
        System.out.println(sol.solve(null));
    }
}
