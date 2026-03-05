package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** LongestStrictlyIncreasingOrStrictlyDecreasingSubarray solution. */
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

    /**
     * Returns the length of the longest strictly increasing or strictly decreasing subarray.
     * @param nums input array
     * @return maximum run length (at least 1)
     * <p><b>Explanation:</b> Two passes (increasing, decreasing) or one pass tracking both runs.</p>
     */
    public int solve(int[] nums) {
        int maxLen = 1, incLen = 1, decLen = 1;
        for (int i = 1; i < nums.length; i++) {
            incLen = nums[i] > nums[i-1] ? incLen + 1 : 1;
            decLen = nums[i] < nums[i-1] ? decLen + 1 : 1;
            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestStrictlyIncreasingOrStrictlyDecreasingSubarray sol = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();
        System.out.println(sol.solve(new int[]{1,4,3,3,2})); // 2
        System.out.println(sol.solve(new int[]{3,3,3,3}));    // 1
        System.out.println(sol.solve(new int[]{3,2,1}));      // 3
    }

}
