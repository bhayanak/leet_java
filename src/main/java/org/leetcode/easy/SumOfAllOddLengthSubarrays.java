package org.leetcode.easy;


/**
 * <b>#1588 - Sum of All Odd Length Subarrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
 *
 *
 * A subarray is a contiguous subsequence of the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,4,2,5,3]
 * Output: 58
 * Explanation: The odd-length subarrays of arr and their sums are:
 * [1] = 1
 * [4] = 4
 * [2] = 2
 * [5] = 5
 * [3] = 3
 * [1,4,2] = 7
 * [4,2,5] = 11
 * [2,5,3] = 10
 * [1,4,2,5,3] = 15
 * If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 *
 * Example 2:
 *
 * Input: arr = [1,2]
 * Output: 3
 * Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
 *
 * Example 3:
 *
 * Input: arr = [10,11,12]
 * Output: 66
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 100
 *
 * 1 &lt;= arr[i] &lt;= 1000
 *
 *
 *
 * Follow up:
 *
 *
 * Could you solve this problem in O(n) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can brute force – try every (i,j) pair, and if the length is odd, go through and add the sum to the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-all-odd-length-subarrays/">LeetCode #1588</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SumOfAllOddLengthSubarrays {

    /**
     * Computes the sum of Sum odd length subarrays.
     *
     * @param arr the arr (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int sumOddLengthSubarrays(int[] arr) {
        int total=0, n=arr.length;
        for (int i=0;i<n;i++) {
            // element arr[i] appears in subarrays starting s=[0..i] ending e=[i..n-1]
            // count of odd-length subarrays containing i:
            int left=i+1, right=n-i;
            total += arr[i] * ((left/2)*(right/2) + ((left+1)/2)*((right+1)/2));
        }
        return total;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        SumOfAllOddLengthSubarrays sol = new SumOfAllOddLengthSubarrays();
                System.out.println(sol.sumOddLengthSubarrays(new int[]{1,4,2,5,3})); // 58
                System.out.println(sol.sumOddLengthSubarrays(new int[]{1,2}));       // 3
                System.out.println(sol.sumOddLengthSubarrays(new int[]{10,11,12}));  // 66
    }
}
