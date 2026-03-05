package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #453: Minimum Moves to Equal Array Elements
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-equal-array-elements/">Problem</a>
 */
public class MinimumMovesToEqualArrayElements {

    /**
     * LeetCode #453 – Minimum Moves to Equal Array Elements
     * Difficulty: MEDIUM
     * Topics: Array, Math
     *
     * Given an integer array nums of size n, return the minimum number of moves
     * required to make all array elements equal.
     * 
     * 
     * In one move, you can increment n - 1 elements of the array by 1.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3]
     * Output: 3
     * Explanation: Only three moves are needed (remember each move increments two
     * elements):
     * [1,2,3]  =&gt;  [2,3,3]  =&gt;  [3,4,3]  =&gt;  [4,4,4]
     * 
     * Example 2:
     * 
     * Input: nums = [1,1,1]
     * Output: 0
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
     * 
     * The answer is guaranteed to fit in a 32-bit integer.
     */
    // n-1 elements +1 is same as 1 element -1, so moves = sum - n*min
    /**
     * Computes the minimum Min moves.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) min = Math.min(min, n);
        int moves = 0;
        for (int n : nums) moves += n - min;
        return moves;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElements sol = new MinimumMovesToEqualArrayElements();
        System.out.println(sol.minMoves(new int[]{1,2,3}));
    }
}
