package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ContainsDuplicateIi solution. */
public class ContainsDuplicateIi {

    /**
     * Returns true if there are two distinct indices i, j where nums[i]==nums[j]
     * and |i-j| &lt;= k.
     * @param nums input array
     * @param k maximum index distance
     * @return true if such a duplicate exists
     * <p><b>Explanation:</b> HashMap tracking last-seen index; O(n) time, O(min(n,k)) space.</p>
     */
    public boolean solve(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateIi sol = new ContainsDuplicateIi();
        System.out.println(sol.solve(new int[]{1, 2, 3, 1}, 3));       // true
        System.out.println(sol.solve(new int[]{1, 0, 1, 1}, 1));       // true
        System.out.println(sol.solve(new int[]{1, 2, 3, 1, 2, 3}, 2)); // false
    }

}
