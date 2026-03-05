package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CategorizeBoxAccordingToCriteria solution. */
public class CategorizeBoxAccordingToCriteria {

    /**
     * Categorizes a box as Bulky, Heavy, Both, or Neither.
     * Bulky: any dimension &gt;= 10^4 OR volume &gt;= 10^9.
     * Heavy: mass &gt;= 100.
     * @param length box length
     * @param width box width
     * @param height box height
     * @param mass box mass
     * @return "Bulky", "Heavy", "Both", or "Neither"
     * <p><b>Explanation:</b> Check bulky and heavy flags independently, combine into 4 cases.</p>
     */
    public String solve(int length, int width, int height, int mass) {
        boolean bulky = (long)length * width * height >= 1_000_000_000L
                        || length >= 10000 || width >= 10000 || height >= 10000;
        boolean heavy = mass >= 100;
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }

    public static void main(String[] args) {
        CategorizeBoxAccordingToCriteria sol = new CategorizeBoxAccordingToCriteria();
        System.out.println(sol.solve(1000, 35, 700, 300)); // "Heavy"
        System.out.println(sol.solve(1, 1, 1, 1));         // "Neither"
        System.out.println(sol.solve(10000, 1, 1, 50));    // "Bulky"
    }

}
