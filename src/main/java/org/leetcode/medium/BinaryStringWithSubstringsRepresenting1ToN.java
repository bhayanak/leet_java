package org.leetcode.medium;


/**
 * <b>#1016 - Binary String With Substrings Representing 1 To N</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Bit Manipulation, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary string s and a positive integer n, return true if the binary representation of all the integers in the range [1, n] are substrings of s, or false otherwise.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "0110", n = 3
 * Output: true
 *
 *
 * Example 2:
 *
 * Input: s = "0110", n = 4
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s[i] is either '0' or '1'.
 *
 * 1 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We only need to check substrings of length at most 30, because 10^9 has 30 bits.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Bit Manipulation, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/">LeetCode #1016</a>
 */
public class BinaryStringWithSubstringsRepresenting1ToN {

    /**
     * TODO: Implement "Binary String With Substrings Representing 1 To N".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Binary String With Substrings Representing 1 To N");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinaryStringWithSubstringsRepresenting1ToN.java &amp;&amp; java org.leetcode.medium.BinaryStringWithSubstringsRepresenting1ToN</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BinaryStringWithSubstringsRepresenting1ToN ===");
        BinaryStringWithSubstringsRepresenting1ToN sol = new BinaryStringWithSubstringsRepresenting1ToN();
        System.out.println(sol.solve(null));
    }
}
