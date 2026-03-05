package org.leetcode.medium;


/**
 * <b>#1760 - Minimum Limit of Balls in a Bag</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums where the ith bag contains nums[i] balls. You are also given an integer maxOperations.
 *
 *
 * You can perform the following operation at most maxOperations times:
 *
 *
 * Take any bag of balls and divide it into two new bags with a positive number of balls.
 *
 *
 *
 *
 * For example, a bag of 5 balls can become two new bags of 1 and 4 balls, or two new bags of 2 and 3 balls.
 *
 *
 *
 * Your penalty is the maximum number of balls in a bag. You want to minimize your penalty after the operations.
 *
 *
 * Return the minimum possible penalty after performing the operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [9], maxOperations = 2
 * Output: 3
 * Explanation: 
 * - Divide the bag with 9 balls into two bags of sizes 6 and 3. [9] -&gt; [6,3].
 * - Divide the bag with 6 balls into two bags of sizes 3 and 3. [6,3] -&gt; [3,3,3].
 * The bag with the most number of balls has 3 balls, so your penalty is 3 and you should return 3.
 *
 * Example 2:
 *
 * Input: nums = [2,4,8,2], maxOperations = 4
 * Output: 2
 * Explanation:
 * - Divide the bag with 8 balls into two bags of sizes 4 and 4. [2,4,8,2] -&gt; [2,4,4,4,2].
 * - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,4,4,4,2] -&gt; [2,2,2,4,4,2].
 * - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,4,4,2] -&gt; [2,2,2,2,2,4,2].
 * - Divide the bag with 4 balls into two bags of sizes 2 and 2. [2,2,2,2,2,4,2] -&gt; [2,2,2,2,2,2,2,2].
 * The bag with the most number of balls has 2 balls, so your penalty is 2, and you should return 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= maxOperations, nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's change the question if we know the maximum size of a bag what is the minimum number of bags you can make
 * Hint 2: note that as the maximum size increases the minimum number of bags decreases so we can binary search the maximum size
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/">LeetCode #1760</a>
 */
public class MinimumLimitOfBallsInABag {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Limit of Balls in a Bag");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumLimitOfBallsInABag ===");
        MinimumLimitOfBallsInABag sol = new MinimumLimitOfBallsInABag();
        System.out.println(sol.solve(null));
    }
}
