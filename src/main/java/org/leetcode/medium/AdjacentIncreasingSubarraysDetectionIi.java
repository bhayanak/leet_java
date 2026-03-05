package org.leetcode.medium;


/**
 * <b>#3350 - Adjacent Increasing Subarrays Detection II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of n integers, your task is to find the maximum value of k for which there exist two adjacent subarrays of length k each, such that both subarrays are strictly increasing. Specifically, check if there are two subarrays of length k starting at indices a and b (a &lt; b), where:
 *
 *
 * Both subarrays nums[a..a + k - 1] and nums[b..b + k - 1] are strictly increasing.
 *
 * The subarrays must be adjacent, meaning b = a + k.
 *
 * Return the maximum possible value of k.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,7,8,9,2,3,4,3,1]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The subarray starting at index 2 is [7, 8, 9], which is strictly increasing.
 *
 * The subarray starting at index 5 is [2, 3, 4], which is also strictly increasing.
 *
 * These two subarrays are adjacent, and 3 is the maximum possible value of k for which two such adjacent strictly increasing subarrays exist.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,4,4,4,5,6,7]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The subarray starting at index 0 is [1, 2], which is strictly increasing.
 *
 * The subarray starting at index 2 is [3, 4], which is also strictly increasing.
 *
 * These two subarrays are adjacent, and 2 is the maximum possible value of k for which two such adjacent strictly increasing subarrays exist.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 2 * 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the boundaries between strictly increasing subarrays.
 * Hint 2: Can we use binary search?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/">LeetCode #3350</a>
 */
public class AdjacentIncreasingSubarraysDetectionIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Adjacent Increasing Subarrays Detection II");
    }

    public static void main(String[] args) {
        System.out.println("=== AdjacentIncreasingSubarraysDetectionIi ===");
        AdjacentIncreasingSubarraysDetectionIi sol = new AdjacentIncreasingSubarraysDetectionIi();
        System.out.println(sol.solve(null));
    }
}
