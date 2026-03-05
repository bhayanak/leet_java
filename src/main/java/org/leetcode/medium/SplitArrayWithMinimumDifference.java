package org.leetcode.medium;


/**
 * <b>#3698 - Split Array With Minimum Difference</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Split the array into exactly two subarrays, left and right, such that left is strictly increasing  and right is strictly decreasing.
 *
 *
 * Return the minimum possible absolute difference between the sums of left and right. If no valid split exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			left
 * 			right
 * 			Validity
 * 			left sum
 * 			right sum
 * 			Absolute difference
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[1]
 * 			[3, 2]
 * 			Yes
 * 			1
 * 			5
 * 			|1 - 5| = 4
 *
 *
 *
 *
 * 			1
 * 			[1, 3]
 * 			[2]
 * 			Yes
 * 			4
 * 			2
 * 			|4 - 2| = 2
 *
 *
 *
 *
 * Thus, the minimum absolute difference is 2.
 *
 * Example 2:
 *
 * Input: nums = [1,2,4,3]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			left
 * 			right
 * 			Validity
 * 			left sum
 * 			right sum
 * 			Absolute difference
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[1]
 * 			[2, 4, 3]
 * 			No
 * 			1
 * 			9
 * 			-
 *
 *
 *
 *
 * 			1
 * 			[1, 2]
 * 			[4, 3]
 * 			Yes
 * 			3
 * 			7
 * 			|3 - 7| = 4
 *
 *
 *
 *
 * 			2
 * 			[1, 2, 4]
 * 			[3]
 * 			Yes
 * 			7
 * 			3
 * 			|7 - 3| = 4
 *
 *
 *
 *
 * Thus, the minimum absolute difference is 4.
 *
 * Example 3:
 *
 * Input: nums = [3,1,2]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * No valid split exists, so the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build a prefix boolean <code>inc[i]</code> that is true iff the subarray <code>nums[0..i]</code> is strictly increasing.
 * Hint 2: Build a suffix boolean <code>dec[i]</code> that is true iff the subarray <code>nums[i..n - 1]</code> is strictly decreasing.
 * Hint 3: A split after index <code>i</code> (where <code>0 &lt;= i &lt; n - 1</code>) is valid iff <code>inc[i] &amp;&amp; dec[i + 1]</code>.
 * Hint 4: Build a prefix-sum array <code>pref</code>, and use it to check if a valid split exists. If no valid split exists return <code>-1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/split-array-with-minimum-difference/">LeetCode #3698</a>
 */
public class SplitArrayWithMinimumDifference {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Split Array With Minimum Difference");
    }

    public static void main(String[] args) {
        System.out.println("=== SplitArrayWithMinimumDifference ===");
        SplitArrayWithMinimumDifference sol = new SplitArrayWithMinimumDifference();
        System.out.println(sol.solve(null));
    }
}
