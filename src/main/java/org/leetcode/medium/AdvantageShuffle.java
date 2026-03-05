package org.leetcode.medium;


/**
 * <b>#870 - Advantage Shuffle</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 and nums2 both of the same length. The advantage of nums1 with respect to nums2 is the number of indices i for which nums1[i] &gt; nums2[i].
 *
 *
 * Return any permutation of nums1 that maximizes its advantage with respect to nums2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,7,11,15], nums2 = [1,10,4,11]
 * Output: [2,11,7,15]
 *
 *
 * Example 2:
 *
 * Input: nums1 = [12,24,8,32], nums2 = [13,25,32,11]
 * Output: [24,32,8,12]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length &lt;= 105
 *
 * nums2.length == nums1.length
 *
 * 0 &lt;= nums1[i], nums2[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/advantage-shuffle/">LeetCode #870</a>
 */
public class AdvantageShuffle {

    /**
     * TODO: Implement "Advantage Shuffle".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Advantage Shuffle");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AdvantageShuffle.java &amp;&amp; java org.leetcode.medium.AdvantageShuffle</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== AdvantageShuffle ===");
        AdvantageShuffle sol = new AdvantageShuffle();
        System.out.println(sol.solve(null));
    }
}
