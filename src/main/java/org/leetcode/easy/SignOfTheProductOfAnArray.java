package org.leetcode.easy;


/**
 * <b>#1822 - Sign of the Product of an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Implement a function signFunc(x) that returns:
 *
 *
 * 1 if x is positive.
 *
 * -1 if x is negative.
 *
 * 0 if x is equal to 0.
 *
 * You are given an integer array nums. Let product be the product of all values in the array nums.
 *
 *
 * Return signFunc(product).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,-2,-3,-4,3,2,1]
 * Output: 1
 * Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 *
 * Example 2:
 *
 * Input: nums = [1,5,0,2,-3]
 * Output: 0
 * Explanation: The product of all values in the array is 0, and signFunc(0) = 0
 *
 * Example 3:
 *
 * Input: nums = [-1,1,-1,1,-1]
 * Output: -1
 * Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * -100 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If there is a 0 in the array the answer is 0
 * Hint 2: To avoid overflow make all the negative numbers -1 and all positive numbers 1 and calculate the prod
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sign-of-the-product-of-an-array/">LeetCode #1822</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class SignOfTheProductOfAnArray {

    /**
     * Solves the problem: Array sign.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int arraySign(int[] nums) {
        int sign=1;
        for (int n:nums) {
            if (n==0) return 0;
            if (n<0) sign=-sign;
        }
        return sign;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        SignOfTheProductOfAnArray sol = new SignOfTheProductOfAnArray();
                System.out.println(sol.arraySign(new int[]{-1,-2,-3,-4,3,2,1})); // 1
                System.out.println(sol.arraySign(new int[]{1,5,0,2,-3}));         // 0
                System.out.println(sol.arraySign(new int[]{-1,1,-1,1,-1}));      // -1
    }
}
