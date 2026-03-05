package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumOperationsToEqualizeArray solution. */
public class MinimumOperationsToEqualizeArray {

    /**
     * Returns the minimum number of operations to make all array elements equal.
     * Each operation: choose an index i &gt; 0 and set nums[i] = nums[i-1].
     * The minimum is to propagate the maximum value to all elements.
     * @param nums input array
     * @return count of non-maximum elements
     * <p><b>Explanation:</b> Count elements != max; that many operations needed.</p>
     */
    public int solve(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int count = 0;
        for (int x : nums) if (x != max) count++;
        return count;
    }

    public static void main(String[] args) {
        MinimumOperationsToEqualizeArray sol = new MinimumOperationsToEqualizeArray();
        System.out.println(sol.solve(new int[]{3,5,3})); // 2 (make both 3s into 5)
        System.out.println(sol.solve(new int[]{2,2,2})); // 0
    }

}
