package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * LeetCode #503: Next Greater Element II
 * @see <a href="https://leetcode.com/problems/next-greater-element-ii/">Problem</a>
 */
public class NextGreaterElementIi {

    /**
     * LeetCode #503 – Next Greater Element II
     * Difficulty: MEDIUM
     * Topics: Array, Stack, Monotonic Stack
     *
     * Given a circular integer array nums (i.e., the next element of
     * nums[nums.length - 1] is nums[0]), return the next greater number for every
     * element in nums.
     * 
     * 
     * The next greater number of a number x is the first greater number to its
     * traversing-order next in the array, which means you could search circularly
     * to find its next greater number. If it doesn't exist, return -1 for this
     * number.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,1]
     * Output: [2,-1,2]
     * Explanation: The first 1's next greater number is 2;
     * The number 2 can't find next greater number.
     * The second 1's next greater number needs to search circularly, which is
     * also 2.
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,4,3]
     * Output: [2,3,4,-1,4]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 104
     * 
     * -109 &lt;= nums[i] &lt;= 109
     */
    // Circular array: iterate 2n times using mod; monotone stack
    /**
     * Solves the problem: Next greater elements.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
     */
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices
        for (int i = 0; i < 2 * n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n])
                result[stack.pop()] = nums[i % n];
            if (i < n) stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementIi sol = new NextGreaterElementIi();
        System.out.println(sol.nextGreaterElements(new int[]{1,2,3}));
    }
}
