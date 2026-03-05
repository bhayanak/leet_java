package org.leetcode.medium;


/**
 * <b>#3804 - Number of Centered Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A subarray of nums is called centered if the sum of its elements is equal to at least one element within that same subarray.
 *
 *
 * Return the number of centered subarrays of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,1,0]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * All single-element subarrays ([-1], [1], [0]) are centered.
 *
 * The subarray [1, 0] has a sum of 1, which is present in the subarray.
 *
 * The subarray [-1, 1, 0] has a sum of 0, which is present in the subarray.
 *
 * Thus, the answer is 5.
 *
 * Example 2:
 *
 * Input: nums = [2,-3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Only single-element subarrays ([2], [-3]) are centered.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 500
 *
 * -105 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Generate all subarrays and use a hashmap to check whether the sum exists in the generated subarrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/number-of-centered-subarrays/">LeetCode #3804</a>
 */
public class NumberOfCenteredSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Centered Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfCenteredSubarrays ===");
        NumberOfCenteredSubarrays sol = new NumberOfCenteredSubarrays();
        System.out.println(sol.solve(null));
    }
}
