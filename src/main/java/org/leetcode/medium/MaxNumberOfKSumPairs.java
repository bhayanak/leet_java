package org.leetcode.medium;


/**
 * <b>#1679 - Max Number of K-Sum Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 *
 *
 * Return the maximum number of operations you can perform on the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Explanation: Starting with nums = [1,2,3,4]:
 * - Remove numbers 1 and 4, then nums = [2,3]
 * - Remove numbers 2 and 3, then nums = []
 * There are no more pairs that sum up to 5, hence a total of 2 operations.
 *
 * Example 2:
 *
 * Input: nums = [3,1,3,4,3], k = 6
 * Output: 1
 * Explanation: Starting with nums = [3,1,3,4,3]:
 * - Remove the first two 3's, then nums = [1,4,3]
 * There are no more pairs that sum up to 6, hence a total of 1 operation.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The abstract problem asks to count the number of disjoint pairs with a given sum k.
 * Hint 2: For each possible value x, it can be paired up with k - x.
 * Hint 3: The number of such pairs equals to  min(count(x), count(k-x)), unless that x = k / 2, where the number of such pairs will be floor(count(x) / 2).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/max-number-of-k-sum-pairs/">LeetCode #1679</a>
 */
public class MaxNumberOfKSumPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Max Number of K-Sum Pairs");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaxNumberOfKSumPairs ===");
        MaxNumberOfKSumPairs sol = new MaxNumberOfKSumPairs();
        System.out.println(sol.solve(null));
    }
}
