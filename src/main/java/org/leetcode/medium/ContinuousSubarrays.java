package org.leetcode.medium;


/**
 * <b>#2762 - Continuous Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Queue, Sliding Window, Heap (Priority Queue), Ordered Set, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. A subarray of nums is called continuous if:
 *
 *
 * Let i, i + 1, ..., j be the indices in the subarray. Then, for each pair of indices i &lt;= i1, i2 &lt;= j, 0 &lt;= |nums[i1] - nums[i2]| &lt;= 2.
 *
 * Return the total number of continuous subarrays.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,4,2,4]
 * Output: 8
 * Explanation: 
 * Continuous subarray of size 1: [5], [4], [2], [4].
 * Continuous subarray of size 2: [5,4], [4,2], [2,4].
 * Continuous subarray of size 3: [4,2,4].
 * There are no subarrys of size 4.
 * Total continuous subarrays = 4 + 3 + 1 = 8.
 * It can be shown that there are no more continuous subarrays.
 *
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [1,2,3]
 * Output: 6
 * Explanation: 
 * Continuous subarray of size 1: [1], [2], [3].
 * Continuous subarray of size 2: [1,2], [2,3].
 * Continuous subarray of size 3: [1,2,3].
 * Total continuous subarrays = 3 + 2 + 1 = 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try using the sliding window technique.
 * Hint 2: Use a set or map to keep track of the maximum and minimum of subarrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Queue, Sliding Window, Heap (Priority Queue), Ordered Set, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/continuous-subarrays/">LeetCode #2762</a>
 */
public class ContinuousSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Continuous Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== ContinuousSubarrays ===");
        ContinuousSubarrays sol = new ContinuousSubarrays();
        System.out.println(sol.solve(null));
    }
}
