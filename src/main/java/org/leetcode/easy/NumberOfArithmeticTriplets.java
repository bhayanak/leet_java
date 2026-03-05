package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** NumberOfArithmeticTriplets solution. */
public class NumberOfArithmeticTriplets {

    /**
     * Counts arithmetic triplets (i,j,k) with i &lt; j &lt; k and
     * nums[j]-nums[i] == nums[k]-nums[j] == diff.
     * @param nums strictly increasing array
     * @param diff required common difference
     * @return count of arithmetic triplets
     * <p><b>Explanation:</b> HashSet: for each num, check if num-diff and num-2*diff exist.</p>
     */
    public int solve(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        int count = 0;
        for (int x : nums)
            if (set.contains(x - diff) && set.contains(x - 2 * diff)) count++;
        return count;
    }

    public static void main(String[] args) {
        NumberOfArithmeticTriplets sol = new NumberOfArithmeticTriplets();
        System.out.println(sol.solve(new int[]{0,1,4,6,7,10}, 3)); // 2
        System.out.println(sol.solve(new int[]{4,5,6,7,8,9}, 2));   // 2
    }

}
