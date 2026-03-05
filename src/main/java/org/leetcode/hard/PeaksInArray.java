package org.leetcode.hard;


/**
 * <b>#3187 - Peaks in Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A peak in an array arr is an element that is greater than its previous and next element in arr.
 *
 *
 * You are given an integer array nums and a 2D integer array queries.
 *
 *
 * You have to process queries of two types:
 *
 *
 * queries[i] = [1, li, ri], determine the count of peak elements in the subarray nums[li..ri].
 *
 * queries[i] = [2, indexi, vali], change nums[indexi] to vali.
 *
 * Return an array answer containing the results of the queries of the first type in order.
 *
 *
 * Notes:
 *
 *
 * The first and the last element of an array or a subarray cannot be a peak.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,4,2,5], queries = [[2,3,4],[1,0,4]]
 *
 *
 * Output: [0]
 *
 *
 * Explanation:
 *
 *
 * First query: We change nums[3] to 4 and nums becomes [3,1,4,4,5].
 *
 *
 * Second query: The number of peaks in the [3,1,4,4,5] is 0.
 *
 * Example 2:
 *
 * Input: nums = [4,1,4,2,1,5], queries = [[2,2,4],[1,0,2],[1,0,4]]
 *
 *
 * Output: [0,1]
 *
 *
 * Explanation:
 *
 *
 * First query: nums[2] should become 4, but it is already set to 4.
 *
 *
 * Second query: The number of peaks in the [4,1,4] is 0.
 *
 *
 * Third query: The second 4 is a peak in the [4,1,4,2,1].
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i][0] == 1 or queries[i][0] == 2
 *
 * For all i that:
 *
 *
 *
 * queries[i][0] == 1: 0 &lt;= queries[i][1] &lt;= queries[i][2] &lt;= nums.length - 1
 *
 * queries[i][0] == 2: 0 &lt;= queries[i][1] &lt;= nums.length - 1, 1 &lt;= queries[i][2] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>p[i]</code> be whether <code>nums[i]</code> is a peak in the original array. Namely <code>p[i] = nums[i] &gt; nums[i - 1] &amp;&amp; nums[i] &gt; nums[i + 1]</code>.
 * Hint 2: Updating <code>nums[i]</code>, only affects <code>p[i]</code>, <code>p[i - 1]</code> and <code>p[i + 1]</code>. We can recalculate the 3 values in constant time.
 * Hint 3: The answer for <code>[l<sub>i</sub>, r<sub>i</sub>]</code> is <code>p[l<sub>i</sub> + 1] + p[l<sub>i</sub> + 2] + … + p[r<sub>i</sub> - 1]</code> (note that <code>l<sub>i</sub></code> and <code>r<sub>i</sub></code> are not included).
 * Hint 4: Use some data structures (i.e. segment tree or binary indexed tree) to maintain the subarray sum efficiently.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Indexed Tree, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/peaks-in-array/">LeetCode #3187</a>
 */
public class PeaksInArray {

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
        throw new UnsupportedOperationException("Not yet implemented: Peaks in Array");
    }

    public static void main(String[] args) {
        System.out.println("=== PeaksInArray ===");
        PeaksInArray sol = new PeaksInArray();
        System.out.println(sol.solve(null));
    }
}
