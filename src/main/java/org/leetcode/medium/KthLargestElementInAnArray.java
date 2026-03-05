package org.leetcode.medium;

/**
 * <b>#215 - Kth Largest Element in an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Sorting, Heap (Priority Queue), Quickselect</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * 
 * 
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * 
 * 
 * Can you solve it without sorting?
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= k &lt;= nums.length &lt;= 105
 * 	
 * -104 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Use a min-heap of size k. Each new element evicts the smallest if heap is full.
 * The heap's root is the k-th largest.
 *
 * <h2>Complexity</h2>
* Time: O(n log k)  |  Space: O(k)
 *
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">LeetCode #215</a>
 */
public class KthLargestElementInAnArray {

    /**
     * Finds Find kth largest.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
     */
    public int findKthLargest(int[] nums, int k) {
        java.util.PriorityQueue<Integer> minH = new java.util.PriorityQueue<>();
        for (int n : nums) {
            minH.offer(n);
            if (minH.size() > k) minH.poll(); // keep only k largest
        }
        return minH.peek();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        KthLargestElementInAnArray sol = new KthLargestElementInAnArray();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4},2)); // 5
        System.out.println(sol.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4)); // 4
    }
}
