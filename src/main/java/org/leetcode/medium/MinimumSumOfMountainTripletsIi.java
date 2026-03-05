package org.leetcode.medium;


/**
 * <b>#2909 - Minimum Sum of Mountain Triplets II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums of integers.
 *
 *
 * A triplet of indices (i, j, k) is a mountain if:
 *
 *
 * i &lt; j &lt; k
 *
 * nums[i] &lt; nums[j] and nums[k] &lt; nums[j]
 *
 * Return the minimum possible sum of a mountain triplet of nums. If no such triplet exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [8,6,1,5,3]
 * Output: 9
 * Explanation: Triplet (2, 3, 4) is a mountain triplet of sum 9 since: 
 * - 2 &lt; 3 &lt; 4
 * - nums[2] &lt; nums[3] and nums[4] &lt; nums[3]
 * And the sum of this triplet is nums[2] + nums[3] + nums[4] = 9. It can be shown that there are no mountain triplets with a sum of less than 9.
 *
 * Example 2:
 *
 * Input: nums = [5,4,8,7,10,2]
 * Output: 13
 * Explanation: Triplet (1, 3, 5) is a mountain triplet of sum 13 since: 
 * - 1 &lt; 3 &lt; 5
 * - nums[1] &lt; nums[3] and nums[5] &lt; nums[3]
 * And the sum of this triplet is nums[1] + nums[3] + nums[5] = 13. It can be shown that there are no mountain triplets with a sum of less than 13.
 *
 * Example 3:
 *
 * Input: nums = [6,5,4,3,4,5]
 * Output: -1
 * Explanation: It can be shown that there are no mountain triplets in nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If you fix index <code>j</code>, <code>i</code> will be the smallest integer to the left of <code>j</code>, and <code>k</code> the largest integer to the right of <code>j</code>.
 * Hint 2: To find <code>i</code> and <code>k</code>, preprocess the prefix minimum array <code>prefix_min[i] = min(nums[0], nums[1], ..., nums[i])</code>, and the suffix minimum array <code>suffix_min[i] = min(nums[i], nums[i + 1], ..., nums[i - 1])</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/minimum-sum-of-mountain-triplets-ii/">LeetCode #2909</a>
 */
public class MinimumSumOfMountainTripletsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Sum of Mountain Triplets II");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumSumOfMountainTripletsIi ===");
        MinimumSumOfMountainTripletsIi sol = new MinimumSumOfMountainTripletsIi();
        System.out.println(sol.solve(null));
    }
}
