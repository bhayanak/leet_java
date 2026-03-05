package org.leetcode.hard;


/**
 * <b>#906 - Super Palindromes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Let's say a positive integer is a super-palindrome if it is a palindrome, and it is also the square of a palindrome.
 *
 *
 * Given two positive integers left and right represented as strings, return the number of super-palindromes integers in the inclusive range [left, right].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: left = "4", right = "1000"
 * Output: 4
 * Explanation: 4, 9, 121, and 484 are superpalindromes.
 * Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.
 *
 * Example 2:
 *
 * Input: left = "1", right = "2"
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= left.length, right.length &lt;= 18
 *
 * left and right consist of only digits.
 *
 * left and right cannot have leading zeros.
 *
 * left and right represent integers in the range [1, 1018 - 1].
 *
 * left is less than or equal to right.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/super-palindromes/">LeetCode #906</a>
 */
public class SuperPalindromes {

    /**
     * TODO: Implement "Super Palindromes".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Super Palindromes");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SuperPalindromes.java &amp;&amp; java org.leetcode.hard.SuperPalindromes</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SuperPalindromes ===");
        SuperPalindromes sol = new SuperPalindromes();
        System.out.println(sol.solve(null));
    }
}
