package org.leetcode.medium;


/**
 * <b>#2320 - Count Number of Ways to Place Houses</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a street with n * 2 plots, where there are n plots on each side of the street. The plots on each side are numbered from 1 to n. On each plot, a house can be placed.
 *
 *
 * Return the number of ways houses can be placed such that no two houses are adjacent to each other on the same side of the street. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * Note that if a house is placed on the ith plot on one side of the street, a house can also be placed on the ith plot on the other side of the street.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 4
 * Explanation: 
 * Possible arrangements:
 * 1. All plots are empty.
 * 2. A house is placed on one side of the street.
 * 3. A house is placed on the other side of the street.
 * 4. Two houses are placed, one on each side of the street.
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: 9
 * Explanation: The 9 possible arrangements are shown in the diagram above.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try coming up with a DP solution for one side of the street.
 * Hint 2: The DP for one side of the street will bear resemblance to the Fibonacci sequence.
 * Hint 3: The number of different arrangements on both side of the street is the same.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-ways-to-place-houses/">LeetCode #2320</a>
 */
public class CountNumberOfWaysToPlaceHouses {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Ways to Place Houses");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNumberOfWaysToPlaceHouses ===");
        CountNumberOfWaysToPlaceHouses sol = new CountNumberOfWaysToPlaceHouses();
        System.out.println(sol.solve(null));
    }
}
