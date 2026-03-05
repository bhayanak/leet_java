package org.leetcode.medium;


/**
 * <b>#852 - Peak Index in a Mountain Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 *
 *
 * Return the index of the peak element.
 *
 *
 * Your task is to solve it in O(log(n)) time complexity.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [0,1,0]
 *
 *
 * Output: 1
 *
 * Example 2:
 *
 * Input: arr = [0,2,1,0]
 *
 *
 * Output: 1
 *
 * Example 3:
 *
 * Input: arr = [0,10,5,2]
 *
 *
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= arr.length &lt;= 105
 *
 * 0 &lt;= arr[i] &lt;= 106
 *
 * arr is guaranteed to be a mountain array.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/">LeetCode #852</a>
 */
public class PeakIndexInAMountainArray {

    /**
     * Solves the problem: Peak index in mountain array.
     * Uses binary search for O(log n) lookup.
     *
     * @param arr the arr (int[])
     * @return the computed int result
     */
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid+1]) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PeakIndexInAMountainArray.java &amp;&amp; java org.leetcode.medium.PeakIndexInAMountainArray</pre>
     */
    public static void main(String[] args) {
        PeakIndexInAMountainArray sol = new PeakIndexInAMountainArray();
                System.out.println(sol.peakIndexInMountainArray(new int[]{0,1,0}));       // 1
                System.out.println(sol.peakIndexInMountainArray(new int[]{0,2,1,0}));     // 1
                System.out.println(sol.peakIndexInMountainArray(new int[]{0,10,5,2}));    // 1
    }
}
