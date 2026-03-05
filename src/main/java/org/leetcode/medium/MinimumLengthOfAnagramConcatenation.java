package org.leetcode.medium;


/**
 * <b>#3138 - Minimum Length of Anagram Concatenation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s, which is known to be a concatenation of anagrams of some string t.
 *
 *
 * Return the minimum possible length of the string t.
 *
 *
 * An anagram is formed by rearranging the letters of a string. For example, "aab", "aba", and, "baa" are anagrams of "aab".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abba"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * One possible string t could be "ba".
 *
 * Example 2:
 *
 * Input: s = "cdef"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * One possible string t could be "cdef", notice that t can be equal to s.
 *
 * Example 2:
 *
 * Input: s = "abcbcacabbaccba"
 *
 *
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The answer should be a divisor of <code>s.length</code>.
 * Hint 2: Check each candidate naively.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-length-of-anagram-concatenation/">LeetCode #3138</a>
 */
public class MinimumLengthOfAnagramConcatenation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Length of Anagram Concatenation");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumLengthOfAnagramConcatenation ===");
        MinimumLengthOfAnagramConcatenation sol = new MinimumLengthOfAnagramConcatenation();
        System.out.println(sol.solve(null));
    }
}
