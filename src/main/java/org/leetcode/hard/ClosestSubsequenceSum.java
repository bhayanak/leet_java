package org.leetcode.hard;


/**
 * <b>#1755 - Closest Subsequence Sum</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Dynamic Programming, Bit Manipulation, Sorting, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer goal.
 *
 *
 * You want to choose a subsequence of nums such that the sum of its elements is the closest possible to goal. That is, if the sum of the subsequence's elements is sum, then you want to minimize the absolute difference abs(sum - goal).
 *
 *
 * Return the minimum possible value of abs(sum - goal).
 *
 *
 * Note that a subsequence of an array is an array formed by removing some elements (possibly all or none) of the original array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,-7,3,5], goal = 6
 * Output: 0
 * Explanation: Choose the whole array as a subsequence, with a sum of 6.
 * This is equal to the goal, so the absolute difference is 0.
 *
 * Example 2:
 *
 * Input: nums = [7,-9,15,-2], goal = -5
 * Output: 1
 * Explanation: Choose the subsequence [7,-9,-2], with a sum of -4.
 * The absolute difference is abs(-4 - (-5)) = abs(1) = 1, which is the minimum.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], goal = -7
 * Output: 7
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 40
 *
 * -107 &lt;= nums[i] &lt;= 107
 *
 * -109 &lt;= goal &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The naive solution is to check all possible subsequences. This works in O(2^n).
 * Hint 2: Divide the array into two parts of nearly is equal size.
 * Hint 3: Consider all subsets of one part and make a list of all possible subset sums and sort this list.
 * Hint 4: Consider all subsets of the other part, and for each one, let its sum = x, do binary search to get the nearest possible value to goal - x in the first part.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Dynamic Programming, Bit Manipulation, Sorting, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/closest-subsequence-sum/">LeetCode #1755</a>
 */
public class ClosestSubsequenceSum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Closest Subsequence Sum");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ClosestSubsequenceSum ===");
        ClosestSubsequenceSum sol = new ClosestSubsequenceSum();
        System.out.println(sol.solve(null));
    }
}
