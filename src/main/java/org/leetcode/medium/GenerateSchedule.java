package org.leetcode.medium;


/**
 * <b>#3680 - Generate Schedule</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n representing n teams. You are asked to generate a schedule such that:
 *
 *
 * Each team plays every other team exactly twice: once at home and once away.
 *
 * There is exactly one match per day; the schedule is a list of consecutive days and schedule[i] is the match on day i.
 *
 * No team plays on consecutive days.
 *
 * Return a 2D integer array schedule, where schedule[i][0] represents the home team and schedule[i][1] represents the away team. If multiple schedules meet the conditions, return any one of them.
 *
 *
 * If no schedule exists that meets the conditions, return an empty array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 *
 *
 * Output: []
 *
 *
 * Explanation:
 *
 *
 * ​​​​​​​Since each team plays every other team exactly twice, a total of 6 matches need to be played: [0,1],[0,2],[1,2],[1,0],[2,0],[2,1].
 *
 *
 * It's not possible to create a schedule without at least one team playing consecutive days.
 *
 * Example 2:
 *
 * Input: n = 5
 *
 *
 * Output: [[0,1],[2,3],[0,4],[1,2],[3,4],[0,2],[1,3],[2,4],[0,3],[1,4],[2,0],[3,1],[4,0],[2,1],[4,3],[1,0],[3,2],[4,1],[3,0],[4,2]]
 *
 *
 * Explanation:
 *
 *
 * Since each team plays every other team exactly twice, a total of 20 matches need to be played.
 *
 *
 * The output shows one of the schedules that meet the conditions. No team plays on consecutive days.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 50​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be solved greedily or using randomization.
 * Hint 2: Try pairing teams greedily while ensuring neither team played on the previous day.
 * Hint 3: Keep track of how many games each team still has to play.
 * Hint 4: Among teams that didn't play the previous day, match a pair whose combined remaining games is highest.
 * Hint 5: If a greedy choice leads to a dead end, try a different match order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/generate-schedule/">LeetCode #3680</a>
 */
public class GenerateSchedule {

    /**
     * Computes the maximum Max hamming distances.
     *
     * @param n the n (int)
     * @return the computed int result
     */
    public int maxHammingDistances(int n) {
        // Max XOR of n and any number < 2^bits(n)
        int bits=Integer.toBinaryString(n).length();
        return (1<<bits)-1;
    }

    public static void main(String[] args) {
        GenerateSchedule sol = new GenerateSchedule();
        System.out.println(sol.maxHammingDistances(0));
    }
}
