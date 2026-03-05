package org.leetcode.medium;

/**
 * <b>#347 - Top K Frequent Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2
 * 
 * 
 * Output: [1,2]
 * 
 * Example 2:
 * 
 * Input: nums = [1], k = 1
 * 
 * 
 * Output: [1]
 * 
 * Example 3:
 * 
 * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
 * 
 * 
 * Output: [1,2]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 105
 * 	
 * -104 &lt;= nums[i] &lt;= 104
 * 	
 * k is in the range [1, the number of unique elements in the array].
 * 	
 * It is guaranteed that the answer is unique.
 * 
 *  
 * 
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Count frequencies, then use a min-heap of size k to keep top k.
 * Alternative: bucket sort by frequency in O(n).
 *
 * <h2>Complexity</h2>
* Time: O(n log k)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/top-k-frequent-elements/">LeetCode #347</a>
 */
public class TopKFrequentElements {

    /**
     * Solves the problem: Top k frequent.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int[] result
     */
    public int[] topKFrequent(int[] nums, int k) {
        java.util.Map<Integer,Integer> freq=new java.util.HashMap<>();
        for(int n:nums) freq.merge(n,1,Integer::sum);
        java.util.PriorityQueue<Integer> heap=new java.util.PriorityQueue<>(
            java.util.Comparator.comparingInt(freq::get));
        for(int n:freq.keySet()){
            heap.offer(n);
            if(heap.size()>k) heap.poll();
        }
        return heap.stream().mapToInt(i->i).toArray();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        TopKFrequentElements sol = new TopKFrequentElements();
        System.out.println(java.util.Arrays.toString(sol.topKFrequent(new int[]{1,1,1,2,2,3},2))); // [1,2]
        System.out.println(java.util.Arrays.toString(sol.topKFrequent(new int[]{1},1)));            // [1]
    }
}
