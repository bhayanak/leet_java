package org.leetcode.easy;


/**
 * <b>#3423 - Maximum Difference Between Adjacent Elements in a Circular Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a circular array nums, find the maximum absolute difference between adjacent elements.
 *
 *
 * Note: In a circular array, the first and last elements are adjacent.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,4]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Because nums is circular, nums[0] and nums[2] are adjacent. They have the maximum absolute difference of |4 - 1| = 3.
 *
 * Example 2:
 *
 * Input: nums = [-5,-10,-5]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The adjacent elements nums[0] and nums[1] have the maximum absolute difference of |-5 - (-10)| = 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * -100 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Traverse from the second element to the last element and check the difference of every adjacent pair.
 * Hint 2: The edge case is to check the difference between the first and last elements.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/">LeetCode #3423</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumDifferenceBetweenAdjacentElementsInACircularArray {

    /**
     * Computes the maximum Max adjacent distance.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxAdjacentDistance(int[] nums) {
        int max=0, n=nums.length;
        for (int i=0;i<n;i++) max=Math.max(max,Math.abs(nums[i]-nums[(i+1)%n]));
        return max;
    }

    public static void main(String[] args) {
        MaximumDifferenceBetweenAdjacentElementsInACircularArray sol = new MaximumDifferenceBetweenAdjacentElementsInACircularArray();
                System.out.println(sol.maxAdjacentDistance(new int[]{1,2,4})); // 3
                System.out.println(sol.maxAdjacentDistance(new int[]{-5,-10,-5})); // 5
    }
}
