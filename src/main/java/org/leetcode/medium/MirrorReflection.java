package org.leetcode.medium;


/**
 * <b>#858 - Mirror Reflection</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Geometry, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a special square room with mirrors on each of the four walls. Except for the southwest corner, there are receptors on each of the remaining corners, numbered 0, 1, and 2.
 *
 *
 * The square room has walls of length p and a laser ray from the southwest corner first meets the east wall at a distance q from the 0th receptor.
 *
 *
 * Given the two integers p and q, return the number of the receptor that the ray meets first.
 *
 *
 * The test cases are guaranteed so that the ray will meet a receptor eventually.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: p = 2, q = 1
 * Output: 2
 * Explanation: The ray meets receptor 2 the first time it gets reflected back to the left wall.
 *
 * Example 2:
 *
 * Input: p = 3, q = 1
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= q &lt;= p &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Geometry, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/mirror-reflection/">LeetCode #858</a>
 */
public class MirrorReflection {

    /**
     * TODO: Implement "Mirror Reflection".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Mirror Reflection");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MirrorReflection.java &amp;&amp; java org.leetcode.medium.MirrorReflection</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MirrorReflection ===");
        MirrorReflection sol = new MirrorReflection();
        System.out.println(sol.solve(null));
    }
}
