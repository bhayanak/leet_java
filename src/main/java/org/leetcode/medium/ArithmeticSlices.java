package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #413: Arithmetic Slices
 * @see <a href="https://leetcode.com/problems/arithmetic-slices/">Problem</a>
 */
public class ArithmeticSlices {

    /**
     * LeetCode #413 – Arithmetic Slices
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming, Sliding Window
     *
     * An integer array is called arithmetic if it consists of at least three
     * elements and if the difference between any two consecutive elements is the
     * same.
     * 
     * 
     * For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic
     * sequences.
     * 
     * Given an integer array nums, return the number of arithmetic subarrays of
     * nums.
     * 
     * 
     * A subarray is a contiguous subsequence of the array.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3,4]
     * Output: 3
     * Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and
     * [1,2,3,4] itself.
     * 
     * Example 2:
     * 
     * Input: nums = [1]
     * Output: 0
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 5000
     * 
     * -1000 &lt;= nums[i] &lt;= 1000
     */
    // DP: dp[i] = number of arithmetic slices ending at i
    // If A[i]-A[i-1] == A[i-1]-A[i-2], then dp[i] = dp[i-1] + 1
    /**
     * Solves the problem: Number of arithmetic slices.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int numberOfArithmeticSlices(int[] nums) {
        int dp = 0, total = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                dp++; total += dp;
            } else {
                dp = 0;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ArithmeticSlices sol = new ArithmeticSlices();
        System.out.println(sol.numberOfArithmeticSlices(new int[]{1,2,3}));
    }
}
