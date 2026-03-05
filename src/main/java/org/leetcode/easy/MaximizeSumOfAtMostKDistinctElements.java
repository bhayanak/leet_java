package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MaximizeSumOfAtMostKDistinctElements solution. */
public class MaximizeSumOfAtMostKDistinctElements {

    /**
     * Returns the maximum possible sum using at most k distinct element values.
     * You can select multiple copies of each value up to its frequency.
     * @param nums input array
     * @param k    maximum number of distinct values to include
     * @return maximum sum
     * <p><b>Explanation:</b> Sort distinct values descending; accumulate the top-k groups.</p>
     */
    public long solve(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.merge(x, 1, Integer::sum);
        List<Integer> vals = new ArrayList<>(freq.keySet());
        vals.sort(Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < Math.min(k, vals.size()); i++)
            sum += (long) vals.get(i) * freq.get(vals.get(i));
        return sum;
    }

    public static void main(String[] args) {
        MaximizeSumOfAtMostKDistinctElements sol = new MaximizeSumOfAtMostKDistinctElements();
        System.out.println(sol.solve(new int[]{1,5,4,2,9,9,9}, 3)); // 9*3=27? let distinct top-3: 9,5,4 → 27+5+4=36? 9 appears 3 times
        System.out.println(sol.solve(new int[]{2,2,2}, 2)); // 6
    }

}
