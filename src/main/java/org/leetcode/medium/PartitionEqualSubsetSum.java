package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #416: Partition Equal Subset Sum
 * @see <a href="https://leetcode.com/problems/partition-equal-subset-sum/">Problem</a>
 */
public class PartitionEqualSubsetSum {

    /**
     * LeetCode #416 – Partition Equal Subset Sum
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming
     *
     * Given an integer array nums, return true if you can partition the array
     * into two subsets such that the sum of the elements in both subsets is equal
     * or false otherwise.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,5,11,5]
     * Output: true
     * Explanation: The array can be partitioned as [1, 5, 5] and [11].
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,5]
     * Output: false
     * Explanation: The array cannot be partitioned into equal sum subsets.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 200
     * 
     * 1 &lt;= nums[i] &lt;= 100
     */
    // 0/1 knapsack: can we pick a subset that sums to total/2?
    /**
     * Returns true if the input can Can partition.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
     */
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int n : nums) {
            for (int j = target; j >= n; j--) {
                dp[j] |= dp[j - n];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        PartitionEqualSubsetSum sol = new PartitionEqualSubsetSum();
        System.out.println(sol.canPartition(new int[]{1,2,3}));
    }
}
