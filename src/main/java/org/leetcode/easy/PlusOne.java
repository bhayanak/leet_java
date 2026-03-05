package org.leetcode.easy;

/**
 * <b>#66 - Plus One</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * 
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * Example 2:
 * 
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * 
 * Example 3:
 * 
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= digits.length &lt;= 100
 * 	
 * 0 &lt;= digits[i] &lt;= 9
 * 	
 * digits does not contain any leading 0's.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Add 1 to the last digit. Propagate carry left.
 * If all digits were 9, prepend a leading 1.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n) worst case
 *
 * @see <a href="https://leetcode.com/problems/plus-one/">LeetCode #66</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class PlusOne {

    /**
     * Adds one to a number represented as an array of digits.
     *
     * @param digits most-significant digit first
     * @return       digits of the incremented number
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) { digits[i]++; return digits; }
            digits[i] = 0; // carry
        }
        // All digits were 9 → need one extra digit
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== PlusOne ===");
        System.out.println("See class methods for usage.");
    }
}
