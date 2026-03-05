package org.leetcode.medium;

/**
 * <b>#29 - Divide Two Integers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 * 
 * 
 * The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
 * 
 * 
 * Return the quotient after dividing dividend by divisor.
 * 
 * 
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Explanation: 10/3 = 3.33333.. which is truncated to 3.
 * 
 * Example 2:
 * 
 * Input: dividend = 7, divisor = -3
 * Output: -2
 * Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -231 &lt;= dividend, divisor &lt;= 231 - 1
 * 	
 * divisor != 0
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Bit-shifting: double the divisor each step to find the largest multiple of
 * divisor ≤ dividend. Subtract that multiple and repeat.
 * Handle overflow for Integer.MIN_VALUE / -1.
 *
 * <h2>Complexity</h2>
* Time: O(log²n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/divide-two-integers/">LeetCode #29</a>
 */
public class DivideTwoIntegers {

    /**
     * Divides two integers without using multiplication, division, or mod.
     * Result is clamped to 32-bit signed range.
     *
     * @param dividend the number to be divided
     * @param divisor  the number to divide by (≠ 0)
     * @return         quotient clamped to [-2³¹, 2³¹-1]
     */
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean negative = (dividend < 0) != (divisor < 0);
        long a = Math.abs((long) dividend), b = Math.abs((long) divisor);
        int result = 0;
        while (a >= b) {
            long tmp = b, multiple = 1;
            while (a >= (tmp << 1)) { tmp <<= 1; multiple <<= 1; }
            a -= tmp;
            result += multiple;
        }
        return negative ? -result : result;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DivideTwoIntegers ===");
        System.out.println("See class methods for usage.");
    }
}
