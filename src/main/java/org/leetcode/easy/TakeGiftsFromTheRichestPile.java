package org.leetcode.easy;


/**
 * <b>#2558 - Take Gifts From the Richest Pile</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Heap (Priority Queue), Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:
 *
 *
 * Choose the pile with the maximum number of gifts.
 *
 * If there is more than one pile with the maximum number of gifts, choose any.
 *
 * Reduce the number of gifts in the pile to the floor of the square root of the original number of gifts in the pile.
 *
 * Return the number of gifts remaining after k seconds.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: gifts = [25,64,9,4,100], k = 4
 * Output: 29
 * Explanation: 
 * The gifts are taken in the following way:
 * - In the first second, the last pile is chosen and 10 gifts are left behind.
 * - Then the second pile is chosen and 8 gifts are left behind.
 * - After that the first pile is chosen and 5 gifts are left behind.
 * - Finally, the last pile is chosen again and 3 gifts are left behind.
 * The final remaining gifts are [5,8,9,4,3], so the total number of gifts remaining is 29.
 *
 * Example 2:
 *
 * Input: gifts = [1,1,1,1], k = 4
 * Output: 4
 * Explanation: 
 * In this case, regardless which pile you choose, you have to leave behind 1 gift in each pile. 
 * That is, you can't take any pile with you. 
 * So, the total gifts remaining are 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= gifts.length &lt;= 103
 *
 * 1 &lt;= gifts[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can you keep track of the largest gifts in the array
 * Hint 2: What is an efficient way to find the square root of a number?
 * Hint 3: Can you keep adding up the values of the gifts while ensuring they are in a certain order?
 * Hint 4: Can we use a priority queue or heap here?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Heap (Priority Queue), Simulation).
 *
 * @see <a href="https://leetcode.com/problems/take-gifts-from-the-richest-pile/">LeetCode #2558</a>
  *
  * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
  */
public class TakeGiftsFromTheRichestPile {

    /**
     * Solves the problem: Pick gifts.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param gifts the gifts (long[])
     * @param k the k (int)
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
      */
    public long pickGifts(long[] gifts, int k) {
        java.util.PriorityQueue<Long> maxHeap=new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
        for (long g:gifts) maxHeap.add(g);
        for (int i=0;i<k;i++) {
            long top=maxHeap.poll();
            maxHeap.add((long)Math.sqrt(top));
        }
        long sum=0; for (long v:maxHeap) sum+=v;
        return sum;
    }

    public static void main(String[] args) {
        TakeGiftsFromTheRichestPile sol = new TakeGiftsFromTheRichestPile();
        System.out.println(sol.pickGifts(new long[]{1L,2L,3L}, 0));
    }
}
