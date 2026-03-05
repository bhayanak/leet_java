package org.leetcode.easy;

/**
 * <b>#190 - Reverse Bits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Divide and Conquer, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Reverse bits of a given 32 bits signed integer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 43261596
 * 
 * 
 * Output: 964176192
 * 
 * 
 * Explanation:
 * 
 * 
 * 	
 * 		
 * 			Integer
 * 			Binary
 * 		
 * 		
 * 			43261596
 * 			00000010100101000001111010011100
 * 		
 * 		
 * 			964176192
 * 			00111001011110000010100101000000
 * 		
 * 	
 * 
 * Example 2:
 * 
 * Input: n = 2147483644
 * 
 * 
 * Output: 1073741822
 * 
 * 
 * Explanation:
 * 
 * 
 * 	
 * 		
 * 			Integer
 * 			Binary
 * 		
 * 		
 * 			2147483644
 * 			01111111111111111111111111111100
 * 		
 * 		
 * 			1073741822
 * 			00111111111111111111111111111110
 * 		
 * 	
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= n &lt;= 231 - 2
 * 	
 * n is even.
 * 
 *  
 * 
 * Follow up: If this function is called many times, how would you optimize it?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * For each of 32 bits, shift result left and OR in the LSB of n, then shift n right.
 * Alternatively use Integer.reverse(n) from the standard library.
 *
 * <h2>Complexity</h2>
* Time: O(32) = O(1)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/reverse-bits/">LeetCode #190</a>
  *
  * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
  */
public class ReverseBits {

    /**
     * Reverses the bits of a 32-bit unsigned integer.
     * @param n input integer
     * @return bit-reversed integer
      *
      * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
      */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1); // take LSB of n, attach to result
            n >>>= 1; // unsigned right shift
        }
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ReverseBits.java &amp;&amp; java org.leetcode.easy.ReverseBits
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        ReverseBits sol = new ReverseBits();
        System.out.println(sol.reverseBits(0b00000010100101000001111010011100)); // 964176192
        System.out.println(Integer.toBinaryString(sol.reverseBits(43261596)));
    }
}
