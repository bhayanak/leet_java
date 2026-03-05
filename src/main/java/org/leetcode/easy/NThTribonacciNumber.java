package org.leetcode.easy;


/**
 * <b>#1137 - N-th Tribonacci Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The Tribonacci sequence Tn is defined as follows: 
 *
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n &gt;= 0.
 *
 *
 * Given n, return the value of Tn.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: 4
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * Example 2:
 *
 * Input: n = 25
 * Output: 1389537
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 37
 *
 * The answer is guaranteed to fit within a 32-bit integer, ie. answer &lt;= 2^31 - 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Make an array F of length 38, and set F[0] = 0, F[1] = F[2] = 1.
 * Hint 2: Now write a loop where you set F[n+3] = F[n] + F[n+1] + F[n+2], and return F[n].
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Memoization).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/n-th-tribonacci-number/">LeetCode #1137</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class NThTribonacciNumber {

    /**
     * Solves the problem: Tribonacci.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int tribonacci(int n) {
        if (n == 0) return 0; if (n <= 2) return 1;
        int a=0, b=1, c=1;
        for (int i = 3; i <= n; i++) { int t=a+b+c; a=b; b=c; c=t; }
        return c;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NThTribonacciNumber.java &amp;&amp; java org.leetcode.easy.NThTribonacciNumber</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        NThTribonacciNumber sol = new NThTribonacciNumber();
                System.out.println(sol.tribonacci(4));  // 4
                System.out.println(sol.tribonacci(25)); // 1389537
    }
}
