package org.leetcode.easy;


/**
 * <b>#2164 - Sort Even and Odd Indices Independently</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:
 *
 *
 * Sort the values at odd indices of nums in non-increasing order.
 *
 *
 *
 *
 * For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
 *
 *
 *
 * Sort the values at even indices of nums in non-decreasing order.
 *
 *
 *
 * For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
 *
 *
 *
 * Return the array formed after rearranging the values of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,1,2,3]
 * Output: [2,3,4,1]
 * Explanation: 
 * First, we sort the values present at odd indices (1 and 3) in non-increasing order.
 * So, nums changes from [4,1,2,3] to [4,3,2,1].
 * Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
 * So, nums changes from [4,1,2,3] to [2,3,4,1].
 * Thus, the array formed after rearranging the values is [2,3,4,1].
 *
 * Example 2:
 *
 * Input: nums = [2,1]
 * Output: [2,1]
 * Explanation: 
 * Since there is exactly one odd index and one even index, no rearrangement of values takes place.
 * The resultant array formed is [2,1], which is the same as the initial array. 
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
 * Hint 1: Try to separate the elements at odd indices from the elements at even indices.
 * Hint 2: Sort the two groups of elements individually.
 * Hint 3: Combine them to form the resultant array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/sort-even-and-odd-indices-independently/">LeetCode #2164</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class SortEvenAndOddIndicesIndependently {

    /**
     * Sorts Sort even odd.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int[] sortEvenOdd(int[] nums) {
        java.util.List<Integer> evens=new java.util.ArrayList<>(), odds=new java.util.ArrayList<>();
        for (int i=0;i<nums.length;i++) { if (i%2==0) evens.add(nums[i]); else odds.add(nums[i]); }
        java.util.Collections.sort(evens);
        odds.sort(java.util.Collections.reverseOrder());
        int[] res=new int[nums.length];
        for (int i=0;i<evens.size();i++) res[i*2]=evens.get(i);
        for (int i=0;i<odds.size();i++) res[i*2+1]=odds.get(i);
        return res;
    }

    public static void main(String[] args) {
        SortEvenAndOddIndicesIndependently sol = new SortEvenAndOddIndicesIndependently();
        System.out.println(sol.sortEvenOdd(new int[]{1,2,3}));
    }
}
