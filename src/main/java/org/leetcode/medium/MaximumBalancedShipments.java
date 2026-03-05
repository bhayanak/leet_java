package org.leetcode.medium;


/**
 * <b>#3638 - Maximum Balanced Shipments</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array weight of length n, representing the weights of n parcels arranged in a straight line. A shipment is defined as a contiguous subarray of parcels. A shipment is considered balanced if the weight of the last parcel is strictly less than the maximum weight among all parcels in that shipment.
 *
 *
 * Select a set of non-overlapping, contiguous, balanced shipments such that each parcel appears in at most one shipment (parcels may remain unshipped).
 *
 *
 * Return the maximum possible number of balanced shipments that can be formed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: weight = [2,5,1,4,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can form the maximum of two balanced shipments as follows:
 *
 *
 * Shipment 1: [2, 5, 1]
 *
 *
 *
 *
 * Maximum parcel weight = 5
 *
 * Last parcel weight = 1, which is strictly less than 5. Thus, it's balanced.
 *
 *
 *
 * Shipment 2: [4, 3]
 *
 *
 *
 * Maximum parcel weight = 4
 *
 * Last parcel weight = 3, which is strictly less than 4. Thus, it's balanced.
 *
 *
 *
 * It is impossible to partition the parcels to achieve more than two balanced shipments, so the answer is 2.
 *
 * Example 2:
 *
 * Input: weight = [4,4]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No balanced shipment can be formed in this case:
 *
 *
 * A shipment [4, 4] has maximum weight 4 and the last parcel's weight is also 4, which is not strictly less. Thus, it's not balanced.
 *
 * Single-parcel shipments [4] have the last parcel weight equal to the maximum parcel weight, thus not balanced.
 *
 * As there is no way to form even one balanced shipment, the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= weight[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a monotonic stack to find for each end index <code>i</code> the nearest previous index <code>j</code> with <code>weight[j] &gt; weight[i]</code> (set <code>j = -1</code> if none).
 * Hint 2: Then set <code>dp[i] = best[j] + 1</code> (using <code>best[-1] = 0</code>), and update <code>best[i] = max(best[i-1], dp[i])</code>; the result is <code>best[n-1]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Stack, Greedy, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/maximum-balanced-shipments/">LeetCode #3638</a>
 */
public class MaximumBalancedShipments {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Balanced Shipments");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumBalancedShipments ===");
        MaximumBalancedShipments sol = new MaximumBalancedShipments();
        System.out.println(sol.solve(null));
    }
}
