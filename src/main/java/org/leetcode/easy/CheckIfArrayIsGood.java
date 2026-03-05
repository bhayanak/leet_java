package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CheckIfArrayIsGood solution. */
public class CheckIfArrayIsGood {

    /**
     * Returns true if nums is a "good" array: a permutation of [1,2,...,max-1,max,max].
     * @param nums input array
     * @return true if nums is a good array
     * <p><b>Explanation:</b> Sort, verify last two are max, and prefix is [1..max-1].</p>
     */
    public boolean solve(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n - 1];
        if (n != max + 1) return false;
        if (nums[n - 2] != max) return false;
        for (int i = 0; i < n - 2; i++) if (nums[i] != i + 1) return false;
        return true;
    }

    public static void main(String[] args) {
        CheckIfArrayIsGood sol = new CheckIfArrayIsGood();
        System.out.println(sol.solve(new int[]{2, 1, 3}));    // false
        System.out.println(sol.solve(new int[]{1, 3, 3, 2})); // true
    }

}
