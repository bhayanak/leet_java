package org.leetcode.hard;


/**
 * <b>#1187 - Make Array Strictly Increasing</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays arr1 and arr2, return the minimum number of operations (possibly zero) needed to make arr1 strictly increasing.
 *
 *
 * In one operation, you can choose two indices 0 &lt;= i &lt; arr1.length and 0 &lt;= j &lt; arr2.length and do the assignment arr1[i] = arr2[j].
 *
 *
 * If there is no way to make arr1 strictly increasing, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
 * Output: 1
 * Explanation: Replace 5 with 2, then arr1 = [1, 2, 3, 6, 7].
 *
 * Example 2:
 *
 * Input: arr1 = [1,5,3,6,7], arr2 = [4,3,1]
 * Output: 2
 * Explanation: Replace 5 with 3 and then replace 3 with 4. arr1 = [1, 3, 4, 6, 7].
 *
 * Example 3:
 *
 * Input: arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
 * Output: -1
 * Explanation: You can't make arr1 strictly increasing.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr1.length, arr2.length &lt;= 2000
 *
 * 0 &lt;= arr1[i], arr2[i] &lt;= 10^9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: The state would be the index in arr1 and the index of the previous element in arr2 after sorting it and removing duplicates.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/make-array-strictly-increasing/">LeetCode #1187</a>
 */
public class MakeArrayStrictlyIncreasing {

    /**
     * TODO: Implement "Make Array Strictly Increasing".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Make Array Strictly Increasing");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MakeArrayStrictlyIncreasing.java &amp;&amp; java org.leetcode.hard.MakeArrayStrictlyIncreasing</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MakeArrayStrictlyIncreasing ===");
        MakeArrayStrictlyIncreasing sol = new MakeArrayStrictlyIncreasing();
        System.out.println(sol.solve(null));
    }
}
