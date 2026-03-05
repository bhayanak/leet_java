package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #744: Find Smallest Letter Greater Than Target
 * @see <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target/">Problem</a>
 */
public class FindSmallestLetterGreaterThanTarget {

    /**
     * Finds the smallest letter in letters that is strictly greater than target,
     * wrapping around cyclically.
     * @param letters sorted circular char array
     * @param target  target character
     * @return smallest letter greater than target
     * <p><b>Explanation:</b> Linear scan; if no letter &gt; target, wrap to first letter.</p>
     */
    public char solve(char[] letters, char target) {
        for (char c : letters) if (c > target) return c;
        return letters[0]; // wraparound
    }

    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget sol = new FindSmallestLetterGreaterThanTarget();
        System.out.println(sol.solve(new char[]{'c','f','j'}, 'a')); // 'c'
        System.out.println(sol.solve(new char[]{'c','f','j'}, 'c')); // 'f'
        System.out.println(sol.solve(new char[]{'x','x','y','y'}, 'z')); // 'x'
    }

}
