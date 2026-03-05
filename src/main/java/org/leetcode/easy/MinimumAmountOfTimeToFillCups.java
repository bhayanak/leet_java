package org.leetcode.easy;


/**
 * <b>#2335 - Minimum Amount of Time to Fill Cups</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a water dispenser that can dispense cold, warm, and hot water. Every second, you can either fill up 2 cups with different types of water, or 1 cup of any type of water.
 *
 *
 * You are given a 0-indexed integer array amount of length 3 where amount[0], amount[1], and amount[2] denote the number of cold, warm, and hot water cups you need to fill respectively. Return the minimum number of seconds needed to fill up all the cups.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: amount = [1,4,2]
 * Output: 4
 * Explanation: One way to fill up the cups is:
 * Second 1: Fill up a cold cup and a warm cup.
 * Second 2: Fill up a warm cup and a hot cup.
 * Second 3: Fill up a warm cup and a hot cup.
 * Second 4: Fill up a warm cup.
 * It can be proven that 4 is the minimum number of seconds needed.
 *
 * Example 2:
 *
 * Input: amount = [5,4,4]
 * Output: 7
 * Explanation: One way to fill up the cups is:
 * Second 1: Fill up a cold cup, and a hot cup.
 * Second 2: Fill up a cold cup, and a warm cup.
 * Second 3: Fill up a cold cup, and a warm cup.
 * Second 4: Fill up a warm cup, and a hot cup.
 * Second 5: Fill up a cold cup, and a hot cup.
 * Second 6: Fill up a cold cup, and a warm cup.
 * Second 7: Fill up a hot cup.
 *
 * Example 3:
 *
 * Input: amount = [5,0,0]
 * Output: 5
 * Explanation: Every second, we fill up a cold cup.
 *
 *
 *
 * Constraints:
 *
 *
 * amount.length == 3
 *
 * 0 &lt;= amount[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To minimize the amount of time needed, you want to fill up as many cups as possible in each second. This means that you want to maximize the number of seconds where you are filling up two cups.
 * Hint 2: You always want to fill up the two types of water with the most unfilled cups.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/">LeetCode #2335</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MinimumAmountOfTimeToFillCups {

    /**
     * Solves the problem: Fill cups.
     * Sorts the input first to enable efficient processing.
     *
     * @param amount the amount (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int fillCups(int[] amount) {
        int steps=0;
        while (true) {
            java.util.Arrays.sort(amount);
            if (amount[2]==0) break;
            if (amount[1]==0) { steps+=amount[2]; break; }
            amount[2]--; amount[1]--; steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        MinimumAmountOfTimeToFillCups sol = new MinimumAmountOfTimeToFillCups();
                System.out.println(sol.fillCups(new int[]{1,4,2})); // 4
                System.out.println(sol.fillCups(new int[]{5,4,4})); // 7
                System.out.println(sol.fillCups(new int[]{5,0,0})); // 5
    }
}
