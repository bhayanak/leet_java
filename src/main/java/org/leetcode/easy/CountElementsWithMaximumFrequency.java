package org.leetcode.easy;


/**
 * <b>#3005 - Count Elements With Maximum Frequency</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers.
 *
 *
 * Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
 *
 *
 * The frequency of an element is the number of occurrences of that element in the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3,1,4]
 * Output: 4
 * Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
 * So the number of elements in the array with maximum frequency is 4.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: 5
 * Explanation: All elements of the array have a frequency of 1 which is the maximum.
 * So the number of elements in the array with maximum frequency is 5.
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
 * Hint 1: Find frequencies of all elements of the array.
 * Hint 2: Find the elements that have the maximum frequencies and count their total occurrences.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-elements-with-maximum-frequency/">LeetCode #3005</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class CountElementsWithMaximumFrequency {

    /**
     * Computes the maximum Max frequency elements.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int maxFrequencyElements(int[] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int n:nums) cnt.merge(n,1,Integer::sum);
        int maxF=0; for (int v:cnt.values()) maxF=Math.max(maxF,v);
        int total=0; for (int v:cnt.values()) if (v==maxF) total+=v;
        return total;
    }

    public static void main(String[] args) {
        CountElementsWithMaximumFrequency sol = new CountElementsWithMaximumFrequency();
                System.out.println(sol.maxFrequencyElements(new int[]{1,2,2,3,1,4})); // 4
                System.out.println(sol.maxFrequencyElements(new int[]{1,2,3,4,5}));   // 5
    }
}
