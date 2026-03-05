package org.leetcode.medium;


/**
 * <b>#1881 - Maximum Value after Insertion</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a very large integer n, represented as a string,​​​​​​ and an integer digit x. The digits in n and the digit x are in the inclusive range [1, 9], and n may represent a negative number.
 *
 *
 * You want to maximize n's numerical value by inserting x anywhere in the decimal representation of n​​​​​​. You cannot insert x to the left of the negative sign.
 *
 *
 * For example, if n = 73 and x = 6, it would be best to insert it between 7 and 3, making n = 763.
 *
 * If n = -55 and x = 2, it would be best to insert it before the first 5, making n = -255.
 *
 * Return a string representing the maximum value of n​​​​​​ after the insertion.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = "99", x = 9
 * Output: "999"
 * Explanation: The result is the same regardless of where you insert 9.
 *
 * Example 2:
 *
 * Input: n = "-13", x = 2
 * Output: "-123"
 * Explanation: You can make n one of {-213, -123, -132}, and the largest of those three is -123.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n.length &lt;= 105
 *
 * 1 &lt;= x &lt;= 9
 *
 * The digits in n​​​ are in the range [1, 9].
 *
 * n is a valid representation of an integer.
 *
 * In the case of a negative n,​​​​​​ it will begin with '-'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that if the number is negative it's the same as positive but you look for the minimum instead.
 * Hint 2: In the case of maximum, if s[i] &lt; x it's optimal that x is put before s[i].
 * Hint 3: In the case of minimum, if s[i] &gt; x it's optimal that x is put before s[i].
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-value-after-insertion/">LeetCode #1881</a>
 */
public class MaximumValueAfterInsertion {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Value after Insertion");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumValueAfterInsertion ===");
        MaximumValueAfterInsertion sol = new MaximumValueAfterInsertion();
        System.out.println(sol.solve(null));
    }
}
