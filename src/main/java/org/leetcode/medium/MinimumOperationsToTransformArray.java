package org.leetcode.medium;


/**
 * <b>#3724 - Minimum Operations to Transform Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 of length n and nums2 of length n + 1.
 *
 *
 * You want to transform nums1 into nums2 using the minimum number of operations.
 *
 *
 * You may perform the following operations any number of times, each time choosing an index i:
 *
 *
 * Increase nums1[i] by 1.
 *
 * Decrease nums1[i] by 1.
 *
 * Append nums1[i] to the end of the array.
 *
 * Return the minimum number of operations required to transform nums1 into nums2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,8], nums2 = [1,7,3]
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
 * 			Step
 * 			i
 * 			Operation
 * 			nums1[i]
 * 			Updated nums1
 *
 *
 *
 *
 *
 *
 * 			1
 * 			0
 * 			Append
 * 			-
 * 			[2, 8, 2]
 *
 *
 *
 *
 * 			2
 * 			0
 * 			Decrement
 * 			Decreases to 1
 * 			[1, 8, 2]
 *
 *
 *
 *
 * 			3
 * 			1
 * 			Decrement
 * 			Decreases to 7
 * 			[1, 7, 2]
 *
 *
 *
 *
 * 			4
 * 			2
 * 			Increment
 * 			Increases to 3
 * 			[1, 7, 3]
 *
 *
 *
 *
 * Thus, after 4 operations nums1 is transformed into nums2.
 *
 * Example 2:
 *
 * Input: nums1 = [1,3,6], nums2 = [2,4,5,3]
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
 * 			Step
 * 			i
 * 			Operation
 * 			nums1[i]
 * 			Updated nums1
 *
 *
 *
 *
 *
 *
 * 			1
 * 			1
 * 			Append
 * 			-
 * 			[1, 3, 6, 3]
 *
 *
 *
 *
 * 			2
 * 			0
 * 			Increment
 * 			Increases to 2
 * 			[2, 3, 6, 3]
 *
 *
 *
 *
 * 			3
 * 			1
 * 			Increment
 * 			Increases to 4
 * 			[2, 4, 6, 3]
 *
 *
 *
 *
 * 			4
 * 			2
 * 			Decrement
 * 			Decreases to 5
 * 			[2, 4, 5, 3]
 *
 *
 *
 *
 * Thus, after 4 operations nums1 is transformed into nums2.
 *
 * Example 3:
 *
 * Input: nums1 = [2], nums2 = [3,4]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Step
 * 			i
 * 			Operation
 * 			nums1[i]
 * 			Updated nums1
 *
 *
 *
 *
 *
 *
 * 			1
 * 			0
 * 			Increment
 * 			Increases to 3
 * 			[3]
 *
 *
 *
 *
 * 			2
 * 			0
 * 			Append
 * 			-
 * 			[3, 3]
 *
 *
 *
 *
 * 			3
 * 			1
 * 			Increment
 * 			Increases to 4
 * 			[3, 4]
 *
 *
 *
 *
 * Thus, after 3 operations nums1 is transformed into nums2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums1.length &lt;= 105
 *
 * nums2.length == n + 1
 *
 * 1 &lt;= nums1[i], nums2[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that <code>nums2</code> has exactly one extra element compared to <code>nums1</code>. That extra element must be produced by an append operation.
 * Hint 2: Suppose we choose index <code>j</code> in <code>nums1</code> to append. Then <code>nums1[j]</code> must eventually become both <code>nums2[j]</code> and <code>nums2.back()</code>.
 * Hint 3: The cost for index <code>j</code> is: adjust <code>nums1[j]</code> so that one copy matches <code>nums2[j]</code> and the appended copy matches <code>nums2.back()</code>.
 * Hint 4: For each <code>j</code>, compute this adjustment cost, add the cost of transforming all other positions, and take the minimum.
 * Hint 5: Use prefix sums.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-transform-array/">LeetCode #3724</a>
 */
public class MinimumOperationsToTransformArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Transform Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToTransformArray ===");
        MinimumOperationsToTransformArray sol = new MinimumOperationsToTransformArray();
        System.out.println(sol.solve(null));
    }
}
