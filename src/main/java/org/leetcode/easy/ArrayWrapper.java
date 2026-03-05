package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ArrayWrapper solution. */
public class ArrayWrapper {

    /**
     * Java equivalent of JS ArrayWrapper: valueOf() returns sum, toString
     * returns "[...elements]".
     * @param nums the wrapped array
     * @return sum of all elements (valueOf semantics)
     * <p><b>Explanation:</b> Accumulate sum in one pass; mirrors JS valueOf for arithmetic.</p>
     */
    public int solve(int[] nums) {
        int sum = 0;
        for (int x : nums) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        ArrayWrapper sol = new ArrayWrapper();
        System.out.println(sol.solve(new int[]{1, 2}));    // 3
        System.out.println(sol.solve(new int[]{1, 2, 3})); // 6
    }

}
