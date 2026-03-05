package org.leetcode.easy;


/**
 * <b>#2206 - Divide Array Into Equal Pairs</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums consisting of 2 * n integers.
 *
 *
 * You need to divide nums into n pairs such that:
 *
 *
 * Each element belongs to exactly one pair.
 *
 * The elements present in a pair are equal.
 *
 * Return true if nums can be divided into n pairs, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3,2,2,2]
 * Output: true
 * Explanation: 
 * There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
 * If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation: 
 * There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
 *
 *
 *
 * Constraints:
 *
 *
 * nums.length == 2 * n
 *
 * 1 &lt;= n &lt;= 500
 *
 * 1 &lt;= nums[i] &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For any number x in the range [1, 500], count the number of elements in nums whose values are equal to x.
 * Hint 2: The elements with equal value can be divided completely into pairs if and only if their count is even.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation, Counting).
 *
 * @see <a href="https://leetcode.com/problems/divide-array-into-equal-pairs/">LeetCode #2206</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class DivideArrayIntoEqualPairs {

    /**
     * Solves the problem: Divide array.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public boolean divideArray(int[] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int n:nums) cnt.merge(n,1,Integer::sum);
        for (int v:cnt.values()) if (v%2!=0) return false;
        return true;
    }

    public static void main(String[] args) {
        DivideArrayIntoEqualPairs sol = new DivideArrayIntoEqualPairs();
                System.out.println(sol.divideArray(new int[]{3,2,3,2,2,2})); // true
                System.out.println(sol.divideArray(new int[]{1,2,3,4}));     // false
    }
}
