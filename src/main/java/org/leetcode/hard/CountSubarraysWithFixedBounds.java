package org.leetcode.hard;


/**
 * <b>#2444 - Count Subarrays With Fixed Bounds</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Queue, Sliding Window, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and two integers minK and maxK.
 *
 *
 * A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
 *
 *
 * The minimum value in the subarray is equal to minK.
 *
 * The maximum value in the subarray is equal to maxK.
 *
 * Return the number of fixed-bound subarrays.
 *
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
 * Output: 2
 * Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1], minK = 1, maxK = 1
 * Output: 10
 * Explanation: Every subarray of nums is a fixed-bound subarray. There are 10 possible subarrays.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i], minK, maxK &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you solve the problem if all the numbers in the array were between minK and maxK inclusive?
 * Hint 2: Think of the inclusion-exclusion principle.
 * Hint 3: Divide the array into multiple subarrays such that each number in each subarray is between minK and maxK inclusive, solve the previous problem for each subarray, and sum all the answers.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Queue, Sliding Window, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-with-fixed-bounds/">LeetCode #2444</a>
 */
public class CountSubarraysWithFixedBounds {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Subarrays With Fixed Bounds");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubarraysWithFixedBounds ===");
        CountSubarraysWithFixedBounds sol = new CountSubarraysWithFixedBounds();
        System.out.println(sol.solve(null));
    }
}
