package org.leetcode.easy;


/**
 * <b>#3712 - Sum of Elements With Frequency Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * Return an integer denoting the sum of all elements in nums whose frequency is divisible by k, or 0 if there are no such elements.
 *
 *
 * Note: An element is included in the sum exactly as many times as it appears in the array if its total frequency is divisible by k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3,3,3,3,4], k = 2
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * The number 1 appears once (odd frequency).
 *
 * The number 2 appears twice (even frequency).
 *
 * The number 3 appears four times (even frequency).
 *
 * The number 4 appears once (odd frequency).
 *
 * So, the total sum is 2 + 2 + 3 + 3 + 3 + 3 = 16.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5], k = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no elements that appear an even number of times, so the total sum is 0.
 *
 * Example 3:
 *
 * Input: nums = [4,4,4,1,2,3], k = 3
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The number 1 appears once.
 *
 * The number 2 appears once.
 *
 * The number 3 appears once.
 *
 * The number 4 appears three times.
 *
 * So, the total sum is 4 + 4 + 4 = 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * 1 &lt;= k &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate as described
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/">LeetCode #3712</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class SumOfElementsWithFrequencyDivisibleByK {

    /**
     * Computes the minimum Min cost.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param n the n (int)
     * @param cost the cost (int[])
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public long minCost(int n, int[] cost) {
        java.util.Arrays.sort(cost);
        long total=0;
        for (int i=0;i<n;i++) total+=cost[i];
        // Every 3rd is free (cheapest)
        for (int i=2;i<n;i+=3) total-=cost[i];
        return total;
    }

    public static void main(String[] args) {
        SumOfElementsWithFrequencyDivisibleByK sol = new SumOfElementsWithFrequencyDivisibleByK();
        System.out.println(sol.minCost(0, new int[]{1,2,3}));
    }
}
