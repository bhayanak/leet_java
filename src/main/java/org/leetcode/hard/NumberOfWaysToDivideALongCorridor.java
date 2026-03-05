package org.leetcode.hard;


/**
 * <b>#2147 - Number of Ways to Divide a Long Corridor</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Along a long library corridor, there is a line of seats and decorative plants. You are given a 0-indexed string corridor of length n consisting of letters 'S' and 'P' where each 'S' represents a seat and each 'P' represents a plant.
 *
 *
 * One room divider has already been installed to the left of index 0, and another to the right of index n - 1. Additional room dividers can be installed. For each position between indices i - 1 and i (1 &lt;= i &lt;= n - 1), at most one divider can be installed.
 *
 *
 * Divide the corridor into non-overlapping sections, where each section has exactly two seats with any number of plants. There may be multiple ways to perform the division. Two ways are different if there is a position with a room divider installed in the first way but not in the second way.
 *
 *
 * Return the number of ways to divide the corridor. Since the answer may be very large, return it modulo 109 + 7. If there is no way, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: corridor = "SSPPSPS"
 * Output: 3
 * Explanation: There are 3 different ways to divide the corridor.
 * The black bars in the above image indicate the two room dividers already installed.
 * Note that in each of the ways, each section has exactly two seats.
 *
 * Example 2:
 *
 * Input: corridor = "PPSPSP"
 * Output: 1
 * Explanation: There is only 1 way to divide the corridor, by not installing any additional dividers.
 * Installing any would create some section that does not have exactly two seats.
 *
 * Example 3:
 *
 * Input: corridor = "S"
 * Output: 0
 * Explanation: There is no way to divide the corridor because there will always be a section that does not have exactly two seats.
 *
 *
 *
 * Constraints:
 *
 *
 * n == corridor.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * corridor[i] is either 'S' or 'P'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Divide the corridor into segments. Each segment has two seats, starts precisely with one seat, and ends precisely with the other seat.
 * Hint 2: How many dividers can you install between two adjacent segments? You must install precisely one. Otherwise, you would have created a section with not exactly two seats.
 * Hint 3: If there are k plants between two adjacent segments, there are k + 1 positions (ways) you could install the divider you must install.
 * Hint 4: The problem now becomes: Find the product of all possible positions between every two adjacent segments.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/">LeetCode #2147</a>
 */
public class NumberOfWaysToDivideALongCorridor {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Divide a Long Corridor");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToDivideALongCorridor ===");
        NumberOfWaysToDivideALongCorridor sol = new NumberOfWaysToDivideALongCorridor();
        System.out.println(sol.solve(null));
    }
}
