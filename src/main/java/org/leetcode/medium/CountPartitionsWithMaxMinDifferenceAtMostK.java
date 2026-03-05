package org.leetcode.medium;


/**
 * <b>#3578 - Count Partitions With Max-Min Difference at Most K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Queue, Sliding Window, Prefix Sum, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k. Your task is to partition nums into one or more non-empty contiguous segments such that in each segment, the difference between its maximum and minimum elements is at most k.
 *
 *
 * Return the total number of ways to partition nums under this condition.
 *
 *
 * Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [9,4,1,3,7], k = 4
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * There are 6 valid partitions where the difference between the maximum and minimum elements in each segment is at most k = 4:
 *
 *
 * [[9], [4], [1], [3], [7]]
 *
 * [[9], [4], [1], [3, 7]]
 *
 * [[9], [4], [1, 3], [7]]
 *
 * [[9], [4, 1], [3], [7]]
 *
 * [[9], [4, 1], [3, 7]]
 *
 * [[9], [4, 1, 3], [7]]
 *
 * Example 2:
 *
 * Input: nums = [3,3,4], k = 0
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are 2 valid partitions that satisfy the given conditions:
 *
 *
 * [[3], [3], [4]]
 *
 * [[3, 3], [4]]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 5 * 104
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Let <code>dp[idx]</code> be the count of ways to partition the array with the last partition ending at index <code>idx</code>.
 * Hint 3: Try using a sliding window; we can track the minimum and maximum in the window using deques.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Queue, Sliding Window, Prefix Sum, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/count-partitions-with-max-min-difference-at-most-k/">LeetCode #3578</a>
 */
public class CountPartitionsWithMaxMinDifferenceAtMostK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Partitions With Max-Min Difference at Most K");
    }

    public static void main(String[] args) {
        System.out.println("=== CountPartitionsWithMaxMinDifferenceAtMostK ===");
        CountPartitionsWithMaxMinDifferenceAtMostK sol = new CountPartitionsWithMaxMinDifferenceAtMostK();
        System.out.println(sol.solve(null));
    }
}
