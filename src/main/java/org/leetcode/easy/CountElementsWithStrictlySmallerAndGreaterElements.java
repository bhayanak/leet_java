package org.leetcode.easy;


/**
 * <b>#2148 - Count Elements With Strictly Smaller and Greater Elements </b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [11,7,2,15]
 * Output: 2
 * Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
 * Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
 * In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
 *
 * Example 2:
 *
 * Input: nums = [-3,3,3,90]
 * Output: 2
 * Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
 * Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * -105 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: All the elements in the array should be counted except for the minimum and maximum elements.
 * Hint 2: If the array has n elements, the answer will be n - count(min(nums)) - count(max(nums))
 * Hint 3: This formula will not work in case the array has all the elements equal, why?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/">LeetCode #2148</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountElementsWithStrictlySmallerAndGreaterElements {

    /**
     * Counts Count elements.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countElements(int[] nums) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int n:nums) { min=Math.min(min,n); max=Math.max(max,n); }
        int count=0;
        for (int n:nums) if (n!=min && n!=max) count++;
        return count;
    }

    public static void main(String[] args) {
        CountElementsWithStrictlySmallerAndGreaterElements sol = new CountElementsWithStrictlySmallerAndGreaterElements();
        System.out.println(sol.countElements(new int[]{1,2,3}));
    }
}
