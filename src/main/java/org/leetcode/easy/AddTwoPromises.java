package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** AddTwoPromises solution. */
public class AddTwoPromises {

    /**
     * Java equivalent of JS addTwoPromises: returns sum of two values.
     * @param a first value
     * @param b second value
     * @return a + b
     * <p><b>Explanation:</b> Direct addition mirrors Promise.all resolution then sum.</p>
     */
    public int solve(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AddTwoPromises sol = new AddTwoPromises();
        System.out.println(sol.solve(2, 3)); // 5
        System.out.println(sol.solve(5, 5)); // 10
    }

}
