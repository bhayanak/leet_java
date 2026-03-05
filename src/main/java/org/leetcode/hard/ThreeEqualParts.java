package org.leetcode.hard;


/**
 * <b>#927 - Three Equal Parts</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array arr which consists of only zeros and ones, divide the array into three non-empty parts such that all of these parts represent the same binary value.
 *
 *
 * If it is possible, return any [i, j] with i + 1 &lt; j, such that:
 *
 *
 * arr[0], arr[1], ..., arr[i] is the first part,
 *
 * arr[i + 1], arr[i + 2], ..., arr[j - 1] is the second part, and
 *
 * arr[j], arr[j + 1], ..., arr[arr.length - 1] is the third part.
 *
 * All three parts have equal binary values.
 *
 * If it is not possible, return [-1, -1].
 *
 *
 * Note that the entire part is used when considering what binary value it represents. For example, [1,1,0] represents 6 in decimal, not 3. Also, leading zeros are allowed, so [0,1,1] and [1,1] represent the same value.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,0,1,0,1]
 * Output: [0,3]
 *
 *
 * Example 2:
 *
 * Input: arr = [1,1,0,1,1]
 * Output: [-1,-1]
 *
 *
 * Example 3:
 *
 * Input: arr = [1,1,0,0,1]
 * Output: [0,2]
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= arr.length &lt;= 3 * 104
 *
 * arr[i] is 0 or 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/three-equal-parts/">LeetCode #927</a>
 */
public class ThreeEqualParts {

    /**
     * TODO: Implement "Three Equal Parts".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Three Equal Parts");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ThreeEqualParts.java &amp;&amp; java org.leetcode.hard.ThreeEqualParts</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ThreeEqualParts ===");
        ThreeEqualParts sol = new ThreeEqualParts();
        System.out.println(sol.solve(null));
    }
}
