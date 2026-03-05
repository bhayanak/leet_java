package org.leetcode.medium;


/**
 * <b>#3428 - Maximum and Minimum Sums of at Most Size K Subsequences</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Sorting, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and a positive integer k. Return the sum of the maximum and minimum elements of all subsequences of nums with at most k elements.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], k = 2
 *
 *
 * Output: 24
 *
 *
 * Explanation:
 *
 *
 * The subsequences of nums with at most 2 elements are:
 *
 *
 *
 *
 *
 * 			Subsequence 
 * 			Minimum
 * 			Maximum
 * 			Sum
 *
 *
 *
 *
 * 			[1]
 * 			1
 * 			1
 * 			2
 *
 *
 *
 *
 * 			[2]
 * 			2
 * 			2
 * 			4
 *
 *
 *
 *
 * 			[3]
 * 			3
 * 			3
 * 			6
 *
 *
 *
 *
 * 			[1, 2]
 * 			1
 * 			2
 * 			3
 *
 *
 *
 *
 * 			[1, 3]
 * 			1
 * 			3
 * 			4
 *
 *
 *
 *
 * 			[2, 3]
 * 			2
 * 			3
 * 			5
 *
 *
 *
 *
 * 			Final Total
 *
 *
 * 			24
 *
 *
 *
 *
 * The output would be 24.
 *
 * Example 2:
 *
 * Input: nums = [5,0,6], k = 1
 *
 *
 * Output: 22
 *
 *
 * Explanation: 
 *
 *
 * For subsequences with exactly 1 element, the minimum and maximum values are the element itself. Therefore, the total is 5 + 5 + 0 + 0 + 6 + 6 = 22.
 *
 * Example 3:
 *
 * Input: nums = [1,1,1], k = 2
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The subsequences [1, 1] and [1] each appear 3 times. For all of them, the minimum and maximum are both 1. Thus, the total is 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= min(70, nums.length)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Sorting, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/maximum-and-minimum-sums-of-at-most-size-k-subsequences/">LeetCode #3428</a>
 */
public class MaximumAndMinimumSumsOfAtMostSizeKSubsequences {

    /**
     * Solves the problem: Maximum weight.
     * Sorts the input first to enable efficient processing.
     *
     * @param intervals the intervals (int[][])
     * @return the computed int result
     */
    public int maximumWeight(int[][] intervals) {
        java.util.Arrays.sort(intervals,(a,b)->a[1]!=b[1] ? a[1]-b[1] : a[0]-b[0]);
        int n=intervals.length, max=0;
        for (int[] iv:intervals) max=Math.max(max,iv[1]-iv[0]);
        return max;
    }

    public static void main(String[] args) {
        MaximumAndMinimumSumsOfAtMostSizeKSubsequences sol = new MaximumAndMinimumSumsOfAtMostSizeKSubsequences();
        System.out.println(sol.maximumWeight(new int[][]{{1,2},{3,4}}));
    }
}
