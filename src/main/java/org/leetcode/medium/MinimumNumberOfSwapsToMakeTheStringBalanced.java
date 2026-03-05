package org.leetcode.medium;


/**
 * <b>#1963 - Minimum Number of Swaps to Make the String Balanced</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Stack, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets '[' and n / 2 closing brackets ']'.
 *
 *
 * A string is called balanced if and only if:
 *
 *
 * It is the empty string, or
 *
 * It can be written as AB, where both A and B are balanced strings, or
 *
 * It can be written as [C], where C is a balanced string.
 *
 * You may swap the brackets at any two indices any number of times.
 *
 *
 * Return the minimum number of swaps to make s balanced.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "][]["
 * Output: 1
 * Explanation: You can make the string balanced by swapping index 0 with index 3.
 * The resulting string is "[[]]".
 *
 * Example 2:
 *
 * Input: s = "]]][[["
 * Output: 2
 * Explanation: You can do the following to make the string balanced:
 * - Swap index 0 with index 4. s = "[]][][".
 * - Swap index 1 with index 5. s = "[[][]]".
 * The resulting string is "[[][]]".
 *
 * Example 3:
 *
 * Input: s = "[]"
 * Output: 0
 * Explanation: The string is already balanced.
 *
 *
 *
 * Constraints:
 *
 *
 * n == s.length
 *
 * 2 &lt;= n &lt;= 106
 *
 * n is even.
 *
 * s[i] is either '[' or ']'.
 *
 * The number of opening brackets '[' equals n / 2, and the number of closing brackets ']' equals n / 2.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate over the string and keep track of the number of opening and closing brackets on each step.
 * Hint 2: If the number of closing brackets is ever larger, you need to make a swap.
 * Hint 3: Swap it with the opening bracket closest to the end of s.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Stack, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/">LeetCode #1963</a>
 */
public class MinimumNumberOfSwapsToMakeTheStringBalanced {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Swaps to Make the String Balanced");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfSwapsToMakeTheStringBalanced ===");
        MinimumNumberOfSwapsToMakeTheStringBalanced sol = new MinimumNumberOfSwapsToMakeTheStringBalanced();
        System.out.println(sol.solve(null));
    }
}
