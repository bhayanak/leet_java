package org.leetcode.hard;


/**
 * <b>#3519 - Count Numbers with Non-Decreasing Digits </b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers, l and r, represented as strings, and an integer b. Return the count of integers in the inclusive range [l, r] whose digits are in non-decreasing order when represented in base b.
 *
 *
 * An integer is considered to have non-decreasing digits if, when read from left to right (from the most significant digit to the least significant digit), each digit is greater than or equal to the previous one.
 *
 *
 * Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: l = "23", r = "28", b = 8
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The numbers from 23 to 28 in base 8 are: 27, 30, 31, 32, 33, and 34.
 *
 * Out of these, 27, 33, and 34 have non-decreasing digits. Hence, the output is 3.
 *
 * Example 2:
 *
 * Input: l = "2", r = "7", b = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The numbers from 2 to 7 in base 2 are: 10, 11, 100, 101, 110, and 111.
 *
 * Out of these, 11 and 111 have non-decreasing digits. Hence, the output is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= l.length &lt;= r.length &lt;= 100
 *
 * 2 &lt;= b &lt;= 10
 *
 * l and r consist only of digits.
 *
 * The value represented by l is less than or equal to the value represented by r.
 *
 * l and r do not contain leading zeros.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use digit dynamic programming.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-numbers-with-non-decreasing-digits/">LeetCode #3519</a>
 */
public class CountNumbersWithNonDecreasingDigits {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Numbers with Non-Decreasing Digits ");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNumbersWithNonDecreasingDigits ===");
        CountNumbersWithNonDecreasingDigits sol = new CountNumbersWithNonDecreasingDigits();
        System.out.println(sol.solve(null));
    }
}
