package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #689: Maximum Sum of 3 Non-Overlapping Subarrays
 * @see <a href="https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays/">Problem</a>
 */
public class MaximumSumOf3NonOverlappingSubarrays {

    /**
     * LeetCode #689 – Maximum Sum of 3 Non-Overlapping Subarrays
     * Difficulty: HARD
     * Topics: Array, Dynamic Programming, Sliding Window, Prefix Sum
     *
     * Given an integer array nums and an integer k, find three non-overlapping
     * subarrays of length k with maximum sum and return them.
     * 
     * 
     * Return the result as a list of indices representing the starting position
     * of each interval (0-indexed). If there are multiple answers, return the
     * lexicographically smallest one.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,1,2,6,7,5,1], k = 2
     * Output: [0,3,5]
     * Explanation: Subarrays [1, 2], [2, 6], [7, 5] correspond to the starting
     * indices [0, 3, 5].
     * We could have also taken [2, 1], but an answer of [1, 3, 5] would be
     * lexicographically larger.
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,1,2,1,2,1,2,1], k = 2
     * Output: [0,2,4]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 2 * 104
     * 
     * 1 &lt;= nums[i] &lt; 216
     * 
     * 1 &lt;= k &lt;= floor(nums.length / 3)
     */
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] sums = new int[n - k + 1];
        int s = 0;
        for (int i = 0; i < k; i++) s += nums[i];
        sums[0] = s;
        for (int i = k; i < n; i++) { s += nums[i] - nums[i-k]; sums[i-k+1] = s; }

        int[] left = new int[sums.length], right = new int[sums.length];
        // Best index for left window ending at or before i
        int best = 0;
        for (int i = 0; i < sums.length; i++) { if (sums[i] > sums[best]) best = i; left[i] = best; }
        // Best index for right window starting at or after i
        best = sums.length - 1;
        for (int i = sums.length-1; i >= 0; i--) { if (sums[i] >= sums[best]) best = i; right[i] = best; }

        int[] ans = new int[]{-1,-1,-1};
        int maxSum = 0;
        for (int m = k; m <= n - 2*k; m++) {
            int l = left[m-k], r = right[m+k];
            int total = sums[l] + sums[m] + sums[r];
            if (total > maxSum) { maxSum = total; ans = new int[]{l, m, r}; }
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumSumOf3NonOverlappingSubarrays sol = new MaximumSumOf3NonOverlappingSubarrays();
        System.out.println(sol.maxSumOfThreeSubarrays(new int[]{1,2,3}, 0));
    }
}
