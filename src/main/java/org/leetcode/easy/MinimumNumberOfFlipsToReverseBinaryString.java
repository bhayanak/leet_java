package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumNumberOfFlipsToReverseBinaryString solution. */
public class MinimumNumberOfFlipsToReverseBinaryString {

    /**
     * Returns the minimum number of bit flips to make the binary string non-increasing.
     * @param s binary string of '0' and '1'
     * @return minimum flips
     * <p><b>Explanation:</b> Count transitions from '0' to '1' going left-to-right; each is a mandatory flip.</p>
     */
    public int solve(String s) {
        int flips = 0;
        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) > s.charAt(i-1)) flips++;
        return flips;
    }

    public static void main(String[] args) {
        MinimumNumberOfFlipsToReverseBinaryString sol = new MinimumNumberOfFlipsToReverseBinaryString();
        System.out.println(sol.solve("010"));   // 1
        System.out.println(sol.solve("0101")); // 2
        System.out.println(sol.solve("111"));  // 0
    }

}
