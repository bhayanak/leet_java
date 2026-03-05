package org.leetcode.hard;


/**
 * <b>#1340 - Jump Game V</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr and an integer d. In one step you can jump from index i to index:
 *
 *
 * i + x where: i + x &lt; arr.length and  0 &lt; x &lt;= d.
 *
 * i - x where: i - x &gt;= 0 and  0 &lt; x &lt;= d.
 *
 * In addition, you can only jump from index i to index j if arr[i] &gt; arr[j] and arr[i] &gt; arr[k] for all indices k between i and j (More formally min(i, j) &lt; k &lt; max(i, j)).
 *
 *
 * You can choose any index of the array and start jumping. Return the maximum number of indices you can visit.
 *
 *
 * Notice that you can not jump outside of the array at any time.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [6,4,14,6,8,13,9,7,10,6,12], d = 2
 * Output: 4
 * Explanation: You can start at index 10. You can jump 10 --&gt; 8 --&gt; 6 --&gt; 7 as shown.
 * Note that if you start at index 6 you can only jump to index 7. You cannot jump to index 5 because 13 &gt; 9. You cannot jump to index 4 because index 5 is between index 4 and 6 and 13 &gt; 9.
 * Similarly You cannot jump from index 3 to index 2 or index 1.
 *
 * Example 2:
 *
 * Input: arr = [3,3,3,3,3], d = 3
 * Output: 1
 * Explanation: You can start at any index. You always cannot jump to any index.
 *
 * Example 3:
 *
 * Input: arr = [7,6,5,4,3,2,1], d = 1
 * Output: 7
 * Explanation: Start at index 0. You can visit all the indicies. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 1000
 *
 * 1 &lt;= arr[i] &lt;= 105
 *
 * 1 &lt;= d &lt;= arr.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming. dp[i] is max jumps you can do starting from index i. Answer is max(dp[i]).
 * Hint 2: dp[i] = 1 + max (dp[j]) where j is all indices you can reach from i.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/jump-game-v/">LeetCode #1340</a>
 */
public class JumpGameV {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Jump Game V");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== JumpGameV ===");
        JumpGameV sol = new JumpGameV();
        System.out.println(sol.solve(null));
    }
}
