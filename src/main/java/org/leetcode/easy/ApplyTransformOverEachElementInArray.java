package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ApplyTransformOverEachElementInArray solution. */
public class ApplyTransformOverEachElementInArray {

    /**
     * Java equivalent of arr.map((val, idx) =&gt; val + idx).
     * @param arr input array
     * @return transformed array where result[i] = arr[i] + i
     * <p><b>Explanation:</b> Single pass: add index to each element, mirroring JS Array.map.</p>
     */
    public int[] solve(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) result[i] = arr[i] + i;
        return result;
    }

    public static void main(String[] args) {
        ApplyTransformOverEachElementInArray sol = new ApplyTransformOverEachElementInArray();
        System.out.println(Arrays.toString(sol.solve(new int[]{1, 2, 3}))); // [1, 3, 5]
        System.out.println(Arrays.toString(sol.solve(new int[]{5, 8, 9, 2}))); // [5, 9, 11, 5]
    }

}
