package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumMovesToEqualArrayElementsIii solution. */
public class MinimumMovesToEqualArrayElementsIii {

    /**
     * Returns the minimum number of moves to make all elements equal, where each
     * move increments (n-1) elements by 1 (equivalent to decrementing 1 element by 1).
     * Optimal target is the median.
     * @param nums input array
     * @return minimum total moves
     * <p><b>Explanation:</b> Sort; compute sum of |nums[i] - median|.</p>
     */
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int moves = 0;
        for (int x : nums) moves += Math.abs(x - median);
        return moves;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsIii sol = new MinimumMovesToEqualArrayElementsIii();
        System.out.println(sol.solve(new int[]{1,2,3}));      // 2
        System.out.println(sol.solve(new int[]{1,10,2,9}));   // 16
    }

}
