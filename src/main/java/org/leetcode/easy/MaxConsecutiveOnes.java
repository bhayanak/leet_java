package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #485: Max Consecutive Ones
 * @see <a href="https://leetcode.com/problems/max-consecutive-ones/">Problem</a>
 */
public class MaxConsecutiveOnes {

    /**
     * LeetCode #485 – Max Consecutive Ones
     * Difficulty: EASY
     * Topics: Array
     *
     * Given a binary array nums, return the maximum number of consecutive 1's in
     * the array.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive
     * 1s. The maximum number of consecutive 1s is 3.
     * 
     * Example 2:
     * 
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 105
     * 
     * nums[i] is either 0 or 1.

     *
     * Hints:
     *   1. You need to think about two things as far as any window is concerned. One is the starting point for the window. How do you detect that a new window of 1s has started? The next part is detecting the en
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int n : nums) {
            if (n == 1) max = Math.max(max, ++count);
            else count = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes sol = new MaxConsecutiveOnes();
        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1,2,3}));
    }
}
