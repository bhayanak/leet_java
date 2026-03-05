package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** LongestAlternatingSubarray solution. */
public class LongestAlternatingSubarray {

    /**
     * Returns the length of the longest alternating subarray
     * (adjacent elements differ by exactly 1 in absolute value, alternating sign).
     * @param nums input array
     * @return length of longest alternating subarray (minimum 1)
     * <p><b>Explanation:</b> Track current run length, resetting when the alternation breaks.</p>
     */
    public int solve(int[] nums) {
        int maxLen = 1, cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i] - nums[i-1]) == 1
                    && (i < 2 || (nums[i] - nums[i-1]) != (nums[i-1] - nums[i-2]))) {
                cur++;
            } else {
                cur = (Math.abs(nums[i] - nums[i-1]) == 1) ? 2 : 1;
            }
            maxLen = Math.max(maxLen, cur);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestAlternatingSubarray sol = new LongestAlternatingSubarray();
        System.out.println(sol.solve(new int[]{2,3,4,3,4})); // 4 (3,4,3,4)
        System.out.println(sol.solve(new int[]{4,5,6}));      // 2 (4,5 or 5,6)
    }

}
