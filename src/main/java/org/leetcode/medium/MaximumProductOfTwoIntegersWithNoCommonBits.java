package org.leetcode.medium;


/**
 * <b>#3670 - Maximum Product of Two Integers With No Common Bits</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Your task is to find two distinct indices i and j such that the product nums[i] * nums[j] is maximized, and the binary representations of nums[i] and nums[j] do not share any common set bits.
 *
 *
 * Return the maximum possible product of such a pair. If no such pair exists, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The best pair is 3 (011) and 4 (100). They share no set bits and 3 * 4 = 12.
 *
 * Example 2:
 *
 * Input: nums = [5,6,4]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Every pair of numbers has at least one common set bit. Hence, the answer is 0.
 *
 * Example 3:
 *
 * Input: nums = [64,8,32]
 *
 *
 * Output: 2048
 *
 *
 * Explanation:
 *
 *
 * No pair of numbers share a common bit, so the answer is the product of the two maximum elements, 64 and 32 (64 * 32 = 2048).
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of each number as a mask: treat <code>nums[i]</code> as a bitmask.
 * Hint 2: Create an array <code>dp</code> of size <code>1 &lt;&lt; B</code>, where <code>B</code> is your bit‑width.
 * Hint 3: Initialize <code>dp[mask]</code> to the maximum <code>nums[i]</code> exactly equal to that <code>mask</code>, or 0 if none.
 * Hint 4: For each <code>m</code>, propagate to all its super‑masks <code>M</code>: <code>dp[m] = max(dp[m], dp[M])</code>
 * Hint 5: For a number <code>x</code> with mask <code>mx</code>, compute its "complement mask" as <code>cm = ~mx &amp; ((1 &lt;&lt; B)-1)</code>.
 * Hint 6: The best disjoint partner is then <code>dp[cm]</code>.
 * Hint 7: Loop over all <code>x</code> in <code>nums</code>, look up <code>dp[cm]</code>, and track the maximum <code>x * partner</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-of-two-integers-with-no-common-bits/">LeetCode #3670</a>
 */
public class MaximumProductOfTwoIntegersWithNoCommonBits {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Product of Two Integers With No Common Bits");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumProductOfTwoIntegersWithNoCommonBits ===");
        MaximumProductOfTwoIntegersWithNoCommonBits sol = new MaximumProductOfTwoIntegersWithNoCommonBits();
        System.out.println(sol.solve(null));
    }
}
