package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #448: Find All Numbers Disappeared in an Array
 * @see <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">Problem</a>
 */
public class FindAllNumbersDisappearedInAnArray {

    /**
     * LeetCode #448 – Find All Numbers Disappeared in an Array
     * Difficulty: EASY
     * Topics: Array, Hash Table
     *
     * Given an array nums of n integers where nums[i] is in the range [1, n],
     * return an array of all the integers in the range [1, n] that do not appear
     * in nums.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [5,6]
     * 
     * 
     * Example 2:
     * 
     * Input: nums = [1,1]
     * Output: [2]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == nums.length
     * 
     * 1 &lt;= n &lt;= 105
     * 
     * 1 &lt;= nums[i] &lt;= n
     * 
     * 
     * 
     * Follow up: Could you do it without extra space and in O(n) runtime? You may
     * assume the returned list does not count as extra space.

     *
     * Hints:
     *   1. This is a really easy problem if you decide to use additional memory. For those trying to write an initial solution using additional memory, think counters!
     *   2. However, the trick really is to not use any additional space than what is already available to use. Sometimes, multiple passes over the input array help find the solution. However, there's an interest
     *   3. The problem specifies that the numbers in the array will be in the range [1, n] where n is the number of elements in the array. Can we use this information and modify the array in-place somehow to fin
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    // Negate nums[|val|-1] for each value; indices with positive values are missing numbers
    /**
     * Finds Find disappeared numbers.
     *
     * @param nums the nums (int[])
     * @return the computed List&lt;Integer&gt; result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int n : nums) {
            int idx = Math.abs(n) - 1;
            if (nums[idx] > 0) nums[idx] = -nums[idx];
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0) result.add(i + 1);
        return result;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray sol = new FindAllNumbersDisappearedInAnArray();
        System.out.println(sol.findDisappearedNumbers(new int[]{1,2,3}));
    }
}
