package org.leetcode.easy;

/**
 * <b>#342 - Power of Four</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Bit Manipulation, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * 
 * 
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 16
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * Input: n = 5
 * Output: false
 * 
 * 
 * Example 3:
 * 
 * Input: n = 1
 * Output: true
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -231 &lt;= n &lt;= 231 - 1
 * 
 *  
 * Follow up: Could you solve it without loops/recursion?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Must be positive, a power of two, and have the set bit in an odd position.
 * Mask 0x55555555 checks that the single bit is in position 0,2,4,...
 *
 * <h2>Complexity</h2>
* Time: O(1)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/power-of-four/">LeetCode #342</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class PowerOfFour {

    /**
     * Returns true if Is power of four.
     *
     * @param n the n (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && (n&0x55555555)!=0;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        PowerOfFour sol = new PowerOfFour();
        System.out.println(sol.isPowerOfFour(16)); // true
        System.out.println(sol.isPowerOfFour(5));  // false
        System.out.println(sol.isPowerOfFour(1));  // true
    }
}
