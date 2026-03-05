package org.leetcode.hard;


/**
 * <b>#1278 - Palindrome Partitioning III</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s containing lowercase letters and an integer k. You need to :
 *
 *
 * First, change some characters of s to other lowercase English letters.
 *
 * Then divide s into k non-empty disjoint substrings such that each substring is a palindrome.
 *
 * Return the minimal number of characters that you need to change to divide the string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", k = 2
 * Output: 1
 * Explanation: You can split the string into "ab" and "c", and change 1 character in "ab" to make it palindrome.
 *
 * Example 2:
 *
 * Input: s = "aabbc", k = 3
 * Output: 0
 * Explanation: You can split the string into "aa", "bb" and "c", all of them are palindrome.
 *
 * Example 3:
 *
 * Input: s = "leetcode", k = 8
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= s.length &lt;= 100.
 *
 * s only contains lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each substring calculate the minimum number of steps to make it palindrome and store it in a table.
 * Hint 2: Create a dp(pos, cnt) which means the minimum number of characters changed for the suffix of s starting on pos splitting the suffix on cnt chunks.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/palindrome-partitioning-iii/">LeetCode #1278</a>
 */
public class PalindromePartitioningIii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Palindrome Partitioning III");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PalindromePartitioningIii ===");
        PalindromePartitioningIii sol = new PalindromePartitioningIii();
        System.out.println(sol.solve(null));
    }
}
