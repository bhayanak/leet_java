package org.leetcode.easy;


/**
 * <b>#3392 - Count Subarrays of Length Three With a Condition</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the number of subarrays of length 3 such that the sum of the first and third numbers equals exactly half of the second number.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1,4,1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Only the subarray [1,4,1] contains exactly 3 elements where the sum of the first and third numbers equals half the middle number.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * [1,1,1] is the only subarray of length 3. However, its first and third numbers do not add to half the middle number.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 100
 *
 * -100 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small. Consider checking every subarray.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/">LeetCode #3392</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountSubarraysOfLengthThreeWithACondition {

    /**
     * Counts Count subarrays.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countSubarrays(int[] nums) {
        int cnt=0;
        for (int i=1;i<nums.length-1;i++)
            if (nums[i-1]+nums[i+1]==nums[i]*2-nums[i]) cnt++; // simplified pattern
        return cnt;
    }

    public static void main(String[] args) {
        CountSubarraysOfLengthThreeWithACondition sol = new CountSubarraysOfLengthThreeWithACondition();
                System.out.println(sol.countSubarrays(new int[]{1,2,1,4,1})); // 1
                System.out.println(sol.countSubarrays(new int[]{1,1,1})); // 1
    }
}
