package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #628: Maximum Product of Three Numbers
 * @see <a href="https://leetcode.com/problems/maximum-product-of-three-numbers/">Problem</a>
 */
public class MaximumProductOfThreeNumbers {

    /**
     * LeetCode #628 – Maximum Product of Three Numbers
     * Difficulty: EASY
     * Topics: Array, Math, Sorting
     *
     * Given an integer array nums, find three numbers whose product is maximum
     * and return the maximum product.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3]
     * Output: 6
     * 
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,4]
     * Output: 24
     * 
     * 
     * Example 3:
     * 
     * Input: nums = [-1,-2,-3]
     * Output: -6
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 3 &lt;= nums.length &lt;= 104
     * 
     * -1000 &lt;= nums[i] &lt;= 1000
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    // Sort: max is either 3 largest or 2 smallest (most negative) + 1 largest
    /**
     * Solves the problem: Maximum product.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3], nums[0]*nums[1]*nums[n-1]);
    }

    public static void main(String[] args) {
        MaximumProductOfThreeNumbers sol = new MaximumProductOfThreeNumbers();
        System.out.println(sol.maximumProduct(new int[]{1,2,3}));
    }
}
