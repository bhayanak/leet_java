package org.leetcode.medium;


/**
 * <b>#1432 - Max Difference You Can Get From Changing an Integer</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer num. You will apply the following steps to num two separate times:
 *
 *
 * Pick a digit x (0 &lt;= x &lt;= 9).
 *
 * Pick another digit y (0 &lt;= y &lt;= 9). Note y can be equal to x.
 *
 * Replace all the occurrences of x in the decimal representation of num by y.
 *
 * Let a and b be the two results from applying the operation to num independently.
 *
 *
 * Return the max difference between a and b.
 *
 *
 * Note that neither a nor b may have any leading zeros, and must not be 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 555
 * Output: 888
 * Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
 * The second time pick x = 5 and y = 1 and store the new integer in b.
 * We have now a = 999 and b = 111 and max difference = 888
 *
 * Example 2:
 *
 * Input: num = 9
 * Output: 8
 * Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
 * The second time pick x = 9 and y = 1 and store the new integer in b.
 * We have now a = 9 and b = 1 and max difference = 8
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We need to get the max and min value after changing num and the answer is max - min.
 * Hint 2: Use brute force, try all possible changes and keep the minimum and maximum values.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/max-difference-you-can-get-from-changing-an-integer/">LeetCode #1432</a>
 */
public class MaxDifferenceYouCanGetFromChangingAnInteger {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Max Difference You Can Get From Changing an Integer");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaxDifferenceYouCanGetFromChangingAnInteger ===");
        MaxDifferenceYouCanGetFromChangingAnInteger sol = new MaxDifferenceYouCanGetFromChangingAnInteger();
        System.out.println(sol.solve(null));
    }
}
