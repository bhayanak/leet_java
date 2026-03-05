package org.leetcode.hard;


/**
 * <b>#818 - Race Car</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Your car starts at position 0 and speed +1 on an infinite number line. Your car can go into negative positions. Your car drives automatically according to a sequence of instructions 'A' (accelerate) and 'R' (reverse):
 *
 *
 * When you get an instruction 'A', your car does the following:
 *
 *
 *
 *
 * position += speed
 *
 * speed *= 2
 *
 *
 *
 * When you get an instruction 'R', your car does the following:
 *
 *
 *
 * If your speed is positive then speed = -1
 *
 * otherwise speed = 1
 *
 * 	Your position stays the same.
 *
 * For example, after commands "AAR", your car goes to positions 0 --&gt; 1 --&gt; 3 --&gt; 3, and your speed goes to 1 --&gt; 2 --&gt; 4 --&gt; -1.
 *
 *
 * Given a target position target, return the length of the shortest sequence of instructions to get there.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = 3
 * Output: 2
 * Explanation: 
 * The shortest instruction sequence is "AA".
 * Your position goes from 0 --&gt; 1 --&gt; 3.
 *
 * Example 2:
 *
 * Input: target = 6
 * Output: 5
 * Explanation: 
 * The shortest instruction sequence is "AAARA".
 * Your position goes from 0 --&gt; 1 --&gt; 3 --&gt; 7 --&gt; 7 --&gt; 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/race-car/">LeetCode #818</a>
 */
public class RaceCar {

    /**
     * TODO: Implement "Race Car".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Race Car");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RaceCar.java &amp;&amp; java org.leetcode.hard.RaceCar</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== RaceCar ===");
        RaceCar sol = new RaceCar();
        System.out.println(sol.solve(null));
    }
}
