package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>MinimumPositiveSumSubarray</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Array, Sliding Window, Brute Force</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers and a range [l, r], find the minimum length subarray within [l, r]
 * whose sum is positive. Return -1 if no such subarray exists.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>For each possible subarray length from l to r, use a sliding window to check if any subarray of that length has a positive sum.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O((r-l+1) * n), where n is the length of the array.</li>
 *   <li>Space: O(1)</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Checks all windows of length l to r; returns the first (smallest) window with positive sum.</p>
 */
public class MinimumPositiveSumSubarray {

    /**
     * Returns the minimum length subarray whose sum is positive.
     * @param nums input array
     * @param l    minimum subarray length
     * @param r    maximum subarray length
     * @return minimum length of subarray in [l,r] with positive sum, or -1
     * <p><b>Explanation:</b> Check all windows of length l to r; return first (smallest) window with positive sum.</p>
     */
    public int solve(int[] nums, int l, int r) {
        int n = nums.length;
        for (int len = l; len <= r; len++) {
            int sum = 0;
            for (int i = 0; i < len; i++) sum += nums[i];
            if (sum > 0) return len;
            for (int i = len; i < n; i++) {
                sum += nums[i] - nums[i - len];
                if (sum > 0) return len;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MinimumPositiveSumSubarray sol = new MinimumPositiveSumSubarray();
        System.out.println(sol.solve(new int[]{-2,2,-3,1}, 2, 3)); // 3
        System.out.println(sol.solve(new int[]{1,2,3,4}, 2, 4));   // 2
        System.out.println(sol.solve(new int[]{-3,-2,-1}, 1, 3));  // -1
    }

}
