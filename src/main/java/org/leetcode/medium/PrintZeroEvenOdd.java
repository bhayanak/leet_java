package org.leetcode.medium;


/**
 * <b>#1116 - Print Zero Even Odd</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Concurrency</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a function printNumber that can be called with an integer parameter and prints it to the console.
 *
 *
 * For example, calling printNumber(7) prints 7 to the console.
 *
 * You are given an instance of the class ZeroEvenOdd that has three functions: zero, even, and odd. The same instance of ZeroEvenOdd will be passed to three different threads:
 *
 *
 * Thread A: calls zero() that should only output 0's.
 *
 * Thread B: calls even() that should only output even numbers.
 *
 * Thread C: calls odd() that should only output odd numbers.
 *
 * Modify the given class to output the series "010203040506..." where the length of the series must be 2n.
 *
 *
 * Implement the ZeroEvenOdd class:
 *
 *
 * ZeroEvenOdd(int n) Initializes the object with the number n that represents the numbers that should be printed.
 *
 * void zero(printNumber) Calls printNumber to output one zero.
 *
 * void even(printNumber) Calls printNumber to output one even number.
 *
 * void odd(printNumber) Calls printNumber to output one odd number.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: "0102"
 * Explanation: There are three threads being fired asynchronously.
 * One of them calls zero(), the other calls even(), and the last one calls odd().
 * "0102" is the correct output.
 *
 * Example 2:
 *
 * Input: n = 5
 * Output: "0102030405"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Concurrency).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/print-zero-even-odd/">LeetCode #1116</a>
 */
public class PrintZeroEvenOdd {

    /**
     * TODO: Implement "Print Zero Even Odd".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Print Zero Even Odd");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PrintZeroEvenOdd.java &amp;&amp; java org.leetcode.medium.PrintZeroEvenOdd</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PrintZeroEvenOdd ===");
        PrintZeroEvenOdd sol = new PrintZeroEvenOdd();
        System.out.println(sol.solve(null));
    }
}
