package org.leetcode.easy;


/**
 * <b>#1046 - Last Stone Weight</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 *
 *
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x &lt;= y. The result of this smash is:
 *
 *
 * If x == y, both stones are destroyed, and
 *
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 *
 * At the end of the game, there is at most one stone left.
 *
 *
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation: 
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
 *
 * Example 2:
 *
 * Input: stones = [1]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= stones.length &lt;= 30
 *
 * 1 &lt;= stones[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process.  We can do it with a heap, or by sorting some list of stones every time we take a turn.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/last-stone-weight/">LeetCode #1046</a>
  *
  * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
  */
public class LastStoneWeight {

    /**
     * Solves the problem: Last stone weight.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param stones the stones (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
      */
    public int lastStoneWeight(int[] stones) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
        for (int s : stones) pq.offer(s);
        while (pq.size() > 1) {
            int a = pq.poll(), b = pq.poll();
            if (a != b) pq.offer(a - b);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LastStoneWeight.java &amp;&amp; java org.leetcode.easy.LastStoneWeight</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        LastStoneWeight sol = new LastStoneWeight();
                System.out.println(sol.lastStoneWeight(new int[]{2,7,4,1,8,1})); // 1
                System.out.println(sol.lastStoneWeight(new int[]{1}));           // 1
    }
}
