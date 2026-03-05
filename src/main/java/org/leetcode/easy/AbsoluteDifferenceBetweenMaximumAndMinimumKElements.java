package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** AbsoluteDifferenceBetweenMaximumAndMinimumKElements solution. */
public class AbsoluteDifferenceBetweenMaximumAndMinimumKElements {

    /**
     * Returns the absolute difference between the sum of the k largest
     * and k smallest elements.
     * @param nums sorted array of integers
     * @return difference of sums
     * <p><b>Explanation:</b> Sort then accumulate k-max minus k-min sums in O(n log n).</p>
     */
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, k = (n + 1) / 2;
        long largest = 0, smallest = 0;
        for (int i = 0; i < k; i++) smallest += nums[i];
        for (int i = n - k; i < n; i++) largest += nums[i];
        return (int)(largest - smallest);
    }

    public static void main(String[] args) {
        AbsoluteDifferenceBetweenMaximumAndMinimumKElements sol =
            new AbsoluteDifferenceBetweenMaximumAndMinimumKElements();
        System.out.println(sol.solve(new int[]{2, 1, 5, 4})); // 3
        System.out.println(sol.solve(new int[]{1, 1, 5, 5})); // 4
    }

}
