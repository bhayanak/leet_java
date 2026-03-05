package org.leetcode.medium;


/**
 * <b>#1509 - Minimum Difference Between Largest and Smallest Value in Three Moves</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * In one move, you can choose one element of nums and change it to any value.
 *
 *
 * Return the minimum difference between the largest and smallest value of nums after performing at most three moves.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,3,2,4]
 * Output: 0
 * Explanation: We can make at most 3 moves.
 * In the first move, change 2 to 3. nums becomes [5,3,3,4].
 * In the second move, change 4 to 3. nums becomes [5,3,3,3].
 * In the third move, change 5 to 3. nums becomes [3,3,3,3].
 * After performing 3 moves, the difference between the minimum and maximum is 3 - 3 = 0.
 *
 * Example 2:
 *
 * Input: nums = [1,5,0,10,14]
 * Output: 1
 * Explanation: We can make at most 3 moves.
 * In the first move, change 5 to 0. nums becomes [1,0,0,10,14].
 * In the second move, change 10 to 0. nums becomes [1,0,0,0,14].
 * In the third move, change 14 to 1. nums becomes [1,0,0,0,1].
 * After performing 3 moves, the difference between the minimum and maximum is 1 - 0 = 1.
 * It can be shown that there is no way to make the difference 0 in 3 moves.
 *
 * Example 3:
 *
 * Input: nums = [3,100,20]
 * Output: 0
 * Explanation: We can make at most 3 moves.
 * In the first move, change 100 to 7. nums becomes [3,7,20].
 * In the second move, change 20 to 7. nums becomes [3,7,7].
 * In the third move, change 3 to 7. nums becomes [7,7,7].
 * After performing 3 moves, the difference between the minimum and maximum is 7 - 7 = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The minimum difference possible is obtained by removing three elements between the three smallest and three largest values in the array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/">LeetCode #1509</a>
 */
public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Difference Between Largest and Smallest Value in Three Moves");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves ===");
        MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves sol = new MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves();
        System.out.println(sol.solve(null));
    }
}
