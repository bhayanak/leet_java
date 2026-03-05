package org.leetcode.medium;


/**
 * <b>#2874 - Maximum Value of an Ordered Triplet II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums.
 *
 *
 * Return the maximum value over all triplets of indices (i, j, k) such that i &lt; j &lt; k. If all such triplets have a negative value, return 0.
 *
 *
 * The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [12,6,1,2,7]
 * Output: 77
 * Explanation: The value of the triplet (0, 2, 4) is (nums[0] - nums[2]) * nums[4] = 77.
 * It can be shown that there are no ordered triplets of indices with a value greater than 77. 
 *
 * Example 2:
 *
 * Input: nums = [1,10,3,4,19]
 * Output: 133
 * Explanation: The value of the triplet (1, 2, 4) is (nums[1] - nums[2]) * nums[4] = 133.
 * It can be shown that there are no ordered triplets of indices with a value greater than 133.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 0
 * Explanation: The only ordered triplet of indices (0, 1, 2) has a negative value of (nums[0] - nums[1]) * nums[2] = -3. Hence, the answer would be 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Preprocess the prefix maximum array, <code>prefix_max[i] = max(nums[0], nums[1], …, nums[i])</code> and the suffix maximum array, <code>suffix_max[i] = max(nums[i], nums[i + 1], …, nums[n - 1])</code>.
 * Hint 2: For each index <code>j</code>, find two indices <code>i</code> and <code>k</code> such that <code>i &lt; j &lt; k</code> and <code>(nums[i] - nums[j]) * nums[k]</code> is the maximum, using the prefix and suffix maximum arrays.
 * Hint 3: For index <code>j</code>, the maximum triplet value is <code>(prefix_max[j - 1] - nums[j]) * suffix_max[j + 1]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/">LeetCode #2874</a>
 */
public class MaximumValueOfAnOrderedTripletIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Value of an Ordered Triplet II");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumValueOfAnOrderedTripletIi ===");
        MaximumValueOfAnOrderedTripletIi sol = new MaximumValueOfAnOrderedTripletIi();
        System.out.println(sol.solve(null));
    }
}
