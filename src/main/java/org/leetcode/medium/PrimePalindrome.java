package org.leetcode.medium;


/**
 * <b>#866 - Prime Palindrome</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the smallest prime palindrome greater than or equal to n.
 *
 *
 * An integer is prime if it has exactly two divisors: 1 and itself. Note that 1 is not a prime number.
 *
 *
 * For example, 2, 3, 5, 7, 11, and 13 are all primes.
 *
 * An integer is a palindrome if it reads the same from left to right as it does from right to left.
 *
 *
 * For example, 101 and 12321 are palindromes.
 *
 * The test cases are generated so that the answer always exists and is in the range [2, 2 * 108].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6
 * Output: 7
 *
 *
 * Example 2:
 *
 * Input: n = 8
 * Output: 11
 *
 *
 * Example 3:
 *
 * Input: n = 13
 * Output: 101
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/prime-palindrome/">LeetCode #866</a>
 */
public class PrimePalindrome {

    /**
     * TODO: Implement "Prime Palindrome".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Prime Palindrome");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PrimePalindrome.java &amp;&amp; java org.leetcode.medium.PrimePalindrome</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PrimePalindrome ===");
        PrimePalindrome sol = new PrimePalindrome();
        System.out.println(sol.solve(null));
    }
}
