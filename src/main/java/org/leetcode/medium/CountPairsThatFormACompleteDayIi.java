package org.leetcode.medium;


/**
 * <b>#3185 - Count Pairs That Form a Complete Day II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array hours representing times in hours, return an integer denoting the number of pairs i, j where i &lt; j and hours[i] + hours[j] forms a complete day.
 *
 *
 * A complete day is defined as a time duration that is an exact multiple of 24 hours.
 *
 *
 * For example, 1 day is 24 hours, 2 days is 48 hours, 3 days is 72 hours, and so on.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: hours = [12,12,30,24,24]
 *
 *
 * Output: 2
 *
 *
 * Explanation: The pairs of indices that form a complete day are (0, 1) and (3, 4).
 *
 * Example 2:
 *
 * Input: hours = [72,48,24,3]
 *
 *
 * Output: 3
 *
 *
 * Explanation: The pairs of indices that form a complete day are (0, 1), (0, 2), and (1, 2).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= hours.length &lt;= 5 * 105
 *
 * 1 &lt;= hours[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A pair <code>(i, j)</code> forms a valid complete day if <code>(hours[i] + hours[j]) % 24 == 0</code>.
 * Hint 2: Using an array or a map, for each index <code>j</code> moving from left to right, increase the answer by the count of <code>(24 - hours[j]) % 24</code>, and then increase the count of <code>hours[j]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/">LeetCode #3185</a>
 */
public class CountPairsThatFormACompleteDayIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Pairs That Form a Complete Day II");
    }

    public static void main(String[] args) {
        System.out.println("=== CountPairsThatFormACompleteDayIi ===");
        CountPairsThatFormACompleteDayIi sol = new CountPairsThatFormACompleteDayIi();
        System.out.println(sol.solve(null));
    }
}
