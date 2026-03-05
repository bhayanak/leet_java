package org.leetcode.medium;


/**
 * <b>#954 - Array of Doubled Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array of even length arr, return true if it is possible to reorder arr such that arr[2 * i + 1] = 2 * arr[2 * i] for every 0 &lt;= i &lt; len(arr) / 2, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,1,3,6]
 * Output: false
 *
 * Example 2:
 *
 * Input: arr = [2,1,2,6]
 * Output: false
 *
 * Example 3:
 *
 * Input: arr = [4,-2,2,-4]
 * Output: true
 * Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 3 * 104
 *
 * arr.length is even.
 *
 * -105 &lt;= arr[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/array-of-doubled-pairs/">LeetCode #954</a>
 */
public class ArrayOfDoubledPairs {

    /**
     * TODO: Implement "Array of Doubled Pairs".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Array of Doubled Pairs");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ArrayOfDoubledPairs.java &amp;&amp; java org.leetcode.medium.ArrayOfDoubledPairs</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ArrayOfDoubledPairs ===");
        ArrayOfDoubledPairs sol = new ArrayOfDoubledPairs();
        System.out.println(sol.solve(null));
    }
}
