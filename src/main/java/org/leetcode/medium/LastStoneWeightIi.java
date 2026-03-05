package org.leetcode.medium;


/**
 * <b>#1049 - Last Stone Weight II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 *
 *
 * We are playing a game with the stones. On each turn, we choose any two stones and smash them together. Suppose the stones have weights x and y with x &lt;= y. The result of this smash is:
 *
 *
 * If x == y, both stones are destroyed, and
 *
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 *
 * At the end of the game, there is at most one stone left.
 *
 *
 * Return the smallest possible weight of the left stone. If there are no stones left, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We can combine 2 and 4 to get 2, so the array converts to [2,7,1,8,1] then,
 * we can combine 7 and 8 to get 1, so the array converts to [2,1,1,1] then,
 * we can combine 2 and 1 to get 1, so the array converts to [1,1,1] then,
 * we can combine 1 and 1 to get 0, so the array converts to [1], then that's the optimal value.
 *
 * Example 2:
 *
 * Input: stones = [31,26,33,21,40]
 * Output: 5
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= stones.length &lt;= 30
 *
 * 1 &lt;= stones[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of the final answer as a sum of weights with + or - sign symbols infront of each weight.  Actually, all sums with 1 of each sign symbol are possible.
 * Hint 2: Use dynamic programming: for every possible sum with N stones, those sums +x or -x is possible with N+1 stones, where x is the value of the newest stone.  (This overcounts sums that are all positive or all negative, but those don't matter.)
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/last-stone-weight-ii/">LeetCode #1049</a>
 */
public class LastStoneWeightIi {

    /**
     * TODO: Implement "Last Stone Weight II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Last Stone Weight II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LastStoneWeightIi.java &amp;&amp; java org.leetcode.medium.LastStoneWeightIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LastStoneWeightIi ===");
        LastStoneWeightIi sol = new LastStoneWeightIi();
        System.out.println(sol.solve(null));
    }
}
