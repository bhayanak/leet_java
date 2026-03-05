package org.leetcode.hard;


/**
 * <b>#2350 - Shortest Impossible Sequence of Rolls</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array rolls of length n and an integer k. You roll a k sided dice numbered from 1 to k, n times, where the result of the ith roll is rolls[i].
 *
 *
 * Return the length of the shortest sequence of rolls so that there's no such subsequence in rolls.
 *
 *
 * A sequence of rolls of length len is the result of rolling a k sided dice len times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rolls = [4,2,1,2,3,3,2,4,1], k = 4
 * Output: 3
 * Explanation: Every sequence of rolls of length 1, [1], [2], [3], [4], can be taken from rolls.
 * Every sequence of rolls of length 2, [1, 1], [1, 2], ..., [4, 4], can be taken from rolls.
 * The sequence [1, 4, 2] cannot be taken from rolls, so we return 3.
 * Note that there are other sequences that cannot be taken from rolls.
 *
 * Example 2:
 *
 * Input: rolls = [1,1,2,2], k = 2
 * Output: 2
 * Explanation: Every sequence of rolls of length 1, [1], [2], can be taken from rolls.
 * The sequence [2, 1] cannot be taken from rolls, so we return 2.
 * Note that there are other sequences that cannot be taken from rolls but [2, 1] is the shortest.
 *
 * Example 3:
 *
 * Input: rolls = [1,1,3,2,2,2,3,3], k = 4
 * Output: 1
 * Explanation: The sequence [4] cannot be taken from rolls, so we return 1.
 * Note that there are other sequences that cannot be taken from rolls but [4] is the shortest.
 *
 *
 *
 * Constraints:
 *
 *
 * n == rolls.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= rolls[i] &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can you find the minimum index such that all sequences of length 1 can be formed from the start until that index?
 * Hint 2: Starting from the previous minimum index, what is the next index such that all sequences of length 2 can be formed?
 * Hint 3: Can you extend the idea to sequences of length 3 and more?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/shortest-impossible-sequence-of-rolls/">LeetCode #2350</a>
 */
public class ShortestImpossibleSequenceOfRolls {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Impossible Sequence of Rolls");
    }

    public static void main(String[] args) {
        System.out.println("=== ShortestImpossibleSequenceOfRolls ===");
        ShortestImpossibleSequenceOfRolls sol = new ShortestImpossibleSequenceOfRolls();
        System.out.println(sol.solve(null));
    }
}
