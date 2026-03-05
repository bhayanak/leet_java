package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** SmallestAbsentPositiveGreaterThanAverage solution. */
public class SmallestAbsentPositiveGreaterThanAverage {

    /**
     * Returns the smallest positive integer greater than the array average that is not in the array.
     * @param nums input array
     * @return smallest absent positive &gt; average
     * <p><b>Explanation:</b> Compute average; start from ceil(average)+1, find first absent positive.</p>
     */
    public int solve(int[] nums) {
        double avg = 0;
        for (int x : nums) avg += x;
        avg /= nums.length;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        int candidate = (int) avg + 1;
        while (set.contains(candidate)) candidate++;
        return candidate;
    }

    public static void main(String[] args) {
        SmallestAbsentPositiveGreaterThanAverage sol = new SmallestAbsentPositiveGreaterThanAverage();
        System.out.println(sol.solve(new int[]{2,1,3,4})); // avg=2.5, check 3 → already in, 4 → in, 5 → ans=5
        System.out.println(sol.solve(new int[]{10,20}));    // avg=15, check 16 → ans=16
    }

}
