package org.leetcode.easy;


/**
 * <b>#2873 - Maximum Value of an Ordered Triplet I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums.
 *
 *
 * Return the maximum value over all triplets of indices (i, j, k) such that i &lt; j &lt; k. If all such triplets have a negative value, return 0.
 *
 *
 * The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [12,6,1,2,7]
 * Output: 77
 * Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
 * It can be shown that there are no ordered triplets of indices with a value greater than 77. 
 *
 * Example 2:
 *
 * Input: nums = [1,10,3,4,19]
 * Output: 133
 * Explanation: The value of the triplet (1, 2, 4) is (nums[1] - nums[2]) * nums[4] = 133.
 * It can be shown that there are no ordered triplets of indices with a value greater than 133.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 0
 * Explanation: The only ordered triplet of indices (0, 1, 2) has a negative value of (nums[0] - nums[1]) * nums[2] = -3. Hence, the answer would be 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use three nested loops to find all the triplets.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/">LeetCode #2873</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumValueOfAnOrderedTripletI {

    /**
     * Solves the problem: Maximum triplet value.
     *
     * @param nums the nums (int[])
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public long maximumTripletValue(int[] nums) {
        long res=0; int n=nums.length;
        for (int i=0;i<n-2;i++) for (int j=i+1;j<n-1;j++) for (int k=j+1;k<n;k++)
            res=Math.max(res,(long)(nums[i]-nums[j])*nums[k]);
        return res;
    }

    public static void main(String[] args) {
        MaximumValueOfAnOrderedTripletI sol = new MaximumValueOfAnOrderedTripletI();
                System.out.println(sol.maximumTripletValue(new int[]{12,6,1,2,7})); // 77
                System.out.println(sol.maximumTripletValue(new int[]{1,10,3,4,19})); // 133
                System.out.println(sol.maximumTripletValue(new int[]{1,2,3})); // 0
    }
}
