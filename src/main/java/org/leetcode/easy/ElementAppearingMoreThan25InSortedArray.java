package org.leetcode.easy;

/**
 * <b>#1287 - ElementAppearingMoreThan25InSortedArray</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given an integer array sorted in non-decreasing order, there is exactly one integer that appears more than 25% of the time. Return that integer.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/elementappearingmorethan25insortedarray-/">LeetCode #1287</a>
 */
public class ElementAppearingMoreThan25InSortedArray {
    /**
     * Finds the element appearing more than 25% of the time in the sorted array.
     *
     * @param arr sorted integer array
     * @return the element appearing more than 25% of the time
     *
     * <p><b>Explanation:</b> Checks every element at positions n/4, n/2, 3n/4 against its</p>
     *   neighbour n/4 steps ahead; the qualifying element spans that gap. Time O(1).
     */
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, quarter = n / 4;
        for (int i = 0; i < n - quarter; i++)
            if (arr[i] == arr[i + quarter]) return arr[i];
        return -1;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== ElementAppearingMoreThan25InSortedArray ===");
        ElementAppearingMoreThan25InSortedArray sol = new ElementAppearingMoreThan25InSortedArray();
        System.out.println(sol.findSpecialInteger(new int[]{1,2,3}));
    }
}
