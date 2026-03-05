package org.leetcode.easy;


/**
 * <b>#1636 - Sort Array by Increasing Frequency</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
 *
 *
 * Return the sorted array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,2,2,3]
 * Output: [3,1,1,2,2,2]
 * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
 *
 * Example 2:
 *
 * Input: nums = [2,3,1,3,2]
 * Output: [1,3,3,2,2]
 * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
 *
 * Example 3:
 *
 * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
 * Output: [5,-1,4,4,-6,-6,1,1,1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * -100 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of each value.
 * Hint 2: Use a custom comparator to compare values by their frequency. If two values have the same frequency, compare their values.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sort-array-by-increasing-frequency/">LeetCode #1636</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class SortArrayByIncreasingFrequency {

    /**
     * Solves the problem: Frequency sort.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int[] frequencySort(int[] nums) {
        java.util.Map<Integer,Integer> freq = new java.util.HashMap<>();
        for (int n : nums) freq.merge(n,1,Integer::sum);
        Integer[] box = new Integer[nums.length];
        for (int i=0;i<nums.length;i++) box[i]=nums[i];
        java.util.Arrays.sort(box,(a,b)->
            freq.get(a).equals(freq.get(b)) ? b-a : freq.get(a)-freq.get(b));
        for (int i=0;i<nums.length;i++) nums[i]=box[i];
        return nums;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        SortArrayByIncreasingFrequency sol = new SortArrayByIncreasingFrequency();
                System.out.println(java.util.Arrays.toString(sol.frequencySort(new int[]{1,1,2,2,2,3}))); // [3,1,1,2,2,2]
                System.out.println(java.util.Arrays.toString(sol.frequencySort(new int[]{2,3,1,3,2}))); // [1,3,3,2,2]
                System.out.println(java.util.Arrays.toString(sol.frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1}))); // [5,-1,4,4,-6,-6,1,1,1]
    }
}
