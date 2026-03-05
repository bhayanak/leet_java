package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindSpecialSubstringOfLengthK solution. */
public class FindSpecialSubstringOfLengthK {

    /**
     * Returns true if there exists a substring of length k where all characters are the
     * same AND no adjacent character outside the substring is the same.
     * @param s input string
     * @param k required substring length
     * @return true if such a special substring exists
     * <p><b>Explanation:</b> Detect maximal runs; check if any run has length exactly k.</p>
     */
    public boolean solve(String s, int k) {
        int i = 0, n = s.length();
        while (i < n) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) j++;
            if (j - i == k) return true;
            i = j;
        }
        return false;
    }

    public static void main(String[] args) {
        FindSpecialSubstringOfLengthK sol = new FindSpecialSubstringOfLengthK();
        System.out.println(sol.solve("aabaab", 2)); // true ("aa" in position 3-4, run length 2)
        System.out.println(sol.solve("abcdef", 1)); // true (each char is a run of 1)
        System.out.println(sol.solve("aaa", 2));    // false (run of 3, not exactly 2)
    }

}
