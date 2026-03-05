package org.leetcode.hard;


/**
 * <b>#899 - Orderly Queue</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer k. You can choose one of the first k letters of s and append it at the end of the string.
 *
 *
 * Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cba", k = 1
 * Output: "acb"
 * Explanation: 
 * In the first move, we move the 1st character 'c' to the end, obtaining the string "bac".
 * In the second move, we move the 1st character 'b' to the end, obtaining the final result "acb".
 *
 * Example 2:
 *
 * Input: s = "baaca", k = 3
 * Output: "aaabc"
 * Explanation: 
 * In the first move, we move the 1st character 'b' to the end, obtaining the string "aacab".
 * In the second move, we move the 3rd character 'c' to the end, obtaining the final result "aaabc".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= s.length &lt;= 1000
 *
 * s consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/orderly-queue/">LeetCode #899</a>
 */
public class OrderlyQueue {

    /**
     * TODO: Implement "Orderly Queue".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Orderly Queue");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac OrderlyQueue.java &amp;&amp; java org.leetcode.hard.OrderlyQueue</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== OrderlyQueue ===");
        OrderlyQueue sol = new OrderlyQueue();
        System.out.println(sol.solve(null));
    }
}
