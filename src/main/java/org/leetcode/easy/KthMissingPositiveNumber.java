package org.leetcode.easy;


/**
 * <b>#1539 - Kth Missing Positive Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 *
 *
 * Return the kth positive integer that is missing from this array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
 * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
 *
 * Example 2:
 *
 * Input: arr = [1,2,3,4], k = 2
 * Output: 6
 * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 1000
 *
 * 1 &lt;= arr[i] &lt;= 1000
 *
 * 1 &lt;= k &lt;= 1000
 *
 * arr[i] &lt; arr[j] for 1 &lt;= i &lt; j &lt;= arr.length
 *
 *
 *
 * Follow up:
 *
 *
 * Could you solve this problem in less than O(n) complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of how many positive numbers are missing as you scan the array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/kth-missing-positive-number/">LeetCode #1539</a>
  *
  * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class KthMissingPositiveNumber {

    /**
     * Finds Find kth positive.
     * Uses binary search for O(log n) lookup.
     *
     * @param arr the arr (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int findKthPositive(int[] arr, int k) {
        int lo=0, hi=arr.length;
        while (lo<hi) {
            int mid=lo+(hi-lo)/2;
            // missing count at mid = arr[mid]-1-mid
            if (arr[mid]-1-mid < k) lo=mid+1; else hi=mid;
        }
        return lo+k;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        KthMissingPositiveNumber sol = new KthMissingPositiveNumber();
                System.out.println(sol.findKthPositive(new int[]{2,3,4,7,11}, 5)); // 9
                System.out.println(sol.findKthPositive(new int[]{1,2,3,4}, 2));    // 6
    }
}
