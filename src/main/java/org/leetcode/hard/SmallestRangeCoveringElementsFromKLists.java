package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCode #632: Smallest Range Covering Elements from K Lists
 * @see <a href="https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/">Problem</a>
 */
public class SmallestRangeCoveringElementsFromKLists {

    /**
     * LeetCode #632 – Smallest Range Covering Elements from K Lists
     * Difficulty: HARD
     * Topics: Array, Hash Table, Greedy, Sliding Window, Sorting, Heap (Priority Queue)
     *
     * You have k lists of sorted integers in non-decreasing order. Find the
     * smallest range that includes at least one number from each of the k lists.
     * 
     * 
     * We define the range [a, b] is smaller than range [c, d] if b - a &lt; d - c or
     * a &lt; c if b - a == d - c.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
     * Output: [20,24]
     * Explanation:
     * List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
     * List 2: [0, 9, 12, 20], 20 is in range [20,24].
     * List 3: [5, 18, 22, 30], 22 is in range [20,24].
     * 
     * Example 2:
     * 
     * Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
     * Output: [1,1]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * nums.length == k
     * 
     * 1 &lt;= k &lt;= 3500
     * 
     * 1 &lt;= nums[i].length &lt;= 50
     * 
     * -105 &lt;= nums[i][j] &lt;= 105
     * 
     * nums[i] is sorted in non-decreasing order.
     */
    // Min heap with one element from each list; track max; expand range
    /**
     * Solves the problem: Smallest range.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param nums the nums (List&lt;List&lt;Integer&gt;&gt;)
     * @return the computed int[] result
     */
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]); // [val, listIdx, elemIdx]
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            pq.offer(new int[]{val, i, 0});
            max = Math.max(max, val);
        }
        int[] range = {pq.peek()[0], max};
        while (pq.size() == nums.size()) {
            int[] cur = pq.poll();
            int listIdx = cur[1], elemIdx = cur[2];
            if (elemIdx + 1 == nums.get(listIdx).size()) break;
            int nextVal = nums.get(listIdx).get(elemIdx + 1);
            pq.offer(new int[]{nextVal, listIdx, elemIdx + 1});
            max = Math.max(max, nextVal);
            if (max - pq.peek()[0] < range[1] - range[0]) range = new int[]{pq.peek()[0], max};
        }
        return range;
    }

    public static void main(String[] args) {
        SmallestRangeCoveringElementsFromKLists sol = new SmallestRangeCoveringElementsFromKLists();
        System.out.println(sol.smallestRange(new java.util.ArrayList<>()));
    }
}
