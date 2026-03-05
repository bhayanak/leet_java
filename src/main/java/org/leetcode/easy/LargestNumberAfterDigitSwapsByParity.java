package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** LargestNumberAfterDigitSwapsByParity solution. */
public class LargestNumberAfterDigitSwapsByParity {

    /**
     * Swaps same-parity digits to form the largest possible number.
     * @param num input integer
     * @return largest integer achievable by swapping same-parity digits
     * <p><b>Explanation:</b> Bubble sort same-parity digits from most significant to least significant.</p>
     */
    public int solve(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if ((digits[i] - '0') % 2 == (digits[j] - '0') % 2 && digits[j] > digits[i]) {
                    char tmp = digits[i]; digits[i] = digits[j]; digits[j] = tmp;
                }
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        LargestNumberAfterDigitSwapsByParity sol = new LargestNumberAfterDigitSwapsByParity();
        System.out.println(sol.solve(1234));  // 3412
        System.out.println(sol.solve(65875)); // 87655
    }

}
