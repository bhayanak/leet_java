package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #747: Largest Number At Least Twice of Others
 * @see <a href="https://leetcode.com/problems/largest-number-at-least-twice-of-others/">Problem</a>
 */
public class LargestNumberAtLeastTwiceOfOthers {

    /**
     * LeetCode #747 – Largest Number At Least Twice of Others
     * Difficulty: EASY
     * Topics: Array, Sorting
     *
     * You are given an integer array nums where the largest integer is unique.
     * 
     * 
     * Determine whether the largest element in the array is at least twice as
     * much as every other number in the array. If it is, return the index of the
     * largest element, or return -1 otherwise.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [3,6,1,0]
     * Output: 1
     * Explanation: 6 is the largest integer.
     * For every other number in the array x, 6 is at least twice as big as x.
     * The index of value 6 is 1, so we return 1.
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,4]
     * Output: -1
     * Explanation: 4 is less than twice the value of 3, so we return -1.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 2 &lt;= nums.length &lt;= 50
     * 
     * 0 &lt;= nums[i] &lt;= 100
     * 
     * The largest element in nums is unique.
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) { max2 = max1; max1 = nums[i]; idx = i; }
            else if (nums[i] > max2) { max2 = nums[i]; }
        }
        return max1 >= 2 * max2 ? idx : -1;
    }

    public static void main(String[] args) {
        LargestNumberAtLeastTwiceOfOthers sol = new LargestNumberAtLeastTwiceOfOthers();
        System.out.println(sol.dominantIndex(new int[]{1,2,3}));
    }
}
