package org.leetcode.medium;


/**
 * <b>#1524 - Number of Sub-arrays With Odd Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, return the number of subarrays with an odd sum.
 *
 *
 * Since the answer can be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,3,5]
 * Output: 4
 * Explanation: All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
 * All sub-arrays sum are [1,4,9,3,8,5].
 * Odd sums are [1,9,3,5] so the answer is 4.
 *
 * Example 2:
 *
 * Input: arr = [2,4,6]
 * Output: 0
 * Explanation: All subarrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
 * All sub-arrays sum are [2,6,12,4,10,6].
 * All sub-arrays have even sum and the answer is 0.
 *
 * Example 3:
 *
 * Input: arr = [1,2,3,4,5,6,7]
 * Output: 16
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * 1 &lt;= arr[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use the accumulative sum to keep track of all the odd-sum sub-arrays ?
 * Hint 2: if the current accu sum is odd, we care only about previous even accu sums and vice versa.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/">LeetCode #1524</a>
 */
public class NumberOfSubArraysWithOddSum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Sub-arrays With Odd Sum");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfSubArraysWithOddSum ===");
        NumberOfSubArraysWithOddSum sol = new NumberOfSubArraysWithOddSum();
        System.out.println(sol.solve(null));
    }
}
