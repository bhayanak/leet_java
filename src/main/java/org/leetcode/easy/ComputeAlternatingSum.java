package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ComputeAlternatingSum solution. */
public class ComputeAlternatingSum {

    /**
     * Returns the alternating sum: +nums[0] -nums[1] +nums[2] ...
     * @param nums input array
     * @return alternating sum
     * <p><b>Explanation:</b> Single pass with sign alternation starting positive at index 0.</p>
     */
    public long solve(int[] nums) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += (i % 2 == 0) ? nums[i] : -nums[i];
        return sum;
    }

    public static void main(String[] args) {
        ComputeAlternatingSum sol = new ComputeAlternatingSum();
        System.out.println(sol.solve(new int[]{4, 2, 5, 3})); // 4
        System.out.println(sol.solve(new int[]{1, 2, 3, 4})); // -2
    }

}
