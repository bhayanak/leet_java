package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** SummaryRanges solution. */
public class SummaryRanges {

    /**
     * Given a sorted unique integer array, returns a list of range strings.
     * Consecutive ranges are condensed to "a-&gt;b"; single values as "a".
     * @param nums sorted unique integers
     * @return list of range strings
     * <p><b>Explanation:</b> Two-pointer: expand each range as far as consecutive, then format.</p>
     */
    public List<String> solve(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length, i = 0;
        while (i < n) {
            int start = nums[i];
            while (i + 1 < n && nums[i+1] == nums[i] + 1) i++;
            if (nums[i] == start) result.add(String.valueOf(start));
            else result.add(start + "->" + nums[i]);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        SummaryRanges sol = new SummaryRanges();
        System.out.println(sol.solve(new int[]{0,1,2,4,5,7})); // ["0->2","4->5","7"]
        System.out.println(sol.solve(new int[]{0,2,3,4,6,8,9})); // ["0","2->4","6","8->9"]
    }

}
