package org.leetcode.medium;


/**
 * <b>#3101 - Count Alternating Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary array nums.
 *
 *
 * We call a subarray alternating if no two adjacent elements in the subarray have the same value.
 *
 *
 * Return the number of alternating subarrays in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,1,1]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The following subarrays are alternating: [0], [1], [1], [1], and [0,1].
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,0]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * Every subarray of the array is alternating. There are 10 possible subarrays that we can choose.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * nums[i] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try using dynamic programming.
 * Hint 2: Let <code>dp[i]</code> be the number of alternating subarrays ending at index <code>i</code>.
 * Hint 3: The final answer is the sum of <code>dp[i]</code> over all  indices <code>i</code> from <code>0</code> to <code>n - 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/count-alternating-subarrays/">LeetCode #3101</a>
 */
public class CountAlternatingSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Alternating Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== CountAlternatingSubarrays ===");
        CountAlternatingSubarrays sol = new CountAlternatingSubarrays();
        System.out.println(sol.solve(null));
    }
}
