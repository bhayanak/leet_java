package org.leetcode.medium;


/**
 * <b>#842 - Split Array into Fibonacci Sequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string of digits num, such as "123456579". We can split it into a Fibonacci-like sequence [123, 456, 579].
 *
 *
 * Formally, a Fibonacci-like sequence is a list f of non-negative integers such that:
 *
 *
 * 0 &lt;= f[i] &lt; 231, (that is, each integer fits in a 32-bit signed integer type),
 *
 * f.length &gt;= 3, and
 *
 * f[i] + f[i + 1] == f[i + 2] for all 0 &lt;= i &lt; f.length - 2.
 *
 * Note that when splitting the string into pieces, each piece must not have extra leading zeroes, except if the piece is the number 0 itself.
 *
 *
 * Return any Fibonacci-like sequence split from num, or return [] if it cannot be done.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "1101111"
 * Output: [11,0,11,11]
 * Explanation: The output [110, 1, 111] would also be accepted.
 *
 * Example 2:
 *
 * Input: num = "112358130"
 * Output: []
 * Explanation: The task is impossible.
 *
 * Example 3:
 *
 * Input: num = "0123"
 * Output: []
 * Explanation: Leading zeroes are not allowed, so "01", "2", "3" is not valid.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num.length &lt;= 200
 *
 * num contains only digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Backtracking).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/split-array-into-fibonacci-sequence/">LeetCode #842</a>
 */
public class SplitArrayIntoFibonacciSequence {

    /**
     * TODO: Implement "Split Array into Fibonacci Sequence".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Split Array into Fibonacci Sequence");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SplitArrayIntoFibonacciSequence.java &amp;&amp; java org.leetcode.medium.SplitArrayIntoFibonacciSequence</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SplitArrayIntoFibonacciSequence ===");
        SplitArrayIntoFibonacciSequence sol = new SplitArrayIntoFibonacciSequence();
        System.out.println(sol.solve(null));
    }
}
