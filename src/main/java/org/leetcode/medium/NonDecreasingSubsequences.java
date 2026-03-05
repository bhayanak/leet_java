package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode #491: Non-decreasing Subsequences
 * @see <a href="https://leetcode.com/problems/non-decreasing-subsequences/">Problem</a>
 */
public class NonDecreasingSubsequences {

    /**
     * LeetCode #491 – Non-decreasing Subsequences
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Backtracking, Bit Manipulation
     *
     * Given an integer array nums, return all the different possible
     * non-decreasing subsequences of the given array with at least two elements.
     * You may return the answer in any order.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [4,6,7,7]
     * Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
     * 
     * Example 2:
     * 
     * Input: nums = [4,4,3,2,1]
     * Output: [[4,4]]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 15
     * 
     * -100 &lt;= nums[i] &lt;= 100
     */
    // Backtracking with dedup at each level using a set
    /**
     * Finds Find subsequences.
     *
     * @param nums the nums (int[])
     * @return the computed List&lt;List&lt;Integer&gt;&gt; result
     */
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() >= 2) result.add(new ArrayList<>(current));
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) continue;
            if (!current.isEmpty() && nums[i] < current.get(current.size()-1)) continue;
            used.add(nums[i]);
            current.add(nums[i]);
            backtrack(nums, i+1, current, result);
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        NonDecreasingSubsequences sol = new NonDecreasingSubsequences();
        System.out.println(sol.findSubsequences(new int[]{1,2,3}));
    }
}
