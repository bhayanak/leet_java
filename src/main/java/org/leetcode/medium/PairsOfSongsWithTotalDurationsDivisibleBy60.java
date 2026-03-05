package org.leetcode.medium;


/**
 * <b>#1010 - Pairs of Songs With Total Durations Divisible by 60</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a list of songs where the ith song has a duration of time[i] seconds.
 *
 *
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i &lt; j with (time[i] + time[j]) % 60 == 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: time = [30,20,150,100,40]
 * Output: 3
 * Explanation: Three pairs have a total duration divisible by 60:
 * (time[0] = 30, time[2] = 150): total duration 180
 * (time[1] = 20, time[3] = 100): total duration 120
 * (time[1] = 20, time[4] = 40): total duration 60
 *
 * Example 2:
 *
 * Input: time = [60,60,60]
 * Output: 3
 * Explanation: All three pairs have a total duration of 120, which is divisible by 60.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= time.length &lt;= 6 * 104
 *
 * 1 &lt;= time[i] &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We only need to consider each song length modulo 60.
 * Hint 2: We can count the number of songs having same (length % 60), and store that in an array of size 60.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/">LeetCode #1010</a>
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {

    /**
     * TODO: Implement "Pairs of Songs With Total Durations Divisible by 60".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Pairs of Songs With Total Durations Divisible by 60");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PairsOfSongsWithTotalDurationsDivisibleBy60.java &amp;&amp; java org.leetcode.medium.PairsOfSongsWithTotalDurationsDivisibleBy60</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PairsOfSongsWithTotalDurationsDivisibleBy60 ===");
        PairsOfSongsWithTotalDurationsDivisibleBy60 sol = new PairsOfSongsWithTotalDurationsDivisibleBy60();
        System.out.println(sol.solve(null));
    }
}
