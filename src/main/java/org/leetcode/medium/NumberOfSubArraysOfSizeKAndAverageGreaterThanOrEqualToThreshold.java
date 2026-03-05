package org.leetcode.medium;


/**
 * <b>#1343 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
 * Output: 3
 * Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
 *
 * Example 2:
 *
 * Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
 * Output: 6
 * Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * 1 &lt;= arr[i] &lt;= 104
 *
 * 1 &lt;= k &lt;= arr.length
 *
 * 0 &lt;= threshold &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Start with a window of size K and test its average against the threshold.
 * Hint 2: Keep moving the window by one element maintaining its size k until you cover the whole array. Count the number of windows that have an average greater than or equal to the threshold.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/">LeetCode #1343</a>
 */
public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold ===");
        NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold sol = new NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold();
        System.out.println(sol.solve(null));
    }
}
