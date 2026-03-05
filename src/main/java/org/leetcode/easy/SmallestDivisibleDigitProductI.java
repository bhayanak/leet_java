package org.leetcode.easy;


/**
 * <b>#3345 - Smallest Divisible Digit Product I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers n and t. Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 10, t = 2
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10 that satisfies the condition.
 *
 * Example 2:
 *
 * Input: n = 15, t = 3
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * The digit product of 16 is 6, which is divisible by 3, making it the smallest number greater than or equal to 15 that satisfies the condition.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= t &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You have to check at most 10 numbers.
 * Hint 2: Apply a brute-force approach by checking each possible number.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/smallest-divisible-digit-product-i/">LeetCode #3345</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class SmallestDivisibleDigitProductI {

    /**
     * Solves the problem: Smallest index.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int smallestIndex(int[] nums) {
        for (int i=0;i<nums.length;i++) {
            int s=0, tmp=nums[i]; while (tmp>0){s+=tmp%10;tmp/=10;}
            if (s==i) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        SmallestDivisibleDigitProductI sol = new SmallestDivisibleDigitProductI();
        System.out.println(sol.smallestIndex(new int[]{1,2,3}));
    }
}
