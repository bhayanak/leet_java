package org.leetcode.easy;

/**
 * <b>#326 - Power of Three</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * 
 * 
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 27
 * Output: true
 * Explanation: 27 = 33
 * 
 * Example 2:
 * 
 * Input: n = 0
 * Output: false
 * Explanation: There is no x where 3x = 0.
 * 
 * Example 3:
 * 
 * Input: n = -1
 * Output: false
 * Explanation: There is no x where 3x = (-1).
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
 * Iteratively divide by 3 while divisible; check if remainder reaches 1.
 *
 * <h2>Complexity</h2>
* Time: O(log₃n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/power-of-three/">LeetCode #326</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class PowerOfThree {

    /**
     * Returns true if Is power of three.
     *
     * @param n the n (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        while(n%3==0) n/=3;
        return n==1;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        PowerOfThree sol = new PowerOfThree();
        System.out.println(sol.isPowerOfThree(27)); // true
        System.out.println(sol.isPowerOfThree(0));  // false
        System.out.println(sol.isPowerOfThree(9));  // true
        System.out.println(sol.isPowerOfThree(45)); // false
    }
}
