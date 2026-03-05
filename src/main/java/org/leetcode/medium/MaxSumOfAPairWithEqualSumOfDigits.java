package org.leetcode.medium;


/**
 * <b>#2342 - Max Sum of a Pair With Equal Sum of Digits</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].
 *
 *
 * Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions. If no such pair of indices exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [18,43,36,13,7]
 * Output: 54
 * Explanation: The pairs (i, j) that satisfy the conditions are:
 * - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
 * - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
 * So the maximum sum that we can obtain is 54.
 *
 * Example 2:
 *
 * Input: nums = [10,12,19,14]
 * Output: -1
 * Explanation: There are no two numbers that satisfy the conditions, so we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the largest possible sum of digits a number can have?
 * Hint 2: Group the array elements by the sum of their digits, and find the largest two elements of each group.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/">LeetCode #2342</a>
 */
public class MaxSumOfAPairWithEqualSumOfDigits {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Max Sum of a Pair With Equal Sum of Digits");
    }

    public static void main(String[] args) {
        System.out.println("=== MaxSumOfAPairWithEqualSumOfDigits ===");
        MaxSumOfAPairWithEqualSumOfDigits sol = new MaxSumOfAPairWithEqualSumOfDigits();
        System.out.println(sol.solve(null));
    }
}
