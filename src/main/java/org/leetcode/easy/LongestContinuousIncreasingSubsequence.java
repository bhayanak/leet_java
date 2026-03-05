package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #674: Longest Continuous Increasing Subsequence
 * @see <a href="https://leetcode.com/problems/longest-continuous-increasing-subsequence/">Problem</a>
 */
public class LongestContinuousIncreasingSubsequence {

    /**
     * LeetCode #674 – Longest Continuous Increasing Subsequence
     * Difficulty: EASY
     * Topics: Array
     *
     * Given an unsorted array of integers nums, return the length of the longest
     * continuous increasing subsequence (i.e. subarray). The subsequence must be
     * strictly increasing.
     * 
     * 
     * A continuous increasing subsequence is defined by two indices l and r (l &lt;
     * r) such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and
     * for each l &lt;= i &lt; r, nums[i] &lt; nums[i + 1].
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,3,5,4,7]
     * Output: 3
     * Explanation: The longest continuous increasing subsequence is [1,3,5] with
     * length 3.
     * Even though [1,3,5,7] is an increasing subsequence, it is not continuous as
     * elements 5 and 7 are separated by element
     * 4.
     * 
     * Example 2:
     * 
     * Input: nums = [2,2,2,2,2]
     * Output: 1
     * Explanation: The longest continuous increasing subsequence is [2] with
     * length 1. Note that it must be strictly
     * increasing.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 104
     * 
     * -109 &lt;= nums[i] &lt;= 109
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int maxLen = 1, cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) maxLen = Math.max(maxLen, ++cur);
            else cur = 1;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence sol = new LongestContinuousIncreasingSubsequence();
        System.out.println(sol.findLengthOfLCIS(new int[]{1,2,3}));
    }
}
