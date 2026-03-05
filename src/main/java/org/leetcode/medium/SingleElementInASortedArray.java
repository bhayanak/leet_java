package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #540: Single Element in a Sorted Array
 * @see <a href="https://leetcode.com/problems/single-element-in-a-sorted-array/">Problem</a>
 */
public class SingleElementInASortedArray {

    /**
     * LeetCode #540 – Single Element in a Sorted Array
     * Difficulty: MEDIUM
     * Topics: Array, Binary Search
     *
     * You are given a sorted array consisting of only integers where every
     * element appears exactly twice, except for one element which appears exactly
     * once.
     * 
     * 
     * Return the single element that appears only once.
     * 
     * 
     * Your solution must run in O(log n) time and O(1) space.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,1,2,3,3,4,4,8,8]
     * Output: 2
     * 
     * 
     * Example 2:
     * 
     * Input: nums = [3,3,7,7,10,11,11]
     * Output: 10
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 105
     * 
     * 0 &lt;= nums[i] &lt;= 105
     */
    // Binary search: pairs (i,i+1) where i is even; single element breaks the pattern
    /**
     * Solves the problem: Single non duplicate.
     * Uses binary search for O(log n) lookup.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) mid--;  // ensure mid is even
            if (nums[mid] == nums[mid+1]) lo = mid + 2;
            else hi = mid;
        }
        return nums[lo];
    }

    public static void main(String[] args) {
        SingleElementInASortedArray sol = new SingleElementInASortedArray();
        System.out.println(sol.singleNonDuplicate(new int[]{1,2,3}));
    }
}
