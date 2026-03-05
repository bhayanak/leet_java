package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #560: Subarray Sum Equals K
 * @see <a href="https://leetcode.com/problems/subarray-sum-equals-k/">Problem</a>
 */
public class SubarraySumEqualsK {

    /**
     * LeetCode #560 – Subarray Sum Equals K
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Prefix Sum
     *
     * Given an array of integers nums and an integer k, return the total number
     * of subarrays whose sum equals to k.
     * 
     * 
     * A subarray is a contiguous non-empty sequence of elements within an array.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,1,1], k = 2
     * Output: 2
     * 
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3], k = 3
     * Output: 2
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 2 * 104
     * 
     * -1000 &lt;= nums[i] &lt;= 1000
     * 
     * -107 &lt;= k &lt;= 107

     *
     * Hints:
     *   1. Will Brute force work here? Try to optimize it.
     *   2. Can we optimize it by using some extra space?
     *   3. What about storing sum frequencies in a hash table? Will it be useful?
     */
    // Prefix sum + hashmap: count(sum[0..i] - k)
    /**
     * Solves the problem: Subarray sum.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
     */
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int n : nums) {
            sum += n;
            count += map.getOrDefault(sum - k, 0);
            map.merge(sum, 1, Integer::sum);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        System.out.println(sol.subarraySum(new int[]{1,2,3}, 0));
    }
}
