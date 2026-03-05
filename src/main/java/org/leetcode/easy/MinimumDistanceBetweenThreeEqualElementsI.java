package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumDistanceBetweenThreeEqualElementsI solution. */
public class MinimumDistanceBetweenThreeEqualElementsI {

    /**
     * Finds the minimum sum of distances between three occurrences of the same element.
     * @param nums input array
     * @return minimum sum of indices distances, or -1 if impossible
     * <p><b>Explanation:</b> Track first and second occurrence of each value; on third occurrence compute score.</p>
     */
    public int solve(int[] nums) {
        Map<Integer, Integer> first = new HashMap<>(), second = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (!first.containsKey(x)) { first.put(x, i); }
            else if (!second.containsKey(x)) { second.put(x, i); }
            else { ans = Math.min(ans, i - first.get(x)); }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        MinimumDistanceBetweenThreeEqualElementsI sol = new MinimumDistanceBetweenThreeEqualElementsI();
        System.out.println(sol.solve(new int[]{4,1,2,2,7,2})); // 4  (indices 1,3,5: 5-1=4)
        System.out.println(sol.solve(new int[]{1,1,1,1,1}));    // 2  (indices 0,1,2: diff=2)
    }

}
