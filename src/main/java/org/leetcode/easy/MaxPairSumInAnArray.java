package org.leetcode.easy;


/**
 * <b>#2815 - Max Pair Sum in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. You have to find the maximum sum of a pair of numbers from nums such that the largest digit in both numbers is equal.
 *
 *
 * For example, 2373 is made up of three distinct digits: 2, 3, and 7, where 7 is the largest among them.
 *
 *
 * Return the maximum sum or -1 if no such pair exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [112,131,411]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * Each numbers largest digit in order is [2,3,4].
 *
 * Example 2:
 *
 * Input: nums = [2536,1613,3366,162]
 *
 *
 * Output: 5902
 *
 *
 * Explanation:
 *
 *
 * All the numbers have 6 as their largest digit, so the answer is 2536 + 3366 = 5902.
 *
 * Example 3:
 *
 * Input: nums = [51,71,17,24,42]
 *
 *
 * Output: 88
 *
 *
 * Explanation:
 *
 *
 * Each number's largest digit in order is [5,7,7,4,4].
 *
 *
 * So we have only two possible pairs, 71 + 17 = 88 and 24 + 42 = 66.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the largest and second largest element with maximum digits equal to x where 1&lt;=x&lt;=9.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/max-pair-sum-in-an-array/">LeetCode #2815</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaxPairSumInAnArray {

    /**
     * Computes the maximum Max sum.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxSum(int[] nums) {
        int res=-1;
        for (int i=0;i<nums.length-1;i++) for (int j=i+1;j<nums.length;j++) {
            int mi=String.valueOf(nums[i]).chars().map(c->c-'0').max().getAsInt();
            int mj=String.valueOf(nums[j]).chars().map(c->c-'0').max().getAsInt();
            if (mi==mj) res=Math.max(res,nums[i]+nums[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxPairSumInAnArray sol = new MaxPairSumInAnArray();
        System.out.println(sol.maxSum(new int[]{1,2,3}));
    }
}
