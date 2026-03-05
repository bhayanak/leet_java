package org.leetcode.easy;


/**
 * <b>#2996 - Smallest Missing Integer Greater Than Sequential Prefix Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of integers nums.
 *
 *
 * A prefix nums[0..i] is sequential if, for all 1 &lt;= j &lt;= i, nums[j] = nums[j - 1] + 1. In particular, the prefix consisting only of nums[0] is sequential.
 *
 *
 * Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,2,5]
 * Output: 6
 * Explanation: The longest sequential prefix of nums is [1,2,3] with a sum of 6. 6 is not in the array, therefore 6 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.
 *
 * Example 2:
 *
 * Input: nums = [3,4,5,1,12,14,13]
 * Output: 15
 * Explanation: The longest sequential prefix of nums is [3,4,5] with a sum of 12. 12, 13, and 14 belong to the array while 15 does not. Therefore 15 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50
 *
 * 1 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To find the longest sequential prefix, iterate from left to right. For a fixed <code>i</code>, if <code>nums[i] != nums[i - 1] + 1</code> then the longest sequential prefix ends at <code>i - 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/">LeetCode #2996</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {

    /**
     * Solves the problem: Missing integer.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int missingInteger(int[] nums) {
        int seq=nums[0]; int i=1;
        while (i<nums.length&&nums[i]==nums[i-1]+1) { seq+=nums[i]; i++; }
        java.util.Set<Integer> set=new java.util.HashSet<>();
        for (int n:nums) set.add(n);
        while (set.contains(seq)) seq++;
        return seq;
    }

    public static void main(String[] args) {
        SmallestMissingIntegerGreaterThanSequentialPrefixSum sol = new SmallestMissingIntegerGreaterThanSequentialPrefixSum();
        System.out.println(sol.missingInteger(new int[]{1,2,3}));
    }
}
