package org.leetcode.hard;


/**
 * <b>#801 - Minimum Swaps To Make Sequences Increasing</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays of the same length nums1 and nums2. In one operation, you are allowed to swap nums1[i] with nums2[i].
 *
 *
 * For example, if nums1 = [1,2,3,8], and nums2 = [5,6,7,4], you can swap the element at i = 3 to obtain nums1 = [1,2,3,4] and nums2 = [5,6,7,8].
 *
 * Return the minimum number of needed operations to make nums1 and nums2 strictly increasing. The test cases are generated so that the given input always makes it possible.
 *
 *
 * An array arr is strictly increasing if and only if arr[0] &lt; arr[1] &lt; arr[2] &lt; ... &lt; arr[arr.length - 1].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3,5,4], nums2 = [1,2,3,7]
 * Output: 1
 * Explanation: 
 * Swap nums1[3] and nums2[3]. Then the sequences are:
 * nums1 = [1, 3, 5, 7] and nums2 = [1, 2, 3, 4]
 * which are both strictly increasing.
 *
 * Example 2:
 *
 * Input: nums1 = [0,3,5,8,9], nums2 = [2,1,4,6,9]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums1.length &lt;= 105
 *
 * nums2.length == nums1.length
 *
 * 0 &lt;= nums1[i], nums2[i] &lt;= 2 * 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-swaps-to-make-sequences-increasing/">LeetCode #801</a>
 */
public class MinimumSwapsToMakeSequencesIncreasing {

    /**
     * TODO: Implement "Minimum Swaps To Make Sequences Increasing".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Swaps To Make Sequences Increasing");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumSwapsToMakeSequencesIncreasing.java &amp;&amp; java org.leetcode.hard.MinimumSwapsToMakeSequencesIncreasing</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumSwapsToMakeSequencesIncreasing ===");
        MinimumSwapsToMakeSequencesIncreasing sol = new MinimumSwapsToMakeSequencesIncreasing();
        System.out.println(sol.solve(null));
    }
}
