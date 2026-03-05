package org.leetcode.medium;

/**
 * <b>#50 - Pow(x, n)</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * 
 * Example 2:
 * 
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * 
 * Example 3:
 * 
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -100.0 &lt; x &lt; 100.0
 * 	
 * -231 &lt;= n &lt;= 231-1
 * 	
 * n is an integer.
 * 	
 * Either x is not zero or n &gt; 0.
 * 	
 * -104 &lt;= xn &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Fast Exponentiation (Exponentiation by Squaring):
 * x^n = (x²)^(n/2) when n is even; x * x^(n-1) when odd.
 * Handle n &lt; 0 by computing (1/x)^(-n). Beware: Integer.MIN_VALUE negation overflows.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(log n) stack
 *
 * @see <a href="https://leetcode.com/problems/powx-n/">LeetCode #50</a>
 */
public class PowXN {

    /**
     * Calculates x raised to the power n (x^n).
     *
     * @param x the base
     * @param n the exponent (can be negative)
     * @return  x^n
     */
    public double myPow(double x, int n) {
        long N = n; // use long to handle Integer.MIN_VALUE
        if (N < 0) { x = 1.0 / x; N = -N; }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        double half = fastPow(x, n / 2);
        return (n % 2 == 0) ? half * half : half * half * x;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PowXN ===");
        System.out.println("See class methods for usage.");
    }
}
