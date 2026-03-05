package org.leetcode.hard;


/**
 * <b>#1745 - Palindrome Partitioning IV</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return true if it is possible to split the string s into three non-empty palindromic substrings. Otherwise, return false.​​​​​
 *
 *
 * A string is said to be palindrome if it the same string when reversed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcbdd"
 * Output: true
 * Explanation: "abcbdd" = "a" + "bcb" + "dd", and all three substrings are palindromes.
 *
 * Example 2:
 *
 * Input: s = "bcbddxy"
 * Output: false
 * Explanation: s cannot be split into 3 palindromes.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= s.length &lt;= 2000
 *
 * s​​​​​​ consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Preprocess checking palindromes in O(1)
 * Hint 2: Note that one string is a prefix and another one is a suffix you can try brute forcing the rest
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/palindrome-partitioning-iv/">LeetCode #1745</a>
 */
public class PalindromePartitioningIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Palindrome Partitioning IV");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PalindromePartitioningIv ===");
        PalindromePartitioningIv sol = new PalindromePartitioningIv();
        System.out.println(sol.solve(null));
    }
}
