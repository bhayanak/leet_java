package org.leetcode.medium;


/**
 * <b>#912 - Sort an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Sorting, Heap (Priority Queue), Merge Sort, Bucket Sort, Radix Sort, Counting Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums, sort the array in ascending order and return it.
 *
 *
 * You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,2,3,1]
 * Output: [1,2,3,5]
 * Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
 *
 * Example 2:
 *
 * Input: nums = [5,1,1,2,0,0]
 * Output: [0,0,1,1,2,5]
 * Explanation: Note that the values of nums are not necessarily unique.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5 * 104
 *
 * -5 * 104 &lt;= nums[i] &lt;= 5 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Sorting, Heap (Priority Queue), Merge Sort, Bucket Sort, Radix Sort, Counting Sort).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sort-an-array/">LeetCode #912</a>
 */
public class SortAnArray {

    // Merge sort — O(n log n) guaranteed
    /**
     * Sorts Sort array.
     * Uses binary search for O(log n) lookup.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
     */
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid); mergeSort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }
    private void merge(int[] a, int lo, int mid, int hi) {
        int[] tmp = java.util.Arrays.copyOfRange(a, lo, hi+1);
        int i = 0, j = mid - lo + 1, k = lo;
        while (i <= mid-lo && j <= hi-lo)
            a[k++] = tmp[i] <= tmp[j] ? tmp[i++] : tmp[j++];
        while (i <= mid-lo) a[k++] = tmp[i++];
        while (j <= hi-lo)  a[k++] = tmp[j++];
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SortAnArray.java &amp;&amp; java org.leetcode.medium.SortAnArray</pre>
     */
    public static void main(String[] args) {
        SortAnArray sol = new SortAnArray();
                System.out.println(java.util.Arrays.toString(sol.sortArray(new int[]{5,2,3,1})));    // [1,2,3,5]
                System.out.println(java.util.Arrays.toString(sol.sortArray(new int[]{5,1,1,2,0,0}))); // [0,0,1,1,2,5]
    }
}
