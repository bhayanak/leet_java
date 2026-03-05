package org.leetcode.easy;


/**
 * <b>#2535 - Difference Between Element Sum and Digit Sum of an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer array nums.
 *
 *
 * The element sum is the sum of all the elements in nums.
 *
 * The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
 *
 * Return the absolute difference between the element sum and digit sum of nums.
 *
 *
 * Note that the absolute difference between two integers x and y is defined as |x - y|.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,15,6,3]
 * Output: 9
 * Explanation: 
 * The element sum of nums is 1 + 15 + 6 + 3 = 25.
 * The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
 * The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Explanation:
 * The element sum of nums is 1 + 2 + 3 + 4 = 10.
 * The digit sum of nums is 1 + 2 + 3 + 4 = 10.
 * The absolute difference between the element sum and digit sum is |10 - 10| = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2000
 *
 * 1 &lt;= nums[i] &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a simple for loop to iterate each number.
 * Hint 2: How you can get the digit for each number?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/">LeetCode #2535</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class DifferenceBetweenElementSumAndDigitSumOfAnArray {

    /**
     * Solves the problem: Difference of sum.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int differenceOfSum(int[] nums) {
        int arrSum=0, digSum=0;
        for (int n:nums) {
            arrSum+=n;
            int tmp=n; while(tmp>0){digSum+=tmp%10; tmp/=10;}
        }
        return Math.abs(arrSum-digSum);
    }

    public static void main(String[] args) {
        DifferenceBetweenElementSumAndDigitSumOfAnArray sol = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
                System.out.println(sol.differenceOfSum(new int[]{1,15,6,3})); // 9
                System.out.println(sol.differenceOfSum(new int[]{1,2,3,4}));  // 0
    }
}
