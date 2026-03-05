package org.leetcode.easy;


/**
 * <b>#2595 - Number of Even and Odd Bits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n.
 *
 *
 * Let even denote the number of even indices in the binary representation of n with value 1.
 *
 *
 * Let odd denote the number of odd indices in the binary representation of n with value 1.
 *
 *
 * Note that bits are indexed from right to left in the binary representation of a number.
 *
 *
 * Return the array [even, odd].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 50
 *
 *
 * Output: [1,2]
 *
 *
 * Explanation:
 *
 *
 * The binary representation of 50 is 110010.
 *
 *
 * It contains 1 on indices 1, 4, and 5.
 *
 * Example 2:
 *
 * Input: n = 2
 *
 *
 * Output: [0,1]
 *
 *
 * Explanation:
 *
 *
 * The binary representation of 2 is 10.
 *
 *
 * It contains 1 only on index 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain two integer variables, even and odd, to count the number of even and odd indices in the binary representation of integer n.
 * Hint 2: Divide n by 2 while n is positive, and if n modulo 2 is 1, add 1 to its corresponding variable.
 *
 * <h2>Approach</h2>
 * Think about the category (Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/number-of-even-and-odd-bits/">LeetCode #2595</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class NumberOfEvenAndOddBits {

    /**
     * Solves the problem: Even odd bit.
     *
     * @param n the n (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] evenOddBit(int n) {
        int even=0, odd=0, pos=0;
        while (n>0) {
            if ((n&1)==1) { if (pos%2==0) even++; else odd++; }
            n>>=1; pos++;
        }
        return new int[]{even,odd};
    }

    public static void main(String[] args) {
        NumberOfEvenAndOddBits sol = new NumberOfEvenAndOddBits();
                System.out.println(java.util.Arrays.toString(sol.evenOddBit(17))); // [2,0]
                System.out.println(java.util.Arrays.toString(sol.evenOddBit(2)));  // [0,1]
    }
}
