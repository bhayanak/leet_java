package org.leetcode.medium;


/**
 * <b>#2962 - Count Subarrays Where Max Element Appears at Least K Times</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and a positive integer k.
 *
 *
 * Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
 *
 *
 * A subarray is a contiguous sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2,3,3], k = 2
 * Output: 6
 * Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
 *
 * Example 2:
 *
 * Input: nums = [1,4,2,1], k = 3
 * Output: 0
 * Explanation: No subarray contains the element 4 at least 3 times.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/">LeetCode #2962</a>
 */
public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Subarrays Where Max Element Appears at Least K Times");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubarraysWhereMaxElementAppearsAtLeastKTimes ===");
        CountSubarraysWhereMaxElementAppearsAtLeastKTimes sol = new CountSubarraysWhereMaxElementAppearsAtLeastKTimes();
        System.out.println(sol.solve(null));
    }
}
