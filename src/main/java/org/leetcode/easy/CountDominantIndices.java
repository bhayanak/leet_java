package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountDominantIndices solution. */
public class CountDominantIndices {

    /**
     * Returns all indices where nums[i] is at least twice every other element.
     * @param nums input array
     * @return array of dominant indices (sorted)
     * <p><b>Explanation:</b> Find max; for each max occurrence verify it &gt;= 2*all others.</p>
     */
    public int[] solve(int[] nums) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);
        List<Integer> result = new ArrayList<>();
        outer:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max) continue;
            for (int j = 0; j < nums.length; j++)
                if (j != i && nums[i] < 2 * nums[j]) continue outer;
            result.add(i);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        CountDominantIndices sol = new CountDominantIndices();
        System.out.println(Arrays.toString(sol.solve(new int[]{3, 6, 1, 0}))); // [1]
        System.out.println(Arrays.toString(sol.solve(new int[]{1, 2, 3, 4}))); // [3]
    }

}
