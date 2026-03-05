package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #525: Contiguous Array
 * @see <a href="https://leetcode.com/problems/contiguous-array/">Problem</a>
 */
public class ContiguousArray {

    /**
     * LeetCode #525 – Contiguous Array
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Prefix Sum
     *
     * Given a binary array nums, return the maximum length of a contiguous
     * subarray with an equal number of 0 and 1.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [0,1]
     * Output: 2
     * Explanation: [0, 1] is the longest contiguous subarray with an equal number
     * of 0 and 1.
     * 
     * Example 2:
     * 
     * Input: nums = [0,1,0]
     * Output: 2
     * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal
     * number of 0 and 1.
     * 
     * Example 3:
     * 
     * Input: nums = [0,1,1,1,1,1,0,0,0]
     * Output: 6
     * Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal
     * number of 0 and 1.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 105
     * 
     * nums[i] is either 0 or 1.
     */
    // Map from prefix sum (treat 0 as -1) to first index seen
    /**
     * Finds Find max length.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(sum)) maxLen = Math.max(maxLen, i - map.get(sum));
            else map.put(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        ContiguousArray sol = new ContiguousArray();
        System.out.println(sol.findMaxLength(new int[]{1,2,3}));
    }
}
