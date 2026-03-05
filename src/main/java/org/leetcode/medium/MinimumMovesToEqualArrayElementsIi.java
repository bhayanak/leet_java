package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #462: Minimum Moves to Equal Array Elements II
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/">Problem</a>
 */
public class MinimumMovesToEqualArrayElementsIi {

    /**
     * LeetCode #462 – Minimum Moves to Equal Array Elements II
     * Difficulty: MEDIUM
     * Topics: Array, Math, Sorting
     *
     * Given an integer array nums of size n, return the minimum number of moves
     * required to make all array elements equal.
     * 
     * 
     * In one move, you can increment or decrement an element of the array by 1.
     * 
     * 
     * Test cases are designed so that the answer will fit in a 32-bit integer.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3]
     * Output: 2
     * Explanation:
     * Only two moves are needed (remember each move increments or decrements one
     * element):
     * [1,2,3]  =&gt;  [2,2,3]  =&gt;  [2,2,2]
     * 
     * Example 2:
     * 
     * Input: nums = [1,10,2,9]
     * Output: 16
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == nums.length
     * 
     * 1 &lt;= nums.length &lt;= 105
     * 
     * -109 &lt;= nums[i] &lt;= 109
     */
    // Optimal meeting point is the median
    /**
     * Computes the minimum Min moves2.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2], moves = 0;
        for (int n : nums) moves += Math.abs(n - median);
        return moves;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsIi sol = new MinimumMovesToEqualArrayElementsIi();
        System.out.println(sol.minMoves2(new int[]{1,2,3}));
    }
}
