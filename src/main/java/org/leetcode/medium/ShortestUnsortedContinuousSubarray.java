package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #581: Shortest Unsorted Continuous Subarray
 * @see <a href="https://leetcode.com/problems/shortest-unsorted-continuous-subarray/">Problem</a>
 */
public class ShortestUnsortedContinuousSubarray {

    /**
     * LeetCode #581 – Shortest Unsorted Continuous Subarray
     * Difficulty: MEDIUM
     * Topics: Array, Two Pointers, Stack, Greedy, Sorting, Monotonic Stack
     *
     * Given an integer array nums, you need to find one continuous subarray such
     * that if you only sort this subarray in non-decreasing order, then the whole
     * array will be sorted in non-decreasing order.
     * 
     * 
     * Return the shortest such subarray and output its length.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,6,4,8,10,9,15]
     * Output: 5
     * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make
     * the whole array sorted in ascending order.
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,4]
     * Output: 0
     * 
     * Example 3:
     * 
     * Input: nums = [1]
     * Output: 0
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 104
     * 
     * -105 &lt;= nums[i] &lt;= 105
     * 
     * 
     * Follow up: Can you solve it in O(n) time complexity?
     */
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) if (nums[i] < nums[i-1]) min = Math.min(min, nums[i]);
        for (int i = n-2; i >= 0; i--) if (nums[i] > nums[i+1]) max = Math.max(max, nums[i]);
        int start = 0;
        while (start < n && nums[start] <= min) start++;
        int end = n-1;
        while (end >= 0 && nums[end] >= max) end--;
        return end > start ? end - start + 1 : 0;
    }

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray sol = new ShortestUnsortedContinuousSubarray();
        System.out.println(sol.findUnsortedSubarray(new int[]{1,2,3}));
    }
}
