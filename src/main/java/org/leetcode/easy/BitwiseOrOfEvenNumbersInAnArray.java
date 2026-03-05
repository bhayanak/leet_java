package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>#3478 - BitwiseOrOfEvenNumbersInAnArray</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given an integer array nums, return the bitwise OR of all even numbers in nums, or 0 if no even numbers exist.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/bitwiseorofevennumbersinanarray-/">LeetCode #3478</a>
 */
public class BitwiseOrOfEvenNumbersInAnArray {

    /**
     * Returns the bitwise OR of all even numbers in the array.
     * @param nums input array
     * @return bitwise OR of even elements (0 if none)
     * <p><b>Explanation:</b> Single pass: OR each even element into the accumulator.</p>
     */
    public int solve(int[] nums) {
        int result = 0;
        for (int x : nums) if (x % 2 == 0) result |= x;
        return result;
    }

    public static void main(String[] args) {
        BitwiseOrOfEvenNumbersInAnArray sol = new BitwiseOrOfEvenNumbersInAnArray();
        System.out.println(sol.solve(new int[]{1, 2, 4, 6})); // 6
        System.out.println(sol.solve(new int[]{1, 3, 5}));    // 0  (no even numbers)
    }

}
