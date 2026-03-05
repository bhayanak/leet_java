package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #442: Find All Duplicates in an Array
 * @see <a href="https://leetcode.com/problems/find-all-duplicates-in-an-array/">Problem</a>
 */
public class FindAllDuplicatesInAnArray {

    /**
     * LeetCode #442 – Find All Duplicates in an Array
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Sorting
     *
     * Given an integer array nums of length n where all the integers of nums are
     * in the range [1, n] and each integer appears at most twice, return an array
     * of all the integers that appears twice.
     * 
     * 
     * You must write an algorithm that runs in O(n) time and uses only constant
     * auxiliary space, excluding the space needed to store the output
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     * 
     * 
     * Example 2:
     * 
     * Input: nums = [1,1,2]
     * Output: [1]
     * 
     * 
     * Example 3:
     * 
     * Input: nums = [1]
     * Output: []
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
     * Each element in nums appears once or twice.
     */
    // Use index marking: negate nums[|val|-1]; already negative = duplicate
    /**
     * Finds Find duplicates.
     *
     * @param nums the nums (int[])
     * @return the computed List&lt;Integer&gt; result
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            int idx = Math.abs(n) - 1;
            if (nums[idx] < 0) result.add(Math.abs(n));
            else nums[idx] = -nums[idx];
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray sol = new FindAllDuplicatesInAnArray();
        System.out.println(sol.findDuplicates(new int[]{1,2,3}));
    }
}
