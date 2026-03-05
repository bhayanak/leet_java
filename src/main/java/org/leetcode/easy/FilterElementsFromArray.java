package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FilterElementsFromArray solution. */
public class FilterElementsFromArray {

    /**
     * Java equivalent of JS Array.filter(fn): keeps elements where the predicate holds.
     * Demo predicate: element &gt; 0.
     * @param arr input array
     * @return elements satisfying the predicate
     * <p><b>Explanation:</b> Stream filter to avoid manual index tracking.</p>
     */
    public int[] solve(int[] arr) {
        return Arrays.stream(arr).filter(x -> x > 0).toArray();
    }

    public static void main(String[] args) {
        FilterElementsFromArray sol = new FilterElementsFromArray();
        System.out.println(Arrays.toString(sol.solve(new int[]{0, 10, 20, -1}))); // [10, 20]
        System.out.println(Arrays.toString(sol.solve(new int[]{1, 2, -3, 0, 5}))); // [1, 2, 5]
    }

}
