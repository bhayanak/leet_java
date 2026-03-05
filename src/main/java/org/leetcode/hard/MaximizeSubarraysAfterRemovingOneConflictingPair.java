package org.leetcode.hard;


/**
 * <b>#3480 - Maximize Subarrays After Removing One Conflicting Pair</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Segment Tree, Enumeration, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n which represents an array nums containing the numbers from 1 to n in order. Additionally, you are given a 2D array conflictingPairs, where conflictingPairs[i] = [a, b] indicates that a and b form a conflicting pair.
 *
 *
 * Remove exactly one element from conflictingPairs. Afterward, count the number of non-empty subarrays of nums which do not contain both a and b for any remaining conflicting pair [a, b].
 *
 *
 * Return the maximum number of subarrays possible after removing exactly one conflicting pair.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, conflictingPairs = [[2,3],[1,4]]
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * Remove [2, 3] from conflictingPairs. Now, conflictingPairs = [[1, 4]].
 *
 * There are 9 subarrays in nums where [1, 4] do not appear together. They are [1], [2], [3], [4], [1, 2], [2, 3], [3, 4], [1, 2, 3] and [2, 3, 4].
 *
 * The maximum number of subarrays we can achieve after removing one element from conflictingPairs is 9.
 *
 * Example 2:
 *
 * Input: n = 5, conflictingPairs = [[1,2],[2,5],[3,5]]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * Remove [1, 2] from conflictingPairs. Now, conflictingPairs = [[2, 5], [3, 5]].
 *
 * There are 12 subarrays in nums where [2, 5] and [3, 5] do not appear together.
 *
 * The maximum number of subarrays we can achieve after removing one element from conflictingPairs is 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= conflictingPairs.length &lt;= 2 * n
 *
 * conflictingPairs[i].length == 2
 *
 * 1 &lt;= conflictingPairs[i][j] &lt;= n
 *
 * conflictingPairs[i][0] != conflictingPairs[i][1]
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>f[i]</code> (where <code>i = 1, 2, 3, ..., n</code>) be the end index of the longest valid subarray (without any conflicting pair) starting at index <code>i</code>.
 * Hint 2: The answer is: <code>sigma(f[i] - i + 1) for i in [1..n]</code>, which simplifies to: <code>sigma(f[i]) - n * (n + 1) / 2 + n</code>.
 * Hint 3: Focus on maintaining <code>f[i]</code>.
 * Hint 4: If we have a conflicting pair <code>(x, y)</code> with <code>x &lt; y</code>: 1. Sort the conflicting pairs by <code>y</code> values in non-increasing order.  2. Update each prefix of the <code>f</code> array accordingly.
 * Hint 5: Use a segment tree or another suitable data structure to maintain the range update and sum query efficiently.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Segment Tree, Enumeration, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximize-subarrays-after-removing-one-conflicting-pair/">LeetCode #3480</a>
 */
public class MaximizeSubarraysAfterRemovingOneConflictingPair {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Subarrays After Removing One Conflicting Pair");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeSubarraysAfterRemovingOneConflictingPair ===");
        MaximizeSubarraysAfterRemovingOneConflictingPair sol = new MaximizeSubarraysAfterRemovingOneConflictingPair();
        System.out.println(sol.solve(null));
    }
}
