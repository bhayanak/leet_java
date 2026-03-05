package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #645: Set Mismatch
 * @see <a href="https://leetcode.com/problems/set-mismatch/">Problem</a>
 */
public class SetMismatch {

    /**
     * LeetCode #645 – Set Mismatch
     * Difficulty: EASY
     * Topics: Array, Hash Table, Bit Manipulation, Sorting
     *
     * You have a set of integers s, which originally contains all the numbers
     * from 1 to n. Unfortunately, due to some error, one of the numbers in s got
     * duplicated to another number in the set, which results in repetition of one
     * number and loss of another number.
     * 
     * 
     * You are given an integer array nums representing the data status of this
     * set after the error.
     * 
     * 
     * Find the number that occurs twice and the number that is missing and return
     * them in the form of an array.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     * 
     * 
     * Example 2:
     * 
     * Input: nums = [1,1]
     * Output: [1,2]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 2 &lt;= nums.length &lt;= 104
     * 
     * 1 &lt;= nums[i] &lt;= 104
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];
        for (int n : nums) count[n]++;
        int dup = -1, missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) dup = i;
            else if (count[i] == 0) missing = i;
        }
        return new int[]{dup, missing};
    }

    public static void main(String[] args) {
        SetMismatch sol = new SetMismatch();
        System.out.println(sol.findErrorNums(new int[]{1,2,3}));
    }
}
