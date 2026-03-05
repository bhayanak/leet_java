package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #594: Longest Harmonious Subsequence
 * @see <a href="https://leetcode.com/problems/longest-harmonious-subsequence/">Problem</a>
 */
public class LongestHarmoniousSubsequence {

    /**
     * LeetCode #594 – Longest Harmonious Subsequence
     * Difficulty: EASY
     * Topics: Array, Hash Table, Sliding Window, Sorting, Counting
     *
     * We define a harmonious array as an array where the difference between its
     * maximum value and its minimum value is exactly 1.
     * 
     * 
     * Given an integer array nums, return the length of its longest harmonious
     * subsequence among all its possible subsequences.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,3,2,2,5,2,3,7]
     * 
     * 
     * Output: 5
     * 
     * 
     * Explanation:
     * 
     * 
     * The longest harmonious subsequence is [3,2,2,2,3].
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,4]
     * 
     * 
     * Output: 2
     * 
     * 
     * Explanation:
     * 
     * 
     * The longest harmonious subsequences are [1,2], [2,3], and [3,4], all of
     * which have a length of 2.
     * 
     * Example 3:
     * 
     * Input: nums = [1,1,1,1]
     * 
     * 
     * Output: 0
     * 
     * 
     * Explanation:
     * 
     * 
     * No harmonic subsequence exists.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 2 * 104
     * 
     * -109 &lt;= nums[i] &lt;= 109
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int findLHS(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int n : nums) freq.merge(n, 1, Integer::sum);
        int maxLen = 0;
        for (int key : freq.keySet()) {
            if (freq.containsKey(key+1))
                maxLen = Math.max(maxLen, freq.get(key) + freq.get(key+1));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence sol = new LongestHarmoniousSubsequence();
        System.out.println(sol.findLHS(new int[]{1,2,3}));
    }
}
