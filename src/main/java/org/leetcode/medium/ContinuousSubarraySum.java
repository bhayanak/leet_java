package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #523: Continuous Subarray Sum
 * @see <a href="https://leetcode.com/problems/continuous-subarray-sum/">Problem</a>
 */
public class ContinuousSubarraySum {

    /**
     * LeetCode #523 – Continuous Subarray Sum
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Math, Prefix Sum
     *
     * Given an integer array nums and an integer k, return true if nums has a
     * good subarray or false otherwise.
     * 
     * 
     * A good subarray is a subarray where:
     * 
     * 
     * its length is at least two, and
     * 
     * the sum of the elements of the subarray is a multiple of k.
     * 
     * Note that:
     * 
     * 
     * A subarray is a contiguous part of the array.
     * 
     * An integer x is a multiple of k if there exists an integer n such that x =
     * n * k. 0 is always a multiple of k.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [23,2,4,6,7], k = 6
     * Output: true
     * Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum
     * up to 6.
     * 
     * Example 2:
     * 
     * Input: nums = [23,2,6,4,7], k = 6
     * Output: true
     * Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose
     * elements sum up to 42.
     * 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
     * 
     * Example 3:
     * 
     * Input: nums = [23,2,6,4,7], k = 13
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 105
     * 
     * 0 &lt;= nums[i] &lt;= 109
     * 
     * 0 &lt;= sum(nums[i]) &lt;= 231 - 1
     * 
     * 1 &lt;= k &lt;= 231 - 1
     */
    // prefix sum mod k; if same remainder seen twice with at least 2 elements between
    /**
     * Checks Check subarray sum.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed boolean result
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) >= 2) return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContinuousSubarraySum sol = new ContinuousSubarraySum();
        System.out.println(sol.checkSubarraySum(new int[]{1,2,3}, 0));
    }
}
