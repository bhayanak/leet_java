package org.leetcode.medium;


/**
 * <b>#2202 - Maximize the Topmost Element After K Moves</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums representing the contents of a pile, where nums[0] is the topmost element of the pile.
 *
 *
 * In one move, you can perform either of the following:
 *
 *
 * If the pile is not empty, remove the topmost element of the pile.
 *
 * If there are one or more removed elements, add any one of them back onto the pile. This element becomes the new topmost element.
 *
 * You are also given an integer k, which denotes the total number of moves to be made.
 *
 *
 * Return the maximum value of the topmost element of the pile possible after exactly k moves. In case it is not possible to obtain a non-empty pile after k moves, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,2,2,4,0,6], k = 4
 * Output: 5
 * Explanation:
 * One of the ways we can end with 5 at the top of the pile after 4 moves is as follows:
 * - Step 1: Remove the topmost element = 5. The pile becomes [2,2,4,0,6].
 * - Step 2: Remove the topmost element = 2. The pile becomes [2,4,0,6].
 * - Step 3: Remove the topmost element = 2. The pile becomes [4,0,6].
 * - Step 4: Add 5 back onto the pile. The pile becomes [5,4,0,6].
 * Note that this is not the only way to end with 5 at the top of the pile. It can be shown that 5 is the largest answer possible after 4 moves.
 *
 * Example 2:
 *
 * Input: nums = [2], k = 1
 * Output: -1
 * Explanation: 
 * In the first move, our only option is to pop the topmost element of the pile.
 * Since it is not possible to obtain a non-empty pile after one move, we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i], k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each index i, how can we check if nums[i] can be present at the top of the pile or not after k moves?
 * Hint 2: For which conditions will we end up with an empty pile?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximize-the-topmost-element-after-k-moves/">LeetCode #2202</a>
 */
public class MaximizeTheTopmostElementAfterKMoves {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize the Topmost Element After K Moves");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTheTopmostElementAfterKMoves ===");
        MaximizeTheTopmostElementAfterKMoves sol = new MaximizeTheTopmostElementAfterKMoves();
        System.out.println(sol.solve(null));
    }
}
