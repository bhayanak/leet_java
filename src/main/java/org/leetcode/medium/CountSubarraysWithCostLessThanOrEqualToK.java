package org.leetcode.medium;


/**
 * <b>#3835 - Count Subarrays With Cost Less Than or Equal to K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Queue, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums, and an integer k.
 *
 *
 * For any subarray nums[l..r], define its cost as:
 *
 *
 * cost = (max(nums[l..r]) - min(nums[l..r])) * (r - l + 1).
 *
 *
 * Return an integer denoting the number of subarrays of nums whose cost is less than or equal to k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2], k = 4
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * We consider all subarrays of nums:
 *
 *
 * nums[0..0]: cost = (1 - 1) * 1 = 0
 *
 * nums[0..1]: cost = (3 - 1) * 2 = 4
 *
 * nums[0..2]: cost = (3 - 1) * 3 = 6
 *
 * nums[1..1]: cost = (3 - 3) * 1 = 0
 *
 * nums[1..2]: cost = (3 - 2) * 2 = 2
 *
 * nums[2..2]: cost = (2 - 2) * 1 = 0
 *
 * There are 5 subarrays whose cost is less than or equal to 4.
 *
 * Example 2:
 *
 * Input: nums = [5,5,5,5], k = 0
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * For any subarray of nums, the maximum and minimum values are the same, so the cost is always 0.
 *
 *
 * As a result, every subarray of nums has cost less than or equal to 0.
 *
 *
 * For an array of length 4, the total number of subarrays is (4 * 5) / 2 = 10.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], k = 0
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The only subarrays of nums with cost 0 are the single-element subarrays, and there are 3 of them.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= k &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use sliding window.
 * Hint 2: A monotonic deque is useful for maintaining the maximum or minimum in <code>O(1)</code> time per operation.
 * Hint 3: When the current window's cost exceeds <code>k</code>, move the left boundary forward until the window becomes valid again. Count all subarrays ending at the current right boundary.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Queue, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-with-cost-less-than-or-equal-to-k/">LeetCode #3835</a>
 */
public class CountSubarraysWithCostLessThanOrEqualToK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Subarrays With Cost Less Than or Equal to K");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubarraysWithCostLessThanOrEqualToK ===");
        CountSubarraysWithCostLessThanOrEqualToK sol = new CountSubarraysWithCostLessThanOrEqualToK();
        System.out.println(sol.solve(null));
    }
}
