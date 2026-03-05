package org.leetcode.medium;


/**
 * <b>#1344 - Angle Between Hands of a Clock</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.
 *
 *
 * Answers within 10-5 of the actual value will be accepted as correct.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: hour = 12, minutes = 30
 * Output: 165
 *
 * Example 2:
 *
 * Input: hour = 3, minutes = 30
 * Output: 75
 *
 * Example 3:
 *
 * Input: hour = 3, minutes = 15
 * Output: 7.5
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= hour &lt;= 12
 *
 * 0 &lt;= minutes &lt;= 59
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The tricky part is determining how the minute hand affects the position of the hour hand.
 * Hint 2: Calculate the angles separately then find the difference.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/angle-between-hands-of-a-clock/">LeetCode #1344</a>
 */
public class AngleBetweenHandsOfAClock {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Angle Between Hands of a Clock");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== AngleBetweenHandsOfAClock ===");
        AngleBetweenHandsOfAClock sol = new AngleBetweenHandsOfAClock();
        System.out.println(sol.solve(null));
    }
}
