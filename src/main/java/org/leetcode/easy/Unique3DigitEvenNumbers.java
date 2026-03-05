package org.leetcode.easy;

/**
 * <b>#3483 - Unique3DigitEvenNumbers</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given an array of digits, count distinct 3-digit even numbers that can be formed using the digits (each digit used at most once per number).</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * <p><b>Explanation:</b> Enumerates all 3-digit even numbers, checks if each can be formed from the digits using frequency counting. Time O(n^3) for brute-force, but set ensures uniqueness.</p>
 * @see <a href="https://leetcode.com/problems/unique3digitevennumbers-/">LeetCode #3483</a>
 */
public class Unique3DigitEvenNumbers {
    /**
     * Counts distinct 3-digit even numbers that can be formed from the given digits.
     *
     * @param digits array of digits (0-9), each usable only as many times as it appears
     * @return count of distinct valid 3-digit even numbers
     *
     * <p><b>Explanation:</b> Enumerates all 3-digit even numbers (100-998 stepping by 2), checks via</p>
     *   digit frequency whether each can be formed from the available digits. Time O(450 * 10).
     */
    public int totalNumbers(int[] digits) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) continue;
                    if (digits[i] == 0) continue; // no leading zero
                    if (digits[k] % 2 != 0) continue; // must be even
                    set.add(digits[i]*100 + digits[j]*10 + digits[k]);
                }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println("=== Unique3DigitEvenNumbers ===");
        Unique3DigitEvenNumbers sol = new Unique3DigitEvenNumbers();
        System.out.println(sol.totalNumbers(new int[]{1,2,3}));
    }
}
