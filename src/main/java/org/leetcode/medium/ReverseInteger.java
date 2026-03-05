package org.leetcode.medium;

/**
 * <b>#7 - Reverse Integer</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * 
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: x = 123
 * Output: 321
 * 
 * Example 2:
 * 
 * Input: x = -123
 * Output: -321
 * 
 * Example 3:
 * 
 * Input: x = 120
 * Output: 21
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -231 &lt;= x &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Repeatedly extract the last digit (x % 10) and build the reversed number.
 * Check for overflow before each multiplication: if rev &gt; (MAX-digit)/10 it overflows.
 *
 * <h2>Complexity</h2>
* Time: O(log x)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/reverse-integer/">LeetCode #7</a>
 */
public class ReverseInteger {

    /**
     * Reverses digits of a 32-bit signed integer; returns 0 on overflow.
     *
     * @param x input integer
     * @return  reversed integer, or 0 if outside [-2³¹, 2³¹-1]
     */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            // Overflow check before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                ReverseInteger sol = new ReverseInteger();
                System.out.println(sol.reverse(123));   // 321
                System.out.println(sol.reverse(-123));  // -321
                System.out.println(sol.reverse(120));   // 21
                System.out.println(sol.reverse(1534236469)); // 0 (overflow)
    }
}
