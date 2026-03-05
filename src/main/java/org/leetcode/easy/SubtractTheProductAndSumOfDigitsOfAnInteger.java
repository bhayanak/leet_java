package org.leetcode.easy;


/**
 * <b>#1281 - Subtract the Product and Sum of Digits of an Integer</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 234
 * Output: 15 
 * Explanation: 
 * Product of digits = 2 * 3 * 4 = 24 
 * Sum of digits = 2 + 3 + 4 = 9 
 * Result = 24 - 9 = 15
 *
 * Example 2:
 *
 * Input: n = 4421
 * Output: 21
 * Explanation: 
 * Product of digits = 4 * 4 * 2 * 1 = 32 
 * Sum of digits = 4 + 4 + 2 + 1 = 11 
 * Result = 32 - 11 = 21
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 10^5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to compute all digits of the number ?
 * Hint 2: Use modulus operator (%) to compute the last digit.
 * Hint 3: Generalise modulus operator idea to compute all digits.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">LeetCode #1281</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    /**
     * Solves the problem: Subtract product and sum.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int subtractProductAndSum(int n) {
        int product=1, sum=0;
        while (n>0) { product*=n%10; sum+=n%10; n/=10; }
        return product-sum;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        SubtractTheProductAndSumOfDigitsOfAnInteger sol = new SubtractTheProductAndSumOfDigitsOfAnInteger();
                System.out.println(sol.subtractProductAndSum(234));  // 15 (2*3*4 - 2+3+4 = 24-9)
                System.out.println(sol.subtractProductAndSum(4421)); // 21
    }
}
