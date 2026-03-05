package org.leetcode.medium;


/**
 * <b>#2829 - Determine the Minimum Sum of a k-avoiding Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers, n and k.
 *
 *
 * An array of distinct positive integers is called a k-avoiding array if there does not exist any pair of distinct elements that sum to k.
 *
 *
 * Return the minimum possible sum of a k-avoiding array of length n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, k = 4
 * Output: 18
 * Explanation: Consider the k-avoiding array [1,2,4,5,6], which has a sum of 18.
 * It can be proven that there is no k-avoiding array with a sum less than 18.
 *
 * Example 2:
 *
 * Input: n = 2, k = 6
 * Output: 3
 * Explanation: We can construct the array [1,2], which has a sum of 3.
 * It can be proven that there is no k-avoiding array with a sum less than 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, k &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">Try to start with the smallest possible integers.</div>
 * Hint 2: <div class="_1l1MA">Check if the current number can be added to the array.</div>
 * Hint 3: <div class="_1l1MA">To check if the current number can be added, keep track of already added numbers in a set.</div>
 * Hint 4: <div class="_1l1MA">If the number <code>i</code> is added to the array, then <code>i + k</code> can not be added.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/determine-the-minimum-sum-of-a-k-avoiding-array/">LeetCode #2829</a>
 */
public class DetermineTheMinimumSumOfAKAvoidingArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Determine the Minimum Sum of a k-avoiding Array");
    }

    public static void main(String[] args) {
        System.out.println("=== DetermineTheMinimumSumOfAKAvoidingArray ===");
        DetermineTheMinimumSumOfAKAvoidingArray sol = new DetermineTheMinimumSumOfAKAvoidingArray();
        System.out.println(sol.solve(null));
    }
}
