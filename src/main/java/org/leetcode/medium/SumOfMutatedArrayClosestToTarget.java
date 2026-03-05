package org.leetcode.medium;


/**
 * <b>#1300 - Sum of Mutated Array Closest to Target</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr and a target value target, return the integer value such that when we change all the integers larger than value in the given array to be equal to value, the sum of the array gets as close as possible (in absolute difference) to target.
 *
 *
 * In case of a tie, return the minimum such integer.
 *
 *
 * Notice that the answer is not neccesarilly a number from arr.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [4,9,3], target = 10
 * Output: 3
 * Explanation: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.
 *
 * Example 2:
 *
 * Input: arr = [2,3,5], target = 10
 * Output: 5
 *
 * Example 3:
 *
 * Input: arr = [60864,25176,27249,21296,20204], target = 56803
 * Output: 11361
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 104
 *
 * 1 &lt;= arr[i], target &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If you draw a graph with the value on one axis and the absolute difference between the target and the array sum, what will you get?
 * Hint 2: That graph is uni-modal.
 * Hint 3: Use ternary search on that graph to find the best value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-mutated-array-closest-to-target/">LeetCode #1300</a>
 */
public class SumOfMutatedArrayClosestToTarget {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Mutated Array Closest to Target");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfMutatedArrayClosestToTarget ===");
        SumOfMutatedArrayClosestToTarget sol = new SumOfMutatedArrayClosestToTarget();
        System.out.println(sol.solve(null));
    }
}
