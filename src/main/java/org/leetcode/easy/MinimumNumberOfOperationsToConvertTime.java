package org.leetcode.easy;


/**
 * <b>#2224 - Minimum Number of Operations to Convert Time</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings current and correct representing two 24-hour times.
 *
 *
 * 24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
 *
 *
 * In one operation you can increase the time current by 1, 5, 15, or 60 minutes. You can perform this operation any number of times.
 *
 *
 * Return the minimum number of operations needed to convert current to correct.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: current = "02:30", correct = "04:35"
 * Output: 3
 * Explanation:
 * We can convert current to correct in 3 operations as follows:
 * - Add 60 minutes to current. current becomes "03:30".
 * - Add 60 minutes to current. current becomes "04:30".
 * - Add 5 minutes to current. current becomes "04:35".
 * It can be proven that it is not possible to convert current to correct in fewer than 3 operations.
 *
 * Example 2:
 *
 * Input: current = "11:00", correct = "11:01"
 * Output: 1
 * Explanation: We only have to add one minute to current, so the minimum number of operations needed is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * current and correct are in the format "HH:MM"
 *
 * current &lt;= correct
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert the times to minutes.
 * Hint 2: Use the operation with the biggest value possible at each step.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/">LeetCode #2224</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class MinimumNumberOfOperationsToConvertTime {

    /**
     * Solves the problem: Minimum rounds.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param tasks the tasks (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int minimumRounds(int[] tasks) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int t:tasks) cnt.merge(t,1,Integer::sum);
        int rounds=0;
        for (int v:cnt.values()) {
            if (v==1) return -1;
            rounds+=v/3 + (v%3==0?0:1);
        }
        return rounds;
    }

    public static void main(String[] args) {
        MinimumNumberOfOperationsToConvertTime sol = new MinimumNumberOfOperationsToConvertTime();
        System.out.println(sol.minimumRounds(new int[]{1,2,3}));
    }
}
