package org.leetcode.easy;


/**
 * <b>#3046 - Split the Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:
 *
 *
 * nums1.length == nums2.length == nums.length / 2.
 *
 * nums1 should contain distinct elements.
 *
 * nums2 should also contain distinct elements.
 *
 * Return true if it is possible to split the array, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,2,3,4]
 * Output: true
 * Explanation: One of the possible ways to split nums is nums1 = [1,2,3] and nums2 = [1,2,4].
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1]
 * Output: false
 * Explanation: The only possible way to split nums is nums1 = [1,1] and nums2 = [1,1]. Both nums1 and nums2 do not contain distinct elements. Therefore, we return false.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * nums.length % 2 == 0 
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It’s impossible if the same number occurs more than twice. So just check the frequency of each value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/split-the-array/">LeetCode #3046</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class SplitTheArray {

    /**
     * Returns true if Is possible to split.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public boolean isPossibleToSplit(int[] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int n:nums) { cnt.merge(n,1,Integer::sum); if (cnt.get(n)>2) return false; }
        return true;
    }

    public static void main(String[] args) {
        SplitTheArray sol = new SplitTheArray();
        System.out.println(sol.isPossibleToSplit(new int[]{1,2,3}));
    }
}
