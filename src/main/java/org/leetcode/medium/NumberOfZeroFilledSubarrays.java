package org.leetcode.medium;


/**
 * <b>#2348 - Number of Zero-Filled Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the number of subarrays filled with 0.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,0,0,2,0,0,4]
 * Output: 6
 * Explanation: 
 * There are 4 occurrences of [0] as a subarray.
 * There are 2 occurrences of [0,0] as a subarray.
 * There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
 *
 * Example 2:
 *
 * Input: nums = [0,0,0,2,0,0]
 * Output: 9
 * Explanation:
 * There are 5 occurrences of [0] as a subarray.
 * There are 3 occurrences of [0,0] as a subarray.
 * There is 1 occurrence of [0,0,0] as a subarray.
 * There is no occurrence of a subarray with a size more than 3 filled with 0. Therefore, we return 9.
 *
 * Example 3:
 *
 * Input: nums = [2,10,2019]
 * Output: 0
 * Explanation: There is no subarray filled with 0. Therefore, we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each zero, you can calculate the number of zero-filled subarrays that end on that index, which is the number of consecutive zeros behind the current element + 1.
 * Hint 2: Maintain the number of consecutive zeros behind the current element, count the number of zero-filled subarrays that end on each index, sum it up to get the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/number-of-zero-filled-subarrays/">LeetCode #2348</a>
 */
public class NumberOfZeroFilledSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Zero-Filled Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfZeroFilledSubarrays ===");
        NumberOfZeroFilledSubarrays sol = new NumberOfZeroFilledSubarrays();
        System.out.println(sol.solve(null));
    }
}
