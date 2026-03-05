package org.leetcode.medium;


/**
 * <b>#1144 - Decrease Elements To Make Array Zigzag</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of integers, a move consists of choosing any element and decreasing it by 1.
 *
 *
 * An array A is a zigzag array if either:
 *
 *
 * Every even-indexed element is greater than adjacent elements, ie. A[0] &gt; A[1] &lt; A[2] &gt; A[3] &lt; A[4] &gt; ...
 *
 * OR, every odd-indexed element is greater than adjacent elements, ie. A[0] &lt; A[1] &gt; A[2] &lt; A[3] &gt; A[4] &lt; ...
 *
 * Return the minimum number of moves to transform the given array nums into a zigzag array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: 2
 * Explanation: We can decrease 2 to 0 or 3 to 1.
 *
 * Example 2:
 *
 * Input: nums = [9,6,1,6,2]
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do each case (even indexed is greater, odd indexed is greater) separately. In say the even case, you should decrease each even-indexed element until it is lower than its immediate neighbors.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/decrease-elements-to-make-array-zigzag/">LeetCode #1144</a>
 */
public class DecreaseElementsToMakeArrayZigzag {

    /**
     * TODO: Implement "Decrease Elements To Make Array Zigzag".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Decrease Elements To Make Array Zigzag");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DecreaseElementsToMakeArrayZigzag.java &amp;&amp; java org.leetcode.medium.DecreaseElementsToMakeArrayZigzag</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DecreaseElementsToMakeArrayZigzag ===");
        DecreaseElementsToMakeArrayZigzag sol = new DecreaseElementsToMakeArrayZigzag();
        System.out.println(sol.solve(null));
    }
}
