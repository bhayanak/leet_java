package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** RingsAndRods solution. */
public class RingsAndRods {

    /**
     * Counts rods that have all three ring colors (R, G, B).
     * @param rings string of "ColorRod" pairs, e.g., "B0R0G0R9R0B0G0"
     * @return number of rods with all 3 colors
     * <p><b>Explanation:</b> Track color bitmask per rod; count rods with bitmask == 7 (R=1,G=2,B=4).</p>
     */
    public int solve(String rings) {
        int[] mask = new int[10];
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';
            if (color == 'R') mask[rod] |= 1;
            else if (color == 'G') mask[rod] |= 2;
            else if (color == 'B') mask[rod] |= 4;
        }
        int count = 0;
        for (int m : mask) if (m == 7) count++;
        return count;
    }

    public static void main(String[] args) {
        RingsAndRods sol = new RingsAndRods();
        System.out.println(sol.solve("B0B6G0R6R0R6G9"));     // 1
        System.out.println(sol.solve("B0R0G0R9R0B0G0"));     // 1
        System.out.println(sol.solve("G4"));                  // 0
    }

}
