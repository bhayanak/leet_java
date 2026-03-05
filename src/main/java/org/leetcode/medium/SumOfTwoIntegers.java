package org.leetcode.medium;

/**
 * <b>#371 - Sum of Two Integers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: a = 1, b = 2
 * Output: 3
 * 
 * 
 * Example 2:
 * 
 * Input: a = 2, b = 3
 * Output: 5
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -1000 &lt;= a, b &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Use bit manipulation: carry = (a&amp;b)&lt;&lt;1, sum = a^b. Repeat until no carry.
 *
 * <h2>Complexity</h2>
* Time: O(1) (bounded by 32 bits)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/sum-of-two-integers/">LeetCode #371</a>
 */
public class SumOfTwoIntegers {

    /**
     * Returns Get sum.
     *
     * @param a the a (int)
     * @param b the b (int)
     * @return the computed int result
     */
    public int getSum(int a, int b) {
        while(b!=0){int carry=(a&b)<<1;a^=b;b=carry;}
        return a;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        SumOfTwoIntegers sol = new SumOfTwoIntegers();
        System.out.println(sol.getSum(1,2));   // 3
        System.out.println(sol.getSum(2,3));   // 5
        System.out.println(sol.getSum(-1,-1)); // -2
    }
}
