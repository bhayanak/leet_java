package org.leetcode.easy;

/** MeanOfArrayAfterRemovingSomeElements solution. */
public class MeanOfArrayAfterRemovingSomeElements {
    /**
     * Returns the mean of the array after removing the smallest 5% and largest 5% of values.
     *
     * @param arr input integer array
     * @return trimmed mean
     *
     * <p><b>Explanation:</b> Sorts the array and sums the middle 90% elements, dividing by their count.</p>
     *   Time O(n log n), Space O(1).
     */
    public double trimMean(int[] arr) {
        java.util.Arrays.sort(arr);
        int n = arr.length, trim = n / 20;
        double sum = 0;
        for (int i = trim; i < n - trim; i++) sum += arr[i];
        return sum / (n - 2 * trim);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== MeanOfArrayAfterRemovingSomeElements ===");
        MeanOfArrayAfterRemovingSomeElements sol = new MeanOfArrayAfterRemovingSomeElements();
        System.out.println(sol.trimMean(new int[]{1,2,3}));
    }
}
