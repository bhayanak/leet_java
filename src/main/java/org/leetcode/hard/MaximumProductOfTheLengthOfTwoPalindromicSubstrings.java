package org.leetcode.hard;


/**
 * <b>#1960 - Maximum Product of the Length of Two Palindromic Substrings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, String, Rolling Hash, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s and are tasked with finding two non-intersecting palindromic substrings of odd length such that the product of their lengths is maximized.
 *
 *
 * More formally, you want to choose four integers i, j, k, l such that 0 &lt;= i &lt;= j &lt; k &lt;= l &lt; s.length and both the substrings s[i...j] and s[k...l] are palindromes and have odd lengths. s[i...j] denotes a substring from index i to index j inclusive.
 *
 *
 * Return the maximum possible product of the lengths of the two non-intersecting palindromic substrings.
 *
 *
 * A palindrome is a string that is the same forward and backward. A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ababbb"
 * Output: 9
 * Explanation: Substrings "aba" and "bbb" are palindromes with odd length. product = 3 * 3 = 9.
 *
 * Example 2:
 *
 * Input: s = "zaaaxbbby"
 * Output: 9
 * Explanation: Substrings "aaa" and "bbb" are palindromes with odd length. product = 3 * 3 = 9.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can use Manacher's algorithm to get the maximum palindromic substring centered at each index
 * Hint 2: After using Manacher's for each center use a line sweep from the center to the left and from the center to the right to find for each index the farthest center to it with distance ≤ palin[center]
 * Hint 3: After that, find the maximum palindrome size for each prefix in the string and for each suffix and the answer would be max(prefix[i] * suffix[i + 1])
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Rolling Hash, Hash Function).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-of-the-length-of-two-palindromic-substrings/">LeetCode #1960</a>
 */
public class MaximumProductOfTheLengthOfTwoPalindromicSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Product of the Length of Two Palindromic Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumProductOfTheLengthOfTwoPalindromicSubstrings ===");
        MaximumProductOfTheLengthOfTwoPalindromicSubstrings sol = new MaximumProductOfTheLengthOfTwoPalindromicSubstrings();
        System.out.println(sol.solve(null));
    }
}
