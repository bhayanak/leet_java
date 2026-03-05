package org.leetcode.hard;


/**
 * <b>#1771 - Maximize Palindrome Length From Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings, word1 and word2. You want to construct a string in the following manner:
 *
 *
 * Choose some non-empty subsequence subsequence1 from word1.
 *
 * Choose some non-empty subsequence subsequence2 from word2.
 *
 * Concatenate the subsequences: subsequence1 + subsequence2, to make the string.
 *
 * Return the length of the longest palindrome that can be constructed in the described manner. If no palindromes can be constructed, return 0.
 *
 *
 * A subsequence of a string s is a string that can be made by deleting some (possibly none) characters from s without changing the order of the remaining characters.
 *
 *
 * A palindrome is a string that reads the same forward as well as backward.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "cacb", word2 = "cbba"
 * Output: 5
 * Explanation: Choose "ab" from word1 and "cba" from word2 to make "abcba", which is a palindrome.
 *
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "ab"
 * Output: 3
 * Explanation: Choose "ab" from word1 and "a" from word2 to make "aba", which is a palindrome.
 *
 * Example 3:
 *
 * Input: word1 = "aa", word2 = "bb"
 * Output: 0
 * Explanation: You cannot construct a palindrome from the described method, so return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word1.length, word2.length &lt;= 1000
 *
 * word1 and word2 consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's ignore the non-empty subsequence constraint. We can concatenate the two strings and find the largest palindromic subsequence with dynamic programming.
 * Hint 2: Iterate through every pair of characters word1[i] and word2[j], and see if some palindrome begins with word1[i] and ends with word2[j]. This ensures that the subsequences are non-empty.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximize-palindrome-length-from-subsequences/">LeetCode #1771</a>
 */
public class MaximizePalindromeLengthFromSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Palindrome Length From Subsequences");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximizePalindromeLengthFromSubsequences ===");
        MaximizePalindromeLengthFromSubsequences sol = new MaximizePalindromeLengthFromSubsequences();
        System.out.println(sol.solve(null));
    }
}
