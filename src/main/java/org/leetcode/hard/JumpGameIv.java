package org.leetcode.hard;


/**
 * <b>#1345 - Jump Game IV</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, you are initially positioned at the first index of the array.
 *
 *
 * In one step you can jump from index i to index:
 *
 *
 * i + 1 where: i + 1 &lt; arr.length.
 *
 * i - 1 where: i - 1 &gt;= 0.
 *
 * j where: arr[i] == arr[j] and i != j.
 *
 * Return the minimum number of steps to reach the last index of the array.
 *
 *
 * Notice that you can not jump outside of the array at any time.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [100,-23,-23,404,100,23,23,23,3,404]
 * Output: 3
 * Explanation: You need three jumps from index 0 --&gt; 4 --&gt; 3 --&gt; 9. Note that index 9 is the last index of the array.
 *
 * Example 2:
 *
 * Input: arr = [7]
 * Output: 0
 * Explanation: Start index is the last index. You do not need to jump.
 *
 * Example 3:
 *
 * Input: arr = [7,6,9,6,9,6,9,7]
 * Output: 1
 * Explanation: You can jump directly from index 0 to index 7 which is last index of the array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 5 * 104
 *
 * -108 &lt;= arr[i] &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build a graph of n nodes where nodes are the indices of the array and edges for node i are nodes i+1, i-1, j where arr[i] == arr[j].
 * Hint 2: Start bfs from node 0 and keep distance. The answer is the distance when you reach node n-1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Breadth-First Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/jump-game-iv/">LeetCode #1345</a>
 */
public class JumpGameIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Jump Game IV");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== JumpGameIv ===");
        JumpGameIv sol = new JumpGameIv();
        System.out.println(sol.solve(null));
    }
}
