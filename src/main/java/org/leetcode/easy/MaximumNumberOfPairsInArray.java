package org.leetcode.easy;


/**
 * <b>#2341 - Maximum Number of Pairs in Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. In one operation, you may do the following:
 *
 *
 * Choose two integers in nums that are equal.
 *
 * Remove both integers from nums, forming a pair.
 *
 * The operation is done on nums as many times as possible.
 *
 *
 * Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2,1,3,2,2]
 * Output: [3,1]
 * Explanation:
 * Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
 * Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
 * Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
 * No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
 *
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [1,0]
 * Explanation: Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [].
 * No more pairs can be formed. A total of 1 pair has been formed, and there are 0 numbers leftover in nums.
 *
 * Example 3:
 *
 * Input: nums = [0]
 * Output: [0,1]
 * Explanation: No pairs can be formed, and there is 1 number leftover in nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 0 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What do we need to know to find how many pairs we can make? We need to know the frequency of each integer.
 * Hint 2: When will there be a leftover number? When the frequency of an integer is an odd number.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-pairs-in-array/">LeetCode #2341</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class MaximumNumberOfPairsInArray {

    /**
     * Solves the problem: Number of pairs.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int[] numberOfPairs(int[] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int n:nums) cnt.merge(n,1,Integer::sum);
        int pairs=0, leftovers=0;
        for (int v:cnt.values()) { pairs+=v/2; leftovers+=v%2; }
        return new int[]{pairs,leftovers};
    }

    public static void main(String[] args) {
        MaximumNumberOfPairsInArray sol = new MaximumNumberOfPairsInArray();
        System.out.println(sol.numberOfPairs(new int[]{1,2,3}));
    }
}
