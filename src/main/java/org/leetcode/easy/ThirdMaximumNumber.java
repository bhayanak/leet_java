package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.TreeSet;

/**
 * LeetCode #414: Third Maximum Number
 * @see <a href="https://leetcode.com/problems/third-maximum-number/">Problem</a>
 */
public class ThirdMaximumNumber {

    /**
     * LeetCode #414 – Third Maximum Number
     * Difficulty: EASY
     * Topics: Array, Sorting
     *
     * Given an integer array nums, return the third distinct maximum number in
     * this array. If the third maximum does not exist, return the maximum number.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [3,2,1]
     * Output: 1
     * Explanation:
     * The first distinct maximum is 3.
     * The second distinct maximum is 2.
     * The third distinct maximum is 1.
     * 
     * Example 2:
     * 
     * Input: nums = [1,2]
     * Output: 2
     * Explanation:
     * The first distinct maximum is 2.
     * The second distinct maximum is 1.
     * The third distinct maximum does not exist, so the maximum (2) is returned
     * instead.
     * 
     * Example 3:
     * 
     * Input: nums = [2,2,3,1]
     * Output: 1
     * Explanation:
     * The first distinct maximum is 3.
     * The second distinct maximum is 2 (both 2's are counted together since they
     * have the same value).
     * The third distinct maximum is 1.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 104
     * 
     * -231 &lt;= nums[i] &lt;= 231 - 1
     * 
     * 
     * Follow up: Can you find an O(n) solution?
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
            if (set.size() > 3) set.pollFirst();
        }
        return set.size() == 3 ? set.first() : set.last();
    }

    public static void main(String[] args) {
        ThirdMaximumNumber sol = new ThirdMaximumNumber();
        System.out.println(sol.thirdMax(new int[]{1,2,3}));
    }
}
