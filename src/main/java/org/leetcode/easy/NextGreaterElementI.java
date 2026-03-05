package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #496: Next Greater Element I
 * @see <a href="https://leetcode.com/problems/next-greater-element-i/">Problem</a>
 */
public class NextGreaterElementI {

    /**
     * LeetCode #496 – Next Greater Element I
     * Difficulty: EASY
     * Topics: Array, Hash Table, Stack, Monotonic Stack
     *
     * The next greater element of some element x in an array is the first greater
     * element that is to the right of x in the same array.
     * 
     * 
     * You are given two distinct 0-indexed integer arrays nums1 and nums2, where
     * nums1 is a subset of nums2.
     * 
     * 
     * For each 0 &lt;= i &lt; nums1.length, find the index j such that nums1[i] ==
     * nums2[j] and determine the next greater element of nums2[j] in nums2. If
     * there is no next greater element, then the answer for this query is -1.
     * 
     * 
     * Return an array ans of length nums1.length such that ans[i] is the next
     * greater element as described above.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
     * Output: [-1,3,-1]
     * Explanation: The next greater element for each value of nums1 is as follows:
     * - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element,
     * so the answer is -1.
     * - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
     * - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element,
     * so the answer is -1.
     * 
     * Example 2:
     * 
     * Input: nums1 = [2,4], nums2 = [1,2,3,4]
     * Output: [3,-1]
     * Explanation: The next greater element for each value of nums1 is as follows:
     * - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
     * - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element,
     * so the answer is -1.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums1.length &lt;= nums2.length &lt;= 1000
     * 
     * 0 &lt;= nums1[i], nums2[i] &lt;= 104
     * 
     * All integers in nums1 and nums2 are unique.
     * 
     * All the integers of nums1 also appear in nums2.
     * 
     * 
     * Follow up: Could y
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
      */
    // Monotone stack on nums2 to precompute next greater for each element
    /**
     * Solves the problem: Next greater element.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums1 the nums1 (int[])
     * @param nums2 the nums2 (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
      */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n) nextGreater.put(stack.pop(), n);
            stack.push(n);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) result[i] = nextGreater.getOrDefault(nums1[i], -1);
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementI sol = new NextGreaterElementI();
        System.out.println(sol.nextGreaterElement(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
