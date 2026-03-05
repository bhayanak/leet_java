package org.leetcode.easy;


/**
 * <b>#2913 - Subarrays Distinct Element Sum of Squares I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums.
 *
 *
 * The distinct count of a subarray of nums is defined as:
 *
 *
 * Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 &lt;= i &lt;= j &lt; nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].
 *
 * Return the sum of the squares of distinct counts of all subarrays of nums.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1]
 * Output: 15
 * Explanation: Six possible subarrays are:
 * [1]: 1 distinct value
 * [2]: 1 distinct value
 * [1]: 1 distinct value
 * [1,2]: 2 distinct values
 * [2,1]: 2 distinct values
 * [1,2,1]: 2 distinct values
 * The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.
 *
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: 3
 * Explanation: Three possible subarrays are:
 * [1]: 1 distinct value
 * [1]: 1 distinct value
 * [1,1]: 1 distinct value
 * The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 = 3.
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
 * Hint 1: Use a set/heap to keep track of distinct element counts.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/">LeetCode #2913</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SubarraysDistinctElementSumOfSquaresI {

    /**
     * Computes the sum of Sum of the digits of harshad number.
     *
     * @param x the x (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0, tmp=x;
        while (tmp>0){sum+=tmp%10;tmp/=10;}
        return x%sum==0?sum:-1;
    }

    public static void main(String[] args) {
        SubarraysDistinctElementSumOfSquaresI sol = new SubarraysDistinctElementSumOfSquaresI();
        System.out.println(sol.sumOfTheDigitsOfHarshadNumber(0));
    }
}
