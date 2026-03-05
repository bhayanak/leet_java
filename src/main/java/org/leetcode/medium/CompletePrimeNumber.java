package org.leetcode.medium;


/**
 * <b>#3765 - Complete Prime Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Enumeration, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer num.
 *
 *
 * A number num is called a Complete Prime Number if every prefix and every suffix of num is prime.
 *
 *
 * Return true if num is a Complete Prime Number, otherwise return false.
 *
 *
 * Note:
 *
 *
 * A prefix of a number is formed by the first k digits of the number.
 *
 * A suffix of a number is formed by the last k digits of the number.
 *
 * Single-digit numbers are considered Complete Prime Numbers only if they are prime.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 23
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * ​​​​​​​Prefixes of num = 23 are 2 and 23, both are prime.
 *
 * Suffixes of num = 23 are 3 and 23, both are prime.
 *
 * All prefixes and suffixes are prime, so 23 is a Complete Prime Number and the answer is true.
 *
 * Example 2:
 *
 * Input: num = 39
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * Prefixes of num = 39 are 3 and 39. 3 is prime, but 39 is not prime.
 *
 * Suffixes of num = 39 are 9 and 39. Both 9 and 39 are not prime.
 *
 * At least one prefix or suffix is not prime, so 39 is not a Complete Prime Number and the answer is false.
 *
 * Example 3:
 *
 * Input: num = 7
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * 7 is prime, so all its prefixes and suffixes are prime and the answer is true.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check primality for all prefixes and all suffixes of <code>num</code> and return true only if every one is prime.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/complete-prime-number/">LeetCode #3765</a>
 */
public class CompletePrimeNumber {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Complete Prime Number");
    }

    public static void main(String[] args) {
        System.out.println("=== CompletePrimeNumber ===");
        CompletePrimeNumber sol = new CompletePrimeNumber();
        System.out.println(sol.solve(null));
    }
}
