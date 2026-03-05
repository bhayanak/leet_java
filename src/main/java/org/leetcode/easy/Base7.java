package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #504: Base 7
 * @see <a href="https://leetcode.com/problems/base-7/">Problem</a>
 */
public class Base7 {

    /**
     * Converts an integer to its base-7 string representation.
     * @param num integer to convert
     * @return base-7 string
     * <p><b>Explanation:</b> Use Java's built-in Integer.toString(num, 7) for O(log n) conversion.</p>
     */
    public String solve(int num) {
        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        Base7 sol = new Base7();
        System.out.println(sol.solve(100)); // "202"
        System.out.println(sol.solve(-7));  // "-10"
    }

}
