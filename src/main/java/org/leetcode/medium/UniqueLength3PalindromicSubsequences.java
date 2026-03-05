package org.leetcode.medium;


/**
 * <b>#1930 - Unique Length-3 Palindromic Subsequences</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
 *
 *
 * Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
 *
 *
 * A palindrome is a string that reads the same forwards and backwards.
 *
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 *
 *
 * For example, "ace" is a subsequence of "abcde".
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aabca"
 * Output: 3
 * Explanation: The 3 palindromic subsequences of length 3 are:
 * - "aba" (subsequence of "aabca")
 * - "aaa" (subsequence of "aabca")
 * - "aca" (subsequence of "aabca")
 *
 * Example 2:
 *
 * Input: s = "adc"
 * Output: 0
 * Explanation: There are no palindromic subsequences of length 3 in "adc".
 *
 * Example 3:
 *
 * Input: s = "bbcbaba"
 * Output: 4
 * Explanation: The 4 palindromic subsequences of length 3 are:
 * - "bbb" (subsequence of "bbcbaba")
 * - "bcb" (subsequence of "bbcbaba")
 * - "bab" (subsequence of "bbcbaba")
 * - "aba" (subsequence of "bbcbaba")
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= s.length &lt;= 105
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the maximum number of length-3 palindromic strings?
 * Hint 2: How can we keep track of the characters that appeared to the left of a given position?
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Bit Manipulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/unique-length-3-palindromic-subsequences/">LeetCode #1930</a>
 */
public class UniqueLength3PalindromicSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Unique Length-3 Palindromic Subsequences");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== UniqueLength3PalindromicSubsequences ===");
        UniqueLength3PalindromicSubsequences sol = new UniqueLength3PalindromicSubsequences();
        System.out.println(sol.solve(null));
    }
}
