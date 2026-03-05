package org.leetcode.easy;


/**
 * <b>#3264 - Final Array State After K Multiplication Operations I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Heap (Priority Queue), Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums, an integer k, and an integer multiplier.
 *
 *
 * You need to perform k operations on nums. In each operation:
 *
 *
 * Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
 *
 * Replace the selected minimum value x with x * multiplier.
 *
 * Return an integer array denoting the final state of nums after performing all k operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
 *
 *
 * Output: [8,4,6,5,6]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Operation
 * 			Result
 *
 *
 *
 *
 * 			After operation 1
 * 			[2, 2, 3, 5, 6]
 *
 *
 *
 *
 * 			After operation 2
 * 			[4, 2, 3, 5, 6]
 *
 *
 *
 *
 * 			After operation 3
 * 			[4, 4, 3, 5, 6]
 *
 *
 *
 *
 * 			After operation 4
 * 			[4, 4, 6, 5, 6]
 *
 *
 *
 *
 * 			After operation 5
 * 			[8, 4, 6, 5, 6]
 *
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [1,2], k = 3, multiplier = 4
 *
 *
 * Output: [16,8]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Operation
 * 			Result
 *
 *
 *
 *
 * 			After operation 1
 * 			[4, 2]
 *
 *
 *
 *
 * 			After operation 2
 * 			[4, 8]
 *
 *
 *
 *
 * 			After operation 3
 * 			[16, 8]
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * 1 &lt;= k &lt;= 10
 *
 * 1 &lt;= multiplier &lt;= 5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain sorted pairs <code>(nums[index], index)</code> in a priority queue.
 * Hint 2: Simulate the operation <code>k</code> times.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Heap (Priority Queue), Simulation).
 *
 * @see <a href="https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/">LeetCode #3264</a>
  *
  * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
  */
public class FinalArrayStateAfterKMultiplicationOperationsI {

    /**
     * Returns Get final state2.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
      */
    public int[] getFinalState2(int[] nums, int k) {
        java.util.PriorityQueue<Integer> pq=new java.util.PriorityQueue<>();
        for (int n:nums) pq.add(n);
        for (int i=0;i<k;i++) pq.add(pq.poll()*2);
        return pq.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    public static void main(String[] args) {
        FinalArrayStateAfterKMultiplicationOperationsI sol = new FinalArrayStateAfterKMultiplicationOperationsI();
        System.out.println(sol.getFinalState2(new int[]{1,2,3}, 0));
    }
}
