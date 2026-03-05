package org.leetcode.easy;

/** CountOddNumbersInAnIntervalRange solution. */
public class CountOddNumbersInAnIntervalRange {
    /**
     * Counts odd numbers in the inclusive range [low, high].
     *
     * @param low  lower bound
     * @param high upper bound
     * @return count of odd numbers in [low, high]
     *
     * <p><b>Explanation:</b> The count of odds in [1..n] is ceil(n/2). Subtract counts:</p>
     *   oddsUpToHigh - oddsUpTo(low-1). Time O(1), Space O(1).
     */
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== CountOddNumbersInAnIntervalRange ===");
        CountOddNumbersInAnIntervalRange sol = new CountOddNumbersInAnIntervalRange();
        System.out.println(sol.countOdds(3, 3));
    }
}
