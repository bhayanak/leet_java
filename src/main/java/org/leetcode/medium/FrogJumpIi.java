package org.leetcode.medium;


/**
 * <b>#2498 - Frog Jump II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array stones sorted in strictly increasing order representing the positions of stones in a river.
 *
 *
 * A frog, initially on the first stone, wants to travel to the last stone and then return to the first stone. However, it can jump to any stone at most once.
 *
 *
 * The length of a jump is the absolute difference between the position of the stone the frog is currently on and the position of the stone to which the frog jumps.
 *
 *
 * More formally, if the frog is at stones[i] and is jumping to stones[j], the length of the jump is |stones[i] - stones[j]|.
 *
 * The cost of a path is the maximum length of a jump among all jumps in the path.
 *
 *
 * Return the minimum cost of a path for the frog.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: stones = [0,2,5,6,7]
 * Output: 5
 * Explanation: The above figure represents one of the optimal paths the frog can take.
 * The cost of this path is 5, which is the maximum length of a jump.
 * Since it is not possible to achieve a cost of less than 5, we return it.
 *
 * Example 2:
 *
 * Input: stones = [0,3,9]
 * Output: 9
 * Explanation: 
 * The frog can jump directly to the last stone and come back to the first stone. 
 * In this case, the length of each jump will be 9. The cost for the path will be max(9, 9) = 9.
 * It can be shown that this is the minimum achievable cost.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= stones.length &lt;= 105
 *
 * 0 &lt;= stones[i] &lt;= 109
 *
 * stones[0] == 0
 *
 * stones is sorted in a strictly increasing order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: One of the optimal strategies will be to jump to every stone.
 * Hint 2: Skipping just one stone in every forward jump and jumping to those skipped stones in backward jump can minimize the maximum jump.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/frog-jump-ii/">LeetCode #2498</a>
 */
public class FrogJumpIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Frog Jump II");
    }

    public static void main(String[] args) {
        System.out.println("=== FrogJumpIi ===");
        FrogJumpIi sol = new FrogJumpIi();
        System.out.println(sol.solve(null));
    }
}
