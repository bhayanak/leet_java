package org.leetcode.hard;


/**
 * <b>#3086 - Minimum Moves to Pick K Ones</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary array nums of length n, a positive integer k and a non-negative integer maxChanges.
 *
 *
 * Alice plays a game, where the goal is for Alice to pick up k ones from nums using the minimum number of moves. When the game starts, Alice picks up any index aliceIndex in the range [0, n - 1] and stands there. If nums[aliceIndex] == 1 , Alice picks up the one and nums[aliceIndex] becomes 0(this does not count as a move). After this, Alice can make any number of moves (including zero) where in each move Alice must perform exactly one of the following actions:
 *
 *
 * Select any index j != aliceIndex such that nums[j] == 0 and set nums[j] = 1. This action can be performed at most maxChanges times.
 *
 * Select any two adjacent indices x and y (|x - y| == 1) such that nums[x] == 1, nums[y] == 0, then swap their values (set nums[y] = 1 and nums[x] = 0). If y == aliceIndex, Alice picks up the one after this move and nums[y] becomes 0.
 *
 * Return the minimum number of moves required by Alice to pick exactly k ones.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,0,0,1,1,0,0,1], k = 3, maxChanges = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation: Alice can pick up 3 ones in 3 moves, if Alice performs the following actions in each move when standing at aliceIndex == 1:
 *
 *
 * At the start of the game Alice picks up the one and nums[1] becomes 0. nums becomes [1,0,0,0,0,1,1,0,0,1].
 *
 * Select j == 2 and perform an action of the first type. nums becomes [1,0,1,0,0,1,1,0,0,1]
 *
 * Select x == 2 and y == 1, and perform an action of the second type. nums becomes [1,1,0,0,0,1,1,0,0,1]. As y == aliceIndex, Alice picks up the one and nums becomes [1,0,0,0,0,1,1,0,0,1].
 *
 * Select x == 0 and y == 1, and perform an action of the second type. nums becomes [0,1,0,0,0,1,1,0,0,1]. As y == aliceIndex, Alice picks up the one and nums becomes [0,0,0,0,0,1,1,0,0,1].
 *
 * Note that it may be possible for Alice to pick up 3 ones using some other sequence of 3 moves.
 *
 * Example 2:
 *
 * Input: nums = [0,0,0,0], k = 2, maxChanges = 3
 *
 *
 * Output: 4
 *
 *
 * Explanation: Alice can pick up 2 ones in 4 moves, if Alice performs the following actions in each move when standing at aliceIndex == 0:
 *
 *
 * Select j == 1 and perform an action of the first type. nums becomes [0,1,0,0].
 *
 * Select x == 1 and y == 0, and perform an action of the second type. nums becomes [1,0,0,0]. As y == aliceIndex, Alice picks up the one and nums becomes [0,0,0,0].
 *
 * Select j == 1 again and perform an action of the first type. nums becomes [0,1,0,0].
 *
 * Select x == 1 and y == 0 again, and perform an action of the second type. nums becomes [1,0,0,0]. As y == aliceIndex, Alice picks up the one and nums becomes [0,0,0,0].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 1
 *
 * 1 &lt;= k &lt;= 105
 *
 * 0 &lt;= maxChanges &lt;= 105
 *
 * maxChanges + sum(nums) &gt;= k
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Ones created using a change require <code>2</code> moves. Hence except for the immediate neighbors of the index where we move all the ones, we should try to use change operations.
 * Hint 2: For some subset of ones, it is always better to move the ones to the median position.
 * Hint 3: We only need to be concerned with the indices where <code>nums[i] == 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sliding Window, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-pick-k-ones/">LeetCode #3086</a>
 */
public class MinimumMovesToPickKOnes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Moves to Pick K Ones");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumMovesToPickKOnes ===");
        MinimumMovesToPickKOnes sol = new MinimumMovesToPickKOnes();
        System.out.println(sol.solve(null));
    }
}
