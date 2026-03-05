package org.leetcode.hard;


/**
 * <b>#3855 - Sum of K-Digit Numbers in a Range</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers l, r, and k.
 *
 *
 * Consider all possible integers consisting of exactly k digits, where each digit is chosen independently from the integer range [l, r] (inclusive). If 0 is included in the range, leading zeros are allowed.
 *
 *
 * Return an integer representing the sum of all such numbers.​​​​​​​ Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: l = 1, r = 2, k = 2
 *
 *
 * Output: 66
 *
 *
 * Explanation:
 *
 *
 * All numbers formed using k = 2 digits in the range [1, 2] are 11, 12, 21, 22.
 *
 * The total sum is 11 + 12 + 21 + 22 = 66.
 *
 * Example 2:
 *
 * Input: l = 0, r = 1, k = 3
 *
 *
 * Output: 444
 *
 *
 * Explanation:
 *
 *
 * All numbers formed using k = 3 digits in the range [0, 1] are 000, 001, 010, 011, 100, 101, 110, 111​​​​​​​.
 *
 * These numbers without leading zeros are 0, 1, 10, 11, 100, 101, 110, 111.
 *
 * The total sum is 444.
 *
 * Example 3:
 *
 * Input: l = 5, r = 5, k = 10
 *
 *
 * Output: 555555520
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * 5555555555 is the only valid number consisting of k = 10 digits in the range [5, 5].
 *
 * The total sum is 5555555555 % (109 + 7) = 555555520.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= l &lt;= r &lt;= 9
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use combinatorics.
 * Hint 2: For some position <code>p</code> among the <code>k</code> digits, the sum is <code>10^p * (l + (l+1) + ... + r) * (r - l + 1)^(k-1)</code>.
 * Hint 3: Summing <code>p</code> over <code>[0, k-1]</code> gives <code>(l + (l+1) + ... + r) * (r - l + 1)^(k-1) * (10^k - 1) / 9</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-k-digit-numbers-in-a-range/">LeetCode #3855</a>
 */
public class SumOfKDigitNumbersInARange {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of K-Digit Numbers in a Range");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfKDigitNumbersInARange ===");
        SumOfKDigitNumbersInARange sol = new SumOfKDigitNumbersInARange();
        System.out.println(sol.solve(null));
    }
}
