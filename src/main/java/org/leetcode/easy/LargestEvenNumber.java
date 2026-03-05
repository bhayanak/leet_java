package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** LargestEvenNumber solution. */
public class LargestEvenNumber {

    /**
     * Forms the largest even number possible from the digits in the string.
     * @param num string of digits
     * @return the largest even number as string, or "" if impossible
     * <p><b>Explanation:</b> Sort digits descending; swap smallest even digit to the end; handle leading zeros.</p>
     */
    public String solve(String num) {
        char[] digits = num.toCharArray();
        Arrays.sort(digits);
        // Find the rightmost even digit to place at end
        int evenIdx = -1;
        for (int i = digits.length - 1; i >= 0; i--)
            if ((digits[i] - '0') % 2 == 0) { evenIdx = i; break; }
        if (evenIdx == -1) return "";
        char evenDigit = digits[evenIdx];
        // Build rest descending (skip evenIdx)
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--)
            if (i != evenIdx) sb.append(digits[i]);
        sb.append(evenDigit);
        // Remove leading zeros
        int start = 0;
        while (start < sb.length() - 1 && sb.charAt(start) == '0') start++;
        return sb.substring(start);
    }

    public static void main(String[] args) {
        LargestEvenNumber sol = new LargestEvenNumber();
        System.out.println(sol.solve("5213"));  // "5312" → let's see...  digits sort: 1235, even: 2 at idx1 → rest=531 → "5312"? 
        System.out.println(sol.solve("2"));     // "2"
        System.out.println(sol.solve("531"));   // ""  (no even digit)
    }

}
