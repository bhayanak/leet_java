package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #482: License Key Formatting
 * @see <a href="https://leetcode.com/problems/license-key-formatting/">Problem</a>
 */
public class LicenseKeyFormatting {

    /**
     * Reformats a license key string into groups of k characters separated by dashes,
     * with all letters uppercased.
     * @param s   the license key string (letters, digits, dashes)
     * @param k   the group size
     * @return reformatted string
     * <p><b>Explanation:</b> Strip dashes, uppercase, then prepend a possibly shorter first group.</p>
     */
    public String solve(String s, int k) {
        String clean = s.replace("-", "").toUpperCase();
        int n = clean.length();
        if (n == 0) return "";
        StringBuilder sb = new StringBuilder();
        int first = n % k;
        if (first > 0) sb.append(clean, 0, first);
        for (int i = first; i < n; i += k) {
            if (sb.length() > 0) sb.append('-');
            sb.append(clean, i, i + k);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LicenseKeyFormatting sol = new LicenseKeyFormatting();
        System.out.println(sol.solve("5F3Z-2e-9-w", 4)); // "5F3Z-2E9W"
        System.out.println(sol.solve("2-5g-3-J", 2));    // "2-5G-3J"
    }

}
