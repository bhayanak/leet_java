package org.leetcode.easy;


/**
 * <b>#1217 - Minimum Cost to Move Chips to The Same Position</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We have n chips, where the position of the ith chip is position[i].
 *
 *
 * We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
 *
 *
 * position[i] + 2 or position[i] - 2 with cost = 0.
 *
 * position[i] + 1 or position[i] - 1 with cost = 1.
 *
 * Return the minimum cost needed to move all the chips to the same position.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: position = [1,2,3]
 * Output: 1
 * Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
 * Second step: Move the chip at position 2 to position 1 with cost = 1.
 * Total cost is 1.
 *
 * Example 2:
 *
 * Input: position = [2,2,2,3,3]
 * Output: 2
 * Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.
 *
 * Example 3:
 *
 * Input: position = [1,1000000000]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= position.length &lt;= 100
 *
 * 1 &lt;= position[i] &lt;= 10^9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The first move keeps the parity of the element as it is.
 * Hint 2: The second move changes the parity of the element.
 * Hint 3: Since the first move is free, if all the numbers have the same parity, the answer would be zero.
 * Hint 4: Find the minimum cost to make all the numbers have the same parity.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/">LeetCode #1217</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumCostToMoveChipsToTheSamePosition {

    /**
     * Computes the minimum Min cost to move chips.
     *
     * @param position the position (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minCostToMoveChips(int[] position) {
        int odd=0, even=0;
        for (int p : position) { if (p%2==0) even++; else odd++; }
        return Math.min(odd, even);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        MinimumCostToMoveChipsToTheSamePosition sol = new MinimumCostToMoveChipsToTheSamePosition();
                System.out.println(sol.minCostToMoveChips(new int[]{1,2,3}));   // 1
                System.out.println(sol.minCostToMoveChips(new int[]{2,2,2,3,3})); // 2
    }
}
