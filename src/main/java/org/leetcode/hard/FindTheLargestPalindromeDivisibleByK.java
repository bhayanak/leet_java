package org.leetcode.hard;


/**
 * <b>#3260 - Find the Largest Palindrome Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming, Greedy, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers n and k.
 *
 *
 * An integer x is called k-palindromic if:
 *
 *
 * x is a palindrome.
 *
 * x is divisible by k.
 *
 * Return the largest integer having n digits (as a string) that is k-palindromic.
 *
 *
 * Note that the integer must not have leading zeros.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, k = 5
 *
 *
 * Output: "595"
 *
 *
 * Explanation:
 *
 *
 * 595 is the largest k-palindromic integer with 3 digits.
 *
 * Example 2:
 *
 * Input: n = 1, k = 4
 *
 *
 * Output: "8"
 *
 *
 * Explanation:
 *
 *
 * 4 and 8 are the only k-palindromic integers with 1 digit.
 *
 * Example 3:
 *
 * Input: n = 5, k = 6
 *
 *
 * Output: "89898"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= k &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It must have a solution since we can have all digits equal to <code>k</code>.
 * Hint 2: Use string dp, store modulus along with length of number currently formed.
 * Hint 3: Is it possible to solve greedily using divisibility rules?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming, Greedy, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/find-the-largest-palindrome-divisible-by-k/">LeetCode #3260</a>
 */
public class FindTheLargestPalindromeDivisibleByK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Largest Palindrome Divisible by K");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheLargestPalindromeDivisibleByK ===");
        FindTheLargestPalindromeDivisibleByK sol = new FindTheLargestPalindromeDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
