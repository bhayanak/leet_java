package org.leetcode.hard;


/**
 * <b>#1354 - Construct Target Array With Multiple Sums</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array target of n integers. From a starting array arr consisting of n 1's, you may perform the following procedure :
 *
 *
 * let x be the sum of all elements currently in your array.
 *
 * choose index i, such that 0 &lt;= i &lt; n and set the value of arr at index i to x.
 *
 * You may repeat this procedure as many times as needed.
 *
 * Return true if it is possible to construct the target array from arr, otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = [9,3,5]
 * Output: true
 * Explanation: Start with arr = [1, 1, 1] 
 * [1, 1, 1], sum = 3 choose index 1
 * [1, 3, 1], sum = 5 choose index 2
 * [1, 3, 5], sum = 9 choose index 0
 * [9, 3, 5] Done
 *
 * Example 2:
 *
 * Input: target = [1,1,1,2]
 * Output: false
 * Explanation: Impossible to create target array from [1,1,1,1].
 *
 * Example 3:
 *
 * Input: target = [8,5]
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * n == target.length
 *
 * 1 &lt;= n &lt;= 5 * 104
 *
 * 1 &lt;= target[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Given that the sum is strictly increasing, the largest element in the target must be formed in the last step by adding the total sum in the previous step. Thus, we can simulate the process in a reversed way.
 * Hint 2: Subtract the largest with the rest of the array, and put the new element into the array. Repeat until all elements become one
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/construct-target-array-with-multiple-sums/">LeetCode #1354</a>
 */
public class ConstructTargetArrayWithMultipleSums {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Construct Target Array With Multiple Sums");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ConstructTargetArrayWithMultipleSums ===");
        ConstructTargetArrayWithMultipleSums sol = new ConstructTargetArrayWithMultipleSums();
        System.out.println(sol.solve(null));
    }
}
