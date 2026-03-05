package org.leetcode.medium;


/**
 * <b>#3196 - Maximize Total Cost of Alternating Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums with length n.
 *
 *
 * The cost of a subarray nums[l..r], where 0 &lt;= l &lt;= r &lt; n, is defined as:
 *
 *
 * cost(l, r) = nums[l] - nums[l + 1] + ... + nums[r] * (−1)r − l
 *
 *
 * Your task is to split nums into subarrays such that the total cost of the subarrays is maximized, ensuring each element belongs to exactly one subarray.
 *
 *
 * Formally, if nums is split into k subarrays, where k &gt; 1, at indices i1, i2, ..., ik − 1, where 0 &lt;= i1 &lt; i2 &lt; ... &lt; ik - 1 &lt; n - 1, then the total cost will be:
 *
 *
 * cost(0, i1) + cost(i1 + 1, i2) + ... + cost(ik − 1 + 1, n − 1)
 *
 *
 * Return an integer denoting the maximum total cost of the subarrays after splitting the array optimally.
 *
 *
 * Note: If nums is not split into subarrays, i.e. k = 1, the total cost is simply cost(0, n - 1).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-2,3,4]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * One way to maximize the total cost is by splitting [1, -2, 3, 4] into subarrays [1, -2, 3] and [4]. The total cost will be (1 + 2 + 3) + 4 = 10.
 *
 * Example 2:
 *
 * Input: nums = [1,-1,1,-1]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * One way to maximize the total cost is by splitting [1, -1, 1, -1] into subarrays [1, -1] and [1, -1]. The total cost will be (1 + 1) + (1 + 1) = 4.
 *
 * Example 3:
 *
 * Input: nums = [0]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * We cannot split the array further, so the answer is 0.
 *
 * Example 4:
 *
 * Input: nums = [1,-1]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Selecting the whole array gives a total cost of 1 + 1 = 2, which is the maximum.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be solved using dynamic programming.
 * Hint 2: Since we can always start a new subarray, the problem is the same as selecting some elements in the array and flipping their signs to negative to maximize the sum. However, we cannot flip the signs of 2 consecutive elements, and the first element in the array cannot be negative.
 * Hint 3: Let <code>dp[i][0/1]</code> be the largest sum we can get for prefix <code>nums[0..i]</code>, where <code>dp[i][0]</code> is the maximum if the <code>i<sup>th</sup></code> element wasn't flipped, and <code>dp[i][1]</code> is the maximum if the <code>i<sup>th</sup></code> element was flipped.
 * Hint 4: Based on the restriction:<br />
<code>dp[i][0] = max(dp[i - 1][0], dp[i - 1][1]) + nums[i]</code><br />
<code>dp[i][1] = dp[i - 1][0] - nums[i]</code>
 * Hint 5: The initial state is:<br />
<code>dp[1][0] = nums[0] + nums[1]</code><br />
<code>dp[1][1] = nums[0] - nums[1]</code><br />
and the answer is <code>max(dp[n - 1][0], dp[n - 1][1])</code>.
 * Hint 6: Can you optimize the space complexity?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/">LeetCode #3196</a>
 */
public class MaximizeTotalCostOfAlternatingSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Total Cost of Alternating Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTotalCostOfAlternatingSubarrays ===");
        MaximizeTotalCostOfAlternatingSubarrays sol = new MaximizeTotalCostOfAlternatingSubarrays();
        System.out.println(sol.solve(null));
    }
}
