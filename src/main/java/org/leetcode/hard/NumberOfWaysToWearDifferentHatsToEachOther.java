package org.leetcode.hard;


/**
 * <b>#1434 - Number of Ways to Wear Different Hats to Each Other</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n people and 40 types of hats labeled from 1 to 40.
 *
 *
 * Given a 2D integer array hats, where hats[i] is a list of all hats preferred by the ith person.
 *
 *
 * Return the number of ways that n people can wear different hats from each other.
 *
 *
 * Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: hats = [[3,4],[4,5],[5]]
 * Output: 1
 * Explanation: There is only one way to choose hats given the conditions. 
 * First person chooses hat 3, Second person chooses hat 4 and last one hat 5.
 *
 * Example 2:
 *
 * Input: hats = [[3,5,1],[3,5]]
 * Output: 4
 * Explanation: There are 4 ways to choose hats:
 * (3,5), (5,3), (1,3) and (1,5)
 *
 * Example 3:
 *
 * Input: hats = [[1,2,3,4],[1,2,3,4],[1,2,3,4],[1,2,3,4]]
 * Output: 24
 * Explanation: Each person can choose hats labeled from 1 to 4.
 * Number of Permutations of (1,2,3,4) = 24.
 *
 *
 *
 * Constraints:
 *
 *
 * n == hats.length
 *
 * 1 &lt;= n &lt;= 10
 *
 * 1 &lt;= hats[i].length &lt;= 40
 *
 * 1 &lt;= hats[i][j] &lt;= 40
 *
 * hats[i] contains a list of unique integers.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Dynamic programming + bitmask.
 * Hint 2: dp(peopleMask, idHat) number of ways to wear different hats given a bitmask (people visited) and used hats from 1 to idHat-1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-wear-different-hats-to-each-other/">LeetCode #1434</a>
 */
public class NumberOfWaysToWearDifferentHatsToEachOther {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Wear Different Hats to Each Other");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToWearDifferentHatsToEachOther ===");
        NumberOfWaysToWearDifferentHatsToEachOther sol = new NumberOfWaysToWearDifferentHatsToEachOther();
        System.out.println(sol.solve(null));
    }
}
