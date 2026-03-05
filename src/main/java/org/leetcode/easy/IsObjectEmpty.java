package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>IsObjectEmpty</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array, determine if it is empty (has no elements).
 * Equivalent to JavaScript's Object.keys(obj).length === 0 for arrays.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Check if the array's length is zero.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(1)</li>
 *   <li>Space: O(1)</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Directly checks the array length, mirroring the JavaScript idiom for object emptiness.</p>
 */
public class IsObjectEmpty {

    /**
     * Java equivalent of JS isEmpty: returns true if the array has no elements.
     * @param nums the array
     * @return true if length is 0
     * <p><b>Explanation:</b> Direct length check; mirrors Object.keys(obj).length === 0 in JS.</p>
     */
    public boolean solve(int[] nums) {
        return nums.length == 0;
    }

    public static void main(String[] args) {
        IsObjectEmpty sol = new IsObjectEmpty();
        System.out.println(sol.solve(new int[]{}));    // true
        System.out.println(sol.solve(new int[]{1}));   // false
    }

}
