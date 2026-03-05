package org.leetcode.medium;


/**
 * <b>#1014 - Best Sightseeing Pair</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array values where values[i] represents the value of the ith sightseeing spot. Two sightseeing spots i and j have a distance j - i between them.
 *
 *
 * The score of a pair (i &lt; j) of sightseeing spots is values[i] + values[j] + i - j: the sum of the values of the sightseeing spots, minus the distance between them.
 *
 *
 * Return the maximum score of a pair of sightseeing spots.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: values = [8,1,5,2,6]
 * Output: 11
 * Explanation: i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11
 *
 * Example 2:
 *
 * Input: values = [1,2]
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= values.length &lt;= 5 * 104
 *
 * 1 &lt;= values[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you tell the best sightseeing spot in one pass (ie. as you iterate over the input?)  What should we store or keep track of as we iterate to do this?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/best-sightseeing-pair/">LeetCode #1014</a>
 */
public class BestSightseeingPair {

    /**
     * TODO: Implement "Best Sightseeing Pair".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Best Sightseeing Pair");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BestSightseeingPair.java &amp;&amp; java org.leetcode.medium.BestSightseeingPair</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BestSightseeingPair ===");
        BestSightseeingPair sol = new BestSightseeingPair();
        System.out.println(sol.solve(null));
    }
}
