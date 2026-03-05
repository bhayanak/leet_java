package org.leetcode.medium;


/**
 * <b>#991 - Broken Calculator</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a broken calculator that has the integer startValue on its display initially. In one operation, you can:
 *
 *
 * multiply the number on display by 2, or
 *
 * subtract 1 from the number on display.
 *
 * Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: startValue = 2, target = 3
 * Output: 2
 * Explanation: Use double operation and then decrement operation {2 -&gt; 4 -&gt; 3}.
 *
 * Example 2:
 *
 * Input: startValue = 5, target = 8
 * Output: 2
 * Explanation: Use decrement and then double {5 -&gt; 4 -&gt; 8}.
 *
 * Example 3:
 *
 * Input: startValue = 3, target = 10
 * Output: 3
 * Explanation: Use double, decrement and double {3 -&gt; 6 -&gt; 5 -&gt; 10}.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= startValue, target &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/broken-calculator/">LeetCode #991</a>
 */
public class BrokenCalculator {

    /**
     * TODO: Implement "Broken Calculator".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Broken Calculator");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BrokenCalculator.java &amp;&amp; java org.leetcode.medium.BrokenCalculator</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BrokenCalculator ===");
        BrokenCalculator sol = new BrokenCalculator();
        System.out.println(sol.solve(null));
    }
}
