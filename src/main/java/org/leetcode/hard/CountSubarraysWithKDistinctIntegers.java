package org.leetcode.hard;


/**
 * <b>#3859 - Count Subarrays With K Distinct Integers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and two integers k and m.
 *
 *
 * Return an integer denoting the count of subarrays of nums such that:
 *
 *
 * The subarray contains exactly k distinct integers.
 *
 * Within the subarray, each distinct integer appears at least m times.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1,2,2], k = 2, m = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The possible subarrays with k = 2 distinct integers, each appearing at least m = 2 times are:
 *
 *
 *
 *
 *
 * 			Subarray
 * 			Distinct
 *
 * 			numbers
 * 			Frequency
 *
 *
 *
 *
 *
 *
 * 			[1, 2, 1, 2]
 * 			{1, 2} → 2
 * 			{1: 2, 2: 2}
 *
 *
 *
 *
 * 			[1, 2, 1, 2, 2]
 * 			{1, 2} → 2
 * 			{1: 2, 2: 3}
 *
 *
 *
 *
 * Thus, the answer is 2.
 *
 * Example 2:
 *
 * Input: nums = [3,1,2,4], k = 2, m = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The possible subarrays with k = 2 distinct integers, each appearing at least m = 1 times are:
 *
 *
 *
 *
 *
 * 			Subarray
 * 			Distinct
 *
 * 			numbers
 * 			Frequency
 *
 *
 *
 *
 *
 *
 * 			[3, 1]
 * 			{3, 1} → 2
 * 			{3: 1, 1: 1}
 *
 *
 *
 *
 * 			[1, 2]
 * 			{1, 2} → 2
 * 			{1: 1, 2: 1}
 *
 *
 *
 *
 * 			[2, 4]
 * 			{2, 4} → 2
 * 			{2: 1, 4: 1}
 *
 *
 *
 *
 * Thus, the answer is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= k, m &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use sliding window.
 * Hint 2: Use the reduction: <code>answer = at_most(k) - at_most(k-1)</code>. <code>at_most(K)</code> = number of subarrays with <code>&lt;= K</code> distinct values where every present value appears <code>&gt;= m</code> times.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-with-k-distinct-integers/">LeetCode #3859</a>
 */
public class CountSubarraysWithKDistinctIntegers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Subarrays With K Distinct Integers");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubarraysWithKDistinctIntegers ===");
        CountSubarraysWithKDistinctIntegers sol = new CountSubarraysWithKDistinctIntegers();
        System.out.println(sol.solve(null));
    }
}
