package org.leetcode.medium;


/**
 * <b>#1306 - Jump Game III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.
 *
 *
 * Notice that you can not jump outside of the array at any time.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [4,2,3,0,3,1,2], start = 5
 * Output: true
 * Explanation: 
 * All possible ways to reach at index 3 with value 0 are: 
 * index 5 -&gt; index 4 -&gt; index 1 -&gt; index 3 
 * index 5 -&gt; index 6 -&gt; index 4 -&gt; index 1 -&gt; index 3 
 *
 * Example 2:
 *
 * Input: arr = [4,2,3,0,3,1,2], start = 0
 * Output: true 
 * Explanation: 
 * One possible way to reach at index 3 with value 0 is: 
 * index 0 -&gt; index 4 -&gt; index 1 -&gt; index 3
 *
 * Example 3:
 *
 * Input: arr = [3,0,2,1,2], start = 2
 * Output: false
 * Explanation: There is no way to reach at index 1 with value 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 5 * 104
 *
 * 0 &lt;= arr[i] &lt; arr.length
 *
 * 0 &lt;= start &lt; arr.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of BFS to solve the problem.
 * Hint 2: When you reach a position with a value = 0 then return true.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/jump-game-iii/">LeetCode #1306</a>
 */
public class JumpGameIii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Jump Game III");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== JumpGameIii ===");
        JumpGameIii sol = new JumpGameIii();
        System.out.println(sol.solve(null));
    }
}
