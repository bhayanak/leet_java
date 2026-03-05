package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** TrionicArrayI solution. */
public class TrionicArrayI {

    /**
     * Returns true if any 3-element subarray (window) of nums sum to at least k.
     * @param nums input array (length &gt;= 3)
     * @param k    target sum
     * @return true if any contiguous subarray of length 3 has sum &gt;= k
     * <p><b>Explanation:</b> Sliding window of size 3; check if any window sum &gt;= k.</p>
     */
    public boolean solve(int[] nums, int k) {
        for (int i = 0; i + 2 < nums.length; i++)
            if (nums[i] + nums[i+1] + nums[i+2] >= k) return true;
        return false;
    }

    public static void main(String[] args) {
        TrionicArrayI sol = new TrionicArrayI();
        System.out.println(sol.solve(new int[]{1,2,3,4,5}, 8));  // true  (2+3+4=9 >= 8)
        System.out.println(sol.solve(new int[]{1,1,1,1,1}, 10)); // false
    }

}
