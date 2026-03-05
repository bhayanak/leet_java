package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #658: Find K Closest Elements
 * @see <a href="https://leetcode.com/problems/find-k-closest-elements/">Problem</a>
 */
public class FindKClosestElements {

    /**
     * LeetCode #658 – Find K Closest Elements
     * Difficulty: MEDIUM
     * Topics: Array, Two Pointers, Binary Search, Sliding Window, Sorting, Heap (Priority Queue)
     *
     * Given a sorted integer array arr, two integers k and x, return the k
     * closest integers to x in the array. The result should also be sorted in
     * ascending order.
     * 
     * 
     * An integer a is closer to x than an integer b if:
     * 
     * 
     * |a - x| &lt; |b - x|, or
     * 
     * |a - x| == |b - x| and a &lt; b
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: arr = [1,2,3,4,5], k = 4, x = 3
     * 
     * 
     * Output: [1,2,3,4]
     * 
     * Example 2:
     * 
     * Input: arr = [1,1,2,3,4,5], k = 4, x = -1
     * 
     * 
     * Output: [1,1,2,3]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= k &lt;= arr.length
     * 
     * 1 &lt;= arr.length &lt;= 104
     * 
     * arr is sorted in ascending order.
     * 
     * -104 &lt;= arr[i], x &lt;= 104
     */
    // Binary search for the window start; compare arr[mid] vs arr[mid+k]
    /**
     * Finds Find closest elements.
     * Uses binary search for O(log n) lookup.
     *
     * @param arr the arr (int[])
     * @param k the k (int)
     * @param x the x (int)
     * @return the computed List&lt;Integer&gt; result
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0, hi = arr.length - k;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (x - arr[mid] > arr[mid+k] - x) lo = mid + 1;
            else hi = mid;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = lo; i < lo + k; i++) result.add(arr[i]);
        return result;
    }

    public static void main(String[] args) {
        FindKClosestElements sol = new FindKClosestElements();
        System.out.println(sol.findClosestElements(new int[]{1,2,3}, 0, 0));
    }
}
