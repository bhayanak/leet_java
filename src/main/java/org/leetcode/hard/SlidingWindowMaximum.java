package org.leetcode.hard;

/**
 * <b>#239 - Sliding Window Maximum</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * 
 * 
 * Return the max sliding window.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation: 
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * 
 * Example 2:
 * 
 * Input: nums = [1], k = 1
 * Output: [1]
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
 * 1 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How about using a data structure such as deque (double-ended queue)?
 * Hint 2: The queue size need not be the same as the window’s size.
 * Hint 3: Remove redundant elements and the queue should store only elements that need to be considered.
 *
 * <h2>Approach</h2>
 * Monotonic deque: maintain indices of useful elements (decreasing values).
 * Front always holds the max for current window.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(k)
 *
 * @see <a href="https://leetcode.com/problems/sliding-window-maximum/">LeetCode #239</a>
 */
public class SlidingWindowMaximum {

    /**
     * Computes the maximum Max sliding window.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int[] result
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        java.util.ArrayDeque<Integer> dq=new java.util.ArrayDeque<>(); // indices
        for (int i=0;i<n;i++) {
            while(!dq.isEmpty()&&dq.peekFirst()<i-k+1) dq.pollFirst(); // out of window
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]) dq.pollLast(); // not useful
            dq.offerLast(i);
            if (i>=k-1) res[i-k+1]=nums[dq.peekFirst()];
        }
        return res;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        SlidingWindowMaximum sol = new SlidingWindowMaximum();
        System.out.println(java.util.Arrays.toString(sol.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3))); // [3,3,5,5,6,7]
    }
}
