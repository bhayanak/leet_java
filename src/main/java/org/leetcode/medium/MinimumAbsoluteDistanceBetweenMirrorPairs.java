package org.leetcode.medium;


/**
 * <b>#3761 - Minimum Absolute Distance Between Mirror Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A mirror pair is a pair of indices (i, j) such that:
 *
 *
 * 0 &lt;= i &lt; j &lt; nums.length, and
 *
 * reverse(nums[i]) == nums[j], where reverse(x) denotes the integer formed by reversing the digits of x. Leading zeros are omitted after reversing, for example reverse(120) = 21.
 *
 * Return the minimum absolute distance between the indices of any mirror pair. The absolute distance between indices i and j is abs(i - j).
 *
 *
 * If no mirror pair exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [12,21,45,33,54]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The mirror pairs are:
 *
 *
 * (0, 1) since reverse(nums[0]) = reverse(12) = 21 = nums[1], giving an absolute distance abs(0 - 1) = 1.
 *
 * (2, 4) since reverse(nums[2]) = reverse(45) = 54 = nums[4], giving an absolute distance abs(2 - 4) = 2.
 *
 * The minimum absolute distance among all pairs is 1.
 *
 * Example 2:
 *
 * Input: nums = [120,21]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * There is only one mirror pair (0, 1) since reverse(nums[0]) = reverse(120) = 21 = nums[1].
 *
 *
 * The minimum absolute distance is 1.
 *
 * Example 3:
 *
 * Input: nums = [21,120]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * There are no mirror pairs in the array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Scan left to right with a hash map: for each <code>nums[i]</code>, if the map contains key <code>nums[i]</code> then set <code>ans = min(ans, i - map[nums[i]])</code>.
 * Hint 2: Store/update the current index under key <code>reverse(nums[i])</code>, so future matches use the most recent index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math).
 *
 * @see <a href="https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/">LeetCode #3761</a>
 */
public class MinimumAbsoluteDistanceBetweenMirrorPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Absolute Distance Between Mirror Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumAbsoluteDistanceBetweenMirrorPairs ===");
        MinimumAbsoluteDistanceBetweenMirrorPairs sol = new MinimumAbsoluteDistanceBetweenMirrorPairs();
        System.out.println(sol.solve(null));
    }
}
