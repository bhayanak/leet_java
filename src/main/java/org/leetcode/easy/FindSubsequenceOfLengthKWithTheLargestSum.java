package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindSubsequenceOfLengthKWithTheLargestSum solution. */
public class FindSubsequenceOfLengthKWithTheLargestSum {

    /**
     * Returns a subsequence of length k with the largest sum, preserving original order.
     * @param nums input array
     * @param k    number of elements to select
     * @return subsequence of k elements with maximum sum in original order
     * <p><b>Explanation:</b> Sort by value descending, pick top-k indices, sort selected indices, extract.</p>
     */
    public int[] solve(int[] nums, int k) {
        int n = nums.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> nums[b] - nums[a]);
        Integer[] chosen = Arrays.copyOf(idx, k);
        Arrays.sort(chosen);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = nums[chosen[i]];
        return result;
    }

    public static void main(String[] args) {
        FindSubsequenceOfLengthKWithTheLargestSum sol = new FindSubsequenceOfLengthKWithTheLargestSum();
        System.out.println(Arrays.toString(sol.solve(new int[]{2,1,3,3}, 2)));    // [3, 3]
        System.out.println(Arrays.toString(sol.solve(new int[]{-1,-2,3,4}, 3)));  // [-1, 3, 4]
    }

}
