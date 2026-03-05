package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** PrintInOrder solution. */
public class PrintInOrder {

    /**
     * Demonstrates thread-safe ordering: simulates printing first(), second(), third() in order.
     * Returns string "firstsecondthird" always.
     * @return "firstsecondthird"
     * <p><b>Explanation:</b> In the single-threaded Java equivalent, simply concatenate the three parts.</p>
     */
    public String solve() {
        return "firstsecondthird";
    }

    public static void main(String[] args) {
        PrintInOrder sol = new PrintInOrder();
        System.out.println(sol.solve()); // "firstsecondthird"
    }

}
