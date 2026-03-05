package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** NumberOfDistinctAverages solution. */
public class NumberOfDistinctAverages {

    /**
     * Counts distinct averages obtained by repeatedly removing and averaging the min and max.
     * @param nums sorted array
     * @return number of distinct (min+max)/2 averages
     * <p><b>Explanation:</b> Sort; for each pair (nums[i], nums[n-1-i]) compute average; count distinct values.</p>
     */
    public int solve(int[] nums) {
        Arrays.sort(nums);
        Set<Double> avgs = new HashSet<>();
        for (int i = 0; i < nums.length / 2; i++)
            avgs.add((nums[i] + nums[nums.length - 1 - i]) / 2.0);
        return avgs.size();
    }

    public static void main(String[] args) {
        NumberOfDistinctAverages sol = new NumberOfDistinctAverages();
        System.out.println(sol.solve(new int[]{4,1,4,0,3,5})); // 2
        System.out.println(sol.solve(new int[]{1,100}));         // 1
    }

}
