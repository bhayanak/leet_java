package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** NeitherMinimumNorMaximum solution. */
public class NeitherMinimumNorMaximum {

    /**
     * Returns any element that is neither the minimum nor maximum of the array.
     * Returns -1 if no such element exists.
     * @param nums input array
     * @return element that is neither min nor max, or -1
     * <p><b>Explanation:</b> Sort; middle element (if length &gt;= 3) is neither min nor max.</p>
     */
    public int solve(int[] nums) {
        if (nums.length < 3) return -1;
        int[] copy = nums.clone();
        Arrays.sort(copy);
        return copy[1]; // second smallest is neither min nor max
    }

    public static void main(String[] args) {
        NeitherMinimumNorMaximum sol = new NeitherMinimumNorMaximum();
        System.out.println(sol.solve(new int[]{3,2,1,4})); // 2 or 3
        System.out.println(sol.solve(new int[]{1,2}));      // -1
    }

}
