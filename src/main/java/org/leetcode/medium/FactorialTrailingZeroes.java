package org.leetcode.medium;

/**
 * <b>#172 - Factorial Trailing Zeroes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * 
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * 
 * Example 2:
 * 
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * 
 * Example 3:
 * 
 * Input: n = 0
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= n &lt;= 104
 * 
 *  
 * 
 * Follow up: Could you write a solution that works in logarithmic time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Trailing zeroes come from factors of 10 = 2×5. In n!, factors of 2 always
 * outnumber factors of 5. Count factors of 5: ⌊n/5⌋ + ⌊n/25⌋ + ⌊n/125⌋ + ...
 *
 * <h2>Complexity</h2>
* Time: O(log₅ n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/factorial-trailing-zeroes/">LeetCode #172</a>
 */
public class FactorialTrailingZeroes {

    /**
     * Returns the number of trailing zeros in n!.
     * @param n non-negative integer
     * @return count of trailing zeros in n!
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) { n /= 5; count += n; } // each multiple of 5 contributes
        return count;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac FactorialTrailingZeroes.java &amp;&amp; java org.leetcode.medium.FactorialTrailingZeroes
     *
     * @param args not used
     */
    public static void main(String[] args) {
        FactorialTrailingZeroes sol = new FactorialTrailingZeroes();
        System.out.println(sol.trailingZeroes(3));   // 0
        System.out.println(sol.trailingZeroes(5));   // 1
        System.out.println(sol.trailingZeroes(25));  // 6
    }
}
