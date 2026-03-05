package org.leetcode.hard;


/**
 * <b>#3317 - Find the Number of Possible Ways for an Event</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers n, x, and y.
 *
 *
 * An event is being held for n performers. When a performer arrives, they are assigned to one of the x stages. All performers assigned to the same stage will perform together as a band, though some stages might remain empty.
 *
 *
 * After all performances are completed, the jury will award each band a score in the range [1, y].
 *
 *
 * Return the total number of possible ways the event can take place.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * Note that two events are considered to have been held differently if either of the following conditions is satisfied:
 *
 *
 * Any performer is assigned a different stage.
 *
 * Any band is awarded a different score.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1, x = 2, y = 3
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * There are 2 ways to assign a stage to the performer.
 *
 * The jury can award a score of either 1, 2, or 3 to the only band.
 *
 * Example 2:
 *
 * Input: n = 5, x = 2, y = 1
 *
 *
 * Output: 32
 *
 *
 * Explanation:
 *
 *
 * Each performer will be assigned either stage 1 or stage 2.
 *
 * All bands will be awarded a score of 1.
 *
 * Example 3:
 *
 * Input: n = 3, x = 3, y = 4
 *
 *
 * Output: 684
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, x, y &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix the number of stages.
 * Hint 2: Assign the Performers to the stages.
 * Hint 3: Use inclusion-exclusion to ensure that no stage has 0 performers.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-possible-ways-for-an-event/">LeetCode #3317</a>
 */
public class FindTheNumberOfPossibleWaysForAnEvent {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Number of Possible Ways for an Event");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheNumberOfPossibleWaysForAnEvent ===");
        FindTheNumberOfPossibleWaysForAnEvent sol = new FindTheNumberOfPossibleWaysForAnEvent();
        System.out.println(sol.solve(null));
    }
}
