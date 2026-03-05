package org.leetcode.medium;


/**
 * <b>#1318 - Minimum Flips to Make a OR b Equal to c</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
 *
 * Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 *
 *
 *
 * Input: a = 2, b = 6, c = 5
 * Output: 3
 * Explanation: After flips a = 1 , b = 4 , c = 5 such that (a OR b == c)
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: a = 4, b = 2, c = 7
 * Output: 1
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: a = 1, b = 2, c = 3
 * Output: 0
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= a &lt;= 10^9
 *
 * 1 &lt;= b &lt;= 10^9
 *
 * 1 &lt;= c &lt;= 10^9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check the bits one by one whether they need to be flipped.
 *
 * <h2>Approach</h2>
 * Think about the category (Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/">LeetCode #1318</a>
 */
public class MinimumFlipsToMakeAOrBEqualToC {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Flips to Make a OR b Equal to c");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumFlipsToMakeAOrBEqualToC ===");
        MinimumFlipsToMakeAOrBEqualToC sol = new MinimumFlipsToMakeAOrBEqualToC();
        System.out.println(sol.solve(null));
    }
}
