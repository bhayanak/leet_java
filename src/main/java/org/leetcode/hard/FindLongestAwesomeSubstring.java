package org.leetcode.hard;


/**
 * <b>#1542 - Find Longest Awesome Substring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s. An awesome substring is a non-empty substring of s such that we can make any number of swaps in order to make it a palindrome.
 *
 *
 * Return the length of the maximum length awesome substring of s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "3242415"
 * Output: 5
 * Explanation: "24241" is the longest awesome substring, we can form the palindrome "24142" with some swaps.
 *
 * Example 2:
 *
 * Input: s = "12345678"
 * Output: 1
 *
 * Example 3:
 *
 * Input: s = "213123"
 * Output: 6
 * Explanation: "213123" is the longest awesome substring, we can form the palindrome "231132" with some swaps.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists only of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Given the character counts, under what conditions can a palindrome be formed ?
 * Hint 2: From left to right, use bitwise xor-operation to compute for any prefix the number of times modulo 2 of each digit.  (mask ^= (1&lt;&lt;(s[i]-'0')).
 * Hint 3: Expected complexity is O(n*A) where A is the alphabet (10).
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-longest-awesome-substring/">LeetCode #1542</a>
 */
public class FindLongestAwesomeSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Longest Awesome Substring");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindLongestAwesomeSubstring ===");
        FindLongestAwesomeSubstring sol = new FindLongestAwesomeSubstring();
        System.out.println(sol.solve(null));
    }
}
