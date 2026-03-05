package org.leetcode.hard;


/**
 * <b>#2334 - Subarray With Elements Greater Than Varying Threshold</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Stack, Union-Find, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer threshold.
 *
 *
 * Find any subarray of nums of length k such that every element in the subarray is greater than threshold / k.
 *
 *
 * Return the size of any such subarray. If there is no such subarray, return -1.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,4,3,1], threshold = 6
 * Output: 3
 * Explanation: The subarray [3,4,3] has a size of 3, and every element is greater than 6 / 3 = 2.
 * Note that this is the only valid subarray.
 *
 * Example 2:
 *
 * Input: nums = [6,5,6,5,8], threshold = 7
 * Output: 1
 * Explanation: The subarray [8] has a size of 1, and 8 &gt; 7 / 1 = 7. So 1 is returned.
 * Note that the subarray [6,5] has a size of 2, and every element is greater than 7 / 2 = 3.5. 
 * Similarly, the subarrays [6,5,6], [6,5,6,5], [6,5,6,5,8] also satisfy the given conditions.
 * Therefore, 2, 3, 4, or 5 may also be returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i], threshold &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For all elements to be greater than the threshold/length, the minimum element in the subarray must be greater than the threshold/length.
 * Hint 2: For a given index, could you find the largest subarray such that the given index is the minimum element?
 * Hint 3: Could you use a monotonic stack to get the next and previous smallest element for every index?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Union-Find, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/subarray-with-elements-greater-than-varying-threshold/">LeetCode #2334</a>
 */
public class SubarrayWithElementsGreaterThanVaryingThreshold {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Subarray With Elements Greater Than Varying Threshold");
    }

    public static void main(String[] args) {
        System.out.println("=== SubarrayWithElementsGreaterThanVaryingThreshold ===");
        SubarrayWithElementsGreaterThanVaryingThreshold sol = new SubarrayWithElementsGreaterThanVaryingThreshold();
        System.out.println(sol.solve(null));
    }
}
