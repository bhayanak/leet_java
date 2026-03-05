package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode #456: 132 Pattern
 * @see <a href="https://leetcode.com/problems/132-pattern/">Problem</a>
 */
public class P132Pattern {

    /**
     * LeetCode #456 – 132 Pattern
     * Difficulty: MEDIUM
     * Topics: Array, Binary Search, Stack, Monotonic Stack, Ordered Set
     *
     * Given an array of n integers nums, a 132 pattern is a subsequence of three
     * integers nums[i], nums[j] and nums[k] such that i &lt; j &lt; k and nums[i] &lt;
     * nums[k] &lt; nums[j].
     * 
     * 
     * Return true if there is a 132 pattern in nums, otherwise, return false.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3,4]
     * Output: false
     * Explanation: There is no 132 pattern in the sequence.
     * 
     * Example 2:
     * 
     * Input: nums = [3,1,4,2]
     * Output: true
     * Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
     * 
     * Example 3:
     * 
     * Input: nums = [-1,3,2,0]
     * Output: true
     * Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1,
     * 3, 0] and [-1, 2, 0].
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == nums.length
     * 
     * 1 &lt;= n &lt;= 2 * 105
     * 
     * -109 &lt;= nums[i] &lt;= 109
     */
    // Use stack + track min so far; when we pop, it becomes the "2" in 1-3-2
    /**
     * Solves the problem: Find132pattern.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
     */
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int k = Integer.MIN_VALUE; // the "2" in 1-3-2
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < k) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) k = stack.pop();
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        P132Pattern sol = new P132Pattern();
        System.out.println(sol.find132pattern(new int[]{1,2,3}));
    }
}
