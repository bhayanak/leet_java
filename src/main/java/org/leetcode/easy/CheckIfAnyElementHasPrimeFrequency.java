package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>#3334 - CheckIfAnyElementHasPrimeFrequency</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given an integer array nums, return true if any value in nums has a prime frequency.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/checkifanyelementhasprimefrequency-/">LeetCode #3334</a>
 */
public class CheckIfAnyElementHasPrimeFrequency {

    /**
     * Returns true if any element in nums appears a prime number of times.
     * @param nums input array
     * @return true if at least one element has a prime frequency
     * <p><b>Explanation:</b> Count frequencies with a HashMap; check each count for primality.</p>
     */
    public boolean solve(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.merge(x, 1, Integer::sum);
        for (int f : freq.values()) if (isPrime(f)) return true;
        return false;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        CheckIfAnyElementHasPrimeFrequency sol = new CheckIfAnyElementHasPrimeFrequency();
        System.out.println(sol.solve(new int[]{1, 2, 2, 3, 3, 3})); // true  (3 appears 3 times)
        System.out.println(sol.solve(new int[]{1, 1, 1, 1}));        // false (1 appears 4 times)
    }

}
