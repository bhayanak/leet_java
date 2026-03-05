package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #665: Non-decreasing Array
 * @see <a href="https://leetcode.com/problems/non-decreasing-array/">Problem</a>
 */
public class NonDecreasingArray {

    /**
     * LeetCode #665 – Non-decreasing Array
     * Difficulty: MEDIUM
     * Topics: Array
     *
     * Given an array nums with n integers, your task is to check if it could
     * become non-decreasing by modifying at most one element.
     * 
     * 
     * We define an array is non-decreasing if nums[i] &lt;= nums[i + 1] holds for
     * every i (0-based) such that (0 &lt;= i &lt;= n - 2).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [4,2,3]
     * Output: true
     * Explanation: You could modify the first 4 to 1 to get a non-decreasing
     * array.
     * 
     * Example 2:
     * 
     * Input: nums = [4,2,1]
     * Output: false
     * Explanation: You cannot get a non-decreasing array by modifying at most one
     * element.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == nums.length
     * 
     * 1 &lt;= n &lt;= 104
     * 
     * -105 &lt;= nums[i] &lt;= 105
     */
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                count++;
                if (count > 1) return false;
                if (i >= 2 && nums[i] < nums[i-2]) nums[i] = nums[i-1]; // fix by raising nums[i]
                else nums[i-1] = nums[i]; // fix by lowering nums[i-1]
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NonDecreasingArray sol = new NonDecreasingArray();
        System.out.println(sol.checkPossibility(new int[]{1,2,3}));
    }
}
