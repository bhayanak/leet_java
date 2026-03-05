package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #704: Binary Search
 * @see <a href="https://leetcode.com/problems/binary-search/">Problem</a>
 */
public class BinarySearch {

    /**
     * LeetCode #704 – Binary Search
     * Difficulty: EASY
     * Topics: Array, Binary Search
     *
     * Given an array of integers nums which is sorted in ascending order, and an
     * integer target, write a function to search target in nums. If target
     * exists, then return its index. Otherwise, return -1.
     * 
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     * 
     * Example 2:
     * 
     * Input: nums = [-1,0,3,5,9,12], target = 2
     * Output: -1
     * Explanation: 2 does not exist in nums so return -1
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 104
     * 
     * -104 &lt; nums[i], target &lt; 104
     * 
     * All the integers in nums are unique.
     * 
     * nums is sorted in ascending order.
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();
        System.out.println(sol.search(new int[]{1,2,3}, 0));
    }
}
