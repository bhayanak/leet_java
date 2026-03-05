package org.leetcode.medium;


/**
 * <b>#1115 - Print FooBar Alternately</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Concurrency</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Suppose you are given the following code:
 *
 * class FooBar {
 *   public void foo() {
 *     for (int i = 0; i &lt; n; i++) {
 *       print("foo");
 *     }
 *   }
 *
 *   public void bar() {
 *     for (int i = 0; i &lt; n; i++) {
 *       print("bar");
 *     }
 *   }
 * }
 *
 * The same instance of FooBar will be passed to two different threads:
 *
 *
 * thread A will call foo(), while
 *
 * thread B will call bar().
 *
 * Modify the given program to output "foobar" n times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: "foobar"
 * Explanation: There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar().
 * "foobar" is being output 1 time.
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: "foobarfoobar"
 * Explanation: "foobar" is being output 2 times.
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
 * @see <a href="https://leetcode.com/problems/print-foobar-alternately/">LeetCode #1115</a>
 */
public class PrintFoobarAlternately {

    /**
     * TODO: Implement "Print FooBar Alternately".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Print FooBar Alternately");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PrintFoobarAlternately.java &amp;&amp; java org.leetcode.medium.PrintFoobarAlternately</pre>
     */
    public static void main(String[] args) {
        PrintFoobarAlternately sol = new PrintFoobarAlternately();
        System.out.println(sol.solve(null));
    }
}
