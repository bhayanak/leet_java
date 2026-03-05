package org.leetcode.easy;

/**
 * <b>#191 - Number of 1 Bits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Divide and Conquer, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 11
 * 
 * 
 * Output: 3
 * 
 * 
 * Explanation:
 * 
 * 
 * The input binary string 1011 has a total of three set bits.
 * 
 * Example 2:
 * 
 * Input: n = 128
 * 
 * 
 * Output: 1
 * 
 * 
 * Explanation:
 * 
 * 
 * The input binary string 10000000 has a total of one set bit.
 * 
 * Example 3:
 * 
 * Input: n = 2147483645
 * 
 * 
 * Output: 30
 * 
 * 
 * Explanation:
 * 
 * 
 * The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 231 - 1
 * 
 *  
 * Follow up: If this function is called many times, how would you optimize it?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Brian Kernighan's trick: n &amp; (n-1) clears the lowest set bit.
 * Count how many times we can do this until n reaches 0.
 *
 * <h2>Complexity</h2>
* Time: O(number of set bits)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/number-of-1-bits/">LeetCode #191</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class NumberOf1Bits {

    /**
     * Returns the number of '1' bits (Hamming weight) in a 32-bit integer.
     * @param n input integer
     * @return count of set bits
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { n &= (n - 1); count++; } // clear lowest set bit each iteration
        return count;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac NumberOf1Bits.java &amp;&amp; java org.leetcode.easy.NumberOf1Bits
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        NumberOf1Bits sol = new NumberOf1Bits();
        System.out.println(sol.hammingWeight(0b00000000000000000000000000001011)); // 3
        System.out.println(sol.hammingWeight(0b10000000000000000000000000000000)); // 1
        System.out.println(sol.hammingWeight(0b11111111111111111111111111111101)); // 31
    }
}
