package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>HexadecimalAndHexatrigesimalConversion</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Math, String, Base Conversion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer n, return the concatenation of its base-16 (hexadecimal)
 * and base-36 (hexatrigesimal) representations as a lowercase string.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Use Java's Integer.toString(n, radix) for direct conversion to base-16 and base-36, then concatenate the results.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(log n)</li>
 *   <li>Space: O(1)</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Uses built-in conversion methods for efficiency and correctness.</p>
 */
public class HexadecimalAndHexatrigesimalConversion {

    /**
     * Returns the concatenation of n in base-16 and n in base-36.
     * @param n positive integer
     * @return hex(n) + base36(n) as lowercase string
     * <p><b>Explanation:</b> Use Java's Integer.toString(n, radix) for direct conversion.</p>
     */
    public String solve(int n) {
        return Integer.toString(n, 16) + Integer.toString(n, 36);
    }

    public static void main(String[] args) {
        HexadecimalAndHexatrigesimalConversion sol = new HexadecimalAndHexatrigesimalConversion();
        System.out.println(sol.solve(13));  // "dd"   (d in hex, d in base36)
        System.out.println(sol.solve(36));  // "2410" (24 in hex, 10 in base36)
    }

}
