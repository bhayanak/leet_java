package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** LastVisitedIntegers solution. */
public class LastVisitedIntegers {

    /**
     * Returns an array of last seen integers for each query.
     * For a digit d, look back d positions among the most-recently-seen integers.
     * @param nums array mixing integers and -1 query markers
     * @return answers to all -1 queries
     * <p><b>Explanation:</b> Maintain a list of seen integers; for each -1 at index i, look back k-th entry.</p>
     */
    public int[] solve(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0; // consecutive -1 count
        for (int x : nums) {
            if (x == -1) {
                k++;
                int idx = seen.size() - k;
                ans.add(idx >= 0 ? seen.get(idx) : -1);
            } else {
                seen.add(x);
                k = 0;
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        LastVisitedIntegers sol = new LastVisitedIntegers();
        System.out.println(Arrays.toString(sol.solve(new int[]{1,2,-1,-1,-1}))); // [2,1,-1]
        System.out.println(Arrays.toString(sol.solve(new int[]{3,-1,3,4,-1}))); // [3,4]
    }

}
