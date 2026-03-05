package org.leetcode.easy;


/**
 * <b>#1748 - Sum of Unique Elements</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
 *
 *
 * Return the sum of all the unique elements of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,2]
 * Output: 4
 * Explanation: The unique elements are [1,3], and the sum is 4.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: 0
 * Explanation: There are no unique elements, and the sum is 0.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: 15
 * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a dictionary to count the frequency of each number.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-unique-elements/">LeetCode #1748</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SumOfUniqueElements {

    /**
     * Computes the sum of Sum of unique.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int sumOfUnique(int[] nums) {
        int[] cnt = new int[101];
        for (int n:nums) cnt[n]++;
        int sum=0;
        for (int i=0;i<cnt.length;i++) if (cnt[i]==1) sum+=i;
        return sum;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        SumOfUniqueElements sol = new SumOfUniqueElements();
                System.out.println(sol.sumOfUnique(new int[]{1,2,3,2})); // 4
                System.out.println(sol.sumOfUnique(new int[]{1,1,1,1,1})); // 0
                System.out.println(sol.sumOfUnique(new int[]{1,2,3,4,5})); // 15
    }
}
