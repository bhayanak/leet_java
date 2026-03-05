package org.leetcode.easy;


/**
 * <b>#2006 - Count Number of Pairs With Absolute Difference K</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the number of pairs (i, j) where i &lt; j such that |nums[i] - nums[j]| == k.
 *
 *
 * The value of |x| is defined as:
 *
 *
 * x if x &gt;= 0.
 *
 * -x if x &lt; 0.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,1], k = 1
 * Output: 4
 * Explanation: The pairs with an absolute difference of 1 are:
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 *
 * Example 2:
 *
 * Input: nums = [1,3], k = 3
 * Output: 0
 * Explanation: There are no pairs with an absolute difference of 3.
 *
 * Example 3:
 *
 * Input: nums = [3,2,1,5,4], k = 2
 * Output: 3
 * Explanation: The pairs with an absolute difference of 2 are:
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 200
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * 1 &lt;= k &lt;= 99
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we check every possible pair?
 * Hint 2: Can we use a nested for loop to solve this problem?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/">LeetCode #2006</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class CountNumberOfPairsWithAbsoluteDifferenceK {

    /**
     * Counts Count k difference.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int countKDifference(int[] nums, int k) {
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>();
        int count=0;
        for (int n : nums) {
            count += cnt.getOrDefault(n-k,0) + cnt.getOrDefault(n+k,0);
            cnt.merge(n,1,Integer::sum);
        }
        return count;
    }

    public static void main(String[] args) {
        CountNumberOfPairsWithAbsoluteDifferenceK sol = new CountNumberOfPairsWithAbsoluteDifferenceK();
                System.out.println(sol.countKDifference(new int[]{1,2,2,1},1)); // 4
                System.out.println(sol.countKDifference(new int[]{1,3},3));     // 0
                System.out.println(sol.countKDifference(new int[]{3,2,1,5,4},2)); // 3
    }
}
