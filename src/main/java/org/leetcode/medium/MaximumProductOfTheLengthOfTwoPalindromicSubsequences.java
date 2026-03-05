package org.leetcode.medium;


/**
 * <b>#2002 - Maximum Product of the Length of Two Palindromic Subsequences</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, find two disjoint palindromic subsequences of s such that the product of their lengths is maximized. The two subsequences are disjoint if they do not both pick a character at the same index.
 *
 *
 * Return the maximum possible product of the lengths of the two palindromic subsequences.
 *
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters. A string is palindromic if it reads the same forward and backward.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcodecom"
 * Output: 9
 * Explanation: An optimal solution is to choose "ete" for the 1st subsequence and "cdc" for the 2nd subsequence.
 * The product of their lengths is: 3 * 3 = 9.
 *
 * Example 2:
 *
 * Input: s = "bb"
 * Output: 1
 * Explanation: An optimal solution is to choose "b" (the first character) for the 1st subsequence and "b" (the second character) for the 2nd subsequence.
 * The product of their lengths is: 1 * 1 = 1.
 *
 * Example 3:
 *
 * Input: s = "accbcaxxcxx"
 * Output: 25
 * Explanation: An optimal solution is to choose "accca" for the 1st subsequence and "xxcxx" for the 2nd subsequence.
 * The product of their lengths is: 5 * 5 = 25.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 12
 *
 * s consists of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could you generate all possible pairs of disjoint subsequences?
 * Hint 2: Could you find the maximum length palindrome in each subsequence for a pair of disjoint subsequences?
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-of-the-length-of-two-palindromic-subsequences/">LeetCode #2002</a>
 */
public class MaximumProductOfTheLengthOfTwoPalindromicSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Product of the Length of Two Palindromic Subsequences");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumProductOfTheLengthOfTwoPalindromicSubsequences ===");
        MaximumProductOfTheLengthOfTwoPalindromicSubsequences sol = new MaximumProductOfTheLengthOfTwoPalindromicSubsequences();
        System.out.println(sol.solve(null));
    }
}
