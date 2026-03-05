package org.leetcode.hard;


/**
 * <b>#1862 - Sum of Floored Pairs</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Binary Search, Counting, Enumeration, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the sum of floor(nums[i] / nums[j]) for all pairs of indices 0 &lt;= i, j &lt; nums.length in the array. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * The floor() function returns the integer part of the division.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,9]
 * Output: 10
 * Explanation:
 * floor(2 / 5) = floor(2 / 9) = floor(5 / 9) = 0
 * floor(2 / 2) = floor(5 / 5) = floor(9 / 9) = 1
 * floor(5 / 2) = 2
 * floor(9 / 2) = 4
 * floor(9 / 5) = 1
 * We calculate the floor of the division for every pair of indices in the array then sum them up.
 *
 * Example 2:
 *
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 49
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the frequency (number of occurrences) of all elements in the array.
 * Hint 2: For each element, iterate through its multiples and multiply frequencies to find the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Search, Counting, Enumeration, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-floored-pairs/">LeetCode #1862</a>
 */
public class SumOfFlooredPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Floored Pairs");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfFlooredPairs ===");
        SumOfFlooredPairs sol = new SumOfFlooredPairs();
        System.out.println(sol.solve(null));
    }
}
