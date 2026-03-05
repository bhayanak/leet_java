package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindTheMaximumDivisibilityScore solution. */
public class FindTheMaximumDivisibilityScore {

    /**
     * Finds the divisor in divisors[] that divides the most elements in nums[].
     * Ties broken by choosing the smaller divisor.
     * @param nums     array of integers
     * @param divisors candidate divisors
     * @return divisor with maximum divisibility score
     * <p><b>Explanation:</b> O(n·m) brute-force; count multiples for each divisor.</p>
     */
    public int solve(int[] nums, int[] divisors) {
        int maxScore = -1, result = Integer.MAX_VALUE;
        for (int d : divisors) {
            int score = 0;
            for (int x : nums) if (x % d == 0) score++;
            if (score > maxScore || (score == maxScore && d < result)) {
                maxScore = score; result = d;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindTheMaximumDivisibilityScore sol = new FindTheMaximumDivisibilityScore();
        System.out.println(sol.solve(new int[]{4,7,9,3,9}, new int[]{5,2,3}));   // 3
        System.out.println(sol.solve(new int[]{20,14,21,10}, new int[]{5,7,5})); // 5
    }

}
