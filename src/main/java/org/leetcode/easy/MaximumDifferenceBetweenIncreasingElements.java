package org.leetcode.easy;


/**
 * <b>#2016 - Maximum Difference Between Increasing Elements</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 &lt;= i &lt; j &lt; n and nums[i] &lt; nums[j].
 *
 *
 * Return the maximum difference. If no such i and j exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [7,1,5,4]
 * Output: 4
 * Explanation:
 * The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
 * Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i &gt; j, so it is not valid.
 *
 * Example 2:
 *
 * Input: nums = [9,4,3,2]
 * Output: -1
 * Explanation:
 * There is no i and j such that i &lt; j and nums[i] &lt; nums[j].
 *
 * Example 3:
 *
 * Input: nums = [1,5,2,10]
 * Output: 9
 * Explanation:
 * The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 2 &lt;= n &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could you keep track of the minimum element visited while traversing?
 * Hint 2: We have a potential candidate for the answer if the prefix min is less than nums[i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/maximum-difference-between-increasing-elements/">LeetCode #2016</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumDifferenceBetweenIncreasingElements {

    /**
     * Solves the problem: Maximum difference.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximumDifference(int[] nums) {
        int min=nums[0], maxDiff=-1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]>min) maxDiff=Math.max(maxDiff,nums[i]-min);
            else min=Math.min(min,nums[i]);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        MaximumDifferenceBetweenIncreasingElements sol = new MaximumDifferenceBetweenIncreasingElements();
        System.out.println(sol.maximumDifference(new int[]{1,2,3}));
    }
}
