package org.leetcode.medium;


/**
 * <b>#1551 - Minimum Operations to Make Array Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have an array arr of length n where arr[i] = (2 * i) + 1 for all valid values of i (i.e., 0 &lt;= i &lt; n).
 *
 *
 * In one operation, you can select two indices x and y where 0 &lt;= x, y &lt; n and subtract 1 from arr[x] and add 1 to arr[y] (i.e., perform arr[x] -=1 and arr[y] += 1). The goal is to make all the elements of the array equal. It is guaranteed that all the elements of the array can be made equal using some operations.
 *
 *
 * Given an integer n, the length of the array, return the minimum number of operations needed to make all the elements of arr equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: 2
 * Explanation: arr = [1, 3, 5]
 * First operation choose x = 2 and y = 0, this leads arr to be [2, 3, 4]
 * In the second operation choose x = 2 and y = 0 again, thus arr = [3, 3, 3].
 *
 * Example 2:
 *
 * Input: n = 6
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build the array arr using the given formula, define target = sum(arr) / n
 * Hint 2: What is the number of operations needed to convert arr so that all elements equal target ?
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-array-equal/">LeetCode #1551</a>
 */
public class MinimumOperationsToMakeArrayEqual {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make Array Equal");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeArrayEqual ===");
        MinimumOperationsToMakeArrayEqual sol = new MinimumOperationsToMakeArrayEqual();
        System.out.println(sol.solve(null));
    }
}
