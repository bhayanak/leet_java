package org.leetcode.easy;


/**
 * <b>#2970 - Count the Number of Incremovable Subarrays I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of positive integers nums.
 *
 *
 * A subarray of nums is called incremovable if nums becomes strictly increasing on removing the subarray. For example, the subarray [3, 4] is an incremovable subarray of [5, 3, 4, 6, 7] because removing this subarray changes the array [5, 3, 4, 6, 7] to [5, 6, 7] which is strictly increasing.
 *
 *
 * Return the total number of incremovable subarrays of nums.
 *
 *
 * Note that an empty array is considered strictly increasing.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: 10
 * Explanation: The 10 incremovable subarrays are: [1], [2], [3], [4], [1,2], [2,3], [3,4], [1,2,3], [2,3,4], and [1,2,3,4], because on removing any one of these subarrays nums becomes strictly increasing. Note that you cannot select an empty subarray.
 *
 * Example 2:
 *
 * Input: nums = [6,5,7,8]
 * Output: 7
 * Explanation: The 7 incremovable subarrays are: [5], [6], [5,7], [6,5], [5,7,8], [6,5,7] and [6,5,7,8].
 * It can be shown that there are only 7 incremovable subarrays in nums.
 *
 * Example 3:
 *
 * Input: nums = [8,7,6,6]
 * Output: 3
 * Explanation: The 3 incremovable subarrays are: [8,7,6], [7,6,6], and [8,7,6,6]. Note that [8,7] is not an incremovable subarray because after removing [8,7] nums becomes [6,6], which is sorted in ascending order but not strictly increasing.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50
 *
 * 1 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two loops to check all the subarrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-incremovable-subarrays-i/">LeetCode #2970</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountTheNumberOfIncremovableSubarraysI {

    /**
     * Counts Count increments to target.
     *
     * @param nums the nums (long[])
     * @param target the target (long)
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public long countIncrementsToTarget(long[] nums, long target) {
        long cnt=0; for (long n:nums) if (n<target) cnt+=target-n;
        return cnt;
    }

    public static void main(String[] args) {
        CountTheNumberOfIncremovableSubarraysI sol = new CountTheNumberOfIncremovableSubarraysI();
        System.out.println(sol.countIncrementsToTarget(new long[]{1L,2L}, 0L));
    }
}
