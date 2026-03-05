package org.leetcode.easy;

/** CountLargestGroup solution. */
public class CountLargestGroup {
    /**
     * Returns the largest group count among all groups of numbers [1..n] grouped by digit sum.
     *
     * @param n upper bound
     * @return the largest group size
     *
     * <p><b>Explanation:</b> Uses a frequency array indexed by digit sum (max digit sum of 4-digit n</p>
     *   is 36). Counts digit sums for 1..n and returns the maximum frequency. Time O(n * log n).
     */
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int s = 0, tmp = i;
            while (tmp > 0) { s += tmp % 10; tmp /= 10; }
            count[s]++;
            max = Math.max(max, count[s]);
        }
        final int finalMax = max;
        return (int) java.util.Arrays.stream(count).filter(c -> c == finalMax).count();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== CountLargestGroup ===");
        CountLargestGroup sol = new CountLargestGroup();
        System.out.println(sol.countLargestGroup(3));
    }
}
