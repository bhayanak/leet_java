package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>#2195 - SmallestMissingMultipleOfK</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Find the smallest positive integer that is a multiple of k and is missing from the array.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/smallestmissingmultipleofk-/">LeetCode #2195</a>
 */
public class SmallestMissingMultipleOfK {

    /**
     * Returns the smallest positive multiple of k that is not present in nums.
     * @param nums array of integers
     * @param k    the multiplier
     * @return smallest missing multiple of k
     * <p><b>Explanation:</b> HashSet of nums; iterate k,2k,3k... until one is missing.</p>
     */
    public int solve(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        int multiple = k;
        while (set.contains(multiple)) multiple += k;
        return multiple;
    }

    public static void main(String[] args) {
        SmallestMissingMultipleOfK sol = new SmallestMissingMultipleOfK();
        System.out.println(sol.solve(new int[]{1,5,3,4,2}, 2));    // 6
        System.out.println(sol.solve(new int[]{1,2,3,4}, 2));      // 6
        System.out.println(sol.solve(new int[]{3,9,6}, 3));         // 12
    }

}
